package tests.homePage;


import org.testng.annotations.Test;
import tests.base.BaseTest;




public class TestOne extends BaseTest {

    @Test
    public void plashka()  {

        basePage.open("https://bi-bi.ru/login/");
        localizationPanel.waitAndClickAgreeRegionBtn();


        loginPage.clickSigninInHeader();
        loginPage.isPopupAuthorizationVisible();

        loginPage.checkSigninWithRandomValidData();


    }


}
