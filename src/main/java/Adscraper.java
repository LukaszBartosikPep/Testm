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
    private String saved;
    private String pageTitle;
    private WebDriver driver;

    private List<String> urlList =new ArrayList<>();

    public Adscraper(int decision){
        System.setProperty("webdriver.ie.driver", "C:/Users/lbartosik/OneDrive - PEPCO/Pulpit/IEDriverServer.exe");
        this.driver = new InternetExplorerDriver();
        this.decision=decision;
//        String driver ="OK";
    }
    public void allLinks() {

        driver.get("https://ksiazkipoangielsku.pl/18-adventure-novels?n=20&id_category=18");


        List<WebElement> element = driver.findElements(By.cssSelector("div.center_block h3 a"));



        for (WebElement elementy : element) {
            urls = elementy.getAttribute("href");

            urlList.add(urls);
        }



        }


    public String retrieveTitle(){
        driver.get(urlList.get(decision));
        pageTitle = driver.getTitle();


        return pageTitle;

    }
//
//    public retrieveImage(){
//
//    }
    public String retrieveDesc(){
        driver.get(urlList.get(decision));
        WebElement desc=driver.findElement(By.cssSelector("div.rte p"));
        System.out.println(decision);
//
//        System.out.println(desc.getText());
        saved= desc.getText();

        driver.quit();
        return saved;

    }
    public void save(){
        System.out.println("The title is:  "+pageTitle);
        System.out.println("The description is:  "+ saved);
    }

    }
