import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
public class Main {


    public static void main(String[] args) {

         Adscraper mainScrap=new Adscraper();

        mainScrap.allLinks();
//        mainScrap.retrieveAll();//Zwraca liste
        Save saveIt = new Save("Data.txt");

        List<Book> books=mainScrap.retrieveAll();

        saveIt.saveBook(books);

//        for(Book book:mainScrap.retrieveAll()){
//            //Deklaracja obiektu
//            //Pętla przez
//            //Book to obiekt klasy Book, book to przypadkowa zmienna
////            System.out.println(book.getTitle());
////            //Pętla idzie poprzez wszystkie elementy
////            System.out.println(book.getDesc());
////            System.out.println(book.getPrice());
//            saveIt.saveBook(book);
//            //Inside book i have all the data
//            //Musze przekazać dane, get i set
//            //Tutaj book to jest reprezentacja wszystkich danych
//
//        }


//
        ArrayList<String> list = (ArrayList<String>) mainScrap.urlList;
//

    }
}