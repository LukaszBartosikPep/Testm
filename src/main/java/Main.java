import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
public class Main {


    public static void main(String[] args) {

         Adscraper mainScrap=new Adscraper();

        mainScrap.allLinks();
        mainScrap.retrieveAll();//Zwraca liste
        Save saveIt = new Save("Data.txt");

        saveIt.saveBook();

        for(Book book:mainScrap.retrieveAll()){   //Czemu tutaj jest Book book i co to jest.
            //Book to obiekt klasy Book, book to przypadkowa zmienna
            System.out.println(book.getTitle());
            //Pętla idzie poprzez wszystkie elementy
            System.out.println(book.getDesc());
            System.out.println(book.getPrice());


        }


//
        ArrayList<String> list = (ArrayList<String>) mainScrap.urlList;
//

    }
}