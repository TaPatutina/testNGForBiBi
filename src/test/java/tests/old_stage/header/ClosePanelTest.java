package tests.old_stage.header;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.old_stage.header.Plashka;

import java.time.Duration;


public class ClosePanelTest {
    WebDriver driver;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1440, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }





    @Test
    public void closePlashka() throws InterruptedException {
        try {
            driver.get("https://bi-bi.ru/catalogto");
            Thread.sleep(100);


            //создать объект  Plashka Class
            Plashka plashka = new Plashka(driver);

            //дождаться открытия и проверить наличие элементов панели уточнения локализации
            plashka.isElementsOfPlashkaToBe();


            //согласиться с городом
            plashka.clickAgreeWithTheCity();


            //плашка закрылась
            Assert.assertFalse(plashka.isAgreeWithTheCityBtnTextVisible());


            System.out.println("ClosePanelTest: Согласиться с городом = ОК");


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(100);
            driver.quit();
        }
    }
}
