package estocmed.produtoconsumo;

import estocmed.estoqueconsumo.EstoqueConsumo;
import estocmed.fornecedor.Fornecedor;
import estocmed.tipodoproduto.TipoDoProduto;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProdutoConsumo{

    @Id
    @GeneratedValue
    private int idProduto;

    @Column(length = 100, nullable = false)
    private String nomeProdutoConsumo;


    @Column(length = 100,nullable = false)
    private TipoDoProduto tipoProduto;

    @ManyToOne
    @JoinColumn(name = "Fornecedor")
    private Fornecedor codFornecedor;

//    @Override
//    public int compareTo(ProdutoConsumo produtoConsumo) {
//        return this.nomeProdutoConsumo.compareTo(produtoConsumo.getNomeProdutoConsumo());
//    }
    
    public TipoDoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoDoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProdutoConsumo() {
        return nomeProdutoConsumo;
    }

    public void setNomeProdutoConsumo(String nomeProdutoConsumo) {
        this.nomeProdutoConsumo = nomeProdutoConsumo;
    }

    /**
     * @return the fornecedor
     */
    public Fornecedor getFornecedor() {
        return codFornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(Fornecedor codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

}
