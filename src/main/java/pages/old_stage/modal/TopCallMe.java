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
    @FindBy(xpath = "//*[@class='col-auto contact-call") private WebElement homepageContactCallBox;
    @FindBy(xpath = "(//*[@class='contact-call__phone'])[2]") private WebElement homepageContactCallPhone;
    @FindBy(xpath = "(//*[@class='contact-call__callback'])[2]") private WebElement homepageContactCallCallback;
    @FindBy(xpath = "(//*[@class='contact-call__callback'])[2]/i") private WebElement homepageContactCallCallbackImg;
    @FindBy(xpath = "//*[@id='popup-holder_-popup-callback']") private List<WebElement> hpPopupCallbackList;
    @FindBy(xpath = "//*[@class='modal-content']") private WebElement hpPopupCallbackModalContent;
    @FindBy(xpath = "//*[@id='popup-holder_-popup-callback']//*[@class='modal-title h2']") private WebElement hpPopupCallbackTitle;
    @FindBy(xpath = "//*[@class='close icn icn-close']") private WebElement hpModalCallmeCloseBtn;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='callback-name']") private WebElement hpModalCallmeNameText;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='callback-lastname']") private WebElement hpModalCallmeLastnameText;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='callback-phone']") private WebElement hpModalCallmePhoneText;
    @FindBy(xpath = "//*[@class='modal-body']//*[@id='callback-agree']") private WebElement hpModalCallmeAgreeCheckbox;
    @FindBy(xpath = "//*[@class='modal-body']//*[@for='callback-agree']") private WebElement hpModalCallmeAgreeCheckboxText;
    @FindBy(xpath = "//*[@id='callback-name']") private WebElement hpModalNameInput;
    @FindBy(xpath = "//*[@id='callback-lastname']") private WebElement hpModalLastnameInput;
    @FindBy(xpath = "//*[@id='callback-phone']") private WebElement hpModalPhoneInput;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-block btn-lg']") private WebElement hpModalCallmeSubmitBtn;
    @FindBy(xpath = "//*[@id='master-popup-emi']") private WebElement alertFormSubmissionIsSuccessful;




    //Constructor
    public TopCallMe(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }




    //блок Позвоните мне  на главной странице
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
    public void submitTheForm (String callback_name, String callback_lastname, String callback_phone) {
        hpModalNameInput.sendKeys(callback_name);
        hpModalLastnameInput.sendKeys(callback_lastname);
        hpModalPhoneInput.sendKeys(callback_phone);
        hpModalCallmeSubmitBtn.click();
    }
    public boolean isAlertSubmissionSuccessful(){ return alertFormSubmissionIsSuccessful.getText().contains("Информация Заявка принята"); }
    public boolean  isHomePagePopupCallNotPresent(){
        Boolean HomePagePopupCallNotStaleness = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='popup-holder_-popup-callback']//*[@class='modal-title h2']"))));
        return false;
    }
    //для проверки закрытия формы (assertFalse):
    public boolean  isHomePagePopupCallTitle(){  return hpPopupCallbackTitle.getText().contentEquals("Заказать обратный звонок"); }























}
