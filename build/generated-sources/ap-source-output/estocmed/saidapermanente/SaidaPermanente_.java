package estocmed.saidapermanente;

import estocmed.estoquepermanente.EstoquePermanente;
import estocmed.setor.Setor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SaidaPermanente.class)
public abstract class SaidaPermanente_ {

	public static volatile SingularAttribute<SaidaPermanente, Setor> setor;
	public static volatile ListAttribute<SaidaPermanente, EstoquePermanente> estoquePermanente;
	public static volatile SingularAttribute<SaidaPermanente, Date> dataSaida;
	public static volatile SingularAttribute<SaidaPermanente, Integer> idSaida;

}

