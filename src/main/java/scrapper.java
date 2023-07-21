import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;
public class scrapper {

    private WebDriver driver;
    public scrapper(){
        // Set the path to the Internet Explorer driver executable
        System.setProperty("webdriver.ie.driver", "C:/Users/lbartosik/OneDrive - PEPCO/Pulpit/IEDriverServer.exe");


        driver = new InternetExplorerDriver();



    }
    public void getElement(){
        driver.get("https://ksiazkipoangielsku.pl/18-adventure-novels?n=20&id_category=18");

//        String pageTitle = driver.getTitle();
//        System.out.println("Page title: " + pageTitle);
//        WebElement element = driver.findElement(By.className("block_content"));
//        WebElement element = driver.findElement(By.cssSelector("h4"));
        List<WebElement> elements=driver.findElements(By.tagName("h3"));
//        String head=element.getAttribute("a href");
//        System.out.println(head);

        for (WebElement elementy : elements) {
            System.out.println(elementy.getText());
        }

        driver.quit();
    }
}