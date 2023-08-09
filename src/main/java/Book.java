import java.io.Serializable;

public class Book  {

    ///Czy to sluży min. do przekazywania zmiennych?
    public String title;
    public String desc;

    public String price;
    public int id;



    public Book(String title, String desc,String price, int id){

        this.title=title;
        this.desc=desc;
        this.price=price;
        this.id=id;

    }

    public int getId(){

        return id;
    }

    public void setId(int id){
        this.id=id;

    }


    public String getTitle(){




        ///Better change value with setters
        return title;
    }
    public void setTitle(String title){
        this.title=title;

    }
    public String getDesc(){
        return desc;

    }
    public void  setDesc(String desc){
        this.desc=desc;

    }
    public String getPrice(){


        return price;
    }
    public void  setPrice(String price){
        this.price=price;

    }
}
