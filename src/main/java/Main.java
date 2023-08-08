import java.io.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class Main {


    public static void main(String[] args)
throws IOException, ClassNotFoundException {

//        Save con=new Save();

        Adscraper mainScrap = new Adscraper();
        mainScrap.allLinks();
//
    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
    SessionFactory factory=meta.getSessionFactoryBuilder().build();
    Session session=factory.openSession();
    Transaction t=session.beginTransaction();


    HiberBook hiber=new HiberBook();



System.out.println(hiber.getTitle());

//

//



//
//
        for (Book book : mainScrap.retrieveAll()) {
//
////

            hiber.setId(101);
            hiber.setTitle(book.getTitle());
            hiber.setDesc(book.getDesc());
            hiber.setPrice(book.getPrice());
//
//
        }


        session.save(hiber);
        t.commit();
        factory.close();
        session.close();
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

