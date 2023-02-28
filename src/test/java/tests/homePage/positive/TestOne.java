package tests.homePage.positive;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.BIBI_HOME_PAGE;




public class TestOne extends BaseTest {

    @Test
    public void plashka() {
        basePage.open(BIBI_HOME_PAGE);
        localizationPanelHomePage
                //.isElementsOfPlashkaToBe()
                .clickAgreeRegionBtn()
                .isAgreeCityBtnTextInvisible();





    }

}
