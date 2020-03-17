package package2;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
	private static SessionFactory sessionFactory;
	public static SessionFactory getsessionfactory()
	{
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		return factory;
		}
	
}
