import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import javax.xml.bind.JAXBException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
public class SaveToXML {







    public void save(List<Book> booksList)throws  IOException{
//        ConfDB conf=new ConfDB();
//        String dataXml="";
//
//        int id = 0;
//        BookXML booksXML=new BookXML();
        XStream xstream = new XStream();
        FileWriter writer= new FileWriter("file.xml");



        for (Book book:booksList){    //Dla kazdego kroku jeden obiekt  //Operuje zarazem na klasie jak i na liście
//            Book bokObj =new Book(); ///Zła praktyka?

//            book.setTitle(book.getTitle());  //Do obiektu klasy Book dodaje geter listy Book.
//            bokObj.setDesc(book.getDesc());
//            bokObj.setPrice(book.getPrice());   //
//            bokObj.setId(book.getId());            ///Po kolei kazdy obiekt, na kazdej iteracji inny BookA.-Tak dziala petla foreach
                                                    //
            String dataXml=xstream.toXML(book);
//        System.out.println(dataXml);
            writer.write(dataXml);
              ///To do pętli




        }

        writer.flush();   //To po pętli
        writer.close();

//        Book bok=new Book();
//        for (Book book: books){
//            book.setTitle();     // To jest metoda klasy Book, wywołana obiektem.
//            book.setId();           //Jak moge przekazac elementy listy do seter.
//            book.setPrice();
//            book.setDesc();

//            price=book.getPrice();
//            desc=book.getDesc();
//            id=book.getId();
            ///Jedna klasa Book.
            //Powinno przekazywac cala liste

//            System.out.println(title+price+desc);
           ;
//            booksXML.setId(id);
//            booksXML.setTitle(title);
//            booksXML.setDesc(desc);
//            booksXML.setPrice(price);

//        }
            //Stream przez pętlą

        ///W
//        String dataXml=xstream.toXML(bok);
////        System.out.println(dataXml);
//        FileWriter writer= new FileWriter("file.xml");
//        writer.write(dataXml);  ///To do pętli
//        writer.flush();   //To po pętli
//        writer.close();


//        books.setTitle();

//        XStream xstream = new XStream();






    }
}
