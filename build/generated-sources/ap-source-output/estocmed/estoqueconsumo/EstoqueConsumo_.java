package estocmed.estoqueconsumo;

import estocmed.produtoconsumo.ProdutoConsumo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EstoqueConsumo.class)
public abstract class EstoqueConsumo_ {

	public static volatile SingularAttribute<EstoqueConsumo, Integer> qtdEstoque;
	public static volatile SingularAttribute<EstoqueConsumo, Integer> idEstoque;
	public static volatile SingularAttribute<EstoqueConsumo, ProdutoConsumo> produto;
	public static volatile SingularAttribute<EstoqueConsumo, Date> dataEntrada;
	public static volatile SingularAttribute<EstoqueConsumo, Integer> qtdSaida;
	public static volatile SingularAttribute<EstoqueConsumo, String> vencimento;
	public static volatile SingularAttribute<EstoqueConsumo, String> tipoEntrada;

}

