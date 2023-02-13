package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

import static constants.Constant.COUNT_CARDS_IN_LISTING_24;

public class BibiListingPage extends BasePage {

    public BibiListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//li[@class='product-card  ']");

    public BibiListingPage checkCountCards (){
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, COUNT_CARDS_IN_LISTING_24);
        return this;
    }

}
