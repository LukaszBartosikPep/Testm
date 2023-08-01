import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {


    public static void main(String[] args){


        connDB con=new connDB();

        con.connection();


//            throws IOException, ClassNotFoundException {
//
//        String desc;
//        String price;
//
//        Adscraper mainScrap = new Adscraper();
//
//        mainScrap.allLinks();
////        mainScrap.retrieveAll();//Zwraca liste
//        Save saveIt = new Save("Data.txt");
//
//        List<Book> books = mainScrap.retrieveAll();
//
//        saveIt.saveBook(books);
////        System.out.println(books);
//
//
//        for (Book book : mainScrap.retrieveAll()) {
////
//////            System.out.pshorintln(book.getTitle());
//////
//            desc = book.getDesc();
//            price = book.getPrice();
////            saveIt.saveBook(book);
////            //Inside book i have all the data
////            //Musze przekazać dane, get i set
////            //Tutaj book to jest reprezentacja wszystkich danych
////
////        }
//
//            SaveXML a = new SaveXML(desc, price);
//
//            FileOutputStream fos = new FileOutputStream("xyz1.xml");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(a);
////        oos.flush();
//
//
//            FileInputStream fis = new FileInputStream("xyz1.xml");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            SaveXML b = (SaveXML) ois.readObject();
//
//            System.out.println(b.desc+" "+ b.price);
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

