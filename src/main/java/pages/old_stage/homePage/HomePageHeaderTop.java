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
    @FindBy(xpath = "//*[@class='breadcrumbs__item']//span[text()='Главная']") private WebElement breadcrumbs_1;
    @FindBy(xpath = "(//*[@class='header-logo__img'])[2]") private WebElement logo_1;

    //Логотип на гл.странице
    @FindBy(xpath = "//*[@class='header-top__logo']") private WebElement homepage_logo;
    @FindBy(xpath = "//*[@class='header-top__logo']/img") private WebElement homepage_logo_img;



    //Перезвоните мне
    @FindBy(xpath = "//*[@class='col-auto contact-call") private WebElement homepage_contact_call_box;
    @FindBy(xpath = "(//*[@class='contact-call__phone'])[2]") private WebElement homepage_contact_call_phone;
    @FindBy(xpath = "(//*[@class='contact-call__callback'])[2]") private WebElement homepage_contact_call_callback;
    @FindBy(xpath = "(//*[@class='contact-call__callback'])[2]/i") private WebElement homepage_contact_call_callback_img;
    @FindBy(xpath = "//*[@id='popup-holder_-popup-callback']") private List<WebElement> hp_popup_callback_list;
    @FindBy(xpath = "//*[@id='popup-holder_-popup-callback']") private WebElement hp_popup_callback;
    @FindBy(xpath = "//*[@class='modal-content']") private WebElement hp_popup_callback_modal_content;
    @FindBy(xpath = "//*[@id='popup-holder_-popup-callback']//*[@class='modal-title h2']") private WebElement hp_popup_callback_title;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='callback-name']") private WebElement hp_modal_callme_name_text;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='callback-lastname']") private WebElement hp_modal_callme_lastname_text;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='callback-phone']") private WebElement hp_modal_callme_phone_text;
    @FindBy(xpath = "//*[@class='modal-body']//*[@id='callback-agree']") private WebElement hp_modal_callme_agree_checkbox;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='callback-agree']") private WebElement hp_modal_callme_agree_checkbox_text;
    @FindBy(xpath = "//*[@id='callback-name']") private WebElement hp_modal_nameInput;
    @FindBy(xpath = "//*[@id='callback-lastname']") private WebElement hp_modal_lastnameInput;
    @FindBy(xpath = "//*[@id='callback-phone']") private WebElement hp_modal_phoneInput;
    @FindBy(xpath = "//*[@id='popup-holder_-popup-callback']//*[@class='close icn icn-close']") private WebElement hp_modal_callme_submit_btn;
    @FindBy(xpath = "//*[@id='popup-holder_master-popup-emi']//p[text()='Заявка принята']") private WebElement alert_form_submission_is_successful;
    @FindBy(xpath = "//*[@class='close icn icn-close']") private WebElement hp_modal_callme_close_btn;




    //Связаться с нами
    @FindBy(xpath = "//*[@class='btn btn-outline-info write-us__btn fading__btn']") private WebElement write_us_header_btn;
    @FindBy(xpath = "//*[@class='write-us__dropdown fading__box']/span") private WebElement write_us_header_hint_text;
    @FindBy(xpath = "//*[@class='write-us__dropdown fading__box']") private WebElement write_us_header_hint;
    @FindBy(xpath = "//*[@id='popup-holder_-popup-request']") private List<WebElement> hp_popup_write_us_list;
    @FindBy(xpath = "//*[@class='modal-content']") private WebElement hp_popup_write_us_modal_content;
    @FindBy(xpath = "//*[@id='popup-holder_-popup-request']//*[@class='modal-title h2']") private WebElement hp_popup_write_us_title;
    @FindBy(xpath = "(//*[@class='modal-body']/p)[2]") private WebElement hp_popup_write_us_subtitle;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-name']") private WebElement hp_modal_write_us_name_text;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-phone']") private WebElement hp_modal_write_us_phone_text;
    @FindBy(xpath = "(//*[@class='text-tabs my-12'])[1]") private WebElement hp_modal_write_us_text_about_select_vin_or_mark;
    @FindBy(xpath = "(//*[@class='text-tabs my-12'])[2]") private WebElement hp_modal_write_us_text_about_select_vin_or_mark2;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-vin']") private WebElement hp_modal_write_us_vin_text;
    @FindBy(xpath = "//*[@class='modal-body']//*[@id='request-agree']") private WebElement hp_modal_write_us_agree_checkbox;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-agree']") private WebElement hp_modal_write_us_agree_checkbox_text;
    @FindBy(xpath = "//*[@id='popup-request']//a[@href='/personal-data-policy']") private WebElement hp_modal_write_us_policy_link;
    @FindBy(xpath = "(//*[@id='popup-holder_-personal-data-policy'])//*[text()='(передача информации третьим лицам)']") private WebElement hp_modal_write_us_policy_final_text;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-mark']") private WebElement hp_modal_write_us_mark_text;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-model']") private WebElement hp_modal_write_us_model_text;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-year']") private WebElement hp_modal_write_us_year_text;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-engine']") private WebElement hp_modal_write_us_engine_text;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='request-transmission']") private WebElement hp_modal_write_us_transmission_text;
    @FindBy(xpath = "(//*[@for='request-tab-2'])[text()='марку автомобиля']") private WebElement hp_modal_write_us_choose_by_car_brand_link;
    @FindBy(xpath = "//*[@id='request-name']") private WebElement hp_modal_write_us_nameInput;
    @FindBy(xpath = "//*[@id='request-phone']") private WebElement hp_modal_write_us_phoneInput;
    @FindBy(xpath = "//*[@id='request-vin']") private WebElement hp_modal_write_us_vinInput;
    @FindBy(xpath = "//*[@id='request-msg']") private WebElement hp_modal_write_us_msgInput;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-block btn-lg']") private WebElement hp_modal_write_us_submit_btn;
    @FindBy(xpath = "//*[@id='master-popup-emi']") private WebElement alert_form_write_us_submission_is_successful;
    @FindBy(xpath = "//*[@id='popup-request']//*[@class='close icn icn-close']") private WebElement hp_modal_write_us_close_btn;
    @FindBy(xpath = "(//*[@id='popup-holder_-personal-data-policy'])//*[@class='close icn icn-close']") private WebElement hp_modal_write_us_policy_close_btn1;
    @FindBy(css = "#popup-holder_-personal-data-policy button.close.icn.icn-close") private WebElement hp_modal_write_us_policy_close_btn;





    //блок локации (смена города)
    @FindBy(xpath = "//*[@class='col-auto iconed-links']/a[@data-js='popupContent']") private WebElement change_region_btn;
    @FindBy(xpath = "//*[@id='popup-holder_location-confirm']//*[@class='modal-title h2'][text()='При смене региона возможно изменение корзины.']") private WebElement alert_location_confirm_title_text;
    @FindBy(xpath = "//*[@id='popup-location']") private WebElement popup_location_id;
    @FindBy(xpath = "//*[@class='popup popup--location']") private WebElement popup_location;
    @FindBy(xpath = "//*[@id='popup_location']") private List<WebElement> elements_of_popup_location;
    @FindBy(xpath = "//*[@id='popup-location']//*[@class='modal-title h2'][text()='Выберите город']") private WebElement popup_location_title_text;
    @FindBy(xpath = "//ul[@class='list-column list-unstyled']//b/*[@class='js-region-select-link']") private WebElement popup_location_default_city;
    @FindBy(xpath = "(//*[@id='popup-location'])//*[contains(text(),'Санкт-Петербург')]") private WebElement region_link_SPb;
    @FindBy(xpath = "//*[@class='iconed-links__item iconed-links__item--row']") private WebElement name_of_region_in_header;
    @FindBy(xpath = "//*[@class='js-mode-name']") private WebElement name_of_delivery_mode_in_header;
    @FindBy(xpath = "//*[@class='site-region__address small d-block js-address']") private WebElement name_of_store_in_header;
    @FindBy(css = "#popup-location div.modal-header button") private WebElement close_popup_location_btn1;
    @FindBy(xpath = "//*[@id='popup-location']/*[@class='modal-header']/button") private WebElement close_popup_location_btn;







    //Constructor
    public HomePageHeaderTop(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }






    //общее
    public String isURL() { return driver.getCurrentUrl(); }
    public void clickOnBreadcrumbs_1() { breadcrumbs_1.click(); }
    public void clickOnLogo_1() { logo_1.click(); }






    //Логотип
    public void isLogoToBe() {
        WebElement isLogoVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(homepage_logo_img));
        WebElement isLogoClickable = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(homepage_logo_img));
        Boolean isLogoLink = homepage_logo.getAttribute("href").contentEquals("https://bi-bi.ru/");
        Boolean isLogoImg = homepage_logo_img.getAttribute("src").contentEquals("https://bi-bi.ru/_ui/dist/images/logo.png");
        Boolean isLogoAlt = homepage_logo_img.getAttribute("alt").contentEquals("bi-bi.ru");
    }
    public void clickToLogo() { homepage_logo.click(); }






    //блок Позвоните мне
    public void isContactCallBoxToBe() {
        WebElement isPhoneNumberVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(homepage_contact_call_phone));
        WebElement isPhoneNumberClickable = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(homepage_contact_call_phone));
        Boolean isPhoneNumberHref = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(homepage_contact_call_phone, "href", "tel:84957559999"));
        Boolean isPhoneNumberDataJS = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(homepage_contact_call_phone, "data-js", "gtag"));
        Boolean isPhoneNumberTagevent = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(homepage_contact_call_phone, "data-tagevent", "callyou"));
        Boolean isPhoneNumberText = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBePresentInElement(homepage_contact_call_phone,"8 495 755-99-99"));
        List<WebElement> isCallbackVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(homepage_contact_call_callback));
        Boolean isCallbackImg = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(homepage_contact_call_callback_img,"class", "icn icn-phone"));
        Boolean isCallbackHref = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(homepage_contact_call_callback, "href", "javascript:void(0);"));
        Boolean isCallbackDataJS = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(homepage_contact_call_callback, "data-js", "popupContent"));
        Boolean isCallbackDataType = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(homepage_contact_call_callback, "data-type", "callback"));
        Boolean isCallbackText = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.textToBePresentInElement(homepage_contact_call_callback,"Перезвоните мне"));
    }
    public void clickCallMe() {homepage_contact_call_callback.click(); }
    public void isHomePagePopupCallBackToBe() {
        List<WebElement> isHomePagePopupCallBackVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(hp_popup_callback_list));
        String isHomePagePopupCallBackTitle = hp_popup_callback_title.getText();
            Assert.assertEquals(isHomePagePopupCallBackTitle, "Заказать обратный\n" +
                    "звонок");
        String isHomePagePopupCallBackNameText = hp_modal_callme_name_text.getText();
            Assert.assertEquals(isHomePagePopupCallBackNameText, "Имя");
        String isHomePagePopupCallBackSurnameText = hp_modal_callme_lastname_text.getText();
            Assert.assertEquals(isHomePagePopupCallBackSurnameText, "Фамилия");
        String isHomePagePopupCallBackPhoneText = hp_modal_callme_phone_text.getText();
            Assert.assertEquals(isHomePagePopupCallBackPhoneText, "Телефон *");
        String isHomePagePopupCallBackAgreeText = hp_modal_callme_agree_checkbox_text.getText();
            Assert.assertEquals(isHomePagePopupCallBackAgreeText, "Я подтверждаю свое согласие на обработку персональных данных в соответствии с  Политикой конфиденциальности");
        Boolean isHomePagePopupCallBackCheckboxSelected = hp_modal_callme_agree_checkbox.isSelected();
    }
    public void  clickToCloseModalCallMe(){hp_modal_callme_close_btn.click();}
    public void submitTheForm (String callback_name, String callback_lastname, String callback_phone) throws InterruptedException {
        hp_modal_nameInput.sendKeys(callback_name);
        hp_modal_lastnameInput.sendKeys(callback_lastname);
        hp_modal_phoneInput.sendKeys(callback_phone);
        Thread.sleep(500);
        hp_modal_callme_submit_btn.click();
    }

    //появился алерт Информация Заявка принята //hasAlertSubmissionSuccessful();
    public void hasAlertSubmissionSuccessful(){
            WebElement isSubmissionSuccessful = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(alert_form_submission_is_successful));
             }

    //форма Позвоните мне не отображается //Assert.assertFalse(homePageHeaderTop.isHomePagePopupCallDisplayed());
    public boolean isHomePagePopupCallDisplayed() {
        try {
            return hp_popup_callback.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    //для проверки закрытия формы (assertFalse):
    public boolean  isHomePagePopupCallTitle(){  return hp_popup_callback_title.getText().contentEquals("Заказать обратный звонок"); }








    //блок Связаться с нами
    public boolean isWriteUsHeaderBtnText(){ return write_us_header_btn.getText().contains("Связаться с нами"); }
    public void clickWriteUsHeaderBtn(){write_us_header_btn.click();}
    public void moveToElementWriteUsHeaderBtn() {
        Actions action_write_us = new Actions(driver);
        action_write_us.moveToElement(write_us_header_btn).click().perform();
    }
    public void isWriteUsHeaderHintText(){ String isWriteUsHeaderHintText = write_us_header_hint_text.getAttribute("innerHTML");
        Assert.assertEquals(isWriteUsHeaderHintText, "Запрос менеджеру<br>по подбору автозапчастей");
    }
    public void clickWriteUsHeaderHint(){ write_us_header_hint.click(); }
    public void isHomePagePopupWriteUsVinToBe(){
        List<WebElement> isHomePagePopupWriteUsVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(hp_popup_write_us_list));
        String isHomePagePopupWriteUsTitle = hp_popup_write_us_title.getText();
            Assert.assertEquals(isHomePagePopupWriteUsTitle, "Отправить запрос менеджеру");
        String isHomePagePopupWriteUsSubtitle = hp_popup_write_us_subtitle.getText();
            Assert.assertEquals(isHomePagePopupWriteUsSubtitle, "Вы можете оставить свою заявку на нужные детали, и мы свяжемся с Вами и поможем сделать заказ");
        String isHomePagePopupWriteUsNameText = hp_modal_write_us_name_text.getText();
            Assert.assertEquals(isHomePagePopupWriteUsNameText, "Как к Вам обращаться");
        String isHomePagePopupWriteUsPhoneText = hp_modal_write_us_phone_text.getText();
            Assert.assertEquals(isHomePagePopupWriteUsPhoneText, "Телефон*");
        String isHomePagePopupWriteUsAboutSelectText = hp_modal_write_us_text_about_select_vin_or_mark.getText();
            Assert.assertEquals(isHomePagePopupWriteUsAboutSelectText, "Введите VIN или  марку автомобиля (либо сообщите по телефону)");
        String isHomePagePopupWriteUsSurnameText = hp_modal_write_us_vin_text.getText();
            Assert.assertEquals(isHomePagePopupWriteUsSurnameText, "VIN");
        String isHomePagePopupWriteUsAgreeText = hp_modal_write_us_agree_checkbox_text.getText();
            Assert.assertEquals(isHomePagePopupWriteUsAgreeText, "Я подтверждаю свое согласие на обработку персональных данных в соответствии с Политикой");
        Boolean isHomePagePopupWriteUsCheckboxSelected = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeSelected(hp_modal_write_us_agree_checkbox));
    }
    public void clickChooseByCarBrand(){hp_modal_write_us_choose_by_car_brand_link.click();}
    public void isHomePagePopupWriteUsMarkToBe(){
        List<WebElement> isHomePagePopupWriteUsVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(hp_popup_write_us_list));
        String isHomePagePopupWriteUsTitle = hp_popup_write_us_title.getText();
            Assert.assertEquals(isHomePagePopupWriteUsTitle, "Отправить запрос менеджеру");
        String isHomePagePopupWriteUsSubtitle = hp_popup_write_us_subtitle.getText();
            Assert.assertEquals(isHomePagePopupWriteUsSubtitle, "Вы можете оставить свою заявку на нужные детали, и мы свяжемся с Вами и поможем сделать заказ");
        String isHomePagePopupWriteUsNameText = hp_modal_write_us_name_text.getText();
            Assert.assertEquals(isHomePagePopupWriteUsNameText, "Как к Вам обращаться");
        String isHomePagePopupWriteUsPhoneText = hp_modal_write_us_phone_text.getText();
            Assert.assertEquals(isHomePagePopupWriteUsPhoneText, "Телефон*");
        String isHomePagePopupWriteUsAboutSelectText = hp_modal_write_us_text_about_select_vin_or_mark2.getText();
            Assert.assertEquals(isHomePagePopupWriteUsAboutSelectText, "Введите VIN или  марку автомобиля (либо сообщите по телефону)");
        Boolean isHomePagePopupWriteUsSurnameText = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.invisibilityOf(hp_modal_write_us_vin_text));
        String isHomePagePopupWriteUsMarkText = hp_modal_write_us_mark_text.getText();
            Assert.assertEquals(isHomePagePopupWriteUsMarkText, "Марка");
        String isHomePagePopupWriteUsModelText = hp_modal_write_us_model_text.getText();
            Assert.assertEquals(isHomePagePopupWriteUsModelText, "Модель");
        String isHomePagePopupWriteUsYearText = hp_modal_write_us_year_text.getText();
            Assert.assertEquals(isHomePagePopupWriteUsYearText, "Год выпуска");
        String isHomePagePopupWriteUsEngineText = hp_modal_write_us_engine_text.getText();
            Assert.assertEquals(isHomePagePopupWriteUsEngineText, "Двигатель");
        String isHomePagePopupWriteUsTransmissionText = hp_modal_write_us_transmission_text.getText();
            Assert.assertEquals(isHomePagePopupWriteUsTransmissionText, "КПП");
        String isHomePagePopupWriteUsAgreeText = hp_modal_write_us_agree_checkbox_text.getText();
            Assert.assertEquals(isHomePagePopupWriteUsAgreeText, "Я подтверждаю свое согласие на обработку персональных данных в соответствии с Политикой");
        Boolean isHomePagePopupWriteUsCheckboxSelected = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeSelected(hp_modal_write_us_agree_checkbox));
    }
    public void clickPopupWriteUsToPolicyLink(){ hp_modal_write_us_policy_link.click(); }
    public void isPopupWriteUsPolicyText(){
        WebElement isPopupWriteUsPolicyTextVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(hp_modal_write_us_policy_final_text));
    }
    public void closePopupWriteUsPolicyText(){
        Actions actionClosePolicyText = new Actions(driver);
        actionClosePolicyText.moveToElement(hp_modal_write_us_policy_close_btn, 1,1).build().perform();
        hp_modal_write_us_policy_close_btn.click();
    }
    public void closeHomePagePopupWriteUs(){
        Actions actionClosePopupWriteUs = new Actions(driver);
        actionClosePopupWriteUs.moveToElement(hp_modal_write_us_close_btn).click().perform();
    }
    public void isPopupWriteUsPolicyTextInvisible(){
        Boolean isPopupWriteUsPolicyTextInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.invisibilityOf(hp_modal_write_us_policy_final_text));
    }




//ПОПАП ЛОКАЛИЗАЦИИ (СМЕНА ГОРОДА)
    //создать объект  HomePageHeaderTop //HomePageHeaderTop hpHeaderTop = new HomePageHeaderTop(driver);

   //кликнуть на регион (город) > открывается попап локализации или алерт про товары, если корзина не пустая  //hpHeaderTop.clickChangeRegionBtn();
    public void clickChangeRegionBtn(){
        change_region_btn.click();
        try {
            WebElement visibilityOf = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(popup_location_title_text));
        } catch (Exception e) {
            WebElement visibilityOf = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(alert_location_confirm_title_text));
        }
    }

    // открывается попап локализации //hpHeaderTop.isElementsOfPopapLocationToBe();
    public void isElementsOfPopupLocationToBe(){
        WebElement visibilityOf = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(popup_location_title_text));
        String isPopupLocationTitleText = popup_location_title_text.getAttribute("textContent");
        Assert.assertEquals(isPopupLocationTitleText, "Выберите город" );
    }
    //выбранный в попапе по умолчанию регион - Москва //String popupLocationSelectedRegionName = hpHeaderTop.isSelectedRegionName(); Assert.assertEquals(popupLocationSelectedRegionName, "Москва");
    public String isSelectedRegionName(){ return popup_location_default_city.getAttribute("text"); }

    //кликнуть на Санкт-Петербург //hpHeaderTop.clickToRegionLink_SPb();
    public void clickToRegionLink_SPb(){region_link_SPb.click();}

    //попап локализации открыт //hpHeaderTop.isTitleOfPopupLocationVisible();
    public boolean isTitleOfPopupLocationVisible(){
        return popup_location_title_text.getAttribute("textContent").contentEquals("Выберите город");
    }
    //попап локализации отображается //Assert.assertTrue(hpHeaderTop.isTitleOfPopupLocationVisible()); или нет, в т.ч. в коде //Assert.assertFalse(hpHeaderTop.isPopupLocationDisplayed());
    public boolean isPopupLocationDisplayed() {
        try {
          return popup_location.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    //в шапке отображается регион СПб //String nameOfRegionInHeader = hpHeaderTop.isNameOfRegionInHeader(); Assert.assertEquals(nameOfRegionInHeader, "Санкт-Петербург");
    public String isNameOfRegionInHeader(){ return name_of_region_in_header.getText(); }
    //в шапке по умолчанию отображается способ получения - Самовывоз из магазина  //String nameOfDeliveryModeInHeader = hpHeaderTop.isNameOfDeliveryModeInHeader(); Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
    public String isNameOfDeliveryModeInHeader(){ return name_of_delivery_mode_in_header.getText(); }
    //в шапке по умолчанию отображается магазин СПб. Шлиссельбургский пр-т  //String nameOfStoreInHeader = hpHeaderTop.isNameOfStoreInHeader(); Assert.assertEquals(nameOfStoreInHeader, "СПб. Шлиссельбургский пр-т");
    public String isNameOfStoreInHeader(){ return name_of_store_in_header.getText(); }
    //Выбрать самовывоз из магазина в Строгино(Москва) из плашки // hpHeaderTop.choosePickUpStrogino();
    public void choosePickUpStrogino(){
        change_region_btn.click();
        popup_location_default_city.click();
        String nameOfDeliveryModeInHeader = isNameOfDeliveryModeInHeader();
        Assert.assertEquals(nameOfDeliveryModeInHeader, "Самовывоз из магазина");
        String nameOfStoreInHeader = isNameOfStoreInHeader();
        Assert.assertEquals(nameOfStoreInHeader, "Москва Строгинский б-р");
    }
    //закрыть попап локализации крестиком //hpHeaderTop.clickClosePopupLocationBtn();
    public void clickClosePopupLocationBtn(){
        close_popup_location_btn.click();
    }







}







