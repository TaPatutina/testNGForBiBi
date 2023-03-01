package tests.old_stage.autorization;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.old_stage.autorization.OldLoginPage;
import pages.old_stage.autorization.PagesMyAccount;
import pages.old_stage.header.HeaderTop;
import pages.old_stage.header.Plashka;

import java.time.Duration;

public class SimpleAuthorizationFromHeaderTest {
    private WebDriver driver;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1440, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }


    @Test
    public void simpleAuthorizationFromHeaderTest() throws InterruptedException {
        try {
            driver.get("https://bi-bi.ru/product/e0000042894");
            Thread.sleep(100);


            //создать объект  Plashka
            Plashka plashka = new Plashka(driver);
            //проверить наличие элементов панели уточнения локализации
            plashka.isElementsOfPlashkaToBe();
            //согласиться с городом
            plashka.clickAgreeWithTheCity();
            //плашка закрылась(быстрая проверка по тексту "Да, верно")
            Assert.assertFalse(plashka.isAgreeWithTheCityBtnTextVisible());


            //создать объект  HeaderTop
            HeaderTop headerTop = new HeaderTop(driver);


            //создать объект  LoginPage
            OldLoginPage oldLoginPage = new OldLoginPage(driver);
            //отображается кнопка Войти в хедере
            headerTop.isSignInBtnToBe();
            //кликнуть Войти в шапке
            oldLoginPage.SignInFromHeader();
            //отображается попап авторизации
            Assert.assertTrue(oldLoginPage.isPopupAuthorizationToBe());
            //залогиниться
            oldLoginPage.signIn("tapatutinabibi@ya.ru", "123456");


            //отображается кнопка Выйти в хедере
            headerTop.isSignOutBtnToBe();
            //кликнуть на имя профиля в хедере
            headerTop.clickOnProfileBtn();


            //создать объект  PagesMyAccount
            PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);
            //открывается страница ЛК
            pagesMyAccount.isPageProfileInfoToBe();

            //есть крошка Главная
            pagesMyAccount.isBreadcrumb1();
            //есть крошка Профиль
            pagesMyAccount.isBreadcrumb2Profile();


















            System.out.println("SimpleAuthorizationFromHeaderTest: авторизация из хедера на странице каталога, корзина пустая = ОК");


        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally  {
            Thread.sleep(50);
            driver.quit();
        }
    }
}
