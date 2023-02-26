package tests.old_stage.modal;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class LP_vin1 {
    WebDriver driver;




    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1400, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }



    @Test

    public void LP_vin1() throws InterruptedException {
        try {
            driver.get("https://bi-bi.ru/podbor");
            Thread.sleep(2000);



            String title = driver.getTitle();
            Assert.assertEquals(title, "Подбор автозапчастей по госномеру | Би-Би");



            WebElement description = driver.findElement(By.xpath("/html/head/meta[11]"));
            String descr = description.getDomProperty("content");
            Assert.assertEquals(descr, "");

/*видимость элементов топа*/
            List<WebElement> header_box = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'header-box']")));


/*кликнуть Связаться с нами в топе*/
            WebElement write_us_top = driver.findElement(By.xpath("//*[@class = 'btn btn-outline-info mr-3 write-us__btn d-none d-md-block']"));
            write_us_top.click();


/*проверить элементы формы Отправить запрос менеджеру*/
          Boolean modal_title = new WebDriverWait(driver, Duration.ofSeconds(3))
                  .until(ExpectedConditions.textToBe(By.xpath("(//*[@id = 'write-us-modal___BV_modal_title_'])[text()]"), "Отправить запрос менеджеру"));


            /*заполнить появившуюся форму Отправить запрос менеджеру*/

            WebElement write_us_top1 = driver.findElement(By.xpath("//input[@id = 'request-email']"));
            write_us_top1.sendKeys("kjglgjhf");


            WebElement write_us_top2 = driver.findElement(By.xpath("//input[@id = 'request-phone']"));
            write_us_top2.sendKeys("99999999999");


            WebElement write_us_top3 = driver.findElement(By.xpath("//input[@id = 'request-vin']"));
            write_us_top3.sendKeys(" 99999 999fпропhj999 ");


            WebElement write_us_top4 = driver.findElement(By.xpath("//textarea[@id = 'request-message']"));
            write_us_top4.sendKeys(" 9999 9999fпропhj9995999 ");


            //кликнуть Отправить
            WebElement write_us_submit = driver.findElement(By.xpath("//button[@class = 'btn btn-primary btn-lg btn-lg--sm-txt float-right']"));
            write_us_submit.click();

            //появится алерт
            WebElement write_us_success1 = driver.findElement(By.xpath("//*[@id = 'write-us-success___BV_modal_body_']"));

            //в алерте есть текст "Спасибо, ваше сообщение отправлено!"
            Boolean write_us_success = new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions.textToBe(By.xpath("//*[@id = 'write-us-success___BV_modal_body_']/p[text()]"), "Спасибо, ваше сообщение отправлено!"));

            //кликнуть ОК на алерте "Спасибо, ваше сообщение отправлено!"
            WebElement btn_ok = driver.findElement(By.xpath("//*[@class = 'btn btn-primary']"));
            btn_ok.click();

            //алерт закрылся
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.stalenessOf(write_us_success1));

            System.out.println("LP_vin1: Отправка формы с VIN из  лендинга подбора по госномеру - ОК");







        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            Thread.sleep(1000);
            driver.quit();
        }
    }
}
