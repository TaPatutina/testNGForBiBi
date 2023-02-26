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


    private final By agree_with_the_city_btn0 = By.xpath("//*[@data-js='region, sliderPanel']//*[contains(text(),'Да, верно')]");

    @FindBy(xpath = "//*[@data-js='region, sliderPanel']//*[contains(text(),'Да, верно')]")
    private WebElement agree_with_the_city_btn;
    @FindBy(xpath = "//*[@class='col-12 col-sm-6 pb-20 pb-sm-0']/div[@class='h5']")
    private WebElement region_request_text;
    @FindBy(xpath = "//*[@class='region-panel fade show']")
    private List<WebElement> elements_of_plashka;
    @FindBy(xpath = "//*[@class='region-panel fade show']//div[@class='small']")
    private WebElement annotation_region_request;
    @FindBy(xpath = "//*[@class='region-panel__link h6 mb-0 js-region-link js-close-panel']")
    private WebElement choose_another_region_btn;
    @FindBy(xpath = "//*[@class='iconed-links__item iconed-links__item--row']")
    private WebElement change_region_btn;
    @FindBy(xpath = "//*[@id='popup-location']")
    private WebElement popup_location;
    @FindBy(xpath = "//*[@id='popup_location']")
    private List<WebElement> elements_of_popup_location;
    @FindBy(xpath = "//*[@class='modal-title h2']")
    private WebElement popup_location_title_text;
    @FindBy(xpath = "//ul[@class='list-column list-unstyled']//b/*[@class='js-region-select-link']")
    private WebElement popup_location_default_city;
    @FindBy(xpath = "(//*[@id='popup-location'])//*[contains(text(),'Санкт-Петербург')]")
    private WebElement region_link_SPb;
    @FindBy(xpath = "//*[@id='popup-location']/*[@class='popup__close']")
    private WebElement close_popup_location_btn;
    @FindBy(xpath = "//*[@class='iconed-links__item iconed-links__item--row']")
    private WebElement name_of_region_in_header;
    @FindBy(xpath = "//*[@class='js-mode-name']")
    private WebElement name_of_delivery_mode_in_header;
    @FindBy(xpath = "//*[@class='site-region__address small d-block js-address']")
    private WebElement name_of_store_in_header;


    //создать объект HomePagePlashka //HomePagePlashka hpPlashka = new HomePagePlashka(driver);

    //согласиться с городом //hpPlashka.clickAgreeWithTheCityIndex0();
    public HomePagePlashka clickAgreeWithTheCityIndex0() {
        driver.findElement(agree_with_the_city_btn0).click();
        return this;
    }

    //дождаться плашки согласия с городом и согласиться с городом //hpPlashka.findAndClickAgreeWithTheCityIndex();
    public HomePagePlashka findAndClickAgreeWithTheCityIndex() {
        WebElement plashkaFind = driver.findElement(agree_with_the_city_btn0);
        waitElementVisible(plashkaFind).click();
        return this;
    }


    //плашка закрылась //Assert.assertFalse(hpPlashka.isPanelOpenedIndex());
    public boolean isPanelOpenedIndex() {
        return agree_with_the_city_btn.getText().contains("Да, верно");
    }

    //проверить наличие элементов плашки согласия с регионом
    public void isElementsOfPlashkaToBe() {
        List<WebElement> elements_of_plashka_list = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(elements_of_plashka));
        String isRegionRequestText = region_request_text.getText();
        Assert.assertEquals(isRegionRequestText, "Ваш город Москва?");
        String isAnnotationRegionRequestText = annotation_region_request.getText();
        Assert.assertEquals(isAnnotationRegionRequestText, "От выбранного города зависят цены, наличие товара и способы доставки");
        String agreeWithTheCityBtnText = agree_with_the_city_btn.getText();
        Assert.assertEquals(agreeWithTheCityBtnText, "Да, верно");

    }

    //согласиться с городом
    public void clickAgreeWithTheCity() {
        agree_with_the_city_btn.click();
    }

    //плашка закрылась
    public boolean isElementsOfPlashkaNotVisible() {
        Boolean ElementsOfPlashkaNotVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOfAllElements(elements_of_plashka)));
        return false;
    }


    //кликнуть Выбрать другой регион //hpPlashka.clickChooseAnotherRegionBtn();
    public void clickChooseAnotherRegionBtn() {
        choose_another_region_btn.click();
    }

    //выбранный по умолчанию регион - Москва // String popupLocationSelectedRegionName = hpPlashka.isSelectedRegionName(); Assert.assertEquals(popupLocationSelectedRegionName, "Москва");
    public String isSelectedRegionName() {
        return popup_location_default_city.getAttribute("text");
    }

    //кликнуть на Санкт-Петербург // hpPlashka.clickToRegionLink_SPb();
    public void clickToRegionLink_SPb() {
        region_link_SPb.click();
    }

    //плашка закрылась (не отображается кнопка с текстом "Да, верно" - через assert (быстро) //Assert.assertFalse(hpPlashka.isAgreeWithTheCityBtnTextVisible());
    public boolean isAgreeWithTheCityBtnTextVisible() {
        return agree_with_the_city_btn.getText().contentEquals("Да, верно");
    }

    //в шапке отображается регион СПб //String nameOfRegionInHeader = hpPlashka.isNameOfRegionInHeader(); Assert.assertEquals(nameOfRegionInHeader, "Санкт-Петербург");
    public String isNameOfRegionInHeader() {
        return name_of_region_in_header.getText();
    }

    //в шапке по умолчанию отображается способ получения - Самовывоз из магазина  //String nameOfDeliveryModeInHeader = hpPlashka.isNameOfDeliveryModeInHeader(); Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
    public String isNameOfDeliveryModeInHeader() {
        return name_of_delivery_mode_in_header.getText();
    }

    //в шапке по умолчанию отображается магазин СПб. Шлиссельбургский пр-т  //String nameOfStoreInHeader = hpPlashka.isNameOfStoreInHeader(); Assert.assertEquals(nameOfStoreInHeader, "СПб. Шлиссельбургский пр-т");
    public String isNameOfStoreInHeader() {
        return name_of_store_in_header.getText();
    }


}











