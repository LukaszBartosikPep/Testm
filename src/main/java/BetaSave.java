import java.io.*;
import java.util.List;
public class BetaSave {
    public String fileName;

    public BetaSave(String fileName) {

        this.fileName=fileName;




//
    }



    public void saveBook(List<Book> books) { //Przekazywany jako argument jest obiekt klasy Book
        //Żeby móc używać obiektu musze go przekazac do metody
//        System.out.println("Tytuł"+book.getTitle()+"Desc"+book.getDesc());
        //Czemu przekazuje zmienne z klasy book, zamiast pobierac metode klasy Adscraper


        ///Lepiej pojedyczna metoda do jednej ksiazki
        //

        try(PrintWriter out =new PrintWriter(fileName)){
            for(Book zapis:books) {
                out.println(zapis.getTitle()); //Wywołanie metody
                out.println(zapis.getDesc());  //To są metody obiektu
                out.println(zapis.getPrice());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}