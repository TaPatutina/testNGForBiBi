package tests.stage.other;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class Рыба {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1400, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));




        try {
            driver.get("https://bi-bi.ru");
            Thread.sleep(2000);



            String title = driver.getTitle();
            Assert.assertEquals(title, "Купить запчасти для иномарок, автомобилей ВАЗ и автоаксессуары по выгодным ценам в интернет-магазине bi-bi.ru");



            WebElement description = driver.findElement(By.xpath("/html/head/meta[7]"));
            String descr = description.getDomProperty("content");
            Assert.assertEquals(descr, "Широкий ассортимент деталей, аксессуаров, товаров для автомобилей по низким ценам. Закажите автозапчасти от официальных производителей в интернет-магазине bi-bi.ru. Пункты выдачи по всей России.");


            /*согласиться с городом*/
            WebElement plashka = (new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.cssSelector("button.btn.btn--white.js-close-panel.js-region-select-link"))));
            plashka.click();


















            System.out.println("Автотест: tests.other.stage.Рыба - ОК");


        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            Thread.sleep(1000);
            driver.quit();
        }





    }
}
