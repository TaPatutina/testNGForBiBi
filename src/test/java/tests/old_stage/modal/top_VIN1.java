/*Запрос на подбор а/з из хедера с указанием VIN (аноним, позитив)*/

package tests.old_stage.modal;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class top_VIN1 {
    private WebDriver driver;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1400, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }


    @Test
    public void top_VIN1() throws InterruptedException {
        try {
            driver.get("https://bi-bi.ru/catalogto");
            Thread.sleep(2000);



/*согласиться с городом*/
            WebElement plashka = (new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.cssSelector("button.btn.btn--white.js-close-panel.js-region-select-link"))));
            plashka.click();

/*Навести курсор на кнопку "Связаться с нами" в шапке сайта*/
            WebElement write_us_header = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'btn btn--grey-border write-us__btn btn--thin-border js-show-dropdown']"))));
            String write_us_text = write_us_header.getText();
            Assert.assertEquals(write_us_text, "Связаться с нами");
            Actions action_write_us = new Actions(driver);
            action_write_us.moveToElement(write_us_header).perform();
            Thread.sleep(1000);



/*Отобразится подсказка  "Запрос менеджеру по подбору запчастей"*/
            WebElement popup_write_us_top1 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'btn btn--link btn--multi-line btn--sm btn--block btn--text-left']"))));
            String popup_write_us_top1_text = popup_write_us_top1.getText();
            Assert.assertEquals(popup_write_us_top1_text, "Запрос менеджеру\n" +
                    "по подбору запчастей");



/*Кликнуть на подсказку "Запрос менеджеру по подбору запчастей"*/
            popup_write_us_top1.click();



/*Откроется форма "Отправить запрос менеджеру"*/
            List<WebElement> modal_write_us = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@id= 'popup-request']"))));




/*Заполнить поле "Как к Вам обращаться" валидным значением (символы А-Я, а-я, пробелы, дефисы)*/
            WebElement request_name = driver.findElement(By.xpath("//input[@id='request-name-popup']"));
            request_name.sendKeys("Иван ");


/*Заполнить поле "Телефон" валидным значением (10 цифр)*/
            WebElement request_phone = driver.findElement(By.xpath("//input[@id='request-phone-popup']"));
            request_phone.sendKeys("9999999999 ");


/*Заполнить поле "VIN" валидным значением*/
            WebElement request_vin = driver.findElement(By.xpath("//input[@id='request-vin-popup']"));
            request_vin.sendKeys("JTJZA11A602463781");


/*Заполнить поле "Сообщение" валидным значением  (любые символы)*/
            WebElement request_message = driver.findElement(By.xpath("//textarea[@id='request-message-popup']"));
            request_message.sendKeys("текст JTJZA11A6сообщение 02463781 ");


/*чекбокс Согласия с обработкой персональных данных предустановлен*/
            Boolean checkbox = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .elementToBeSelected(By.xpath("//*[@id='request-agree-popup']"))));



/*Кликнуть на ссылку в описании чекбокса согласия с политикой конфиденциальности в форме*/
            WebElement policy_link = driver.findElement(By.xpath("//*[@class = 'form-cols__col']//a[text()='Политикой']"));
            policy_link.click();



/*Попап Политики конфиденциальности отображается*/
            List<WebElement> policy_popup = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'fancybox-wrap fancybox-desktop fancybox-type-ajax fancybox-opened']"))));



/*Кликнуть на крестик закрытия текста политики конфиденциальности*/
            WebElement close_policy = driver.findElement(By.xpath("//*[@class = 'popup__close popup__close--content']"));
            close_policy.click();

/*Нажать кнопку Отправить*/
            WebElement btn_send = driver.findElement(By.xpath("(//*[@class = 'btn btn--lg btn--block'])[text()='Отправить']"));
            btn_send.click();


/*Отображается алерт об отправке*/
            WebElement alert = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id='popup-request-alert']"))));
            String alert_text = alert.getText();
            Assert.assertEquals(alert_text, "Информация\n" +
                    "Спасибо, ваше сообщение отправлено!\n" +
                    "Ок");


/*закрыть алерт об отправке*/
            WebElement close_alert = driver.findElement(By.xpath("(//*[@class = 'btn btn--lg pull-right js-ok-button'])[text()='Ок']"));
            close_alert.click();


/*алерт не отображается*/
            WebDriverWait closed_alert = new WebDriverWait(driver, Duration.ofSeconds(3));
            closed_alert.until(ExpectedConditions.not(ExpectedConditions
                    .visibilityOfElementLocated(By.xpath("//*[@id='popup-request-alert']"))));



            System.out.println("top_VIN1: Отправка формы запроса а/з с VIN из хедера страницы каталога ТО - ОК");


        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            Thread.sleep(100);
            driver.quit();
        }





    }
}
