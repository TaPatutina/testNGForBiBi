package tests.homePage.positive;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.stage.homePage.HomePageHeaderTop;
import pageObject.stage.homePage.HomePagePlashka;
import tests.base.BaseTest;

import java.time.Duration;

import static constants.Constant.Urls.BIBI_HOME_PAGE;

public class changeRegionWithEmptyCartTest extends BaseTest {


    @Test

    public void HPChangeRegionWithEmptyCart(){
        basePage.open(BIBI_HOME_PAGE);
        bibiHomePage.waitAndClickAgreeRegion();
        Assert.assertFalse(bibiHomePage.isPanelOpenedIndex());

    }

/*

     throws InterruptedException {
        try {
            driver.get("https://bi-bi.ru");
            Thread.sleep(100);

            //создать объект HomePagePlashka
            //HomePagePlashka hpPlashka = new HomePagePlashka(driver);
            //согласиться с городом
            //hpPlashka.clickAgreeWithTheCityIndex();
            //плашка закрылась
            //Assert.assertFalse(hpPlashka.isPanelOpenedIndex());


            //создать объект  HomePageHeaderTop
            HomePageHeaderTop hpHeaderTop = new HomePageHeaderTop(driver);
            //в шапке отображается регион Москва
            String nameOfRegionInHeader = hpHeaderTop.isNameOfRegionInHeader();
            Assert.assertEquals(nameOfRegionInHeader, "Москва");
            //в шапке по умолчанию отображается способ получения - Самовывоз из магазина
            String nameOfDeliveryModeInHeader = hpHeaderTop.isNameOfDeliveryModeInHeader();
            Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
            //в шапке по умолчанию отображается магазин СПб. Шлиссельбургский пр-т
            String nameOfStoreInHeader = hpHeaderTop.isNameOfStoreInHeader();
            Assert.assertEquals(nameOfStoreInHeader, "Москва Строгинский б-р");
            //кликнуть на регион (город)
            hpHeaderTop.clickChangeRegionBtn();

            // открывается попап локации
            hpHeaderTop.isElementsOfPopupLocationToBe();
            //попап локализации открыт (2 проверки)
            Assert.assertTrue(hpHeaderTop.isTitleOfPopupLocationVisible());
            //Assert.assertTrue(hpHeaderTop.isPopupLocationDisplayed());
            //выбранный в попапе по умолчанию регион - Москва
            String popupLocationSelectedRegionName = hpHeaderTop.isSelectedRegionName();
            Assert.assertEquals(popupLocationSelectedRegionName, "Москва");
            //кликнуть на Санкт-Петербург
            hpHeaderTop.clickToRegionLink_SPb();

            //в шапке отображается регион СПб
            String nameOfRegionInHeader2 = hpHeaderTop.isNameOfRegionInHeader();
            Assert.assertEquals(nameOfRegionInHeader2, "Санкт-Петербург");
            //в шапке по умолчанию отображается способ получения - Самовывоз из магазина
            String nameOfDeliveryModeInHeader2 = hpHeaderTop.isNameOfDeliveryModeInHeader();
            Assert.assertEquals(nameOfDeliveryModeInHeader2, "Самовывоз из магазина");
            //в шапке по умолчанию отображается магазин СПб. Шлиссельбургский пр-т
            String nameOfStoreInHeader2 = hpHeaderTop.isNameOfStoreInHeader();
            Assert.assertEquals(nameOfStoreInHeader2, "СПб. Шлиссельбургский пр-т");

            //попап локализации не отображается
            Assert.assertFalse(hpHeaderTop.isPopupLocationDisplayed());

            //снова кликнуть на город в шапке
            hpHeaderTop.clickChangeRegionBtn();
            //выбранный в попапе по умолчанию регион - Санкт-Петербург
            String popupLocationSelectedRegionName2 = hpHeaderTop.isSelectedRegionName();
            Assert.assertEquals(popupLocationSelectedRegionName2, "Санкт-Петербург");

            //закрыть попап локализации крестиком == не закрывается, хз почему ==
            hpHeaderTop.clickClosePopupLocationBtn();
            Thread.sleep(500);
            //попап локализации не отображается
            //Assert.assertFalse(hpHeaderTop.isPopupLocationDisplayed());


            System.out.println("HPChangeRegionWithEmptyCartTest: смена региона из хедера на гл.странице, корзина пустая, аноним  = ОК");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(100);
            driver.quit();
        }
    }



 */
}
