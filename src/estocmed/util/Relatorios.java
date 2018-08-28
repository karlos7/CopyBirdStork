/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estocmed.util;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import estocmed.estoqueconsumo.EstoqueConsumo;
import estocmed.saidaconsumo.SaidaConsumo;
import estocmed.saidaconsumo.SaidaConsumoTableModel;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karlos Oliveira
 */
public class Relatorios {

    private static SimpleDateFormat formatarData = new SimpleDateFormat("dd-MM-yyyy(HH-mm-ss)");
    private static Document document = new Document(PageSize.A4);

    private static void gerarCabecalho() {
        Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
        Font fontLinha = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD);
        fontLinha.setColor(41, 72, 59);
        Font fontLinhaMenor = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
        fontLinhaMenor.setColor(BaseColor.BLUE);

        document.open();
        PdfPTable tabela = new PdfPTable(1);
        PdfPCell celula1;
        try {
            celula1 = new PdfPCell(Image.getInstance("src\\birdpoint\\imagens\\fvs.png"));
            celula1.setBorder(-1);
            celula1.setIndent(155);
            tabela.addCell(celula1);
            document.add(tabela);
        } catch (BadElementException ex) {
            Logger.getLogger(Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Paragraph titulo = new Paragraph("SAÍDA DE PRODUTOS", boldFont);
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);

            Paragraph linha0 = new Paragraph("________________________________", fontLinhaMenor);
            linha0.setAlignment(Element.ALIGN_CENTER);
            linha0.setSpacingAfter(-21);
            linha0.setSpacingBefore(-21);
            document.add(linha0);

            Paragraph linha2 = new Paragraph("______________________________________________", fontLinha);
            linha2.setAlignment(Element.ALIGN_CENTER);
            document.add(linha2);

            Paragraph linha3 = new Paragraph("________________________________", fontLinhaMenor);
            linha3.setAlignment(Element.ALIGN_CENTER);
            linha3.setSpacingBefore(-16);
            document.add(linha3);
            
            Paragraph linha4 = new Paragraph("");
            linha4.setAlignment(Element.ALIGN_CENTER);
            linha4.setSpacingBefore(20);
            document.add(linha4);

            
        } catch (com.itextpdf.text.DocumentException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static String converterDataString(Date date) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        return f.format(date);
    }
    
    public static void gerarRelatorioTabela(List relatorioGeral) {
        String diretorioPdf = "saida_estoque_consumo" + formatarData.format(new Date()) + ".pdf";
        Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
        
        try {
            try {
                PdfWriter.getInstance(document, new FileOutputStream(diretorioPdf));
            } catch (com.itextpdf.text.DocumentException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.open();
            gerarCabecalho();

            PdfPTable tabela = new PdfPTable(5);


            PdfPCell celulaTituloNome = new PdfPCell(new Phrase("Nome Produto", boldFont));
            PdfPCell celulaTituloSetor = new PdfPCell(new Phrase("Setor", boldFont));
            PdfPCell celulaTituloEstoque = new PdfPCell(new Phrase("Qtd. Estoque", boldFont));
            PdfPCell celulaTituloSaida = new PdfPCell(new Phrase("Qtd. Saída", boldFont));
            PdfPCell celulaTituloVencimento = new PdfPCell(new Phrase("Vencimento", boldFont));

            tabela.addCell(celulaTituloNome);
            tabela.addCell(celulaTituloSetor);
            tabela.addCell(celulaTituloEstoque);
            tabela.addCell(celulaTituloSaida);
            tabela.addCell(celulaTituloVencimento);

            for (Object objUsuario : relatorioGeral) {

                EstoqueConsumo estoqueConsumo = (EstoqueConsumo) objUsuario;

                PdfPCell celulaNome = new PdfPCell(new Phrase(estoqueConsumo.getProduto().getNomeProdutoConsumo()));
                PdfPCell celulaSetor = new PdfPCell(new Phrase(estoqueConsumo.getTipoEntrada()));
                PdfPCell celulaEstoque = new PdfPCell(new Phrase(estoqueConsumo.getQtdEstoque().toString()));
                PdfPCell celulaSaida = new PdfPCell(new Phrase(estoqueConsumo.getQtdSaida().toString()));
                PdfPCell celulaVencimento = new PdfPCell(new Phrase(converterDataString(estoqueConsumo.getDataVencimento())));

                tabela.addCell(celulaNome);
                tabela.addCell(celulaSetor);
                tabela.addCell(celulaEstoque);
                tabela.addCell(celulaSaida);
                tabela.addCell(celulaVencimento);
            }

            tabela.setWidthPercentage(100);
            document.add(tabela);

            Desktop.getDesktop().open(new File(diretorioPdf));
        } catch (DocumentException | IOException de) {
            System.err.println(de.getMessage());
        }
        document.close();
        limparGeral();
    }

//    public static void gerarRelatorio(List relatorioGeral) {
//        Font normal = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
//        String diretorioPdf = "saida_estoque_consumo" + formatarData.format(new Date()) + ".pdf";
//        Font fontLinhaMenor = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
//
//        try {
//            try {
//                PdfWriter.getInstance(document, new FileOutputStream(diretorioPdf));
//            } catch (com.itextpdf.text.DocumentException ex) {
//                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            document.open();
//            gerarCabecalho();
//
//            try {
//                if (relatorioGeral.size() > 0) {
//
//                    for (Object obj : relatorioGeral) {
//                        EstoqueConsumo estoqueConsumo = (EstoqueConsumo) obj;
//                        Paragraph linha1 = new Paragraph("Produto: " + estoqueConsumo.getProduto().getNomeProdutoConsumo()
//                                + "Destino: " + estoqueConsumo.getTipoEntrada()
//                                + "Quantidade em estoque: " + estoqueConsumo.getQtdEstoque()
//                                + "Quantidade saída: " + estoqueConsumo.getQtdSaida(), normal);
//                        linha1.setAlignment(Element.ALIGN_JUSTIFIED);
//                        linha1.setIndentationLeft(25);
//                        document.add(linha1);
////                            Paragraph linha2 = new Paragraph("Destino: " + estoqueConsumo.getTipoEntrada(), normal);
////                            linha2.setAlignment(Element.ALIGN_JUSTIFIED);
////                            linha2.setIndentationLeft(25);
////                            document.add(linha2);
////                            Paragraph linha3 = new Paragraph("Quantidade em estoque: " + estoqueConsumo.getQtdEstoque(), normal);
////                            linha3.setAlignment(Element.ALIGN_JUSTIFIED);
////                            linha3.setIndentationLeft(25);
////                            document.add(linha3);
////                            Paragraph linha4 = new Paragraph("Quantidade saída: " + estoqueConsumo.getQtdSaida(), normal);
////                            linha4.setAlignment(Element.ALIGN_JUSTIFIED);
////                            linha4.setIndentationLeft(25);
////                            document.add(linha4);
//                        Paragraph linha0 = new Paragraph("________________________________", fontLinhaMenor);
//                        linha0.setAlignment(Element.ALIGN_LEFT);
//                        linha0.setSpacingAfter(2);
//                        linha0.setSpacingBefore(-20);
//                        linha0.setIndentationLeft(25);
//                        document.add(linha0);
//
//                    }
//
//                }
//            } catch (com.itextpdf.text.DocumentException ex) {
//                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            try {
//                document.add(new Paragraph(" "));
//            } catch (com.itextpdf.text.DocumentException ex) {
//                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Desktop.getDesktop().open(new File(diretorioPdf));
//        } catch (IOException de) {
//            System.err.println(de.getMessage());
//        }
//        document.close();
//        limparGeral();
//    }

    private static void limparGeral() {
        document = new Document();
    }

}
