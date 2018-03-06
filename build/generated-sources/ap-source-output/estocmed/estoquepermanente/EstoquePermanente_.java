package estocmed.estoquepermanente;

import estocmed.produtopermanente.ProdutoPermanente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EstoquePermanente.class)
public abstract class EstoquePermanente_ {

	public static volatile SingularAttribute<EstoquePermanente, String> vencimentoPermanente;
	public static volatile SingularAttribute<EstoquePermanente, ProdutoPermanente> produtoPermanente;
	public static volatile SingularAttribute<EstoquePermanente, Integer> idEstoquePermanente;
	public static volatile SingularAttribute<EstoquePermanente, Date> dataEntradaPermanente;
	public static volatile SingularAttribute<EstoquePermanente, String> tomboProdutoPermanente;
	public static volatile SingularAttribute<EstoquePermanente, Boolean> status;

}

