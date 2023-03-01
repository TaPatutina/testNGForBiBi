package tests.base;

import common.CommonActions;
import common.RandomData;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.homePage.BibiHomePage;
import pages.homePage.header.MiniCartHomePage;
import pages.homePage.header.LocalizationPanelHomePage;
import pages.otherObjects.LoginPage;
import pages.otherObjects.header.LocalizationPanel;
import pages.otherObjects.listing.OrdinaryListingPage;
import pages.otherObjects.productPage.PopupAddToCart;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected RandomData randomData = new RandomData(driver);

    protected BasePage basePage = new BasePage(driver);
    protected BibiHomePage bibiHomePage = new BibiHomePage(driver);
    protected OrdinaryListingPage ordinaryListingPage = new OrdinaryListingPage(driver);
    protected MiniCartHomePage miniCartHomePage = new MiniCartHomePage(driver);
    protected LocalizationPanelHomePage localizationPanelHomePage = new LocalizationPanelHomePage(driver);
    protected LocalizationPanel localizationPanel = new LocalizationPanel(driver);
    protected PopupAddToCart popupAddToCart = new PopupAddToCart(driver);
    protected LoginPage loginPage = new LoginPage(driver);



    @AfterTest
    public void clearCookiesAndLocalStorage(){
        if(CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite (alwaysRun = true)
    public void close(){
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }

}
