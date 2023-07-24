import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.List;

public class Adscraper {

    private String title;
    public String urls;
    private WebDriver driver;

    public void allLinks() {
        System.setProperty("webdriver.ie.driver", "C:/Users/lbartosik/OneDrive - PEPCO/Pulpit/IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.get("https://ksiazkipoangielsku.pl/18-adventure-novels?n=20&id_category=18");
        List<WebElement> element = driver.findElements(By.className("product_desc"));
        for (WebElement elementy : element) {
            urls = elementy.getAttribute("href");
////            urls=elementy.getText();
            System.out.println(urls);
//        }


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
            driver.quit();
//        if (urls.contains("http")){
//            System.out.println("Yes");
//        }
        }

//    public retrieveTitle(){
//
//
//    }
//
//    public retrieveImage(){
//
//    }
//    public retrieveDesc(){
//
//    }
//    public save(){
//
//    }

    }
}