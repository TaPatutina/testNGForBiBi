package tests.homePage.positive;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.time.Duration;
import java.util.List;

import static constants.Constant.Urls.BIBI_HOME_PAGE;

public class test1 extends BaseTest {

    @Test
    public void checkIsRedirectToListingFromThinBanner1() {
        basePage.open(BIBI_HOME_PAGE);
        bibiHomePage
                //.isElementsOfPlashkaToBe()
                .waitAndClickAgreeRegion();


    }

}
