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
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import estocmed.estoqueconsumo.EstoqueConsumo;
import estocmed.saidaconsumo.SaidaConsumo;
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
            document.add(linha0);

            Paragraph linha2 = new Paragraph("______________________________________________", fontLinha);
            linha2.setAlignment(Element.ALIGN_CENTER);
            document.add(linha2);

            Paragraph linha3 = new Paragraph("________________________________", fontLinhaMenor);
            linha3.setAlignment(Element.ALIGN_CENTER);
            linha3.setSpacingBefore(-16);
            document.add(linha3);

            Paragraph linha = new Paragraph();
            linha.setAlignment(Element.ALIGN_CENTER);
            document.add(linha);
            document.add(new Paragraph(" "));
        } catch (com.itextpdf.text.DocumentException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void gerarRelatorio(List relatorioGeral) {
        Font normal = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
        String diretorioPdf = "saida_estoque_consumo" + formatarData.format(new Date()) + ".pdf";
        Font fontLinhaMenor = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
        List<String> produto = new ArrayList<>();
        List<String> destino = new ArrayList<>();
        int i = 1;

        try {
            try {
                PdfWriter.getInstance(document, new FileOutputStream(diretorioPdf));
            } catch (com.itextpdf.text.DocumentException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.open();
            gerarCabecalho();

            for (Object obj : relatorioGeral) {
                SaidaConsumo saidaConsumo = (SaidaConsumo) obj;
                produto.add(saidaConsumo.getEstoqueConsumo().get(0).getProduto().toString());
                destino.add(saidaConsumo.getDestino().getNomeDestino());
            }
            try {
                if (relatorioGeral.size() > 0) {

                    for (Object obj : relatorioGeral) {
                        SaidaConsumo saidaConsumo = (SaidaConsumo) obj;
                        if (!(produto.get(i - 1).equals(saidaConsumo.getEstoqueConsumo().get(0).getProduto().getNomeProdutoConsumo()) && destino.get(i - 1).equals(saidaConsumo.getDestino().getNomeDestino()))) {
                            Paragraph linha1 = new Paragraph("Produto: " + saidaConsumo.getEstoqueConsumo().get(0).getProduto().getNomeProdutoConsumo(), normal);
                            linha1.setAlignment(Element.ALIGN_JUSTIFIED);
                            linha1.setIndentationLeft(25);
                            document.add(linha1);
                            Paragraph linha2 = new Paragraph("Destino: " + saidaConsumo.getDestino().getNomeDestino(), normal);
                            linha2.setAlignment(Element.ALIGN_JUSTIFIED);
                            linha2.setIndentationLeft(25);
                            document.add(linha2);
                            Paragraph linha3 = new Paragraph("Quantidade em estoque: " + saidaConsumo.getEstoqueConsumo().get(0).getQtdEstoque().toString(), normal);
                            linha3.setAlignment(Element.ALIGN_JUSTIFIED);
                            linha3.setIndentationLeft(25);
                            document.add(linha3);
                            Paragraph linha4 = new Paragraph("Quantidade saída: " + saidaConsumo.getEstoqueConsumo().get(0).getQtdSaida().toString(), normal);
                            linha4.setAlignment(Element.ALIGN_JUSTIFIED);
                            linha4.setIndentationLeft(25);
                            document.add(linha4);
                            Paragraph linha0 = new Paragraph("________________________________", fontLinhaMenor);
                            linha0.setAlignment(Element.ALIGN_LEFT);
                            linha0.setSpacingAfter(2);
                            linha0.setSpacingBefore(-20);
                            linha0.setIndentationLeft(25);
                            document.add(linha0);
                            if (i<=produto.size()) {
                                i++;
                            }
                            
                        }

                    }

                }
            } catch (com.itextpdf.text.DocumentException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                document.add(new Paragraph(" "));
            } catch (com.itextpdf.text.DocumentException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
            Desktop.getDesktop().open(new File(diretorioPdf));
        } catch (IOException de) {
            System.err.println(de.getMessage());
        }
        document.close();
        limparGeral();
    }

    private static void limparGeral() {
        document = new Document();
    }

}
