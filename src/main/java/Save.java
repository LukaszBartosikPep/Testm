import java.io.*;

public class Save {
    public String fileName;

    public Save(String fileName) {

        this.fileName=fileName;




//
    }



    public void saveBook(Book book) { //Przekazywany jako argument jest obiekt klasy Book
        //Tutaj przekazywane są również
//        System.out.println("Tytuł"+book.getTitle()+"Desc"+book.getDesc());
        //Czemu przekazuje zmienne z klasy book, zamiast pobierac metode klasy Adscraper
        try(PrintWriter out =new PrintWriter(fileName)){
            out.println(book.getTitle()); //Wywołanie metody
            out.println(book.getDesc());
            out.println(book.getPrice());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}