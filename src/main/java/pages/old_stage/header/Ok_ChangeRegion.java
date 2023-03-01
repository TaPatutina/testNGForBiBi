package pages.old_stage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Ok_ChangeRegion {
    private WebDriver driver;



    //@FindBy(xpath = "//*[@class='site-region__address js-address']") private WebElement name_of_store_in_header; //для прода
    //@FindBy(xpath = "//*[@class='site-region__address js-address']") private WebElement name_of_store_in_header1; //для прода
    @FindBy(xpath = "//*[@class='site-region__address small d-block js-address']") private WebElement name_of_store_in_header; //для стейджа
    @FindBy(xpath = "//*[@class='site-region__address small d-block js-address']") private WebElement name_of_store_in_header1; //для стейджа


    @FindBy(xpath = "//*[@class='nav nav--left']//*[@class='icon icon--store']") private WebElement icon_of_store_in_header;
    @FindBy(xpath = "//*[@class='js-mode-name']") private WebElement name_of_delivery_mode_in_header;
    @FindBy(xpath = "//*[@data-change-region-btn]") private WebElement change_region_header_btn;

    @FindBy(xpath = "//*[@id='popup_location']") private List<WebElement> elements_of_popup_location;
    @FindBy(xpath = "//*[@id='popup-location']") private WebElement popup_location;
    @FindBy(xpath = "//*[@class='popup__hl']") private WebElement popup_location_title_text;
    @FindBy(xpath = "//*[strong]//*[@class='link link--black link--no-border js-region-select-link']") private WebElement popup_location_default_city;
    @FindBy(xpath = "(//*[@id='popup-location'])//*[contains(text(),'Москва')]") private WebElement region_link_Msk;
    @FindBy(xpath = "(//*[@id='popup-location'])//*[contains(text(),'Санкт-Петербург')]") private WebElement region_link_SPb;
    @FindBy(xpath = "(//*[@id='popup-location'])//*[contains(text(),'Тверь')]") private WebElement region_link_Tver;
    @FindBy(xpath = "//*[@class='nav-main nav-main--top']//*[@data-change-region-btn]") private WebElement name_of_region_in_header;
    @FindBy(xpath = "//*[@id='popup-location']/*[@class='popup__close']") private WebElement close_popup_location_btn;
    @FindBy(xpath = "//*[@name='searchRegion']") private WebElement searchRegionInput;
    @FindBy(xpath = "(//*[@class='custom-autocomplete__item ui-menu-item'])[1]") private WebElement custom_region_autocomplete_1;
    @FindBy(xpath = "//*[@class='custom-autocomplete__item ui-state-disabled ui-menu-item']") private WebElement missing_region_autocomplete;

    @FindBy(xpath = "//*[@class='nav__item nav__item--visible-desktop']") private WebElement pos_area_in_header;
    @FindBy(xpath = "//*[@id='popup-delivery']") private WebElement popup_delivery_mode;
    @FindBy(xpath = "//*[@id='popup-delivery']/h2[text()= 'Способ получения']") private WebElement popup_delivery_mode_title;
    @FindBy(xpath = "//*[@id='popup-delivery']/*[@data-popup='close']") private WebElement close_popup_delivery_mode_btn;
    @FindBy(xpath = "(//*[@id='popup-delivery']//li//button[@data-shop-pos='017_Химки'])[contains(text(),'Выбрать')]") private WebElement header_map_shop_pos_017_btn;
    @FindBy(xpath = "(//*[@id='popup-delivery']//li//button[@data-shop-pos='019_Строгино'])[contains(text(),'Выбрать')]") private WebElement header_map_shop_pos_019_btn;
    @FindBy(xpath = "(//*[@id='popup-delivery']//li//*[@data-shop-pos='020_Печатники'])[contains(text(),'Выбрать')]") private WebElement header_map_shop_pos_020_btn;
    @FindBy(xpath = "(//*[@id='popup-delivery']//li//*[@data-shop-pos='285_Тверь Калинина'])[contains(text(),'Выбрать')]") private WebElement header_map_shop_pos_285_btn;



    @FindBy(xpath = "(//*[@id='popup-location-confirm'])//*[contains(text(),'Вы хотите сменить выбранный регион?')]") private WebElement alert_confirm_new_region;
    @FindBy(xpath = "(//*[@id='popup-location-confirm'])//*[contains(text(),'Да')]") private WebElement alert_confirm_new_region_submit_btn;

    //страница профиля
    @FindBy(xpath = "//*[@id='popup_cart_delivery_new']/h2[contains(text(), 'Выберите магазин')]") private WebElement profile_map_shop_title;
    @FindBy(xpath = "(//*[@id='popup_cart_delivery_new']//li//button[@data-shop-pos='017_Химки'])[contains(text(),'Выбрать')]") private WebElement profile_map_shop_pos_017_btn;
    @FindBy(xpath = "(//*[@id='popup_cart_delivery_new']//li//button[@data-shop-pos='019_Строгино'])[contains(text(),'Выбрать')]") private WebElement profile_map_shop_pos_019_btn;
    @FindBy(xpath = "(//*[@id='popup_cart_delivery_new']//li//button[@data-shop-pos='020_Печатники'])[contains(text(),'Выбрать')]") private WebElement profile_map_shop_pos_020_btn;




    //Constructor
    public Ok_ChangeRegion(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }



    //СОЗДАТЬ ОБЪЕКТ ChangeRegion //ChangeRegion changeRegion = new ChangeRegion(driver);

    //кликнуть на регион (город) //changeRegion.clickChangeRegionBtn();
    public void clickChangeRegionBtn(){change_region_header_btn.click();}


    // открывается попап локации //changeRegion.isElementsOfPopapLocationToBe();
    public void isElementsOfPopupLocationToBe(){
        /*List<WebElement> elementsOfPopupLocationList = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(elements_of_popup_location));*/
        String isPopupLocationTitleText = popup_location_title_text.getText();
        Assert.assertEquals(isPopupLocationTitleText, "Выберите город" );
    }

    //выбранный в попапе по умолчанию регион - Москва //String popupLocationSelectedRegionName = changeRegion.isSelectedRegionName(); Assert.assertEquals(popupLocationSelectedRegionName, "Москва");
    public String isSelectedRegionName(){ return popup_location_default_city.getText(); }

    //кликнуть на Санкт-Петербург //changeRegion.clickToRegionLink_SPb();
    public void clickToRegionLink_SPb(){region_link_SPb.click();}

    //попап локализации отображается (проверка по тексту "Выберите город") //changeRegion.isTitleOfPopupLocationVisible();
    public boolean isTitleOfPopupLocationVisible(){
        return popup_location_title_text.getText().contentEquals("Выберите город");
    }

    //попап локализации отображается //Assert.assertTrue(changeRegion.isPopupLocationVisible());
    public boolean isPopupLocationVisible(){
        WebElement PopupLocationVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_location));
        return true;
    }

    //попап локализации не отображается //Assert.assertTrue(changeRegion.isPopupLocationNotVisible());
    public boolean isPopupLocationNotVisible(){
        Boolean PopupLocationVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(popup_location)));
        return true;
    }


    //попап локализации отображается //Assert.assertTrue(changeRegion.isPopupLocationDisplayed()); или нет, в т.ч. в коде //Assert.assertFalse(changeRegion.isPopupLocationDisplayed());
    public boolean isPopupLocationDisplayed() {
        try {
            return popup_location.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    //в шапке отображается регион СПб //String nameOfRegionInHeader = changeRegion.isNameOfRegionInHeader(); Assert.assertEquals(nameOfRegionInHeader, "Санкт-Петербург");
    public String isNameOfRegionInHeader(){ return name_of_region_in_header.getText(); }

    //в шапке по умолчанию отображается способ получения - Самовывоз из магазина  //String nameOfDeliveryModeInHeader = changeRegion.isNameOfDeliveryModeInHeader(); Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
    public String isNameOfDeliveryModeInHeader(){ return name_of_delivery_mode_in_header.getText(); }

    //в шапке по умолчанию отображается магазин СПб. Шлиссельбургский пр-т  //String nameOfStoreInHeader = changeRegion.isNameOfStoreInHeader(); Assert.assertEquals(nameOfStoreInHeader, "СПб. Шлиссельбургский пр-т");
    public String isNameOfStoreInHeader(){ return name_of_store_in_header.getText(); }

    //Выбрать самовывоз из магазина в Строгино(Москва) из панели уточнения локализации // changeRegion.choosePickUpStrogino();
    public void choosePickUpStroginoFromPanel(){
        change_region_header_btn.click();
        popup_location_default_city.click();
        String nameOfDeliveryModeInHeader = name_of_delivery_mode_in_header.getText();
        Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
        String nameOfStoreInHeader = name_of_store_in_header.getText();
        Assert.assertEquals(nameOfStoreInHeader, "Москва Строгинский б-р");
    }

    // установить через хедер регион Москва, магазин 017_Химки > в хедере отображ Химки Молодежная //changeRegion.putFromHeaderMskPos017Chimki();
    public void putFromHeaderMskPos017Chimki() throws InterruptedException {
        change_region_header_btn.click();
        try {alert_confirm_new_region_submit_btn.click();
        } catch (Exception e) {}
        WebElement hasLinkMoscow = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(region_link_Msk));
        region_link_Msk.click();
        Boolean isNameOfRegionInHeaderMsk = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(name_of_region_in_header, "outerText", " "+"Москва"));
        icon_of_store_in_header.click();
        try {
            WebElement PopupDeliveryModeVisible = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(popup_delivery_mode));
            Actions action_write_us = new Actions(driver);
            action_write_us.moveToElement(header_map_shop_pos_017_btn).click().perform();
        } catch (Exception e){
            close_popup_delivery_mode_btn.click();
            Thread.sleep(1000);
            pos_area_in_header.click();
            WebElement PopupDeliveryModeVisible = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(popup_delivery_mode));
            /*Actions action_write_us = new Actions(driver);
            action_write_us.moveToElement(header_map_shop_pos_017_btn).click().perform();*/
            header_map_shop_pos_017_btn.click();
        }
        String nameOfDeliveryModeInHeader = name_of_delivery_mode_in_header.getText();
        Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
        Thread.sleep(50);
        Boolean isNameOfStore020InHeader = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.attributeContains(name_of_store_in_header, "textContent", "Химки Молодежная"));
        Boolean isNameRegionInHeaderChimki = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.attributeContains(name_of_region_in_header, "textContent", "Химки"));
    }





    // установить через хедер регион Москва, магазин Строгино > в хедере отображ Москва Строгинский б-р //changeRegion.putFromHeaderMskPos019Strogino();
    public void putFromHeaderMskPos019Strogino() throws InterruptedException {
        change_region_header_btn.click();
        try {alert_confirm_new_region_submit_btn.click();
        } catch (Exception e) {}
        WebElement hasLinkMoscow = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(region_link_Msk));
        region_link_Msk.click();
        Boolean isNameOfRegionInHeaderMsk = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(name_of_region_in_header, "outerText", " "+"Москва"));
        icon_of_store_in_header.click();
        try {
            WebElement PopupDeliveryModeVisible = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(popup_delivery_mode));
            Actions action_write_us = new Actions(driver);
            action_write_us.moveToElement(header_map_shop_pos_019_btn).click().perform();
        } catch (Exception e){
            close_popup_delivery_mode_btn.click();
            Thread.sleep(1000);
            pos_area_in_header.click();
            WebElement PopupDeliveryModeVisible = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(popup_delivery_mode));
            Actions action_write_us = new Actions(driver);
            action_write_us.moveToElement(header_map_shop_pos_019_btn).click().perform();
        }
        String nameOfDeliveryModeInHeader = name_of_delivery_mode_in_header.getText();
            Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
        Thread.sleep(50);
        Boolean isNameOfStore020InHeader = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.attributeContains(name_of_store_in_header1, "textContent", "Москва Строгинский б-р"));
        Boolean isNameRegionInHeaderChimki = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.attributeContains(name_of_region_in_header, "textContent", "Москва"));
    }








    //закрыть попап локализации крестиком //changeRegion.clickClosePopupLocationBtn();
    public void clickClosePopupLocationBtn(){
        close_popup_location_btn.click();
    }

    //ввести название существующего города в поле поиска в попапе локализации, кликнуть на подсказку ввести название существующего города в поле поиска в попапе локализации, кликнуть на подсказку - регион в шапке поменяется на выбранный
    // changeRegion.searchAvailableRegion("Уфа");
    public void searchAvailableRegion(String region_name){
        searchRegionInput.sendKeys(region_name);
        Boolean isCustomRegionAutocomplete_1 = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(custom_region_autocomplete_1, "textContent", region_name));
        custom_region_autocomplete_1.click();
        Boolean isNameOfRegionInHeader = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(name_of_region_in_header, "outerText", " "+ region_name));
    }
    //ввести название несуществующего города в поле поиска в попапе локализации - отобразится подсказка "Название города введено не верно" //changeRegion.searchMissingRegion("Moskva");
    public void searchMissingRegion(String region_name){
        searchRegionInput.sendKeys(region_name);
        Boolean isMissingRegionAutocomplete = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(missing_region_autocomplete, "textContent", "Название города введено не верно"));
        missing_region_autocomplete.click();
    }




    // установить через хедер регион Тверь, магазин Калинина > в хедере отображ Тверь Калинина //changeRegion.putFromHeaderTverPos285Kalinina();
    public void putFromHeaderTverPos285Kalinina() throws InterruptedException {
        change_region_header_btn.click();
        try {
            WebElement hasLinkTver = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(region_link_Tver));
            region_link_Tver.click();
            Boolean isNameOfRegionInHeaderTver = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(name_of_region_in_header, "outerText", " "+"Тверь"));
            icon_of_store_in_header.click();
        } catch (Exception e) {
            alert_confirm_new_region_submit_btn.click();
            change_region_header_btn.click();
            WebElement hasLinkTver = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(region_link_Tver));
            region_link_Tver.click();
            Boolean isNameOfRegionInHeaderTver = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(name_of_region_in_header, "outerText", " "+"Тверь"));
            icon_of_store_in_header.click();
        }

        try {
            WebElement PopupDeliveryModeVisible = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(popup_delivery_mode));
            Actions action_write_us = new Actions(driver);
            action_write_us.moveToElement(header_map_shop_pos_285_btn).click().perform();
        } catch (Exception e){
            close_popup_delivery_mode_btn.click();
            Thread.sleep(50);
            icon_of_store_in_header.click();
            WebElement PopupDeliveryModeVisible = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(popup_delivery_mode));
            header_map_shop_pos_285_btn.click();
        }
        Thread.sleep(500);
        Boolean isNameOfStore285InHeader = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.attributeContains(name_of_store_in_header1, "textContent", "Тверь пр-т Калинина"));
        Boolean isNameRegionInHeaderTver = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeContains(name_of_region_in_header, "textContent", "Тверь"));
    }






}

