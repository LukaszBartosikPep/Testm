import java.io.*;

public class Save {
    public String fileName;

    public Save(String fileName) {

        this.fileName=fileName;




//        this.title=title;
//        this.desc=desc;  //nie opisuje klasy save, save to file
    }



    public void saveBook(Book book) { //Co to jest?
        System.out.println("Tytuł"+book.getTitle()+"Desc"+book.getDesc());
        //Czemu przekazuje zmienne z klasy book, zamiast pobierac metode klasy Adscraper
        try(PrintWriter out =new PrintWriter(fileName)){
            out.println(book.getTitle());
            out.println(book.getDesc());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}