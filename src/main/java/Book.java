//import javax.persistence.*;
import javax.persistence.*;

@Entity
@Table(name="warehouse")
public class Book  {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer id=null;
    ///Czy to sluży min. do przekazywania zmiennych?

    public String title;



    public String desc;


    public String price;


    public Book(){

    }


    public Book(String title, String desc,String price){

        this.title=title;
        this.desc = desc;
        this.price=price;
//        this.id=id;

    }



    public Integer getId(){

        return id;
    }

    public void setId(Integer id){
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
    public void setDesc(String desc){
        this.desc = desc;

    }
    public String getPrice(){


        return price;
    }
    public void  setPrice(String price){
        this.price=price;

    }

    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", price='" + price + '\'' +

                '}';
    }
}
