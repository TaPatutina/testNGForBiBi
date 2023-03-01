package tests.old_stage.changeRegionOrDeliveryMode;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.old_stage.header.Ok_ChangeRegion;
import pages.old_stage.header.Plashka;

import java.time.Duration;

public class OkChangeRegionEmptyCartTest {
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
            Ok_ChangeRegion okChangeRegion = new Ok_ChangeRegion(driver);
            //в шапке отображается регион Москва
            String nameOfRegionInHeader = okChangeRegion.isNameOfRegionInHeader();
            Assert.assertEquals(nameOfRegionInHeader, "Москва");
            //в шапке по умолчанию отображается способ получения - Самовывоз из магазина
            String nameOfDeliveryModeInHeader = okChangeRegion.isNameOfDeliveryModeInHeader();
            Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
            //в шапке по умолчанию отображается магазин СПб. Шлиссельбургский пр-т
            String nameOfStoreInHeader = okChangeRegion.isNameOfStoreInHeader();
            Assert.assertEquals(nameOfStoreInHeader, "Москва Строгинский б-р");
            //кликнуть на регион (город)
            okChangeRegion.clickChangeRegionBtn();
            // открывается попап локации
            okChangeRegion.isElementsOfPopupLocationToBe();
            //попап локализации отображается (проверка по тексту "Выберите город")
            Assert.assertTrue(okChangeRegion.isTitleOfPopupLocationVisible());
            //выбранный в попапе по умолчанию регион - Москва
            String popupLocationSelectedRegionName = okChangeRegion.isSelectedRegionName();
            Assert.assertEquals(popupLocationSelectedRegionName, "Москва");
            //кликнуть на Санкт-Петербург
            okChangeRegion.clickToRegionLink_SPb();

            //в шапке отображается регион СПб
            String nameOfRegionInHeader2 = okChangeRegion.isNameOfRegionInHeader();
            Assert.assertEquals(nameOfRegionInHeader2, "Санкт-Петербург");
            //в шапке по умолчанию отображается способ получения - Самовывоз из магазина
            String nameOfDeliveryModeInHeader2 = okChangeRegion.isNameOfDeliveryModeInHeader();
            Assert.assertEquals(nameOfDeliveryModeInHeader2, "Самовывоз из магазина");
            //в шапке по умолчанию отображается магазин СПб. Шлиссельбургский пр-т
            String nameOfStoreInHeader2 = okChangeRegion.isNameOfStoreInHeader();
            Assert.assertEquals(nameOfStoreInHeader2, "СПб. Шлиссельбургский пр-т");
            //попап локализации не отображается
            Assert.assertFalse(okChangeRegion.isPopupLocationDisplayed());


            //снова кликнуть на город в шапке
            okChangeRegion.clickChangeRegionBtn();
            //выбранный в попапе по умолчанию регион - Санкт-Петербург
            String popupLocationSelectedRegionName2 = okChangeRegion.isSelectedRegionName();
            Assert.assertEquals(popupLocationSelectedRegionName2, "Санкт-Петербург");
            //ввести название существующего города в поле поиска в попапе локализации, кликнуть на подсказку - регион в шапке поменяется на выбранный
            okChangeRegion.searchAvailableRegion("Лобня");
            //попап локализации не отображается
            Assert.assertFalse(okChangeRegion.isPopupLocationDisplayed());



            //снова кликнуть на город в шапке
            okChangeRegion.clickChangeRegionBtn();
            //ввести название несуществующего города в поле поиска в попапе локализации - отобразится некликабельная подсказка "Название города введено не верно" //changeRegion.searchMissingRegion("Moskva");
            okChangeRegion.searchMissingRegion("Moskva");
            //закрыть попап локализации крестиком
            okChangeRegion.clickClosePopupLocationBtn();
            //попап локализации не отображается
            Thread.sleep(500);
            Assert.assertFalse(okChangeRegion.isPopupLocationDisplayed());


            System.out.println("ChangeRegionEmptyCartTest: смена региона из хедера на странице Авторезина, корзина пустая, аноним  = ОК");



        } catch (InterruptedException e) {
            e.printStackTrace();
        }  finally  {
            Thread.sleep(50);
            driver.quit();
        }
    }
}
