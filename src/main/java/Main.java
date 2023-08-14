import java.io.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main  {


    public static void main(String[] args)
throws IOException, ClassNotFoundException {



        Adscraper mainScrap = new Adscraper();
        mainScrap.allLinks();
//
//

       ConfDB conf=new ConfDB();


//        String title= conf.findByAuthor();
           //Tutaj
        String collectedTitle=conf.collectTitleDB("sklep KsiążkiPoAngielsku.pl - Steward Chris Driving over lemons");
        String collectedPrice =conf.collectPriceDB("6,00zł");
        System.out.println(collectedTitle);
        System.out.println(collectedPrice);

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

        conf.close();
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

