import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "test")
public class Book  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;
    ///Czy to sluży min. do przekazywania zmiennych?
    @Column(name = "title")
    public String title;


    @Column(name="desc")
    public String desc;
    @Column(name="price")

    public String price;


    public Book(){

    }


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

    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +

                '}';
    }
}
