package pages.old_stage.header;

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


    @FindBy(css = "button.btn.btn--white.js-close-panel.js-region-select-link") private WebElement agreeWithTheCityBtn;
    @FindBy(xpath = "//*[@class='slider-panel__title'][contains(text(),'Ваш город')]") private WebElement regionRequestText;
    @FindBy(xpath = "//*[@class='slider-panel js-slider-panel slider-panel--fixed is-visible']") private List<WebElement> elementsOfPlashka;
    @FindBy(xpath = "//*[@class='slider-panel__content']") private WebElement annotationRegionRequest;
    @FindBy(xpath = "//*[@data-js='region, sliderPanel']//button[contains(text(),'Нет, выбрать другой город')]") private WebElement chooseAnotherRegionBtn;
    @FindBy(xpath = "//*[@id='popup_location']") private List<WebElement> elementsOfPopupLocation;
    @FindBy(xpath = "//*[@class='popup__hl'][contains(text(),'Выберите город')]") private WebElement popupLocationTitleText;

    @FindBy(xpath = "//*[strong]//*[@class='link link--black link--no-border js-region-select-link']") private WebElement popupLocationDefaultCity;
    @FindBy(xpath = "(//*[@id='popup-location'])//*[contains(text(),'Санкт-Петербург')]") private WebElement regionLinkSpb;
    @FindBy(xpath = "(//*[@id='popup-location'])//*[contains(text(),'Тверь')]") private WebElement regionLinkTver;
    @FindBy(xpath = "//*[@class='nav-main nav-main--top']//*[@data-change-region-btn]") private WebElement nameOfRegionInHeader;
    @FindBy(xpath = "//*[@class='js-mode-name']") private WebElement nameOfDeliveryModeInHeader;
    @FindBy(xpath = "//*[@class='site-region__address small d-block js-address']") private WebElement nameOfStoreInHeader;



    //Constructor
    public Plashka(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }


    //СОЗДАТЬ ОБЪЕКТ Plashka //Plashka plashka = new Plashka(driver);

    //дождаться открытия и проверить наличие элементов панели уточнения локализации //plashka.isElementsOfPlashkaToBe();
    public void isElementsOfPlashkaToBe(){
        WebElement isRegionRequestTextContain = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(regionRequestText));
        String isAnnotationRegionRequestText = annotationRegionRequest.getText();
            Assert.assertEquals(isAnnotationRegionRequestText, "От выбранного города зависят цены, наличие товара и способы доставки" );
        String agreeWithTheCityBtnText = agreeWithTheCityBtn.getText();
            Assert.assertEquals(agreeWithTheCityBtnText, "Да, верно");
        String chooseAnotherRegionBtnText = chooseAnotherRegionBtn.getText();
            Assert.assertEquals(chooseAnotherRegionBtnText, "Нет, выбрать другой город");
    }

    //согласиться с городом > панель уточнения локализации закрылась //plashka.clickAgreeWithTheCity();
    public void clickAgreeWithTheCity() {
        WebElement isRegionRequestTextContain = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(agreeWithTheCityBtn));
        agreeWithTheCityBtn.click();
        Boolean isRegionRequestTextInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(regionRequestText)));
    }

    //плашка закрылась (быстрая проверка по тексту "Да, верно")//Assert.assertFalse(plashka.isAgreeWithTheCityBtnTextVisible());
    public boolean  isAgreeWithTheCityBtnTextVisible(){
        return agreeWithTheCityBtn.getText().contentEquals("Да, верно");
    }

    //плашка закрылась (по видимости всех элементов, долго!)
    public boolean  isElementsOfPlashkaNotVisible(){
        Boolean ElementsOfPlashkaNotVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOfAllElements(elementsOfPlashka)));
        return false;
    }

    //дождаться открытия панели уточнения локализации и кликнуть "Выбрать другой регион" > откроется попап с городами //plashka.clickChooseAnotherRegionBtn();
    public void clickChooseAnotherRegionBtn(){
        WebElement isRegionRequestTextContain = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(agreeWithTheCityBtn));
        chooseAnotherRegionBtn.click();
        WebElement visibilityOf = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupLocationTitleText));
    }


    // открывается попап локации
    public void isElementsOfPopapLocationToBe(){
        List<WebElement> elementsOfPopupLocationList = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(elementsOfPopupLocation));
        WebElement visibilityOf = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupLocationTitleText));
    }

    //выбранный по умолчанию регион - Москва // String popupLocationSelectedRegionName = plashka.isSelectedRegionName(); Assert.assertEquals(popupLocationSelectedRegionName, "Москва");
    public String isSelectedRegionName(){ return popupLocationDefaultCity.getText(); }

    //кликнуть на Санкт-Петербург > город в шапке сменился на Санкт-Петербург // plashka.clickToRegionLink_SPb();
    public void clickToRegionLink_SPb(){
        regionLinkSpb.click();
        Boolean textToBePresentInElement = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.textToBePresentInElement(nameOfRegionInHeader,"Санкт-Петербург"));
    }

    //кликнуть  в попапе локализации на регион "Тверь" > город в шапке сменился на Тверь // plashka.clickToRegionLink_Tver();
    public void clickToRegionLink_Tver(){
        regionLinkTver.click();
        Boolean textToBePresentInElement = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.textToBePresentInElement(nameOfRegionInHeader,"Тверь"));
    }

    //в шапке отображается регион СПб //String nameOfRegionInHeader = plashka.isNameOfRegionInHeader(); Assert.assertEquals(nameOfRegionInHeader, "Санкт-Петербург");
    public String isNameOfRegionInHeader(){ return nameOfRegionInHeader.getText(); }


    //в шапке по умолчанию отображается способ получения - Самовывоз из магазина  //String nameOfDeliveryModeInHeader = plashka.isNameOfDeliveryModeInHeader(); Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
    public String isNameOfDeliveryModeInHeader(){ return nameOfDeliveryModeInHeader.getText(); }



    //в шапке по умолчанию отображается магазин СПб. Шлиссельбургский пр-т  //String nameOfStoreInHeader = plashka.isNameOfStoreInHeader(); Assert.assertEquals(nameOfStoreInHeader, "СПб. Шлиссельбургский пр-т");
    public String isNameOfStoreInHeader(){ return nameOfStoreInHeader.getText(); }


    //Выбрать самовывоз из магазина в Строгино(Москва) из плашки // plashka.choosePickUpStrogino();
    public void choosePickUpStrogino(){
        chooseAnotherRegionBtn.click();
        popupLocationDefaultCity.click();
        String nameOfDeliveryModeInHeader = isNameOfDeliveryModeInHeader();
            Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
        String nameOfStoreInHeader = isNameOfStoreInHeader();
            Assert.assertEquals(nameOfStoreInHeader, "Москва Строгинский б-р");
    }





}











