import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class Adscraper {

    private int decision;
    private String title;
    public String urls;
    private WebDriver driver;

    private List<String> url =new ArrayList<>();

    public Adscraper(int decision){
        System.setProperty("webdriver.ie.driver", "C:/Users/lbartosik/OneDrive - PEPCO/Pulpit/IEDriverServer.exe");
        this.driver = new InternetExplorerDriver();
//        String driver ="OK";
    }
    public void allLinks() {

        driver.get("https://ksiazkipoangielsku.pl/18-adventure-novels?n=20&id_category=18");


        List<WebElement> element = driver.findElements(By.cssSelector("div.center_block h3 a"));


//        List<WebElement> element = driver.findElements(By.tagName("h3"));
        for (WebElement elementy : element) {
            urls = elementy.getAttribute("href");
//            urls=elementy.getText();
            url.add(urls);
        }


//        System.out.println(url);
//        WebElement element = driver.findElement(By.id("product_list"));
//
////        List<WebElement> elements2=element.findElements(By.className("product_img_link"));
//        WebElement elements2=element.findElement(By.tagName("h3"));
//        List<WebElement> elements3=elements2.findElements(By.tagName("a"));
//        for (WebElement elementy : elements3) {
//            urls=elementy.getAttribute("href");
////            urls=elementy.getText();
//            System.out.println(urls);
//        }

//        if (urls.contains("http")){
//            System.out.println("Yes");
//        }
        }
//    public int getDecision(){
//        return decision;
//    }

    public void retrieveTitle(){
        driver.get(url.get(decision));
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);


    }
//
//    public retrieveImage(){
//
//    }
    public void retrieveDesc(){
        driver.get(url.get(decision));
        WebElement desc=driver.findElement(By.cssSelector("div.rte p"));
        System.out.println(decision);
//
        System.out.println(desc.getText());
        driver.quit();

    }
//    public save(){
//
//    }

    }
