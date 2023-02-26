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


public class Index {

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



            /* хедер верхний уровень все элементы */
            List<WebElement> nav_main_top = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .presenceOfAllElementsLocatedBy(By.xpath(""))));

            /* лого */
            WebElement logo = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.cssSelector(""))));



            /* номер телефона */
            WebElement call_us_number = driver.findElement(By.cssSelector(".call-us__number"));
            String tel_number = call_us_number.getText();
            Assert.assertEquals(tel_number, "8 495 755-99-99");



            /* иконка  телефона */
            WebElement call_us_icon = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'icon icon--phone-ring']"))));



            /* Перезвоните мне */
            WebElement call_me = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));
            String call_me_text = call_me.getText();
            Assert.assertEquals(call_me_text, "Перезвоните мне");




            /* Связаться с нами */
            WebElement write_us_top = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));
            String write_us_top_text = write_us_top.getText();
            Assert.assertEquals(write_us_top_text, "Связаться с нами");



            /* навести курсор на Связаться с нами */
            Actions write_us_top1 = new Actions(driver);
            write_us_top1.moveToElement(write_us_top).build().perform();
            Thread.sleep(20000);



            /* форма связи в хедере все элементы */
            List<WebElement> form_write_us_top_all = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .presenceOfAllElementsLocatedBy(By.xpath(""))));





            /* иконка  бизнес-региона */
            WebElement bsn_reg_icon = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));





            /* название  бизнес-региона */
            WebElement bsn_reg_name = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));





            /* иконка  способа получения в хедере */
            WebElement store_icon_top = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));





            /* способ получения */
            WebElement deliverymode = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));
            String deliverymode_text = deliverymode.getText();
            Assert.assertEquals(deliverymode_text, "Самовывоз из магазина");





            /* место получения */
            WebElement sitestore_displeyName = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));
            String sitestore_displeyName_text = sitestore_displeyName.getText();
            Assert.assertEquals(sitestore_displeyName_text, "Москва Строгинский б-р");





            /* иконка  избранного  в хедере - только для авторизованного пользователя */
            WebElement cor_icon_top = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));





            /* счетчик  избранного  в хедере - только для авторизованного пользователя, только есть товары в избранном (?) */
            WebElement favorite_counter_top = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));





            /* избранное текст - только для авторизованного пользователя */
            WebElement favorite_header = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));
            String favorite_header_text = favorite_header.getText();
            Assert.assertEquals(favorite_header_text, "Избранное");





            /* иконка  сравнения  в хедере */
            WebElement compare_icon_top = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));





            /* счетчик  сравнения в хедере - только есть товары в сравнении (?)*/
            WebElement compare_counter_top = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));





            /* сравнение текст */
            WebElement compare_header = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));
            String compare_header_text = compare_header.getText();
            Assert.assertEquals(compare_header_text, "Сравнение");





            /* иконка  корзины  в хедере */
            WebElement minicart_icon_top = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));





            /* счетчик  корзины в хедере - только если есть товар в корзине */
            WebElement minicart_counter_top = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));





            /* корзина текст */
            WebElement minicart_header = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));
            String minicart_header_text = minicart_header.getText();
            Assert.assertEquals(minicart_header_text, "Корзина");




            /* корзина в хедере весь блок */
            WebElement minicart = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));



            /* навести курсор на корзину в хедере */
            Actions HoverMinicart = new Actions(driver);
            HoverMinicart.moveToElement(minicart).build().perform();
            Thread.sleep(2000);



            /* для анонима - иконка входа */
            WebElement login_icon = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));



            /* для анонима - текст "Войти" */
            WebElement login = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));
            String login_text = login.getText();
            Assert.assertEquals(login_text, "Войти");



            /* для залогиненного пользователя - иконка профиля */
            WebElement profile_icon = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));



            /* для залогиненного пользователя - имя профиля */
            WebElement profile_name = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));
            String profile_name_text = profile_name.getText();
            Assert.assertEquals(profile_name_text, "имя");







            System.out.println("Автотест: Элементы хедер верхний уровень гл.страницы для анонима - ОК");








            /* кнопка Каталог товаров */
            WebElement header_catalog_btn = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));
            String header_catalog_btn_text = header_catalog_btn.getText();
            Assert.assertEquals(header_catalog_btn_text, "Каталог товаров");




            /* селект типов поиска */
            WebElement search_type_select = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));
            String search_type_select_text = search_type_select.getText();
            Assert.assertEquals(search_type_select_text, "Везде");




            /* поле поиска */
            WebElement search_field_1 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));
            String search_field_1_holder = search_field_1.getAttribute("placeholder");
            Assert.assertEquals(search_field_1_holder, "Поиск по артикулу или названию");




            /* кнопка Найти */
            WebElement search_btn = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));
            String search_btn_text = search_btn.getText();
            Assert.assertEquals(search_btn_text, "Везде");





            /* иконка на кнопке Найти */
            WebElement search_icon = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));





            /* кнопка Подобрать детали */
            WebElement search_marka_btn = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));
            String search_marka_text = search_marka_btn.getText();
            Assert.assertEquals(search_marka_text, "Подобрать детали под автомобиль");





            /* иконка на кнопке Подобрать детали */
            WebElement search_marka_icon = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath(""))));





            System.out.println("Автотест: Элементы хедер нижний  уровень гл.страницы для анонима - ОК");






            /* главная карусель баннеров */


            List<WebElement> banners = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .presenceOfAllElementsLocatedBy(By.xpath(""))));











            System.out.println("Автотест: Элементы блока баннеров гл.страницы для анонима - ОК");






            System.out.println("Автотест: Элементы хедер нижний  уровень гл.страницы для анонима - ОК");


            /* хедер нижний уровень все элементы */
            List<WebElement> nav_main_bottom = (new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions
                            .presenceOfAllElementsLocatedBy(By.xpath(""))));








            System.out.println("Автотест: Элементы гл.страницы - ОК");


        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            Thread.sleep(1000);
            driver.quit();
        }





    }
}
