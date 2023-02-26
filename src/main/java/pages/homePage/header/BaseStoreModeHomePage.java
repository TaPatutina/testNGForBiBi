package pages.homePage.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import java.util.List;

public class BaseStoreModeHomePage extends BasePage {
    public BaseStoreModeHomePage(WebDriver driver) {
        super(driver);
    }

    //блок локации (смена города)

    private final By popupLocationDefaultCity = By.xpath("//ul[contains(@class,'list-unstyled')]//b/div[@class='js-region-select-link']");
    private final By regionLinkSPb = By.xpath("//div[@id='popup-location']//a[contains(text(),'Санкт-Петербург')]");
    private final By nameOfRegionInHeader = By.xpath("//div[@class='iconed-links__item iconed-links__item--row']");
    private final By nameOfDeliveryModeInHeader = By.cssSelector("div.js-mode-name");
    private final By nameOfStoreInHeader = By.xpath("//div[@class='site-region__address small d-block js-address']");
    private final By changeRegionBtn = By.xpath("//div[@class='iconed-links__item iconed-links__item--row']");
    private final By popupLocation = By.cssSelector("div#popup-location");
    private final By popupLocationTitleText = By.cssSelector("div.modal-title.h2");
    private final By closePopupLocationBtn = By.cssSelector("#popup-location div.modal-header button.close");
    private final By elementsPopupLocation = By.xpath("//div[@id='popup_location']");
    //аннотации Селениума:
    @FindBy(xpath = "//div[@id='popup-holder_location-confirm']//div[@class='modal-title h2'][text()='При смене региона возможно изменение корзины.']")
    private WebElement alertLocationConfirmTitleText;
    @FindBy(xpath = "//div[@id='popup-location']")
    private WebElement popupLocationId;
    @FindBy(css = "#popup-location div.modal-header button")
    private WebElement closePopupLocationBtn1;
    @FindBy(xpath = "//div[@class='region-panel fade show']")
    private List<WebElement> elementsPlashka;






    //ok
    public String isSelectedRegionName() {
        WebElement textAttrDefaultCity = driver.findElement(popupLocationDefaultCity);
        return textAttrDefaultCity.getAttribute("text");
    }

    //ok
    //кликнуть на Санкт-Петербург
    public BaseStoreModeHomePage clickToRegionLink_SPb() {
        WebElement regionLinkSPb = driver.findElement(this.regionLinkSPb);
        regionLinkSPb.click();
        return this;
    }



    //в шапке отображается регион
    public String isNameOfRegionInHeader() {
        WebElement nameRegionInHeader = driver.findElement(nameOfRegionInHeader);
        return nameRegionInHeader.getText();
    }

    //в шапке отображается способ получения
    public String isNameOfDeliveryModeInHeader() {
        WebElement nameOfDeliveryModeInHeader = driver.findElement(this.nameOfDeliveryModeInHeader);
        return nameOfDeliveryModeInHeader.getText();
    }

    //в шапке отображается магазин
    public String isNameOfStoreInHeader() {
        WebElement nameOfStoreInHeader = driver.findElement(this.nameOfStoreInHeader);
        return nameOfStoreInHeader.getText();
    }


}
