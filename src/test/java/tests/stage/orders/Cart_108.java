//аноним, элементы попапа "Купить" для ассортим.товара Аккумулятор FORSE 60 Ач 600А
package tests.stage.orders;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.stage.orders.PopapAddToCart;
import pageObject.stage.header.Plashka;

import java.time.Duration;


public class Cart_108 {
    WebDriver driver;


    @BeforeTest (groups = {"elements", "regress"})
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1400, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }





    @Test (groups = {"elements", "regress"})
    public void popapAddToCart_BI30200_elements () throws InterruptedException {
        try {

         //открыть страницу товара BI30200
        driver.get("https://bi-bi.ru/product/e0000034180");
        Thread.sleep(1000);


        //создать объект PopapAddToCart
        PopapAddToCart pageProduct_BI30200 = new PopapAddToCart(driver);


        //создать объект closePlashka
        Plashka plashka = new Plashka(driver);


        //проверить, что он открыт
        /*Assert.assertTrue(plashka.isPageOpened());*/


        //согласиться с городом
        plashka.clickAgreeWithTheCity();


        //есть текст Купить на кнопке
        Assert.assertTrue(pageProduct_BI30200.isClickAdd_to_cartButtonText());


        //кликнуть на Add_to_cartButton
        pageProduct_BI30200.clickAdd_to_cartButton();


        //есть текст Аккумулятор FORSE 60 Ач 600А на попапе
        String H1Text = pageProduct_BI30200.isH1Text();
        Assert.assertEquals(H1Text, "Аккумулятор FORSE 60 Ач 600А");


        //есть текст Производитель:
        Assert.assertTrue(pageProduct_BI30200.isVendorText());


        //есть текст  FORSE
        String popup_cart_brandName = pageProduct_BI30200.isVendorName();
        Assert.assertEquals(popup_cart_brandName, "FORSE");


        //есть текст Код товара:
        Assert.assertTrue(pageProduct_BI30200.isOemText());


        //есть текст  BI30200
        String OemCode = pageProduct_BI30200.isOemCode();
        Assert.assertEquals(OemCode, "BI30200");


        //есть текст Магазин:
        Assert.assertTrue(pageProduct_BI30200.isStoreText());


        //есть текст Москва Строгинский б-р:
        String Popup_cart_add_Store_text = pageProduct_BI30200.isPopup_cart_add_Store_text();
        Assert.assertEquals(Popup_cart_add_Store_text, "Москва Строгинский б-р");


        //есть текст Доступно для заказа:
        Assert.assertTrue(pageProduct_BI30200.isPopup_cart_availableText());


        //есть цена
        WebElement popup_cart_price = (new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions
                      .visibilityOfElementLocated(By.xpath("//*[@class='price price--lg']"))));


        //есть текст Срок поставки:  от 0 дней:
        String Delivery_time_text = pageProduct_BI30200.isDelivery_time_text();
        Assert.assertEquals(Delivery_time_text, "Срок поставки:  от 0 дней");


        //есть предустановленное мин кол-во "1"
        String cart_spinner_input_text = pageProduct_BI30200.isPopup_cart_spinner_input_text();
        Assert.assertEquals(cart_spinner_input_text, "1");


        //есть кнопка В корзину
        Assert.assertTrue(pageProduct_BI30200.isPopup_cart_add_btn_text());


        //есть кнопка Выберите другой магазин
        Assert.assertTrue(pageProduct_BI30200.isPopup_btn_change_another_store_text());


        //закрыть попап
        pageProduct_BI30200.clickClosePopup_cart_add();





        Thread.sleep(100);
        System.out.println("Cart_108(popapAddToCart_BI30200_elements): Элементы попапа 'Купить' = аноним, ассортим.товар, в наличии = ОК");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally  {
            Thread.sleep(50);
            driver.quit();
        }
    }
}


