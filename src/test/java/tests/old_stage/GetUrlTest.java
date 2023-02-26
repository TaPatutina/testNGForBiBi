package tests.old_stage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;


public class GetUrlTest {
    WebDriver driver;


    @BeforeTest (groups = {"smokeTest", "regress", "elements"})
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1440, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }




    @Parameters({"url"})
    @Test (groups = {"smokeTest", "regress", "elements"})
    public void closePlashka() throws InterruptedException {
        try {
            driver.get("https://bi-bi.ru/");
            Thread.sleep(1000);


            Boolean currentUrl = (new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlToBe("https://bi-bi.ru/")));


            System.out.println("GetUrlTest: currentUrl = ОК");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally  {
            Thread.sleep(50);
            driver.quit();
        }
    }
}
