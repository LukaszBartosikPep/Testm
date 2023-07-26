import java.util.List;

public class Main {


    public static void main(String[] args) {
        int idBook=1;
        int secDec=2;
        String title="None";
        String desc="None";
         Adscraper bookOne=new Adscraper();

         bookOne.allLinks();
         int size=bookOne.size;
         System.out.println(size);
         for(int i=1;i<size-15;i++){
         title= bookOne.retrieveTitle(i);
         desc=bookOne.retrieveDesc(i);

    }
//         System.out.println(title);
//         System.out.println(desc);



         Save saveBook = new Save(title, desc);

         saveBook.saveTitle();
         saveBook.saveDesc();
         saveBook.saveText();



    }
}