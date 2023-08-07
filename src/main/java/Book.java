import java.io.Serializable;

public class Book implements Serializable {

    ///Czy to sluży min. do przekazywania zmiennych?
    public String title;
    public String desc;

    public String price;



    public Book(String title, String desc,String price){

        this.title=title;
        this.desc=desc;
        this.price=price;

    }


    public String getTitle(){




        ///Better change value with setters
        return title;
    }
    public String getDesc(){
        return desc;

    }
    public String getPrice(){


        return price;
    }
}
