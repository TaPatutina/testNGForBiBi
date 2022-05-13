package tests.stage.other;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.stage.header.Plashka;

import java.time.Duration;

public class PlashkaTest {


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
            driver.get("https://bi-bi.ru/contacts");
            Thread.sleep(1000);


            //создать объект  Plashka
            Plashka plashka = new Plashka(driver);
            //согласиться с городом
            plashka.clickAgreeWithTheCity();
            //плашка закрылась
            Assert.assertFalse(plashka.isAgreeWithTheCityBtnTextVisible());


            System.out.println("Автотест: Согласиться с городом = ОК");
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally  {
            Thread.sleep(50);
            driver.quit();
        }
    }
}