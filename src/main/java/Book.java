//import javax.persistence.*;
import javax.persistence.*;

@Entity
@Table(name="warehouse")
public class Book  {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id=null;


    public String title;



    public String desc;


    public String price;


    public Book(){

    }


    public Book(String title, String desc,String price){

        this.title=title;
        this.desc = desc;
        this.price=price;


    }



    public Long getId(){

        return id;
    }

    public void setId(Long id){
        this.id=id;


    }


    public String getTitle(){





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
