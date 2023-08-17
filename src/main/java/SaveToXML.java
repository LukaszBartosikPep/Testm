import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import javax.xml.bind.JAXBException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.List;
import java.io.IOException;
public class SaveToXML {







    public void save()throws  IOException{
        ConfDB conf=new ConfDB();
        String title=null;
        String price=null;
        String desc = null;
        int id = 0;
        BookXML booksXML=new BookXML();
        for (Book book: conf.collectTokensDB("sklep KsiążkiPoAngielsku.pl - Steward Chris Driving over lemons","6,00zł" )){
            title=book.getTitle();
            price=book.getPrice();
            desc=book.getDesc();
            id=book.getId();
//            System.out.println(title+price+desc);
            booksXML.setId(id);
            booksXML.setTitle(title);
            booksXML.setDesc(desc);
            booksXML.setPrice(price);

        }






//        books.setTitle();

//        XStream xstream = new XStream();
        XStream xstream = new XStream();

        String dataXml=xstream.toXML(booksXML);
//        System.out.println(dataXml);
        FileWriter writer= new FileWriter("file.xml");
        writer.write(dataXml);
        writer.flush();
        writer.close();





    }
}
