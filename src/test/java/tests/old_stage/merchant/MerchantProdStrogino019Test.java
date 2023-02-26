package tests.old_stage.merchant;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.old_stage.header.Plashka;
import pages.old_stage.pricing.MerchantStage;

import java.time.Duration;

public class MerchantProdStrogino019Test {
    private WebDriver driver;



    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1400, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }





    @Test
    public void MerchantProdStrogino019Test() throws InterruptedException {
        try {
            //ВНИМАНИЕ! ЭТО ПРОД!
            driver.get("https://bi-bi.ru/productPricing?oem=OP595&brand=FILTRON");
            Thread.sleep(1000);

            //создать объект  Plashka
            Plashka plashka = new Plashka(driver);



            /*согласиться с городом*/
            WebElement plashka1 = (new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.cssSelector("button.btn.btn--white.js-close-panel.js-region-select-link"))));
            plashka1.click();


            //создать объект MerchantStage
            MerchantStage merchantStage = new MerchantStage(driver);
            //дождаться появления предложений
            merchantStage.waitPricingOriginalListVisible();



            //есть предложение поставщика1
            merchantStage.isOfferFromSupplier1ForStage();

            //есть предложение поставщика2
            merchantStage.isOfferFromSupplier2ForStage();










        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally  {
            Thread.sleep(50);
            driver.quit();
        }
    }
}