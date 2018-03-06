package estocmed.saidaconsumo;

import estocmed.destino.Destino;
import estocmed.estoqueconsumo.EstoqueConsumo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SaidaConsumo.class)
public abstract class SaidaConsumo_ {

	public static volatile ListAttribute<SaidaConsumo, EstoqueConsumo> estoqueConsumo;
	public static volatile SingularAttribute<SaidaConsumo, Date> dataSaida;
	public static volatile SingularAttribute<SaidaConsumo, Destino> destino;
	public static volatile SingularAttribute<SaidaConsumo, Integer> idSaida;

}

