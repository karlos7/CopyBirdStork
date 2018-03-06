package estocmed.produtoconsumo;

import estocmed.fornecedor.Fornecedor;
import estocmed.tipodoproduto.TipoDoProduto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProdutoConsumo.class)
public abstract class ProdutoConsumo_ {

	public static volatile SingularAttribute<ProdutoConsumo, Integer> idProduto;
	public static volatile SingularAttribute<ProdutoConsumo, Fornecedor> codFornecedor;
	public static volatile SingularAttribute<ProdutoConsumo, String> nomeProdutoConsumo;
	public static volatile SingularAttribute<ProdutoConsumo, TipoDoProduto> tipoProduto;

}

