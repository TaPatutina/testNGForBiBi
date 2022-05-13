package tests.stage.orders.anonymous;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.stage.header.ChangeRegion;
import pageObject.stage.header.Plashka;
import pageObject.stage.orders.order;

import java.time.Duration;

public class order1DomesticProductToStoreOfflinePaymentTest {
    WebDriver driver;


    @BeforeTest (groups = {"smokeTest", "regress", "elements", "orders"})
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1440, 1400));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }





    @Test (groups = {"smokeTest", "regress", "elements", "orders"})
    public void orderMerchProductToStoreOnlinePayment () throws InterruptedException {
        try {

            //открыть страницу каталога Масляные фильтры с сортировкой по цене asc
            driver.get("https://bi-bi.ru/catalog/filtry-dlya-avto/masljanyj-filtr/?sort=price-asc");
            Thread.sleep(100);


            //СОЗДАТЬ ОБЪЕКТ  Plashka
            Plashka plashka = new Plashka(driver);
            //согласиться с городом > панель уточнения локализации закрылась
            plashka.clickAgreeWithTheCity();

            //СОЗДАТЬ ОБЪЕКТ ChangeRegion
            ChangeRegion changeRegion = new ChangeRegion(driver);
            // установить через хедер регион Тверь, магазин Калинина > в хедере отображ Тверь Калинина
            changeRegion.putFromHeaderTverPos285Kalinina();

            //СОЗДАТЬ ОБЪЕКТ order
            order order = new order(driver);

            //со страницы каталога (с сортировкой) кликнуть "Купить" в миникарточке ассортиментного товара >  откроется попап "Положить в корзину"
            order.clickBuyInDomesticProdCardFromCategoryPage();

            //в попапе "Купить" для ассортиментного товара кликнуть "В корзину" > кнопка изменится на "Перейти в корзину"
            order.clickAddToCartBtnInDomesticPopup();

            //в попапе "Купить" для ассортиментного товара кликнуть "Перейти в корзину" > откроется страница корзины
            order.clickMoveToCartBtnInDomesticPopup();

            //на странице корзины кликнуть "Продолжить"  > откроется страница чекаута
            order.clickContinueBtnInCartPage();

            //выбрать оплату при получении
            order.selectOfflinePaymentInCheckoutPage();

            //заполнить данные получателя на чекауте и отправить заказ  > переход на страницу "Спасибо за заказ"
            order.fillDetailsAndSendOrder(
            "один domestic товар",
            "ооо",
            "79999999999",
            "bi-bi@ya.ru");





            Thread.sleep(100);
            System.out.println("order1DomesticProductToStoreOfflinePaymentTest: Заказать 1 ассортиментный товар с доставкой в магазин Тверь пр-т Калинина, аноним, оплата при получении = ОК");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally  {
            Thread.sleep(50);
            driver.quit();
        }
    }
}
