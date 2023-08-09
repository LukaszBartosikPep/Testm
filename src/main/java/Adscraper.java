import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class Adscraper {


    public String urls;

//    private String pageTitle;
    private WebDriver driver;

//    public int size;  //usunac
   public List<String> urlList =new ArrayList<>();
    public List<String> sublist =new ArrayList<>();
    public Adscraper(){
        System.setProperty("webdriver.ie.driver", "C:/Users/lbartosik/OneDrive - PEPCO/Pulpit/IEDriverServer.exe");
        this.driver = new InternetExplorerDriver();

//        String driver ="OK";
    }
    public void allLinks() {

        driver.get("https://ksiazkipoangielsku.pl/18-adventure-novels?n=20&id_category=18");


        List<WebElement> elementList = driver.findElements(By.cssSelector("div.center_block h3 a"));



        for (WebElement element : elementList) {
            urls = element.getAttribute("href");

            urlList.add(urls);
        }
        sublist = urlList.subList(urlList.size() - 13, urlList.size());
        sublist.clear();
//        sublist = urlList.remove(urlList.size()-7);
//        int size=urlList.size();
//        System.out.println(urlList);


        }


        public List<Book> retrieveAll(){ ///Dane o wszystkich ksiazkach

            List<Book> nList=new ArrayList<>();

            for (String url: urlList){   //Przechodzi przez wszystkie url w liście: ekwiwalent size.


                 nList.add(retrieveBook(url));     //Dodaje do nowej listy wszystkie desc i title.
                //ur jest w tym przypadku wszystkie url po kolei z urlList.
            }

        return nList;    //Zwrócona lista jest typu Book

        //Przez wszystkie linki i pobierac jedna ksiazke
            //Zapsiywac do nowej listy
        //Jaką tu dać pętle
        //For loop for all links
            //and return to Main
            //Przypisac do nowej listy za pomoca petli.




        }


//    }

    public Book retrieveBook(String url){ //Ta metoda kiedy jest uruchamiana przekazuje zmienne do Book.
        //
        driver.get(url);
        WebElement desc=driver.findElement(By.cssSelector("div.rte p"));
        WebElement price=driver.findElement(By.id("our_price_display"));
        String pageTitle = driver.getTitle();
        int id=101;
        return new Book(pageTitle, desc.getText(), price.getText(), id);



    }
//





//

    }
