package pages.old_stage.homePage;

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

public class HomePageHeaderTop {
    private WebDriver driver;



    //общее
    @FindBy(xpath = "//*[@class='breadcrumbs__item']//span[text()='Главная']") private WebElement breadcrumbs1;
    @FindBy(xpath = "(//*[@class='header-logo__img'])[2]") private WebElement logo1;

    //Логотип на гл.странице
    @FindBy(xpath = "//*[@class='header-top__logo']") private WebElement homepageLogo;
    @FindBy(xpath = "//*[@class='header-top__logo']/img") private WebElement homepageLogoImg;



    //Перезвоните мне
    @FindBy(xpath = "//*[@class='col-auto contact-call") private WebElement homepageContactCallBox;
    @FindBy(xpath = "(//*[@class='contact-call__phone'])[2]") private WebElement homepageContactCallPhone;
    @FindBy(xpath = "(//*[@class='contact-call__callback'])[2]") private WebElement homepageContactCallCallback;
    @FindBy(xpath = "(//*[@class='contact-call__callback'])[2]/i") private WebElement homepageContactCallCallbackImg;
    @FindBy(xpath = "//*[@id='popup-holder_-popup-callback']") private List<WebElement> hpPopupCallbackList;
    @FindBy(xpath = "//*[@id='popup-holder_-popup-callback']") private WebElement hpPopupCallback;
    @FindBy(xpath = "//*[@class='modal-content']") private WebElement hpPopupCallbackModalContent;
    @FindBy(xpath = "//*[@id='popup-holder_-popup-callback']//*[@class='modal-title h2']") private WebElement hpPopupCallbackTitle;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='callback-name']") private WebElement hpModalCallmeNameText;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='callback-lastname']") private WebElement hpModalCallmeLastnameText;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='callback-phone']") private WebElement hpModalCallmePhoneText;
    @FindBy(xpath = "//*[@class='modal-body']//*[@id='callback-agree']") private WebElement hpModalCallmeAgreeCheckbox;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='callback-agree']") private WebElement hpModalCallmeAgreeCheckboxText;
    @FindBy(xpath = "//*[@id='callback-name']") private WebElement hpModalNameInput;
    @FindBy(xpath = "//*[@id='callback-lastname']") private WebElement hpModalLastnameInput;
    @FindBy(xpath = "//*[@id='callback-phone']") private WebElement hpModalPhoneInput;
    @FindBy(xpath = "//*[@id='popup-holder_-popup-callback']//*[@class='close icn icn-close']") private WebElement hpModalCallmeSubmitBtn;
    @FindBy(xpath = "//*[@id='popup-holder_master-popup-emi']//p[text()='Заявка принята']") private WebElement alertFormSubmissionIsSuccessful;
    @FindBy(xpath = "//*[@class='close icn icn-close']") private WebElement hpModalCallmeCloseBtn;




    //Связаться с нами
    @FindBy(xpath = "//*[@class='btn btn-outline-info write-us__btn fading__btn']") private WebElement writeUsHeaderBtn;
    @FindBy(xpath = "//*[@class='write-us__dropdown fading__box']/span") private WebElement writeUsHeaderHintText;
    @FindBy(xpath = "//*[@class='write-us__dropdown fading__box']") private WebElement writeUsHeaderHint;
    @FindBy(xpath = "//*[@id='popup-holder_-popup-request']") private List<WebElement> hpPopupWriteUsList;
    @FindBy(xpath = "//*[@class='modal-content']") private WebElement hpPopupWriteUsModalContent;
    @FindBy(xpath = "//*[@id='popup-holder_-popup-request']//*[@class='modal-title h2']") private WebElement hpPopupWriteUsTitle;
    @FindBy(xpath = "(//*[@class='modal-body']/p)[2]") private WebElement hpPopupWriteUsSubtitle;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-name']") private WebElement hpModalWriteUsNameText;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-phone']") private WebElement hpModalWriteUsPhoneText;
    @FindBy(xpath = "(//*[@class='text-tabs my-12'])[1]") private WebElement hpModalWriteUsTextAboutSelectVinOrMark;
    @FindBy(xpath = "(//*[@class='text-tabs my-12'])[2]") private WebElement hpModalWriteUsTextAboutSelectVinOrMark2;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-vin']") private WebElement hpModalWriteUsVinText;
    @FindBy(xpath = "//*[@class='modal-body']//*[@id='request-agree']") private WebElement hpModalWriteUsAgreeCheckbox;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-agree']") private WebElement hpModalWriteUsAgreeCheckboxText;
    @FindBy(xpath = "//*[@id='popup-request']//a[@href='/personal-data-policy']") private WebElement hpModalWriteUsPolicyLink;
    @FindBy(xpath = "(//*[@id='popup-holder_-personal-data-policy'])//*[text()='(передача информации третьим лицам)']") private WebElement hpModalWriteUsPolicyFinalText;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-mark']") private WebElement hpModalWriteUsMarkText;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-model']") private WebElement hpModalWriteUsModelText;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-year']") private WebElement hpModalWriteUsYearText;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-engine']") private WebElement hpModalWriteUsEngineText;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-transmission']") private WebElement hpModalWriteUsTransmissionText;
    @FindBy(xpath = "(//*[@for='request-tab-2'])[text()='марку автомобиля']") private WebElement hpModalWriteUsChooseByCarBrandLink;
    @FindBy(xpath = "//*[@id='request-name']") private WebElement hpModalWriteUsNameInput;
    @FindBy(xpath = "//*[@id='request-phone']") private WebElement hpModalWriteUsPhoneInput;
    @FindBy(xpath = "//*[@id='request-vin']") private WebElement hpModalWriteUsVinInput;
    @FindBy(xpath = "//*[@id='request-msg']") private WebElement hpModalWriteUsMsgInput;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-block btn-lg']") private WebElement hpModalWriteUsSubmitBtn;
    @FindBy(xpath = "//*[@id='master-popup-emi']") private WebElement alertFormWriteUsSubmissionIsSuccessful;
    @FindBy(xpath = "//*[@id='popup-request']//*[@class='close icn icn-close']") private WebElement hpModalWriteUsCloseBtn;
    @FindBy(xpath = "(//*[@id='popup-holder_-personal-data-policy'])//*[@class='close icn icn-close']") private WebElement hpModalWriteUsPolicyCloseBtn1;
    @FindBy(css = "#popup-holder_-personal-data-policy button.close.icn.icn-close") private WebElement hpModalWriteUsPolicyCloseBtn;





    //блок локации (смена города)
    @FindBy(xpath = "//*[@class='col-auto iconed-links']/a[@data-js='popupContent']") private WebElement changeRegionBtn;
    @FindBy(xpath = "//*[@id='popup-holder_location-confirm']//*[@class='modal-title h2'][text()='При смене региона возможно изменение корзины.']") private WebElement alertLocationConfirmTitleText;
    @FindBy(xpath = "//*[@id='popup-location']") private WebElement popupLocationId;
    @FindBy(xpath = "//*[@class='popup popup--location']") private WebElement popupLocation;
    @FindBy(xpath = "//*[@id='popup_location']") private List<WebElement> elementsOfPopupLocation;
    @FindBy(xpath = "//*[@id='popup-location']//*[@class='modal-title h2'][text()='Выберите город']") private WebElement popupLocationTitleText;
    @FindBy(xpath = "//ul[@class='list-column list-unstyled']//b/*[@class='js-region-select-link']") private WebElement popupLocationDefaultCity;
    @FindBy(xpath = "(//*[@id='popup-location'])//*[contains(text(),'Санкт-Петербург')]") private WebElement regionLinkSpb;
    @FindBy(xpath = "//*[@class='iconed-links__item iconed-links__item--row']") private WebElement nameOfRegionInHeader;
    @FindBy(xpath = "//*[@class='js-mode-name']") private WebElement nameOfDeliveryModeInHeader;
    @FindBy(xpath = "//*[@class='site-region__address small d-block js-address']") private WebElement nameOfStoreInHeader;
    @FindBy(css = "#popup-location div.modal-header button") private WebElement closePopupLocationBtn1;
    @FindBy(xpath = "//*[@id='popup-location']/*[@class='modal-header']/button") private WebElement closePopupLocationBtn;







    //Constructor
    public HomePageHeaderTop(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }






    //общее
    public String isURL() { return driver.getCurrentUrl(); }
    public void clickOnBreadcrumbs_1() { breadcrumbs1.click(); }
    public void clickOnLogo_1() { logo1.click(); }






    //Логотип
    public void isLogoToBe() {
        WebElement isLogoVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(homepageLogoImg));
        WebElement isLogoClickable = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(homepageLogoImg));
        Boolean isLogoLink = homepageLogo.getAttribute("href").contentEquals("https://bi-bi.ru/");
        Boolean isLogoImg = homepageLogoImg.getAttribute("src").contentEquals("https://bi-bi.ru/_ui/dist/images/logo.png");
        Boolean isLogoAlt = homepageLogoImg.getAttribute("alt").contentEquals("bi-bi.ru");
    }
    public void clickToLogo() { homepageLogo.click(); }






    //блок Позвоните мне
    public void isContactCallBoxToBe() {
        WebElement isPhoneNumberVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(homepageContactCallPhone));
        WebElement isPhoneNumberClickable = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(homepageContactCallPhone));
        Boolean isPhoneNumberHref = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(homepageContactCallPhone, "href", "tel:84957559999"));
        Boolean isPhoneNumberDataJS = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(homepageContactCallPhone, "data-js", "gtag"));
        Boolean isPhoneNumberTagevent = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(homepageContactCallPhone, "data-tagevent", "callyou"));
        Boolean isPhoneNumberText = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBePresentInElement(homepageContactCallPhone,"8 495 755-99-99"));
        List<WebElement> isCallbackVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(homepageContactCallCallback));
        Boolean isCallbackImg = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(homepageContactCallCallbackImg,"class", "icn icn-phone"));
        Boolean isCallbackHref = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(homepageContactCallCallback, "href", "javascript:void(0);"));
        Boolean isCallbackDataJS = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(homepageContactCallCallback, "data-js", "popupContent"));
        Boolean isCallbackDataType = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(homepageContactCallCallback, "data-type", "callback"));
        Boolean isCallbackText = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBePresentInElement(homepageContactCallCallback,"Перезвоните мне"));
    }
    public void clickCallMe() {
        homepageContactCallCallback.click(); }
    public void isHomePagePopupCallBackToBe() {
        List<WebElement> isHomePagePopupCallBackVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(hpPopupCallbackList));
        String isHomePagePopupCallBackTitle = hpPopupCallbackTitle.getText();
            Assert.assertEquals(isHomePagePopupCallBackTitle, "Заказать обратный\n" +
                    "звонок");
        String isHomePagePopupCallBackNameText = hpModalCallmeNameText.getText();
            Assert.assertEquals(isHomePagePopupCallBackNameText, "Имя");
        String isHomePagePopupCallBackSurnameText = hpModalCallmeLastnameText.getText();
            Assert.assertEquals(isHomePagePopupCallBackSurnameText, "Фамилия");
        String isHomePagePopupCallBackPhoneText = hpModalCallmePhoneText.getText();
            Assert.assertEquals(isHomePagePopupCallBackPhoneText, "Телефон *");
        String isHomePagePopupCallBackAgreeText = hpModalCallmeAgreeCheckboxText.getText();
            Assert.assertEquals(isHomePagePopupCallBackAgreeText, "Я подтверждаю свое согласие на обработку персональных данных в соответствии с  Политикой конфиденциальности");
        Boolean isHomePagePopupCallBackCheckboxSelected = hpModalCallmeAgreeCheckbox.isSelected();
    }
    public void  clickToCloseModalCallMe(){
        hpModalCallmeCloseBtn.click();}
    public void submitTheForm (String callback_name, String callback_lastname, String callback_phone) throws InterruptedException {
        hpModalNameInput.sendKeys(callback_name);
        hpModalLastnameInput.sendKeys(callback_lastname);
        hpModalPhoneInput.sendKeys(callback_phone);
        Thread.sleep(500);
        hpModalCallmeSubmitBtn.click();
    }

    //появился алерт Информация Заявка принята //hasAlertSubmissionSuccessful();
    public void hasAlertSubmissionSuccessful(){
            WebElement isSubmissionSuccessful = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(alertFormSubmissionIsSuccessful));
             }

    //форма Позвоните мне не отображается //Assert.assertFalse(homePageHeaderTop.isHomePagePopupCallDisplayed());
    public boolean isHomePagePopupCallDisplayed() {
        try {
            return hpPopupCallback.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    //для проверки закрытия формы (assertFalse):
    public boolean  isHomePagePopupCallTitle(){  return hpPopupCallbackTitle.getText().contentEquals("Заказать обратный звонок"); }








    //блок Связаться с нами
    public boolean isWriteUsHeaderBtnText(){ return writeUsHeaderBtn.getText().contains("Связаться с нами"); }
    public void clickWriteUsHeaderBtn(){
        writeUsHeaderBtn.click();}
    public void moveToElementWriteUsHeaderBtn() {
        Actions action_write_us = new Actions(driver);
        action_write_us.moveToElement(writeUsHeaderBtn).click().perform();
    }
    public void isWriteUsHeaderHintText(){ String isWriteUsHeaderHintText = writeUsHeaderHintText.getAttribute("innerHTML");
        Assert.assertEquals(isWriteUsHeaderHintText, "Запрос менеджеру<br>по подбору автозапчастей");
    }
    public void clickWriteUsHeaderHint(){ writeUsHeaderHint.click(); }
    public void isHomePagePopupWriteUsVinToBe(){
        List<WebElement> isHomePagePopupWriteUsVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(hpPopupWriteUsList));
        String isHomePagePopupWriteUsTitle = hpPopupWriteUsTitle.getText();
            Assert.assertEquals(isHomePagePopupWriteUsTitle, "Отправить запрос менеджеру");
        String isHomePagePopupWriteUsSubtitle = hpPopupWriteUsSubtitle.getText();
            Assert.assertEquals(isHomePagePopupWriteUsSubtitle, "Вы можете оставить свою заявку на нужные детали, и мы свяжемся с Вами и поможем сделать заказ");
        String isHomePagePopupWriteUsNameText = hpModalWriteUsNameText.getText();
            Assert.assertEquals(isHomePagePopupWriteUsNameText, "Как к Вам обращаться");
        String isHomePagePopupWriteUsPhoneText = hpModalWriteUsPhoneText.getText();
            Assert.assertEquals(isHomePagePopupWriteUsPhoneText, "Телефон*");
        String isHomePagePopupWriteUsAboutSelectText = hpModalWriteUsTextAboutSelectVinOrMark.getText();
            Assert.assertEquals(isHomePagePopupWriteUsAboutSelectText, "Введите VIN или  марку автомобиля (либо сообщите по телефону)");
        String isHomePagePopupWriteUsSurnameText = hpModalWriteUsVinText.getText();
            Assert.assertEquals(isHomePagePopupWriteUsSurnameText, "VIN");
        String isHomePagePopupWriteUsAgreeText = hpModalWriteUsAgreeCheckboxText.getText();
            Assert.assertEquals(isHomePagePopupWriteUsAgreeText, "Я подтверждаю свое согласие на обработку персональных данных в соответствии с Политикой");
        Boolean isHomePagePopupWriteUsCheckboxSelected = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeSelected(hpModalWriteUsAgreeCheckbox));
    }
    public void clickChooseByCarBrand(){
        hpModalWriteUsChooseByCarBrandLink.click();}
    public void isHomePagePopupWriteUsMarkToBe(){
        List<WebElement> isHomePagePopupWriteUsVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(hpPopupWriteUsList));
        String isHomePagePopupWriteUsTitle = hpPopupWriteUsTitle.getText();
            Assert.assertEquals(isHomePagePopupWriteUsTitle, "Отправить запрос менеджеру");
        String isHomePagePopupWriteUsSubtitle = hpPopupWriteUsSubtitle.getText();
            Assert.assertEquals(isHomePagePopupWriteUsSubtitle, "Вы можете оставить свою заявку на нужные детали, и мы свяжемся с Вами и поможем сделать заказ");
        String isHomePagePopupWriteUsNameText = hpModalWriteUsNameText.getText();
            Assert.assertEquals(isHomePagePopupWriteUsNameText, "Как к Вам обращаться");
        String isHomePagePopupWriteUsPhoneText = hpModalWriteUsPhoneText.getText();
            Assert.assertEquals(isHomePagePopupWriteUsPhoneText, "Телефон*");
        String isHomePagePopupWriteUsAboutSelectText = hpModalWriteUsTextAboutSelectVinOrMark2.getText();
            Assert.assertEquals(isHomePagePopupWriteUsAboutSelectText, "Введите VIN или  марку автомобиля (либо сообщите по телефону)");
        Boolean isHomePagePopupWriteUsSurnameText = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.invisibilityOf(hpModalWriteUsVinText));
        String isHomePagePopupWriteUsMarkText = hpModalWriteUsMarkText.getText();
            Assert.assertEquals(isHomePagePopupWriteUsMarkText, "Марка");
        String isHomePagePopupWriteUsModelText = hpModalWriteUsModelText.getText();
            Assert.assertEquals(isHomePagePopupWriteUsModelText, "Модель");
        String isHomePagePopupWriteUsYearText = hpModalWriteUsYearText.getText();
            Assert.assertEquals(isHomePagePopupWriteUsYearText, "Год выпуска");
        String isHomePagePopupWriteUsEngineText = hpModalWriteUsEngineText.getText();
            Assert.assertEquals(isHomePagePopupWriteUsEngineText, "Двигатель");
        String isHomePagePopupWriteUsTransmissionText = hpModalWriteUsTransmissionText.getText();
            Assert.assertEquals(isHomePagePopupWriteUsTransmissionText, "КПП");
        String isHomePagePopupWriteUsAgreeText = hpModalWriteUsAgreeCheckboxText.getText();
            Assert.assertEquals(isHomePagePopupWriteUsAgreeText, "Я подтверждаю свое согласие на обработку персональных данных в соответствии с Политикой");
        Boolean isHomePagePopupWriteUsCheckboxSelected = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeSelected(hpModalWriteUsAgreeCheckbox));
    }
    public void clickPopupWriteUsToPolicyLink(){ hpModalWriteUsPolicyLink.click(); }
    public void isPopupWriteUsPolicyText(){
        WebElement isPopupWriteUsPolicyTextVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(hpModalWriteUsPolicyFinalText));
    }
    public void closePopupWriteUsPolicyText(){
        Actions actionClosePolicyText = new Actions(driver);
        actionClosePolicyText.moveToElement(hpModalWriteUsPolicyCloseBtn, 1,1).build().perform();
        hpModalWriteUsPolicyCloseBtn.click();
    }
    public void closeHomePagePopupWriteUs(){
        Actions actionClosePopupWriteUs = new Actions(driver);
        actionClosePopupWriteUs.moveToElement(hpModalWriteUsCloseBtn).click().perform();
    }
    public void isPopupWriteUsPolicyTextInvisible(){
        Boolean isPopupWriteUsPolicyTextInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.invisibilityOf(hpModalWriteUsPolicyFinalText));
    }




//ПОПАП ЛОКАЛИЗАЦИИ (СМЕНА ГОРОДА)
    //создать объект  HomePageHeaderTop //HomePageHeaderTop hpHeaderTop = new HomePageHeaderTop(driver);

   //кликнуть на регион (город) > открывается попап локализации или алерт про товары, если корзина не пустая  //hpHeaderTop.clickChangeRegionBtn();
    public void clickChangeRegionBtn(){
        changeRegionBtn.click();
        try {
            WebElement visibilityOf = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(popupLocationTitleText));
        } catch (Exception e) {
            WebElement visibilityOf = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(alertLocationConfirmTitleText));
        }
    }

    // открывается попап локализации //hpHeaderTop.isElementsOfPopapLocationToBe();
    public void isElementsOfPopupLocationToBe(){
        WebElement visibilityOf = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(popupLocationTitleText));
        String isPopupLocationTitleText = popupLocationTitleText.getAttribute("textContent");
        Assert.assertEquals(isPopupLocationTitleText, "Выберите город" );
    }
    //выбранный в попапе по умолчанию регион - Москва //String popupLocationSelectedRegionName = hpHeaderTop.isSelectedRegionName(); Assert.assertEquals(popupLocationSelectedRegionName, "Москва");
    public String isSelectedRegionName(){ return popupLocationDefaultCity.getAttribute("text"); }

    //кликнуть на Санкт-Петербург //hpHeaderTop.clickToRegionLink_SPb();
    public void clickToRegionLink_SPb(){
        regionLinkSpb.click();}

    //попап локализации открыт //hpHeaderTop.isTitleOfPopupLocationVisible();
    public boolean isTitleOfPopupLocationVisible(){
        return popupLocationTitleText.getAttribute("textContent").contentEquals("Выберите город");
    }
    //попап локализации отображается //Assert.assertTrue(hpHeaderTop.isTitleOfPopupLocationVisible()); или нет, в т.ч. в коде //Assert.assertFalse(hpHeaderTop.isPopupLocationDisplayed());
    public boolean isPopupLocationDisplayed() {
        try {
          return popupLocation.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    //в шапке отображается регион СПб //String nameOfRegionInHeader = hpHeaderTop.isNameOfRegionInHeader(); Assert.assertEquals(nameOfRegionInHeader, "Санкт-Петербург");
    public String isNameOfRegionInHeader(){ return nameOfRegionInHeader.getText(); }
    //в шапке по умолчанию отображается способ получения - Самовывоз из магазина  //String nameOfDeliveryModeInHeader = hpHeaderTop.isNameOfDeliveryModeInHeader(); Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
    public String isNameOfDeliveryModeInHeader(){ return nameOfDeliveryModeInHeader.getText(); }
    //в шапке по умолчанию отображается магазин СПб. Шлиссельбургский пр-т  //String nameOfStoreInHeader = hpHeaderTop.isNameOfStoreInHeader(); Assert.assertEquals(nameOfStoreInHeader, "СПб. Шлиссельбургский пр-т");
    public String isNameOfStoreInHeader(){ return nameOfStoreInHeader.getText(); }
    //Выбрать самовывоз из магазина в Строгино(Москва) из плашки // hpHeaderTop.choosePickUpStrogino();
    public void choosePickUpStrogino(){
        changeRegionBtn.click();
        popupLocationDefaultCity.click();
        String nameOfDeliveryModeInHeader = isNameOfDeliveryModeInHeader();
        Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
        String nameOfStoreInHeader = isNameOfStoreInHeader();
        Assert.assertEquals(nameOfStoreInHeader, "Москва Строгинский б-р");
    }
    //закрыть попап локализации крестиком //hpHeaderTop.clickClosePopupLocationBtn();
    public void clickClosePopupLocationBtn(){
        closePopupLocationBtn.click();
    }







}







