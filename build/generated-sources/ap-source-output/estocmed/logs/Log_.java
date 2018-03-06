package estocmed.logs;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Log.class)
public abstract class Log_ {

	public static volatile SingularAttribute<Log, Date> data;
	public static volatile SingularAttribute<Log, String> operacao;
	public static volatile SingularAttribute<Log, Integer> idLogs;
	public static volatile SingularAttribute<Log, String> usuario;

}

