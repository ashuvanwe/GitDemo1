package one.to.one;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;



public class HibernateUtil
{

	private static StandardServiceRegistry reg;
	private static SessionFactory sf;
	
	public static SessionFactory getsessionfactory()
	{
		
		if(sf==null)
		{
		Map<String, Object>settings=new HashMap<String, Object>();
		
		settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
		settings.put(Environment.URL, "jdbc:mysql://localhost:3306/unidirectional");
		settings.put(Environment.USER,"root" );
		settings.put(Environment.PASS, "root");
	
		settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQL55Dialect");
		settings.put(Environment.HBM2DDL_AUTO, "update");
		settings.put(Environment.SHOW_SQL, "true");
	    
		
		reg=new StandardServiceRegistryBuilder().applySettings(settings).build();
		MetadataSources mds=new MetadataSources(reg).addAnnotatedClass(Account.class).addAnnotatedClass(Accountplus.class);
		Metadata md=mds.getMetadataBuilder().build();
		
		sf=md.getSessionFactoryBuilder().build();
		
		}
		return sf;
	}
}
