package Jsp.Jspnew;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TestEmployee {

	public static void main(String[] args) 
	{
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("Hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=meta.getSessionFactoryBuilder().build();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Employee e=new Employee();
		e.setId(844345);
		//e.setFullName("SAISWAROOP");
		//e.setMobileNumber("9885558229");
		//e.setDept("Zology");
		s.update(e);
		t.commit();
		System.out.println("data inserted successfully");
		sf.close();
		s.close();
		
	}

}
