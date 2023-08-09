import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



public class Conf {



    public void conf(){
        Configuration configuration=new org.hibernate.cfg.Configuration().configure();
        SessionFactory factory= configuration.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();

    }
}
