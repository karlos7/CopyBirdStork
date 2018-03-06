package estocmed.produtopermanente;

import estocmed.fornecedor.Fornecedor;
import estocmed.tipodoproduto.TipoDoProduto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProdutoPermanente.class)
public abstract class ProdutoPermanente_ {

	public static volatile SingularAttribute<ProdutoPermanente, Fornecedor> codFornecedor;
	public static volatile SingularAttribute<ProdutoPermanente, Integer> idProdutoPermanente;
	public static volatile SingularAttribute<ProdutoPermanente, String> nomeProdutoPermanente;
	public static volatile SingularAttribute<ProdutoPermanente, TipoDoProduto> tipoProduto;

}

