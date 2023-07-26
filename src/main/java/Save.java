import java.io.*;

public class Save {
    public String desc;
    public String title;

    public Save(String title, String desc) {
        this.title=title;
        this.desc=desc;
    }

    public String saveTitle() {
//        System.out.println(title);
        return title;
    }

    public String saveDesc() {
//        System.out.println(desc);
        return desc;


    }

    public void saveText() {
        System.out.println("Tytuł"+title+"Desc"+desc);
        try(PrintWriter out =new PrintWriter("Data.txt")){
            out.println(title);
            out.println(desc);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}