package pages.otherObjects.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.base.BasePage;

public class LocalizationPanel extends BasePage {
    public LocalizationPanel(WebDriver driver) {
        super(driver);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button.btn.btn--white.js-close-panel.js-region-select-link") private WebElement agreeWithTheCityBtn;

    /**
     * Дождаться появления кнопки "Да, верно" на панели локализации, согласиться с предложенным городом
     */
    public LocalizationPanel waitAndClickAgreeRegionBtn() {
        waitElementVisible(agreeWithTheCityBtn).click();
        Assert.assertFalse(agreeWithTheCityBtn.getText().contains("Да, верно"));
        return this;
    }



}
