package tests.stage.orders.anonymous;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.stage.header.Plashka;
import pageObject.stage.orders.order;

import java.time.Duration;

public class order1MixProductToStoreOnlinePaymentTest {
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


            //СОЗДАТЬ ОБЪЕКТ order
            order order = new order(driver);

            //со страницы каталога (с сортировкой) кликнуть "Купить" в миникарточке ассортиментного товара >  откроется попап "Положить в корзину"
            order.clickBuyInDomesticProdCardFromCategoryPage();

            //в попапе "Купить" для ассортиментного товара кликнуть "В корзину" > кнопка изменится на "Перейти в корзину"
            order.clickAddToCartBtnInDomesticPopup();

            //открыть страницу каталога "Универсальный набор инструментов"
            driver.get("https://bi-bi.ru/catalog/instrument/nabory-instrumentov/universalniy-nabor-instrumentov/");
            Thread.sleep(100);

            //со страницы каталога (с сортировкой) кликнуть "Подробнее" в миникарточке неассортиментного товара >  откроется страница неассортиментного товара
            order.goToMerchProdPageFromCategoryPage();

            //в карточке неассортиментного товара кликнуть "Показать предложения" > откроются предложения
            order.clickShowOffersBtn();

            //в карточке неассортиментного товара кликнуть "Купить" > откроется попап "Положить в корзину"
            order.clickBuyInMerchProdPage();

            //в попапе "Купить" для неассортиментного товара кликнуть "В корзину" > кнопка изменится на "Перейти в корзину"
            order.clickAddToCartBtnInMerchPopup();

            //в попапе "Купить" для неассортиментного товара кликнуть "Перейти в корзину" > откроется страница корзины
            order.clickMoveToCartBtnInMerchPopup();

            //на странице корзины кликнуть "Продолжить"  > откроется страница чекаута
            order.clickContinueBtnInCartPage();

            //выбрать оплату Банковской картой на сайте
            order.selectOnlinePaymentInCheckoutPage();

            //заполнить данные получателя на чекауте и отправить заказ  > откроется страница  страница оплаты
            order.fillDetailsAndSendOrder(
                    "микс товары",
                    "ооо",
                    "79999999999",
                    "bi-bi@yandex.ru");

            //ждем открытия страницы сбера для оплаты онлайн, оплачиваем MasterCard > переход на страницу "Спасибо за заказ"
            order.correctOnlinePaymentMasterCard(
                    "0000 5555 5555 0000",
                    "1224",
                    "123");



            Thread.sleep(100);
            System.out.println("order1MixProductToStoreOnlinePaymentTest: Заказать 1 ассортиментный товар + 1 неассортиментный товар с доставкой в магазин, аноним, онлайн оплата = ОК");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally  {
            Thread.sleep(50);
            driver.quit();
        }
    }
}
