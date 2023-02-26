package tests.old_stage.homePage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.old_stage.homePage.HomePagePlashka;
import pages.old_stage.homePage.HomePageHeaderTop;

import java.time.Duration;

public class HPHeaderModalCallbackTest {
    WebDriver driver;




    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1400, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }



    @Test

    public void HPHeaderModalCallbackTest() throws InterruptedException {
        try {
            driver.get("https://bi-bi.ru/");
            Thread.sleep(500);


            //создать объект  HomePagePlashka
            HomePagePlashka homePagePlashka = new HomePagePlashka(driver);
            //согласиться с городом
            //homePagePlashka.clickAgreeWithTheCityIndex();
            //плашка закрылась
            Assert.assertFalse(homePagePlashka.isPanelOpenedIndex());


            //создать объект  HomePageHeaderTop
            HomePageHeaderTop homePageHeaderTop = new HomePageHeaderTop(driver);



            //есть блок Позвоните мне
            homePageHeaderTop.isContactCallBoxToBe();



            //кликнуть на Позвоните мне
            homePageHeaderTop.clickCallMe();


            //открылась форма сообщения Позвоните мне
            homePageHeaderTop.isHomePagePopupCallBackToBe();


            //закрыть форму крестиком
            //homePageHeaderTop.clickToCloseModalCallMe();


            //форма Позвоните мне не отображается (проверяем по наличию заголовка формы)
            //Assert.assertFalse(homePageHeaderTop.isHomePagePopupCallTitle());

            //кликнуть на Позвоните мне
            //homePageHeaderTop.clickCallMe();


            //заполнить и отправить форму
            homePageHeaderTop.submitTheForm("Сто шестьдесят","Иванов","0000000160");





            //появился алерт Информация Заявка принята
            homePageHeaderTop.hasAlertSubmissionSuccessful();

            

            //форма Позвоните мне не отображается
            Assert.assertFalse(homePageHeaderTop.isHomePagePopupCallDisplayed());






            System.out.println("HPHeaderModalCallbackTest: отправка формы обратного звонка из хедера на гл.странице (аноним, пустая корзина, позитив) = ОК");


        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            Thread.sleep(100);
            driver.quit();
        }
    }
}


