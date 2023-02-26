package tests.old_stage.accountPages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.old_stage.autorization.LoginPage;
import pages.old_stage.autorization.PagesMyAccount;
import pages.old_stage.header.HeaderTop;
import pages.old_stage.header.Plashka;

import java.time.Duration;

public class ProfilePageElementsTest {
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
            //согласиться с городом > панель уточнения локализации закрылась
            plashka.clickAgreeWithTheCity();



            //создать объект  HeaderTop
            HeaderTop headerTop = new HeaderTop(driver);

            //отображается кнопка Войти в хедере
            headerTop.isSignInBtnToBe();


            //создать объект  LoginPage
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



            //создать объект  PagesMyAccount
            PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);
            //открывается страница ЛК
            pagesMyAccount.isPageProfileInfoToBe();
            //есть крошка Главная
            pagesMyAccount.isBreadcrumb1();
            //есть крошка Профиль
            pagesMyAccount.isBreadcrumb2Profile();

/*
            //создать объект  ChangeRegion
            ChangeRegion changeRegion = new ChangeRegion(driver);
            // установить через хедер регион Москва, магазин Строгино
            changeRegion.putFromHeaderMskPos019Strogino();

            Thread.sleep(500);
            //сменить магазин из списка на карте на Полбина,6
            pagesMyAccount.changeStoreFromProfile();
*/


            //кликнуть Сменить магазин в профиле
            pagesMyAccount.clickChangeStoreFromProfile();

            //закрыть открывшуюся карту крестиком
            pagesMyAccount.clickClosePopupLocationBtn();

            //карта закрылась
            Assert.assertTrue(pagesMyAccount.isProfileMapShopsInvisible());

            //кликнуть Редактировать данные
            pagesMyAccount.editInfoFromProfile();

            //открывается форма редактирования личных данных
            pagesMyAccount.isPopupEditProfileInfoToBe();

            //закрыть форму редактирования личных данных > форма закрылась
            pagesMyAccount.closePopupEditProfileInfo();

            //кликнуть Сменить пароль
            pagesMyAccount.clickChangePassBtnInProfile();

            //открылась форма смены пароля
            pagesMyAccount.isPopupChangePassInProfileToBe();

            //закрыть форму пароля крестиком > форма закрылась
            pagesMyAccount.closePopupChangePassInProfile();

            //кликнуть Добавить новый адрес
            pagesMyAccount.addNewAddressInProfilePage();

            //открылась форма добавления нового адреса
            pagesMyAccount.isPopupAddNewAddressInProfileToBe();

            //закрыть форму добавления нового адреса крестиком > форма закрылась
            pagesMyAccount.closePopupAddNewAddressInProfile();

            //кликнуть на иконку Изменить адрес у первого адреса
            pagesMyAccount.clickToIconEditAddress1FromProfilePage();

            //открылась форма редактирования адреса
            pagesMyAccount.isPopupEditAddressInProfileToBe();

            //закрыть форму редактирования адреса крестиком > форма закрылась
            pagesMyAccount.closePopupEditAddressInProfile();










            System.out.println("ProfilePageElementsTest: ЛК элементы страницы профиля = ОК");


        } catch (InterruptedException e ) {
            e.printStackTrace();
            Thread.sleep(100);
        } finally  {
            Thread.sleep(50);
            driver.quit();
        }
    }
}
