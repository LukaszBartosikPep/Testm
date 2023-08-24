import java.io.*;
import java.util.List;
import java.util.ArrayList;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.xml.bind.JAXBException;

public class Main  {


    public static void main(String[] args)
            throws IOException, ClassNotFoundException, JAXBException {



        Adscraper mainScrap = new Adscraper();

       mainScrap.allLinks();
       List<Book> reboks= mainScrap.retrieveAll();
//
//        XStream xstream = new XStream();
//        XStream xsstream = new XStream(new StaxDriver());

       ConfDB conf=new ConfDB();
//            String title;
//            String price;
//        List<Book> books =conf.collectTokensDB("sklep KsiążkiPoAngielsku.pl - Steward Chris Driving over lemons","6,00zł" );
//        System.out.println(books);


        Book books=new Book();

//        books.setId(0);

        //Saving list from scrapper to DB.
       for(Book book: reboks){
           conf.saveToDB(book);




       }
//        conf.saveToDB(get);
        conf.close();
        SaveToXML stx=new SaveToXML();
//        stx.save(book);
//        String title;
//        for (Book book: conf.collectTokensDB("sklep KsiążkiPoAngielsku.pl - Steward Chris Driving over lemons","6,00zł" )){
//            title=book.getTitle();
//
//            System.out.println(title);
//        }





//        String dataXml=xstream.toXML(book);
//        System.out.println(dataXml);
//        for(Book book: conf.collectTokensDB("sklep KsiążkiPoAngielsku.pl - Steward Chris Driving over lemons","6,00zł" )){
////           title=book.getTitle();
//           price= book.getPrice();
//
//            System.out.println(price);
//        }


//        String title= conf.findByAuthor();
           //Tutaj
//        String collectedTitle=conf.collectTitleDB("sklep KsiążkiPoAngielsku.pl - Steward Chris Driving over lemons");
//        String collectedPrice =conf.collectPriceDB("6,00zł");
//        System.out.println(collectedTitle);
//        System.out.println(collectedPrice);

//       conf.conf();


//        HiberBook hiber=new HiberBook();


//        Book book=new Book(null,null, null,1);

//        conf(session).save(book);
//        hiber.setTitle("Set");
//
//        System.out.println(hiber.getTitle());

//        for (Book book : mainScrap.retrieveAll()){
////            Book book1=new Book(book.getTitle(),book.getDesc(),book.getPrice());
//            conf.saveToDB(book);
//
//        }


//


//
//
//        for (Book book : mainScrap.retrieveAll()) {
////
//////
//
//            hiber.setId(101);
//            hiber.setTitle(book.getTitle());
//            hiber.setDesc(book.getDesc());
//            hiber.setPrice(book.getPrice());
//            session.save(hiber);
//            System.out.println(book.getTitle());
////
//        }
//        t.commit();



//        factory.close(); ///inna metoda close

////
//            Book a = new Book(desc, price,title);
//
//            FileOutputStream fos = new FileOutputStream("xyz1.xml");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(a);
////        oos.flush();
//
//
//            FileInputStream fis = new FileInputStream("xyz1.xml");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            Book b = (Book) ois.readObject();
//
////            System.out.println(b.desc+" "+ b.price);
////
////            ois.close();
//////            oos.close();
//////            fos.close();
//
//        }
//
//
////

//

    }
}

