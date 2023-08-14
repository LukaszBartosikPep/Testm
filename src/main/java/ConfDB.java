import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import java.util.ArrayList;
//import javax.persistence.Query;
import java.util.List;
import java.util.*;
public class ConfDB {

    SessionFactory factory;
//    public List<Book> listOfBooks = new ArrayList<>();   //Usunąć. Czy opisuje klase?


    public ConfDB() {
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


//    int listLength;
    List<Book> listOfTitles = new ArrayList<>();
    public String collectTitleDB(String title) {
        //Najlepiej return
//
        Session session = factory.openSession();
//
        Query query =session.createQuery("SELECT title FROM Book WHERE title= :title") ;        //Cały
//
        query.setParameter("title",title);
//
        listOfTitles=query.list();
        String titles = listOfTitles.toString();
//        t.commit(); ///?
        session.close();
//
        return titles;



    }


    List<Book> listOfPrice=new ArrayList<>();
    public String collectPriceDB(String price){
        Session session = factory.openSession();
        Query query=session.createQuery("SELECT price FROM Book WHERE price= :price");
        query.setParameter("price", price);

        listOfPrice=query.list();

        String prices=listOfPrice.toString();

        session.close();

//        System.out.println(prices);





        return prices;
    }

    public void close() {
        factory.close();

    }

}
//        String contain;  //Nie potrzebne
//        public String findByAuthor(){
////            System.out.println(content);
//                for(int i=0; i<listOfBooks.size();i++) {  ///Foreach mozna uzyc
//                    if (listOfBooks.get(i).contains("Foster Alan Dean")) {  //Nieczytelne, dodac opis author.
//                        String title = listOfBooks.get(i);
//
//                    }
//                }
//
////                System.out.println(contain);
//                return title;













