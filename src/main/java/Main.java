import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {


    public static void main(String[] args)
throws IOException, ClassNotFoundException {

        DB con=new DB();
        Adscraper mainScrap = new Adscraper();
        mainScrap.allLinks();
//        List<Book> books = mainScrap.retrieveAll();
        con.saveBookDB(mainScrap.retrieveAll());



//
        String desc;
        String price;
        String title;
//



//
//
//        for (Book book : mainScrap.retrieveAll()) {
////
//////
//            title=book.getTitle();
//            desc = book.getDesc();
//            price = book.getPrice();
////
////
////        }
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

