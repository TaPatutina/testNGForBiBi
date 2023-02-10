package tests.stage.podbor;

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

public class GosNomer1 {
    WebDriver driver;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1400, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }


    @Test
    public void GosNomer1() throws InterruptedException {
        try {
            driver.get("https://stageim.tomail.ru/podbor");
            Thread.sleep(500);



            String title = driver.getTitle();
            Assert.assertEquals(title, "Подбор автозапчастей по госномеру | Би-Би");



            WebElement description = driver.findElement(By.xpath("/html/head/meta[11]"));
            String descr = description.getDomProperty("content");
            Assert.assertEquals(descr, "");

/*видимость элементов топа*/
            List<WebElement> header_box = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'header-box']")));


            Boolean h1 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .textToBe(By.xpath("//*[@class = 'h1']"), "ФЕДЕРАЛЬНАЯ СЕТЬ БИ-БИ ЭТО")));


            List<WebElement> moments = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'moments d-none d-md-flex']"))));


            Boolean title_lg_1 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .textToBe(By.xpath("//*[@class = 'title-lg-1 title-lg-1--uppercenter']"), "ПОДБОР АВТОЗАПЧАСТЕЙ ПО ГОСНОМЕРУ")));



            List<WebElement> aside = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'bordered-box auto-selection mt-0 mr-0']"))));


            WebElement jivo = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id = 'jvlabelWrap']"))));


//*Шаг 1. Введите госномер*/


            Boolean step1 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .textToBe(By.xpath("(//*[@class='auto-selection__step'])[1]"), "Шаг 1. Введите госномер")));


            WebElement input_number = driver.findElement(By.xpath("//input[@id='code-num']"));
            input_number.sendKeys("a333aa");


            WebElement input_region = driver.findElement(By.xpath("//input[@id='code-reg']"));
            input_region.sendKeys("77");

            WebElement btn_code_submit = driver.findElement(By.xpath("//*[@class = 'btn btn-lg btn-block btn-primary auto-selection__code-submit']"));
            btn_code_submit.click();


            Boolean cardata_name = (new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions
                            .textToBe(By.xpath("//*[@class = 'auto-selection__cardata-name h3']"), "РОЛЛС РОЙС КУЛЛИНАН, 2019 г.")));


            Boolean cardata_nums = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .textToBe(By.xpath("//*[@class = 'auto-selection__cardata-nums']"), "VIN: SCATV4107LU111265 | Госномер: А333АА77")));


            Boolean result_list = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .textToBe(By.xpath("//*[@class = 'auto-selection__result-list row row-cols-1 row-cols-md-2 no-gutters']"), "Год производства:\n" +
                                    "2019\n" +
                                    "Цвет:\n" +
                                    "Серый\n" +
                                    "Тип двигателя:\n" +
                                    "Бензиновый\n" +
                                    "Объем двигателя:\n" +
                                    "6749 куб.см\n" +
                                    "Расположение руля:\n" +
                                    "LEFT")));




/*Шаг 2. Выберите нужную категорию или введите название*/


            Boolean step2 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .textToBe(By.xpath("(//*[@class='auto-selection__step'])[2]"), "Шаг 2. Выберите нужную категорию или введите название")));


            List<WebElement> selection__items = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'auto-selection__items my-4']"))));




            WebElement item_1 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'auto-selection__item'])[1]"))));
            item_1.click();
            WebElement item_oil11 = driver.findElement(By.xpath("(//*[@class = 'auto-selection__item active'])[1]"));





            WebElement item_2 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'auto-selection__item'])[1]"))));
            item_2.click();
            WebElement item_oil12 = driver.findElement(By.xpath("(//*[@class = 'auto-selection__item active'])[2]"));





            WebElement item_3 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'auto-selection__item'])[1]"))));
            item_3.click();
            WebElement item_oil13 = driver.findElement(By.xpath("(//*[@class = 'auto-selection__item active'])[3]"));





            WebElement item_4 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'auto-selection__item'])[1]"))));
            item_4.click();
            WebElement item_oil14 = driver.findElement(By.xpath("(//*[@class = 'auto-selection__item active'])[4]"));





            WebElement item_5 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'auto-selection__item'])[1]"))));
            item_5.click();
            WebElement item_oil15 = driver.findElement(By.xpath("(//*[@class = 'auto-selection__item active'])[5]"));





            WebElement item_6 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'auto-selection__item'])[1]"))));
            item_6.click();
            WebElement item_oil16 = driver.findElement(By.xpath("(//*[@class = 'auto-selection__item active'])[6]"));





            WebElement item_7 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'auto-selection__item'])[1]"))));
            item_7.click();
            WebElement item_oil17 = driver.findElement(By.xpath("(//*[@class = 'auto-selection__item active'])[7]"));





            WebElement item_8 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'auto-selection__item'])[1]"))));
            item_8.click();
            WebElement item_oil18 = driver.findElement(By.xpath("(//*[@class = 'auto-selection__item active'])[8]"));





            WebElement item_9 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//label[@class = 'auto-selection__item']"))));
            item_9.click();

            /*дождаться невидимости элемента*/
            /*WebDriverWait wait_item_9 = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait_item_9.until(ExpectedConditions.not(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class = 'auto-selection__item']"))));*/


            WebElement item_oil19 = driver.findElement(By.xpath("(//*[@class = 'auto-selection__item active'])[9]"));
            item_oil19.click();


            /*дождаться видимости элемента*/
            WebElement item_free = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//label[@class = 'auto-selection__item']"))));


            /*заполнить поле Сообщение*/
            WebElement textarea = driver.findElement(By.xpath("//*[@id = 'additional-item']"));
            textarea.sendKeys("Не обращайте внимание, это тест");

            /*кликнуть Отправить*/
            WebElement btn_send = driver.findElement(By.xpath("//*[@class = 'auto-selection__submit btn btn-lg btn-block btn-primary']"));
            btn_send.click();


            /*Boolean jivotext = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions.attributeContains(By.xpath("//*[@id='scrollbar-container']//jdiv/text()"),"textContent","Автомобиль: РОЛЛС РОЙС КУЛЛИНАН " +
                            "VIN: SCATV4107LU111265 " +
                            "Категория или деталь: Масляный фильтр, Воздушный фильтр, Салонный фильтр, Масло моторное, Тормозные диски, Тормозные колодки, Щетки стеклоочистителя, Свечи, Не обращайте внимание, это тест")));

                            .visibilityOfElementLocated(By.xpath("//*[@id='scrollbar-container']//jdiv[text()='Автомобиль: РОЛЛС РОЙС КУЛЛИНАН\n" +
                                    "VIN: SCATV4107LU111265\n" +
                                    "Категория или деталь: Масляный фильтр, Воздушный фильтр, Салонный фильтр, Масло моторное, Тормозные диски, Тормозные колодки, Щетки стеклоочистителя, Свечи, Не обращайте внимание, это тест']"))));
                            */
            Thread.sleep(1000);

            System.out.println("Автотест: LP Подбор по госномеру - ОК");


        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            Thread.sleep(1000);
            driver.quit();
        }
    }
}
