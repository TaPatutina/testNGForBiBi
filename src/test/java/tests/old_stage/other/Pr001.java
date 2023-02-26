package tests.old_stage.other;/*аноним, главная страница*/

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;


public class Pr001 {

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


            List<WebElement> nav_main_bottom = (new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions
                            .presenceOfAllElementsLocatedBy(By.xpath("//*[@id='main-container']/header/nav"))));



            WebElement call_us_number = driver.findElement(By.cssSelector(".call-us__number"));
            String tel_number = call_us_number.getText();
            Assert.assertEquals(tel_number, "8 495 755-99-99");



            WebElement call_us_icon = (new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'icon icon--phone-ring']"))));




            WebElement write_us_header = (new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id='main-container']/header/div[2]/div/ul[1]/li[2]/div[2]/button"))));
            String write_us_top = write_us_header.getText();
            Assert.assertEquals(write_us_top, "Связаться с нами");

            Actions action_write_us = new Actions(driver);
            action_write_us.moveToElement(write_us_header).perform();
            Thread.sleep(1000);

            WebElement popup_write_us_top1 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'write-us__dropdown']//span"))));
            String popup_write_us_top1_text = popup_write_us_top1.getText();
            Assert.assertEquals(popup_write_us_top1_text, "Запрос менеджеру\n" +
                    "по подбору запчастей");






            WebElement bsn_region = (new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id='main-container']/header/div[2]/div/ul[1]/li[3]/a"))));



            WebElement way_to_get = (new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id='main-container']/header/div[2]/div/ul[1]/li[4]/span/a"))));




            System.out.println("Элементы nav-top гл.страницы для анонима - ОК");





            System.out.println("Автотест: Элементы гл.страницы - ОК");


        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            Thread.sleep(1000);
            driver.quit();
        }





    }
}
