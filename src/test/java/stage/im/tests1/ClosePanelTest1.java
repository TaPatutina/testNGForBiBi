package stage.im.tests1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import stage.im.pageobject1.Plashka1;

import java.time.Duration;


public class ClosePanelTest1 {
    WebDriver driver;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1400, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }





    @Test
    public void closePlashka() throws InterruptedException {
        try {
            driver.get("https://bi-bi.ru/catalogto");
            Thread.sleep(2000);

            //Create object of Plashka Class
            Plashka1 plashka = new Plashka1(driver);
            plashka.clikOnClose_panel();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }






    @AfterClass
    public void close() {
        driver.close();
    }

}
