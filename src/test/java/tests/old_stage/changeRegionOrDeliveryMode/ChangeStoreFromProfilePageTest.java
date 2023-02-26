package tests.old_stage.changeRegionOrDeliveryMode;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.old_stage.autorization.LoginPage;
import pages.old_stage.autorization.PagesMyAccount;
import pages.old_stage.header.ChangeRegion;
import pages.old_stage.header.HeaderTop;
import pages.old_stage.header.Plashka;

import java.time.Duration;

public class ChangeStoreFromProfilePageTest {
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


            //СОЗДАТЬ ОБЪЕКТ  Plashka
            Plashka plashka = new Plashka(driver);


            //согласиться с городом > панель уточнения локализации закрылась
            plashka.clickAgreeWithTheCity();


            //СОЗДАТЬ ОБЪЕКТ  HeaderTop
            HeaderTop headerTop = new HeaderTop(driver);

            //отображается кнопка Войти в хедере
            headerTop.isSignInBtnToBe();


            //СОЗДАТЬ ОБЪЕКТ  LoginPage
            LoginPage loginPage = new LoginPage(driver);

            //кликнуть Войти в шапке
            loginPage.SignInFromHeader();
            //отображается попап авторизации
            Assert.assertTrue(loginPage.isPopupAuthorizationToBe());
            //залогиниться
            loginPage.signIn("tapatutinabibi@ya.ru", "123456");


            //отображается кнопка Выйти в хедере
            headerTop.isSignOutBtnToBe();
            //кликнуть на имя профиля в хедере
            headerTop.clickOnProfileBtn();



            //СОЗДАТЬ ОБЪЕКТ  PagesMyAccount
            PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

            //открывается страница ЛК
            pagesMyAccount.isPageProfileInfoToBe();



            //СОЗДАТЬ ОБЪЕКТ ChangeRegion
            ChangeRegion changeRegion = new ChangeRegion(driver);

            // установить через хедер регион Москва, магазин 017_Химки > в хедере отображ Химки Молодежная
            changeRegion.putFromHeaderMskPos017Chimki();

            Thread.sleep(100);
            //страница профиля > блок Магазин самовывоза > кликнуть Сменить магазин > выбрать из списка на карте Полбина,6 > магаз сменился в шапке и в блоке профиля
            pagesMyAccount.setStore020FromProfile();








            System.out.println("ChangeStoreFromProfilePageTest: смена магазина в блоке 'Магазин самовывоза' профиля  = ОК");


        } catch (InterruptedException e ) {
            e.printStackTrace();
            Thread.sleep(100);
        } finally  {
            Thread.sleep(50);
            driver.quit();
        }
    }
}