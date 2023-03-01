package pages.old_stage.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;

import java.time.Duration;
import java.util.List;

public class HomePagePlashka extends BasePage {
    public HomePagePlashka(WebDriver driver) {
        super(driver);
    }


    private final By agreeWithTheCityBtn0 = By.xpath("//*[@data-js='region, sliderPanel']//*[contains(text(),'Да, верно')]");

    @FindBy(xpath = "//*[@data-js='region, sliderPanel']//*[contains(text(),'Да, верно')]")
    private WebElement agreeWithTheCityBtn;
    @FindBy(xpath = "//*[@class='col-12 col-sm-6 pb-20 pb-sm-0']/div[@class='h5']")
    private WebElement regionRequestText;
    @FindBy(xpath = "//*[@class='region-panel fade show']")
    private List<WebElement> elementsOfPlashka;
    @FindBy(xpath = "//*[@class='region-panel fade show']//div[@class='small']")
    private WebElement annotationRegionRequest;
    @FindBy(xpath = "//*[@class='region-panel__link h6 mb-0 js-region-link js-close-panel']")
    private WebElement chooseAnotherRegionBtn;
    @FindBy(xpath = "//*[@class='iconed-links__item iconed-links__item--row']")
    private WebElement changeRegionBtn;
    @FindBy(xpath = "//*[@id='popup-location']")
    private WebElement popupLocation;
    @FindBy(xpath = "//*[@id='popup_location']")
    private List<WebElement> elementsOfPopupLocation;
    @FindBy(xpath = "//*[@class='modal-title h2']")
    private WebElement popupLocationTitleText;
    @FindBy(xpath = "//ul[@class='list-column list-unstyled']//b/*[@class='js-region-select-link']")
    private WebElement popupLocationDefaultCity;
    @FindBy(xpath = "(//*[@id='popup-location'])//*[contains(text(),'Санкт-Петербург')]")
    private WebElement regionLinkSpb;
    @FindBy(xpath = "//*[@id='popup-location']/*[@class='popup__close']")
    private WebElement closePopupLocationBtn;
    @FindBy(xpath = "//*[@class='iconed-links__item iconed-links__item--row']")
    private WebElement nameOfRegionInHeader;
    @FindBy(xpath = "//*[@class='js-mode-name']")
    private WebElement nameOfDeliveryModeInHeader;
    @FindBy(xpath = "//*[@class='site-region__address small d-block js-address']")
    private WebElement nameOfStoreInHeader;


    //создать объект HomePagePlashka //HomePagePlashka hpPlashka = new HomePagePlashka(driver);

    //согласиться с городом //hpPlashka.clickAgreeWithTheCityIndex0();
    public HomePagePlashka clickAgreeWithTheCityIndex0() {
        driver.findElement(agreeWithTheCityBtn0).click();
        return this;
    }

    //дождаться плашки согласия с городом и согласиться с городом //hpPlashka.findAndClickAgreeWithTheCityIndex();
    public HomePagePlashka findAndClickAgreeWithTheCityIndex() {
        WebElement plashkaFind = driver.findElement(agreeWithTheCityBtn0);
        waitElementVisible(plashkaFind).click();
        return this;
    }


    //плашка закрылась //Assert.assertFalse(hpPlashka.isPanelOpenedIndex());
    public boolean isPanelOpenedIndex() {
        return agreeWithTheCityBtn.getText().contains("Да, верно");
    }

    //проверить наличие элементов плашки согласия с регионом
    public void isElementsOfPlashkaToBe() {
        List<WebElement> elements_of_plashka_list = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(elementsOfPlashka));
        String isRegionRequestText = regionRequestText.getText();
        Assert.assertEquals(isRegionRequestText, "Ваш город Москва?");
        String isAnnotationRegionRequestText = annotationRegionRequest.getText();
        Assert.assertEquals(isAnnotationRegionRequestText, "От выбранного города зависят цены, наличие товара и способы доставки");
        String agreeWithTheCityBtnText = agreeWithTheCityBtn.getText();
        Assert.assertEquals(agreeWithTheCityBtnText, "Да, верно");

    }

    //согласиться с городом
    public void clickAgreeWithTheCity() {
        agreeWithTheCityBtn.click();
    }

    //плашка закрылась
    public boolean isElementsOfPlashkaNotVisible() {
        Boolean ElementsOfPlashkaNotVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOfAllElements(elementsOfPlashka)));
        return false;
    }


    //кликнуть Выбрать другой регион //hpPlashka.clickChooseAnotherRegionBtn();
    public void clickChooseAnotherRegionBtn() {
        chooseAnotherRegionBtn.click();
    }

    //выбранный по умолчанию регион - Москва // String popupLocationSelectedRegionName = hpPlashka.isSelectedRegionName(); Assert.assertEquals(popupLocationSelectedRegionName, "Москва");
    public String isSelectedRegionName() {
        return popupLocationDefaultCity.getAttribute("text");
    }

    //кликнуть на Санкт-Петербург // hpPlashka.clickToRegionLink_SPb();
    public void clickToRegionLink_SPb() {
        regionLinkSpb.click();
    }

    //плашка закрылась (не отображается кнопка с текстом "Да, верно" - через assert (быстро) //Assert.assertFalse(hpPlashka.isAgreeWithTheCityBtnTextVisible());
    public boolean isAgreeWithTheCityBtnTextVisible() {
        return agreeWithTheCityBtn.getText().contentEquals("Да, верно");
    }

    //в шапке отображается регион СПб //String nameOfRegionInHeader = hpPlashka.isNameOfRegionInHeader(); Assert.assertEquals(nameOfRegionInHeader, "Санкт-Петербург");
    public String isNameOfRegionInHeader() {
        return nameOfRegionInHeader.getText();
    }

    //в шапке по умолчанию отображается способ получения - Самовывоз из магазина  //String nameOfDeliveryModeInHeader = hpPlashka.isNameOfDeliveryModeInHeader(); Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
    public String isNameOfDeliveryModeInHeader() {
        return nameOfDeliveryModeInHeader.getText();
    }

    //в шапке по умолчанию отображается магазин СПб. Шлиссельбургский пр-т  //String nameOfStoreInHeader = hpPlashka.isNameOfStoreInHeader(); Assert.assertEquals(nameOfStoreInHeader, "СПб. Шлиссельбургский пр-т");
    public String isNameOfStoreInHeader() {
        return nameOfStoreInHeader.getText();
    }


}











