package pages.homePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.base.BasePage;

import java.util.List;

public class LocalizationPanelHomePage extends BasePage {
    public LocalizationPanelHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this); //для аннотации Селениума @FindBy
    }

    @FindBy(xpath ="//div[contains(@data-js, 'sliderPanel')]//button[text()='Да, верно']") private WebElement agreeCityBtn;
    private final By regionPanelElements = By.cssSelector("div.region-panel.fade.show");
    private final By agreeWithTheCityBtn = By.xpath("//div[contains(@data-js,'sliderPanel')]//button[contains(text(),'верно')]");
    private final By regionRequestText = By.xpath("//div[starts-with(@class,'col-12')]/div[@class='h5']");
    private final By annotationRegionRequest = By.xpath("//div[@class='region-panel fade show']//div[@class='region-panel__desc']");
    private final By chooseAnotherRegionBtn = By.xpath("//div[@class='region-panel__link h6 mb-0 js-region-link js-close-panel']");



    /**
     * Кликнуть "Да" в панели локализации "Ваш город ..?"
     */
    public LocalizationPanelHomePage clickAgreeRegionBtn() {
        agreeCityBtn.click();
        return this;
    }

    /**
     * Дождаться появления кнопки "Да, верно" на панели локализации, согласиться с предложенным городом
     */
    public LocalizationPanelHomePage waitAndClickAgreeRegionBtn() {
        waitElementVisible(agreeCityBtn).click();
        Assert.assertFalse(agreeCityBtn.getText().contains("Да, верно"));
        return this;
    }


    /**
     * Панель локадизации отображается
     */
    public boolean isAgreeityBtnTextVisible() {
        WebElement agreeCityBtn = driver.findElement(agreeWithTheCityBtn);
        return agreeCityBtn.getText().contentEquals("Да, верно");
    }

    /**
     * Панель локализации не отображается
     */
    public boolean isAgreeCityBtnTextInvisible() {
        WebElement agreeCityBtn = driver.findElement(agreeWithTheCityBtn);
        Assert.assertFalse(agreeCityBtn.getText().contains("Да, верно"));
        return true;

    }


    /**
     * проверить наличие элементов на панели локализации
     */
    public LocalizationPanelHomePage isElementsOfPlashkaToBe() {
        List<WebElement> regionPanelElements = driver.findElements(this.regionPanelElements);
        waitElementsVisible(regionPanelElements);
        String isRegionRequestText = driver.findElement(regionRequestText).getText();
        Assert.assertTrue(isRegionRequestText.startsWith("Ваш город "));
        String isAnnotationRegionRequestText = driver.findElement(annotationRegionRequest).getText();
        Assert.assertEquals(isAnnotationRegionRequestText, "От выбранного города зависят цены, наличие товара и способы доставки");
        String agreeWithTheCityBtnText = driver.findElement(agreeWithTheCityBtn).getText();
        Assert.assertEquals(agreeWithTheCityBtnText, "Да, верно");
        return this;

    }


    //согласиться с городом
    public LocalizationPanelHomePage clickAgreeWithTheCity() {
        driver.findElement(agreeWithTheCityBtn).click();
        return this;
    }


    //кликнуть Выбрать другой регион //hpPlashka.clickChooseAnotherRegionBtn();
    public LocalizationPanelHomePage clickChooseAnotherRegionBtn() {
        driver.findElement(chooseAnotherRegionBtn).click();
        return this;
    }


}
