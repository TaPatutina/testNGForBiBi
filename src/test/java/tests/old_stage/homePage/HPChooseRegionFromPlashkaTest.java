package tests.old_stage.homePage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.old_stage.homePage.HomePagePlashka;

import java.time.Duration;


public class HPChooseRegionFromPlashkaTest {
    WebDriver driver;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1400, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }





    @Test
    public void HPChooseRegionFromPlashkaTest() throws InterruptedException {
        try {
            driver.get("https://bi-bi.ru");
            Thread.sleep(100);


            //создать объект  HomePagePlashka
            HomePagePlashka hpPlashka = new HomePagePlashka(driver);
            //проверить наличие элементов плашки согласия с регионом
            hpPlashka.isElementsOfPlashkaToBe();


            //кликнуть Выбрать другой регион
            hpPlashka.clickChooseAnotherRegionBtn();
            Thread.sleep(100);

            //выбранный по умолчанию регион
            String popupLocationSelectedRegionName = hpPlashka.isSelectedRegionName();
            Assert.assertEquals(popupLocationSelectedRegionName, "Москва");

            //кликнуть на Санкт-Петербург
            hpPlashka.clickToRegionLink_SPb();

            //плашка закрылась
            Assert.assertFalse(hpPlashka.isAgreeWithTheCityBtnTextVisible());

            //в шапке отображается регион СПб
            String nameOfRegionInHeader = hpPlashka.isNameOfRegionInHeader();
            Assert.assertEquals(nameOfRegionInHeader, "Санкт-Петербург");


            //в шапке по умолчанию отображается способ получения - Самовывоз из магазина
            String nameOfDeliveryModeInHeader = hpPlashka.isNameOfDeliveryModeInHeader();
            Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");


            //в шапке по умолчанию отображается магазин СПб. Шлиссельбургский пр-т
            String nameOfStoreInHeader = hpPlashka.isNameOfStoreInHeader();
            Assert.assertEquals(nameOfStoreInHeader, "СПб. Шлиссельбургский пр-т");


            System.out.println("HPChooseRegionFromPlashkaTest: Гл.страница: сменить регион через плашку = ОК");

        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            Thread.sleep(100);
            driver.quit();
        }
    }
}
