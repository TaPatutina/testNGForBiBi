package tests.stage.homePage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.stage.homePage.HomePagePlashka;
import pageObject.stage.homePage.HomePageHeaderTop;

import java.time.Duration;

public class HPHeaderTopTest {
    WebDriver driver;




    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1400, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }



    @Test

    public void HPHeaderTopTest() throws InterruptedException {
        try {
            driver.get("https://bi-bi.ru/");
            Thread.sleep(1000);


            //создать объект  HomePagePlashka
            HomePagePlashka homePagePlashka = new HomePagePlashka(driver);
            //согласиться с городом
            //homePagePlashka.clickAgreeWithTheCityIndex();
            //плашка закрылась
            Assert.assertFalse(homePagePlashka.isPanelOpenedIndex());



            //создать объект  HomePageHeaderTop
            HomePageHeaderTop homePageHeaderTop = new HomePageHeaderTop(driver);



            //есть логотип
            homePageHeaderTop.isLogoToBe();
            //кликнуть на логотип
            homePageHeaderTop.clickToLogo();



            //блок Позвоните мне
            //есть кнопка Позвоните мне
            homePageHeaderTop.isContactCallBoxToBe();
            //кликнуть на Позвоните мне
            homePageHeaderTop.clickCallMe();
            //открылась форма сообщения Позвоните мне
            homePageHeaderTop.isHomePagePopupCallBackToBe();
            //закрыть форму крестиком
            //homePageHeaderTop.clickToCloseModalCallMe();
             //форма Позвоните мне не отображается (проверяем по наличию заголовка формы)
            //Assert.assertFalse(homePageHeaderTop.isHomePagePopupCallTitle());




            //блок Связаться с нами
            //есть кнопка с текстом Связаться с нами
            Assert.assertTrue(homePageHeaderTop.isWriteUsHeaderBtnText());
            //навести курсор на кнопку Связаться с нами
            homePageHeaderTop.moveToElementWriteUsHeaderBtn();
            Thread.sleep(500);
            //отображается подсказка с текстом Запрос менеджеру на подбор а/з
            homePageHeaderTop.isWriteUsHeaderHintText();
            //кликнуть на подсказку
            homePageHeaderTop.clickWriteUsHeaderHint();
            //откроется форма Отправить запрос менеджеру для VIN


            /* //ХЗ почему не кликается кнопка закрыть текст политики
            homePageHeaderTop.isHomePagePopupWriteUsVinToBe();
            //кликнуть на ссылку Политики конфиденциальности
            homePageHeaderTop.clickPopupWriteUsToPolicyLink();
            //откроется текст Политики конфиденциальности
            homePageHeaderTop.isPopupWriteUsPolicyText();
            //закрыть крестиком текст Политики
            homePageHeaderTop.closePopupWriteUsPolicyText();*/


            Thread.sleep(500);
            //текст политики не отображается
            homePageHeaderTop.isPopupWriteUsPolicyTextInvisible();
            //закрыть форму
            homePageHeaderTop.closeHomePagePopupWriteUs();

            //навести курсор на кнопку Связаться с нами
            homePageHeaderTop.moveToElementWriteUsHeaderBtn();
            Thread.sleep(500);
            //отображается подсказка с текстом Запрос менеджеру на подбор а/з
            homePageHeaderTop.isWriteUsHeaderHintText();
            //кликнуть на подсказку
            homePageHeaderTop.clickWriteUsHeaderHint();
            //выбрать Введите марку авто
            homePageHeaderTop.clickChooseByCarBrand();
            //откроется форма Отправить запрос менеджеру для марки авто
            homePageHeaderTop.isHomePagePopupWriteUsMarkToBe();
            //закрыть форму
            homePageHeaderTop.closeHomePagePopupWriteUs();












            System.out.println("HPHeaderTopTest: Топ хедера на гл.странице = ОК");


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally  {
            Thread.sleep(50);
            driver.quit();
        }
    }
}