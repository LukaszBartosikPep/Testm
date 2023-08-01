import java.io.*;
import java.util.List;

public class SaveXML implements Serializable{

    String desc;
    String price;
    List<Book> books;

    public SaveXML(String desc,String price){

        this.price=price;
        this.desc=desc;



    }





}
