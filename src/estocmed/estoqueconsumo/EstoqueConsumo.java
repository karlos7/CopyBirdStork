/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estocmed.estoqueconsumo;

import estocmed.produtoconsumo.ProdutoConsumo;
import estocmed.saidaconsumo.SaidaConsumo;
import java.text.Collator;
import java.util.Date;
import java.util.Locale;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author noobr
 */
@Entity
public class EstoqueConsumo implements Comparable<EstoqueConsumo> {

    @Id
    @GeneratedValue
    private int idEstoque;

    @ManyToOne(fetch = FetchType.EAGER)
    private ProdutoConsumo produto;

    @Column(length = 100, nullable = false)
    private Integer qtdEstoque;

    @Column(length = 100, nullable = false)
    private Integer qtdSaida;

    @Column(length = 100, nullable = false)
    private Date dataEntrada;
    @Column(length = 100, nullable = false)
    private String vencimento;
    @Column(length = 100, nullable = false)
    private String tipoEntrada;

    @Override
    public int compareTo(EstoqueConsumo produtoConsumo) {
        Collator cot = Collator.getInstance(new Locale("pt", "BR"));
        return cot.compare(produto.getNomeProdutoConsumo(), produtoConsumo.getProduto().getNomeProdutoConsumo());
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public ProdutoConsumo getProduto() {
        return produto;
    }

    public void setProduto(ProdutoConsumo produto) {
        this.produto = produto;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    
    public Integer getQtdSaida() {
        return qtdSaida;
    }

    public void setQtdSaida(Integer qtdSaida) {
        this.qtdSaida = qtdSaida;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }
}
