package Simplilearn_Project.LAcademy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import java.util.Scanner  ;

public class App 
{
    public static void main( String[] args )
    {
    	  
    	Configuration config = new Configuration().configure().addAnnotatedClass(LAStudents.class).addAnnotatedClass(LATeachers.class).addAnnotatedClass(LASubject.class).addAnnotatedClass(LAClasses.class);
        ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry() ;  
        SessionFactory sf = config.buildSessionFactory(registry) ; 
        Session session = sf.openSession() ; 
    	
        Scanner sc = new Scanner(System.in) ;
         
        System.out.println("Enter the number of Teachers in the Academy : "); 
        int x = sc.nextInt() ; 
        String[] arr = new String[x] ;
    	System.out.println("Enter the Names Of those Teachers  : "); 
    	for(int i = 0 ; i < x ; i ++ ) {
    		arr[i] = sc.next() ;
    	}
        int j = 0 ;
    	for(int i = 2001 ; i < 2001 + x ; i ++ ) {
    		LATeachers t = new LATeachers () ;
    		t.setT_id(i); 
    		t.setT_name(arr[j]); ;
    		session.save(t) ;
    		j++ ;
    	}
    	 

        session.beginTransaction( ) ;
        
        
        
        
        session.getTransaction().commit() ;  

    }
}
