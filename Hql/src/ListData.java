
import java.util.List;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;
 
  
public class ListData {  
  
    public static void main( String[] args )  
    {  
        // StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
         //Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory = new Configuration().configure().buildSessionFactory(); 
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction();  
        String hql="Select e.firstName from Employee e order by firstName DESC";
        //String hql="From Employee e where e.id>100";
        //String hql="From Employee";
        Query query=session.createQuery(hql);
        List<String> result=query.list();
        for(String e:result)
            {
            System.out.println(e);	
            }
        
        //List<Employee> result=query.list();
        //for(Employee e:result)
        //{
        	//System.out.println(+e.getId()+" "+e.getFirstName()+" "+e.getLastName());
       // }
        
        
        
    }  
}  