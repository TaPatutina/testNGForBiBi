package tests.old_stage.accountPages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.old_stage.autorization.LoginPage;
import pages.old_stage.autorization.PagesMyAccount;
import pages.old_stage.header.Plashka;

import java.time.Duration;

public class EditProfileInfoFromProfilePageTest {
    private WebDriver driver;


    @BeforeTest (groups = {"smokeTest", "regress"})
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1440, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }


    @Test  (groups = {"smokeTest", "regress"})
    public void EditProfileInfoFromProfilePageTest() throws InterruptedException {
        try {
            driver.get("https://bi-bi.ru/product/e0000042894");
            Thread.sleep(1000);



            //СОЗДАТЬ ОБЪЕКТ  Plashka
            Plashka plashka = new Plashka(driver);
            //согласиться с городом > панель уточнения локализации закрылась
            plashka.clickAgreeWithTheCity();



            //СОЗДАТЬ ОБЪЕКТ  LoginPage
            LoginPage loginPage = new LoginPage(driver);
            //кликнуть Войти в шапке > отображается попап авторизации (проверка по заголовку)
            loginPage.SignInFromHeader();
            //залогиниться как tapatutina@ya.ru > отображается кнопка Выйти в хедере
            loginPage.signInAsTapatutinaYaRu();
            //кликнуть на имя профиля в хедере > переход на стр профиля
            loginPage.clickOnProfileBtn();



            //СОЗДАТЬ ОБЪЕКТ  PagesMyAccount
            PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);
            //нажать на кнопку Редактировать данные > откроется форма (проверка по заголовку)
            pagesMyAccount.clickOnEditProfileInfoBtn();
            //заполнить поле Имя формы редактирования данных
            pagesMyAccount.inputNameToProfileInfo("Татьянa");
            //заполнить поле Фамилия формы редактирования данных
            pagesMyAccount.inputSurnameToProfileInfo("Patutina");
            //выбрать пол - Женский в форме редактирования данных
            pagesMyAccount.selectGenderFemaleToProfileInfo();
            //редактировать дату рождения кликами
            pagesMyAccount.editBirthDateToProfileInfo();
            //кликнуть Сохранить в форме редактирования
            pagesMyAccount.editProfileInfoSubmit();
            //проверить, что личные данные юзера сохранились
            pagesMyAccount.checkProfileInfoUpdate();



            System.out.println("EditProfileInfoFromProfilePageTest: редактировать данные в блоке 'Личная информация' профиля  = ОК");


        } catch (InterruptedException e ) {
            e.printStackTrace();
            Thread.sleep(100);
        } finally  {
            Thread.sleep(50);
            driver.quit();
        }
    }
}
