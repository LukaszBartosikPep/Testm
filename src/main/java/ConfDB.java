import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
      ///To tez jest pole klasy, pomimo ze ponizej.

    public List<Book> collectTokensDB(String title, String price) {
//        List<Book> listOfTitle= null;
//        List<Book> listOfPrice= null;
        List<Book> listOfTokens=new ArrayList<>();
        //Najlepiej return
//
        Session session = factory.openSession();
//
        Query query =session.createQuery("FROM Book WHERE price= :price");
//        Query query =session.createQuery("FROM Book WHERE price= :price AND title= :title");//Powinno być *.
//
//        query.setParameter("title",title);
        query.setParameter("price", price);
        //ONE query usage
//        Query queryP=session.createQuery("FROM Book WHERE price= :price");   ///Całe obiekty, powinno zwracac wszystko.
//
//
//        listOfTokens=queryT.list();
//        listOfTokens=queryP.list();
//        listOfTokens.add(queryT);
        listOfTokens.addAll(query.list());
//        listOfTokens.addAll(queryP.list());

        
//        String titles = listOfTitles.toString();
//        t.commit(); ///?
        session.close();
//
        return listOfTokens;

        ///Return lista ksiazke, aby móc działać dalej na liście.




    }



//    public List<Book> collectPriceDB(String price){
//        List<Book> listOfPrice;
//        Session session = factory.openSession();
//        Query query=session.createQuery("SELECT * FROM Book WHERE price= :price");   ///Całe obiekty, powinno zwracac wszystko.
//        query.setParameter("price", price);
//
//        listOfPrice=query.list();
//
////        String prices=listOfPrice.toString();
//
//        session.close();
//
////        System.out.println(prices);
//
//
//
//
//
//        return listOfPrice;
//    }

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













