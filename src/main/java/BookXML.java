public class BookXML {

    public int id;
    ///Czy to sluży min. do przekazywania zmiennych?

    public String title;



    public String desc;


    public String price;


//    public Book(){
//
//    }


    public BookXML(){

//        this.title=title;
//        this.desc=desc;
//        this.price=price;
//        this.id=id;

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
//                "id=" + id +
                ", title='" + title + '\'' +
//                ", desc='" + desc + '\'' +
                ", price='" + price + '\'' +

                '}';
    }
}
