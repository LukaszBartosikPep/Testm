import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;
import java.util.*;
public class ConfDB {

        SessionFactory factory;


    public  ConfDB() {
        Configuration configuration = new org.hibernate.cfg.Configuration().configure();
        factory = configuration.buildSessionFactory();
    }
        public void saveToDB(Book book) {
            Session session = factory.openSession();
            Transaction t = session.beginTransaction();

            session.save(book);
            t.commit();
            session.close();
        }
        public void getFromDB(){

            Session session = factory.openSession();
            Transaction t= session.beginTransaction();
//            Book book=session.get(Book.class, 101);
            String hql= "FROM Book";
            List<Book> list=session.createQuery(hql).list();
//            List<Book> result=query.list();
            t.commit();
            session.close();
            System.out.println(list);
        }
        public void close(){
            factory.close();

        }



}
