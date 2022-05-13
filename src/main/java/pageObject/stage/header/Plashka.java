package pageObject.stage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Plashka {
    private WebDriver driver;


    @FindBy(css = "button.btn.btn--white.js-close-panel.js-region-select-link") private WebElement agree_with_the_city_btn;
    @FindBy(xpath = "//*[@class='slider-panel__title'][contains(text(),'Ваш город')]") private WebElement region_request_text;
    @FindBy(xpath = "//*[@class='slider-panel js-slider-panel slider-panel--fixed is-visible']") private List<WebElement> elements_of_plashka;
    @FindBy(xpath = "//*[@class='slider-panel__content']") private WebElement annotation_region_request;
    @FindBy(xpath = "//*[@data-js='region, sliderPanel']//button[contains(text(),'Нет, выбрать другой город')]") private WebElement choose_another_region_btn;
    @FindBy(xpath = "//*[@id='popup_location']") private List<WebElement> elements_of_popup_location;
    @FindBy(xpath = "//*[@class='popup__hl'][contains(text(),'Выберите город')]") private WebElement popup_location_title_text;

    @FindBy(xpath = "//*[strong]//*[@class='link link--black link--no-border js-region-select-link']") private WebElement popup_location_default_city;
    @FindBy(xpath = "(//*[@id='popup-location'])//*[contains(text(),'Санкт-Петербург')]") private WebElement region_link_SPb;
    @FindBy(xpath = "(//*[@id='popup-location'])//*[contains(text(),'Тверь')]") private WebElement region_link_Tver;
    @FindBy(xpath = "//*[@class='nav-main nav-main--top']//*[@data-change-region-btn]") private WebElement name_of_region_in_header;
    @FindBy(xpath = "//*[@class='js-mode-name']") private WebElement name_of_delivery_mode_in_header;
    @FindBy(xpath = "//*[@class='site-region__address small d-block js-address']") private WebElement name_of_store_in_header;



    //Constructor
    public Plashka(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }


    //СОЗДАТЬ ОБЪЕКТ Plashka //Plashka plashka = new Plashka(driver);

    //дождаться открытия и проверить наличие элементов панели уточнения локализации //plashka.isElementsOfPlashkaToBe();
    public void isElementsOfPlashkaToBe(){
        WebElement isRegionRequestTextContain = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(region_request_text));
        String isAnnotationRegionRequestText = annotation_region_request.getText();
            Assert.assertEquals(isAnnotationRegionRequestText, "От выбранного города зависят цены, наличие товара и способы доставки" );
        String agreeWithTheCityBtnText = agree_with_the_city_btn.getText();
            Assert.assertEquals(agreeWithTheCityBtnText, "Да, верно");
        String chooseAnotherRegionBtnText = choose_another_region_btn.getText();
            Assert.assertEquals(chooseAnotherRegionBtnText, "Нет, выбрать другой город");
    }

    //согласиться с городом > панель уточнения локализации закрылась //plashka.clickAgreeWithTheCity();
    public void clickAgreeWithTheCity() {
        WebElement isRegionRequestTextContain = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(agree_with_the_city_btn));
        agree_with_the_city_btn.click();
        Boolean isRegionRequestTextInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(region_request_text)));
    }

    //плашка закрылась (быстрая проверка по тексту "Да, верно")//Assert.assertFalse(plashka.isAgreeWithTheCityBtnTextVisible());
    public boolean  isAgreeWithTheCityBtnTextVisible(){
        return agree_with_the_city_btn.getText().contentEquals("Да, верно");
    }

    //плашка закрылась (по видимости всех элементов, долго!)
    public boolean  isElementsOfPlashkaNotVisible(){
        Boolean ElementsOfPlashkaNotVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOfAllElements(elements_of_plashka)));
        return false;
    }

    //дождаться открытия панели уточнения локализации и кликнуть "Выбрать другой регион" > откроется попап с городами //plashka.clickChooseAnotherRegionBtn();
    public void clickChooseAnotherRegionBtn(){
        WebElement isRegionRequestTextContain = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(agree_with_the_city_btn));
        choose_another_region_btn.click();
        WebElement visibilityOf = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_location_title_text));
    }


    // открывается попап локации
    public void isElementsOfPopapLocationToBe(){
        List<WebElement> elementsOfPopupLocationList = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(elements_of_popup_location));
        WebElement visibilityOf = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_location_title_text));
    }

    //выбранный по умолчанию регион - Москва // String popupLocationSelectedRegionName = plashka.isSelectedRegionName(); Assert.assertEquals(popupLocationSelectedRegionName, "Москва");
    public String isSelectedRegionName(){ return popup_location_default_city.getText(); }

    //кликнуть на Санкт-Петербург > город в шапке сменился на Санкт-Петербург // plashka.clickToRegionLink_SPb();
    public void clickToRegionLink_SPb(){
        region_link_SPb.click();
        Boolean textToBePresentInElement = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.textToBePresentInElement(name_of_region_in_header,"Санкт-Петербург"));
    }

    //кликнуть  в попапе локализации на регион "Тверь" > город в шапке сменился на Тверь // plashka.clickToRegionLink_Tver();
    public void clickToRegionLink_Tver(){
        region_link_Tver.click();
        Boolean textToBePresentInElement = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.textToBePresentInElement(name_of_region_in_header,"Тверь"));
    }

    //в шапке отображается регион СПб //String nameOfRegionInHeader = plashka.isNameOfRegionInHeader(); Assert.assertEquals(nameOfRegionInHeader, "Санкт-Петербург");
    public String isNameOfRegionInHeader(){ return name_of_region_in_header.getText(); }


    //в шапке по умолчанию отображается способ получения - Самовывоз из магазина  //String nameOfDeliveryModeInHeader = plashka.isNameOfDeliveryModeInHeader(); Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
    public String isNameOfDeliveryModeInHeader(){ return name_of_delivery_mode_in_header.getText(); }



    //в шапке по умолчанию отображается магазин СПб. Шлиссельбургский пр-т  //String nameOfStoreInHeader = plashka.isNameOfStoreInHeader(); Assert.assertEquals(nameOfStoreInHeader, "СПб. Шлиссельбургский пр-т");
    public String isNameOfStoreInHeader(){ return name_of_store_in_header.getText(); }


    //Выбрать самовывоз из магазина в Строгино(Москва) из плашки // plashka.choosePickUpStrogino();
    public void choosePickUpStrogino(){
        choose_another_region_btn.click();
        popup_location_default_city.click();
        String nameOfDeliveryModeInHeader = isNameOfDeliveryModeInHeader();
            Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
        String nameOfStoreInHeader = isNameOfStoreInHeader();
            Assert.assertEquals(nameOfStoreInHeader, "Москва Строгинский б-р");
    }





}











