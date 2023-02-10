package tests.stage.changeRegionOrDeliveryMode;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.stage.header.ChangeRegion;
import pageObject.stage.header.Plashka;

import java.time.Duration;

public class ChangeRegionEmptyCartTest {
    private WebDriver driver;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1400, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }


    @Test
    public void changeRegionWithEmptyCart() throws InterruptedException {
        try {
            driver.get("https://bi-bi.ru/catalog/shiny-diski/avtorezina/");
            Thread.sleep(300);


            //создать объект  Plashka
            Plashka plashka = new Plashka(driver);
            //проверить наличие элементов плашки согласия с регионом
            plashka.isElementsOfPlashkaToBe();
            //согласиться с городом
            plashka.clickAgreeWithTheCity();
            //плашка закрылась
            Assert.assertFalse(plashka.isAgreeWithTheCityBtnTextVisible());


            //СОЗДАТЬ ОБЪЕКТ ChangeRegion
            ChangeRegion changeRegion = new ChangeRegion(driver);
            //в шапке отображается регион Москва
            String nameOfRegionInHeader = changeRegion.isNameOfRegionInHeader();
            Assert.assertEquals(nameOfRegionInHeader, "Москва");
            //в шапке по умолчанию отображается способ получения - Самовывоз из магазина
            String nameOfDeliveryModeInHeader = changeRegion.isNameOfDeliveryModeInHeader();
            Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
            //в шапке по умолчанию отображается магазин СПб. Шлиссельбургский пр-т
            String nameOfStoreInHeader = changeRegion.isNameOfStoreInHeader();
            Assert.assertEquals(nameOfStoreInHeader, "Москва Строгинский б-р");
            //кликнуть на регион (город)
            changeRegion.clickChangeRegionBtn();
            // открывается попап локации
            changeRegion.isElementsOfPopupLocationToBe();
            //попап локализации отображается (проверка по тексту "Выберите город")
            Assert.assertTrue(changeRegion.isTitleOfPopupLocationVisible());
            //выбранный в попапе по умолчанию регион - Москва
            String popupLocationSelectedRegionName = changeRegion.isSelectedRegionName();
            Assert.assertEquals(popupLocationSelectedRegionName, "Москва");
            //кликнуть на Санкт-Петербург
            changeRegion.clickToRegionLink_SPb();

            //в шапке отображается регион СПб
            String nameOfRegionInHeader2 = changeRegion.isNameOfRegionInHeader();
            Assert.assertEquals(nameOfRegionInHeader2, "Санкт-Петербург");
            //в шапке по умолчанию отображается способ получения - Самовывоз из магазина
            String nameOfDeliveryModeInHeader2 = changeRegion.isNameOfDeliveryModeInHeader();
            Assert.assertEquals(nameOfDeliveryModeInHeader2, "Самовывоз из магазина");
            //в шапке по умолчанию отображается магазин СПб. Шлиссельбургский пр-т
            String nameOfStoreInHeader2 = changeRegion.isNameOfStoreInHeader();
            Assert.assertEquals(nameOfStoreInHeader2, "СПб. Шлиссельбургский пр-т");
            //попап локализации не отображается
            Assert.assertFalse(changeRegion.isPopupLocationDisplayed());


            //снова кликнуть на город в шапке
            changeRegion.clickChangeRegionBtn();
            //выбранный в попапе по умолчанию регион - Санкт-Петербург
            String popupLocationSelectedRegionName2 = changeRegion.isSelectedRegionName();
            Assert.assertEquals(popupLocationSelectedRegionName2, "Санкт-Петербург");
            //ввести название существующего города в поле поиска в попапе локализации, кликнуть на подсказку - регион в шапке поменяется на выбранный
            changeRegion.searchAvailableRegion("Лобня");
            //попап локализации не отображается
            Assert.assertFalse(changeRegion.isPopupLocationDisplayed());



            //снова кликнуть на город в шапке
            changeRegion.clickChangeRegionBtn();
            //ввести название несуществующего города в поле поиска в попапе локализации - отобразится некликабельная подсказка "Название города введено не верно" //changeRegion.searchMissingRegion("Moskva");
            changeRegion.searchMissingRegion("Moskva");
            //закрыть попап локализации крестиком
            changeRegion.clickClosePopupLocationBtn();
            //попап локализации не отображается
            Thread.sleep(500);
            Assert.assertFalse(changeRegion.isPopupLocationDisplayed());


            System.out.println("ChangeRegionEmptyCartTest: смена региона из хедера на странице Авторезина, корзина пустая, аноним  = ОК");



        } catch (InterruptedException e) {
            e.printStackTrace();
        }  finally  {
            Thread.sleep(50);
            driver.quit();
        }
    }
}
