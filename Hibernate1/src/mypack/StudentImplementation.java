package mypack;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
//import org.hibernate.boot.Metadata;  
//import org.hibernate.boot.MetadataSources;  
//import org.hibernate.boot.registry.StandardServiceRegistry;  
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;  
  
public class StudentImplementation {  
  
    public static void main( String[] args )  
    {
        //StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();  
        // Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
          
        //SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        SessionFactory factory=new Configuration().configure().buildSessionFactory();  
        Session session = factory.openSession();  
        Session session1 = factory.openSession();  
        Transaction t = session.beginTransaction();  
        Transaction t1 = session1.beginTransaction();
         
        Student e1=new Student();    
            e1.setSid(49);    
            e1.setSFirstname("Vidhyut");    
            e1.setSLastname("Jamaal");    
            session.save(e1);
            t.commit();   
        
            Student e2=new Student();    
            e2.setSid(12);    
            e2.setSFirstname("Vidhyut");    
            e2.setSLastname("Jamaal");
       session1.save(e2);  
      t1.rollback();
       System.out.println("successfully saved");    
        factory.close();  
        session.close();     
    }  
}  