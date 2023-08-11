import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;
import java.util.*;
public class ConfDB {

        SessionFactory factory;
        public List<String> listOfBooks =new ArrayList<>();


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
        String content;
        int listLength;
        public void collectFromDB(String contain){
        //Najlepiej return

            Session session = factory.openSession();
            Transaction t= session.beginTransaction();
//            Book book=session.get(Book.class, 101);
            String hql= "SELECT title FROM Book WHERE title ?";
            hql.setString(1,contain);
            listOfBooks=session.createQuery(hql).list();
//            List<Book> result=query.list();
//            List<Book> nList=new ArrayList<>(list);
//            content= String.valueOf(list.get(0).toString());
            content=listOfBooks.toString();
            t.commit();
            session.close();
            System.out.println(contain);
//            listLength=list.size();

        }
        public void close(){
            factory.close();

        }
        String contain;
        public String findByAuthor(){
//            System.out.println(content);
                for(int i=0; i<listOfBooks.size();i++) {
                    if (listOfBooks.get(i).contains("Foster Alan Dean")) {
                        contain = listOfBooks.get(i);

                    }
                }
//                System.out.println(contain);
                return contain;








        }



}
