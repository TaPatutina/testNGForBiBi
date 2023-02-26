package pages.old_stage.modal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class TopCallMe {
    private WebDriver driver;


    //Перезвоните мне на главной странице
    @FindBy(xpath = "//*[@class='col-auto contact-call") private WebElement homepage_contact_call_box;
    @FindBy(xpath = "(//*[@class='contact-call__phone'])[2]") private WebElement homepage_contact_call_phone;
    @FindBy(xpath = "(//*[@class='contact-call__callback'])[2]") private WebElement homepage_contact_call_callback;
    @FindBy(xpath = "(//*[@class='contact-call__callback'])[2]/i") private WebElement homepage_contact_call_callback_img;
    @FindBy(xpath = "//*[@id='popup-holder_-popup-callback']") private List<WebElement> hp_popup_callback_list;
    @FindBy(xpath = "//*[@class='modal-content']") private WebElement hp_popup_callback_modal_content;
    @FindBy(xpath = "//*[@id='popup-holder_-popup-callback']//*[@class='modal-title h2']") private WebElement hp_popup_callback_title;
    @FindBy(xpath = "//*[@class='close icn icn-close']") private WebElement hp_modal_callme_close_btn;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='callback-name']") private WebElement hp_modal_callme_name_text;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='callback-lastname']") private WebElement hp_modal_callme_lastname_text;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='callback-phone']") private WebElement hp_modal_callme_phone_text;
    @FindBy(xpath = "//*[@class='modal-body']//*[@id='callback-agree']") private WebElement hp_modal_callme_agree_checkbox;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='callback-agree']") private WebElement hp_modal_callme_agree_checkbox_text;
    @FindBy(xpath = "//*[@id='callback-name']") private WebElement hp_modal_nameInput;
    @FindBy(xpath = "//*[@id='callback-lastname']") private WebElement hp_modal_lastnameInput;
    @FindBy(xpath = "//*[@id='callback-phone']") private WebElement hp_modal_phoneInput;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-block btn-lg']") private WebElement hp_modal_callme_submit_btn;
    @FindBy(xpath = "//*[@id='master-popup-emi']") private WebElement alert_form_submission_is_successful;




    //Constructor
    public TopCallMe(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }




    //блок Позвоните мне  на главной странице
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
    public void submitTheForm (String callback_name, String callback_lastname, String callback_phone) {
        hp_modal_nameInput.sendKeys(callback_name);
        hp_modal_lastnameInput.sendKeys(callback_lastname);
        hp_modal_phoneInput.sendKeys(callback_phone);
        hp_modal_callme_submit_btn.click();
    }
    public boolean isAlertSubmissionSuccessful(){ return alert_form_submission_is_successful.getText().contains("Информация Заявка принята"); }
    public boolean  isHomePagePopupCallNotPresent(){
        Boolean HomePagePopupCallNotStaleness = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='popup-holder_-popup-callback']//*[@class='modal-title h2']"))));
        return false;
    }
    //для проверки закрытия формы (assertFalse):
    public boolean  isHomePagePopupCallTitle(){  return hp_popup_callback_title.getText().contentEquals("Заказать обратный звонок"); }























}
