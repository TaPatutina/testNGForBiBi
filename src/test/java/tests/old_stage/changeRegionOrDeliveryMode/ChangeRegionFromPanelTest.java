package tests.old_stage.changeRegionOrDeliveryMode;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.old_stage.header.Plashka;

import java.time.Duration;


public class ChangeRegionFromPanelTest {
    WebDriver driver;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1400, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }





    @Test
    public void chooseRegion() throws InterruptedException {
        try {
            driver.get("https://bi-bi.ru/catalogto");
            Thread.sleep(100);


            //создать объект  Plashka Class
            Plashka plashka = new Plashka(driver);
            //проверить наличие элементов плашки согласия с регионом
            plashka.isElementsOfPlashkaToBe();


            //кликнуть Выбрать другой регион
            plashka.clickChooseAnotherRegionBtn();
            Thread.sleep(100);

            //выбранный по умолчанию регион
            String popupLocationSelectedRegionName = plashka.isSelectedRegionName();
            Assert.assertEquals(popupLocationSelectedRegionName, "Москва");

            //кликнуть на Санкт-Петербург
            plashka.clickToRegionLink_SPb();

            //плашка закрылась
            Assert.assertFalse(plashka.isAgreeWithTheCityBtnTextVisible());

            //в шапке отображается регион СПб
            String nameOfRegionInHeader = plashka.isNameOfRegionInHeader();
            Assert.assertEquals(nameOfRegionInHeader, "Санкт-Петербург");


            //в шапке по умолчанию отображается способ получения - Самовывоз из магазина
            String nameOfDeliveryModeInHeader = plashka.isNameOfDeliveryModeInHeader();
            Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");


            //в шапке по умолчанию отображается магазин СПб. Шлиссельбургский пр-т
            String nameOfStoreInHeader = plashka.isNameOfStoreInHeader();
            Assert.assertEquals(nameOfStoreInHeader, "СПб. Шлиссельбургский пр-т");


            System.out.println("PanelChooseRegionTest: Сменить регион через плашку = ОК");

        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally  {
            Thread.sleep(50);
            driver.quit();
        }
    }
}
