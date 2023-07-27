import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
public class Main {


    public static void main(String[] args) {
//        int idBook=1;
//        int secDec=2;
//        String title="None";
//        String desc="None";
         Adscraper mainScrap=new Adscraper();

        mainScrap.allLinks();
//         int size=mainScrap.size;
        ArrayList<String> list = (ArrayList<String>) mainScrap.urlList;
         System.out.println(list);

        Book collBook =new Book();


        Save saveBook = new Save("Data.txt");
//        for( String item : list.size()) {
            saveBook.saveBook(mainScrap.retrieveBook(4)); //Przekazuje do metody saveBook w Save
            //Nie powinna przekazywac najpierw do Book?

//         for(int i=1;i<size-15;i++){
//         title= mainScrap.retrieveTitle(i);
//         desc=mainScrap.retrieveDesc(i);
//
//    }
//         System.out.println(title);
//         System.out.println(desc);

//Foreach for all books and assign to book(?) and pass to save





//         saveBook.saveTitle();
//         saveBook.saveDesc();
//         saveBook.saveText();



    }
}