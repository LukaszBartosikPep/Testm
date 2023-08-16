import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import javax.xml.bind.JAXBException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.List;
import java.io.IOException;
public class SaveToXML {







    public void save(List<Book> book)throws  IOException{

        XStream xstream = new XStream();
        XStream xsstream = new XStream(new StaxDriver());

        String dataXml=xsstream.toXML(book);
        System.out.println(dataXml);
        try (PrintWriter out = new PrintWriter("filename.txt")) {
            out.println(dataXml);
        }




    }
}
