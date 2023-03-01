package pages.homePage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;

import java.time.Duration;
import java.util.List;

public class ChangeRegionHomePage extends BasePage {
    public ChangeRegionHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this); //для аннотации Селениума @FindBy
    }


    @FindBy(xpath = "//*[@class='site-region__address js-address']")
    private WebElement nameOfStoreInHeader; //для прода
    @FindBy(xpath = "//*[@class='site-region__address js-address']")
    private WebElement nameOfStoreInHeader1; //для прода
    //@FindBy(xpath = "//*[@class='site-region__address small d-block js-address']") private WebElement name_of_store_in_header; //для стейджа
    //@FindBy(xpath = "//*[@class='site-region__address small d-block js-address']") private WebElement name_of_store_in_header1; //для стейджа
    @FindBy(xpath = "//*[@class='nav nav--left']//*[@class='icon icon--store']")
    private WebElement iconOfStoreInHeader;
    @FindBy(xpath = "//*[@class='js-mode-name']")
    private WebElement nameOfDeliveryModeInHeader;
    @FindBy(xpath = "//*[@data-change-region-btn]")
    private WebElement changeRegionHeaderBtn;

    @FindBy(xpath = "//*[@id='popup_location']")
    private List<WebElement> elementsOfPopupLocation;
    @FindBy(xpath = "//*[@id='popup-location']")
    private WebElement popupLocation;
    @FindBy(xpath = "//*[@class='popup__hl']")
    private WebElement popupLocationTitleText;
    @FindBy(xpath = "//*[strong]//*[@class='link link--black link--no-border js-region-select-link']")
    private WebElement popupLocationDefaultCity;
    @FindBy(xpath = "(//*[@id='popup-location'])//*[contains(text(),'Москва')]")
    private WebElement regionLinkMsk;
    @FindBy(xpath = "(//*[@id='popup-location'])//*[contains(text(),'Санкт-Петербург')]")
    private WebElement regionLinkSpb;
    @FindBy(xpath = "(//*[@id='popup-location'])//*[contains(text(),'Тверь')]")
    private WebElement regionLinkTver;
    @FindBy(xpath = "//*[@class='nav-main nav-main--top']//*[@data-change-region-btn]")
    private WebElement nameOfRegionInHeader;
    @FindBy(xpath = "//*[@id='popup-location']/*[@class='popup__close']")
    private WebElement closePopupLocationBtn;
    @FindBy(xpath = "//*[@name='searchRegion']")
    private WebElement searchRegionInput;
    @FindBy(xpath = "(//*[@class='custom-autocomplete__item ui-menu-item'])[1]")
    private WebElement customRegionAutocomplete1;
    @FindBy(xpath = "//*[@class='custom-autocomplete__item ui-state-disabled ui-menu-item']")
    private WebElement missingRegionAutocomplete;

    @FindBy(xpath = "//*[@class='nav__item nav__item--visible-desktop']")
    private WebElement posAreaInHeader;
    @FindBy(xpath = "//*[@id='popup-delivery']")
    private WebElement popupDeliveryMode;
    @FindBy(xpath = "//*[@id='popup-delivery']/h2[text()= 'Способ получения']")
    private WebElement popupDeliveryModeTitle;
    @FindBy(xpath = "//*[@id='popup-delivery']/*[@data-popup='close']")
    private WebElement closePopupDeliveryModeBtn;
    @FindBy(xpath = "(//*[@id='popup-delivery']//li//button[@data-shop-pos='017_Химки'])[contains(text(),'Выбрать')]")
    private WebElement headerMapShopPos017Btn;
    @FindBy(xpath = "(//*[@id='popup-delivery']//li//button[@data-shop-pos='019_Строгино'])[contains(text(),'Выбрать')]")
    private WebElement headerMapShopPos019Btn;
    @FindBy(xpath = "(//*[@id='popup-delivery']//li//*[@data-shop-pos='020_Печатники'])[contains(text(),'Выбрать')]")
    private WebElement headerMapShopPos020Btn;
    @FindBy(xpath = "(//*[@id='popup-delivery']//li//*[@data-shop-pos='285_Тверь Калинина'])[contains(text(),'Выбрать')]")
    private WebElement headerMapShopPos285Btn;


    @FindBy(xpath = "(//*[@id='popup-location-confirm'])//*[contains(text(),'Вы хотите сменить выбранный регион?')]")
    private WebElement alertConfirmNewRegion;
    @FindBy(xpath = "(//*[@id='popup-location-confirm'])//*[contains(text(),'Да')]")
    private WebElement alertConfirmNewRegionSubmitBtn;

    //страница профиля
    @FindBy(xpath = "//*[@id='popup_cart_delivery_new']/h2[contains(text(), 'Выберите магазин')]")
    private WebElement profileMapShopTitle;
    @FindBy(xpath = "(//*[@id='popup_cart_delivery_new']//li//button[@data-shop-pos='017_Химки'])[contains(text(),'Выбрать')]")
    private WebElement profileMapShopPos017Btn;
    @FindBy(xpath = "(//*[@id='popup_cart_delivery_new']//li//button[@data-shop-pos='019_Строгино'])[contains(text(),'Выбрать')]")
    private WebElement profileMapShopPos019Btn;
    @FindBy(xpath = "(//*[@id='popup_cart_delivery_new']//li//button[@data-shop-pos='020_Печатники'])[contains(text(),'Выбрать')]")
    private WebElement profileMapShopPos020Btn;



     public void clickChangeRegionBtn() {
        changeRegionHeaderBtn.click();
    }


    // открывается попап локации //changeRegion.isElementsOfPopapLocationToBe();
    public void isElementsOfPopupLocationToBe() {
        /*List<WebElement> elementsOfPopupLocationList = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(elements_of_popup_location));*/
        String isPopupLocationTitleText = popupLocationTitleText.getText();
        Assert.assertEquals(isPopupLocationTitleText, "Выберите город");
    }

    //выбранный в попапе по умолчанию регион - Москва //String popupLocationSelectedRegionName = changeRegion.isSelectedRegionName(); Assert.assertEquals(popupLocationSelectedRegionName, "Москва");
    public String isSelectedRegionName() {
        return popupLocationDefaultCity.getText();
    }

    //кликнуть на Санкт-Петербург //changeRegion.clickToRegionLink_SPb();
    public void clickToRegionLink_SPb() {
        regionLinkSpb.click();
    }

    //попап локализации отображается (проверка по тексту "Выберите город") //changeRegion.isTitleOfPopupLocationVisible();
    public boolean isTitleOfPopupLocationVisible() {
        return popupLocationTitleText.getText().contentEquals("Выберите город");
    }

    //попап локализации отображается //Assert.assertTrue(changeRegion.isPopupLocationVisible());
    public boolean isPopupLocationVisible() {
        WebElement PopupLocationVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupLocation));
        return true;
    }

    //попап локализации не отображается //Assert.assertTrue(changeRegion.isPopupLocationNotVisible());
    public boolean isPopupLocationNotVisible() {
        Boolean PopupLocationVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(popupLocation)));
        return true;
    }


    //попап локализации отображается //Assert.assertTrue(changeRegion.isPopupLocationDisplayed()); или нет, в т.ч. в коде //Assert.assertFalse(changeRegion.isPopupLocationDisplayed());
    public boolean isPopupLocationDisplayed() {
        try {
            return popupLocation.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    //в шапке отображается регион СПб //String nameOfRegionInHeader = changeRegion.isNameOfRegionInHeader(); Assert.assertEquals(nameOfRegionInHeader, "Санкт-Петербург");
    public String isNameOfRegionInHeader() {
        return nameOfRegionInHeader.getText();
    }

    //в шапке по умолчанию отображается способ получения - Самовывоз из магазина  //String nameOfDeliveryModeInHeader = changeRegion.isNameOfDeliveryModeInHeader(); Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
    public String isNameOfDeliveryModeInHeader() {
        return nameOfDeliveryModeInHeader.getText();
    }

    //в шапке по умолчанию отображается магазин СПб. Шлиссельбургский пр-т  //String nameOfStoreInHeader = changeRegion.isNameOfStoreInHeader(); Assert.assertEquals(nameOfStoreInHeader, "СПб. Шлиссельбургский пр-т");
    public String isNameOfStoreInHeader() {
        return nameOfStoreInHeader.getText();
    }

    //Выбрать самовывоз из магазина в Строгино(Москва) из панели уточнения локализации // changeRegion.choosePickUpStrogino();
    public void choosePickUpStroginoFromPanel() {
        changeRegionHeaderBtn.click();
        popupLocationDefaultCity.click();
        String nameOfDeliveryModeInHeader = this.nameOfDeliveryModeInHeader.getText();
        Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
        String nameOfStoreInHeader = this.nameOfStoreInHeader.getText();
        Assert.assertEquals(nameOfStoreInHeader, "Москва Строгинский б-р");
    }

    // установить через хедер регион Москва, магазин 017_Химки > в хедере отображ Химки Молодежная //changeRegion.putFromHeaderMskPos017Chimki();
    public void putFromHeaderMskPos017Chimki() throws InterruptedException {
        changeRegionHeaderBtn.click();
        try {
            alertConfirmNewRegionSubmitBtn.click();
        } catch (Exception e) {
        }
        WebElement hasLinkMoscow = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(regionLinkMsk));
        regionLinkMsk.click();
        Boolean isNameOfRegionInHeaderMsk = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(nameOfRegionInHeader, "outerText", " " + "Москва"));
        iconOfStoreInHeader.click();
        try {
            WebElement PopupDeliveryModeVisible = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(popupDeliveryMode));
            Actions action_write_us = new Actions(driver);
            action_write_us.moveToElement(headerMapShopPos017Btn).click().perform();
        } catch (Exception e) {
            closePopupDeliveryModeBtn.click();
            Thread.sleep(1000);
            posAreaInHeader.click();
            WebElement PopupDeliveryModeVisible = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(popupDeliveryMode));
            /*Actions action_write_us = new Actions(driver);
            action_write_us.moveToElement(header_map_shop_pos_017_btn).click().perform();*/
            headerMapShopPos017Btn.click();
        }
        String nameOfDeliveryModeInHeader = this.nameOfDeliveryModeInHeader.getText();
        Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
        Thread.sleep(50);
        Boolean isNameOfStore020InHeader = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.attributeContains(nameOfStoreInHeader, "textContent", "Химки Молодежная"));
        Boolean isNameRegionInHeaderChimki = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.attributeContains(nameOfRegionInHeader, "textContent", "Химки"));
    }


    // установить через хедер регион Москва, магазин Строгино > в хедере отображ Москва Строгинский б-р //changeRegion.putFromHeaderMskPos019Strogino();
    public void putFromHeaderMskPos019Strogino() throws InterruptedException {
        changeRegionHeaderBtn.click();
        try {
            alertConfirmNewRegionSubmitBtn.click();
        } catch (Exception e) {
        }
        WebElement hasLinkMoscow = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(regionLinkMsk));
        regionLinkMsk.click();
        Boolean isNameOfRegionInHeaderMsk = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(nameOfRegionInHeader, "outerText", " " + "Москва"));
        iconOfStoreInHeader.click();
        try {
            WebElement PopupDeliveryModeVisible = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(popupDeliveryMode));
            Actions action_write_us = new Actions(driver);
            action_write_us.moveToElement(headerMapShopPos019Btn).click().perform();
        } catch (Exception e) {
            closePopupDeliveryModeBtn.click();
            Thread.sleep(1000);
            posAreaInHeader.click();
            WebElement PopupDeliveryModeVisible = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(popupDeliveryMode));
            Actions action_write_us = new Actions(driver);
            action_write_us.moveToElement(headerMapShopPos019Btn).click().perform();
        }
        String nameOfDeliveryModeInHeader = this.nameOfDeliveryModeInHeader.getText();
        Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
        Thread.sleep(50);
        Boolean isNameOfStore020InHeader = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.attributeContains(nameOfStoreInHeader1, "textContent", "Москва Строгинский б-р"));
        Boolean isNameRegionInHeaderChimki = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.attributeContains(nameOfRegionInHeader, "textContent", "Москва"));
    }


    //закрыть попап локализации крестиком //changeRegion.clickClosePopupLocationBtn();
    public void clickClosePopupLocationBtn() {
        closePopupLocationBtn.click();
    }

    //ввести название существующего города в поле поиска в попапе локализации, кликнуть на подсказку ввести название существующего города в поле поиска в попапе локализации, кликнуть на подсказку - регион в шапке поменяется на выбранный
    // changeRegion.searchAvailableRegion("Уфа");
    public void searchAvailableRegion(String region_name) {
        searchRegionInput.sendKeys(region_name);
        Boolean isCustomRegionAutocomplete_1 = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(customRegionAutocomplete1, "textContent", region_name));
        customRegionAutocomplete1.click();
        Boolean isNameOfRegionInHeader = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(nameOfRegionInHeader, "outerText", " " + region_name));
    }

    //ввести название несуществующего города в поле поиска в попапе локализации - отобразится подсказка "Название города введено не верно" //changeRegion.searchMissingRegion("Moskva");
    public void searchMissingRegion(String region_name) {
        searchRegionInput.sendKeys(region_name);
        Boolean isMissingRegionAutocomplete = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(missingRegionAutocomplete, "textContent", "Название города введено не верно"));
        missingRegionAutocomplete.click();
    }


    // установить через хедер регион Тверь, магазин Калинина > в хедере отображ Тверь Калинина //changeRegion.putFromHeaderTverPos285Kalinina();
    public void putFromHeaderTverPos285Kalinina() throws InterruptedException {
        changeRegionHeaderBtn.click();
        try {
            WebElement hasLinkTver = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(regionLinkTver));
            regionLinkTver.click();
            Boolean isNameOfRegionInHeaderTver = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(nameOfRegionInHeader, "outerText", " " + "Тверь"));
            iconOfStoreInHeader.click();
        } catch (Exception e) {
            alertConfirmNewRegionSubmitBtn.click();
            changeRegionHeaderBtn.click();
            WebElement hasLinkTver = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(regionLinkTver));
            regionLinkTver.click();
            Boolean isNameOfRegionInHeaderTver = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(nameOfRegionInHeader, "outerText", " " + "Тверь"));
            iconOfStoreInHeader.click();
        }

        try {
            WebElement PopupDeliveryModeVisible = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(popupDeliveryMode));
            Actions action_write_us = new Actions(driver);
            action_write_us.moveToElement(headerMapShopPos285Btn).click().perform();
        } catch (Exception e) {
            closePopupDeliveryModeBtn.click();
            Thread.sleep(50);
            iconOfStoreInHeader.click();
            WebElement PopupDeliveryModeVisible = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(popupDeliveryMode));
            headerMapShopPos285Btn.click();
        }
        Thread.sleep(500);
        Boolean isNameOfStore285InHeader = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.attributeContains(nameOfStoreInHeader1, "textContent", "Тверь пр-т Калинина"));
        Boolean isNameRegionInHeaderTver = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeContains(nameOfRegionInHeader, "textContent", "Тверь"));
    }


}