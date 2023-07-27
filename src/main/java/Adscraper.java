import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class Adscraper {


    public String urls;
    public String saved;
    private String pageTitle;
    private WebDriver driver;

//    public int size;  //usunac
    public List<String> urlList =new ArrayList<>();

    public Adscraper(){
        System.setProperty("webdriver.ie.driver", "C:/Users/lbartosik/OneDrive - PEPCO/Pulpit/IEDriverServer.exe");
        this.driver = new InternetExplorerDriver();

//        String driver ="OK";
    }
    public void allLinks() {

        driver.get("https://ksiazkipoangielsku.pl/18-adventure-novels?n=20&id_category=18");


        List<WebElement> element = driver.findElements(By.cssSelector("div.center_block h3 a"));



        for (WebElement elementy : element) {
            urls = elementy.getAttribute("href");

            urlList.add(urls);
        }
        int size=urlList.size();


        }


        public List<Book> retrieveAll(){  //Jaką tu dać pętle
        //For loop for all links
            //and return to Main
            //Przypisac do nowej listy za pomoca petli.
            return urlList;



        }

//    public String retrieveTitle(int i){
//        driver.get(urlList.get(i));
//        pageTitle = driver.getTitle();
//
//        System.out.println(pageTitle);
//        return pageTitle;
//
//    }


    public Book retrieveBook(int i){
        driver.get(urlList.get(i));
        WebElement desc=driver.findElement(By.cssSelector("div.rte p"));
        pageTitle = driver.getTitle();
        return new Book(pageTitle, desc.getText()); ///cena, przekazuje do klasy book




    }
//    public Book retrievePrice(int i){
//
//        driver.get(urlList.get(i));
//
//    }
//
//    public retrieveImage(){
//
//    }
//    public String retrieveDesc(int i){
//        driver.get(urlList.get(i));
//        WebElement desc=driver.findElement(By.cssSelector("div.rte p"));
////        System.out.println(idBook);
////
//        System.out.println(desc.getText());
//        saved= desc.getText();
////        Save save=new Save(saved);
////        driver.quit();
//        return saved;
//
//    }
//    public void save(){
//        System.out.println("The title is:  "+pageTitle);
//        System.out.println("The description is:  "+ saved);
//    }

    }
