package pages.homePage;

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

public class BibiHomePage extends BasePage {
    public BibiHomePage(WebDriver driver) {
        super(driver);
    }


    //общее
    private final By breadcrumbs_1 = By.xpath("//div[@class='breadcrumbs__item']//span[text()='Главная']");
    private final By logo_1 = By.xpath("(//div[@class='header-logo__img'])[2]");
    private final By homepage_logo = By.cssSelector("div.header-top__logo");
    private final By homepage_logo_img = By.xpath("//div[@class='header-top__logo']/img");



    //Перезвоните мне
    @FindBy(xpath = "//div[@class='col-auto contact-call")
    private WebElement homepage_contact_call_box;
    @FindBy(xpath = "(//div[@class='contact-call__phone'])[2]")
    private WebElement homepage_contact_call_phone;
    @FindBy(xpath = "(//div[@class='contact-call__callback'])[2]")
    private WebElement homepage_contact_call_callback;
    @FindBy(xpath = "(//div[@class='contact-call__callback'])[2]/i")
    private WebElement homepage_contact_call_callback_img;
    @FindBy(xpath = "//div[@id='popup-holder_-popup-callback']")
    private List<WebElement> hp_popup_callback_list;
    @FindBy(xpath = "//div[@id='popup-holder_-popup-callback']")
    private WebElement hp_popup_callback;
    @FindBy(xpath = "//div[@class='modal-content']")
    private WebElement hp_popup_callback_modal_content;
    @FindBy(xpath = "//div[@id='popup-holder_-popup-callback']//*[@class='modal-title h2']")
    private WebElement hp_popup_callback_title;
    @FindBy(xpath = "//div[@class='modal-body']//*[@for='callback-name']")
    private WebElement hp_modal_callme_name_text;
    @FindBy(xpath = "//div[@class='modal-body']//*[@for='callback-lastname']")
    private WebElement hp_modal_callme_lastname_text;
    @FindBy(xpath = "//div[@class='modal-body']//*[@for='callback-phone']")
    private WebElement hp_modal_callme_phone_text;
    @FindBy(xpath = "//div[@class='modal-body']//*[@id='callback-agree']")
    private WebElement hp_modal_callme_agree_checkbox;
    @FindBy(xpath = "//div[@class='modal-body']//*[@for='callback-agree']")
    private WebElement hp_modal_callme_agree_checkbox_text;
    @FindBy(xpath = "//div[@id='callback-name']")
    private WebElement hp_modal_nameInput;
    @FindBy(xpath = "//div[@id='callback-lastname']")
    private WebElement hp_modal_lastnameInput;
    @FindBy(xpath = "//div[@id='callback-phone']")
    private WebElement hp_modal_phoneInput;
    @FindBy(xpath = "//div[@id='popup-holder_-popup-callback']//div[contains(@class,'close']")
    private WebElement hp_modal_callme_submit_btn;
    @FindBy(xpath = "//div[@id='popup-holder_master-popup-emi']//p[text()='Заявка принята']")
    private WebElement alert_form_submission_is_successful;
    @FindBy(xpath = "//div[@class='close icn icn-close']")
    private WebElement hp_modal_callme_close_btn;


    //Связаться с нами
    @FindBy(xpath = "//div[@class='btn btn-outline-info write-us__btn fading__btn']")
    private WebElement write_us_header_btn;
    @FindBy(xpath = "//div[@class='write-us__dropdown fading__box']/span")
    private WebElement write_us_header_hint_text;
    @FindBy(xpath = "//div[@class='write-us__dropdown fading__box']")
    private WebElement write_us_header_hint;
    @FindBy(xpath = "//div[@id='popup-holder_-popup-request']")
    private List<WebElement> hp_popup_write_us_list;
    @FindBy(xpath = "//div[@class='modal-content']")
    private WebElement hp_popup_write_us_modal_content;
    @FindBy(xpath = "//div[@id='popup-holder_-popup-request']//*[@class='modal-title h2']")
    private WebElement hp_popup_write_us_title;
    @FindBy(xpath = "(//div[@class='modal-body']/p)[2]")
    private WebElement hp_popup_write_us_subtitle;
    @FindBy(xpath = "//div[@class='modal-body']//*[@for='request-name']")
    private WebElement hp_modal_write_us_name_text;
    @FindBy(xpath = "//div[@class='modal-body']//*[@for='request-phone']")
    private WebElement hp_modal_write_us_phone_text;
    @FindBy(xpath = "(//div[@class='text-tabs my-12'])[1]")
    private WebElement hp_modal_write_us_text_about_select_vin_or_mark;
    @FindBy(xpath = "(//div[@class='text-tabs my-12'])[2]")
    private WebElement hp_modal_write_us_text_about_select_vin_or_mark2;
    @FindBy(xpath = "//div[@class='modal-body']//*[@for='request-vin']")
    private WebElement hp_modal_write_us_vin_text;
    @FindBy(xpath = "//div[@class='modal-body']//*[@id='request-agree']")
    private WebElement hp_modal_write_us_agree_checkbox;
    @FindBy(xpath = "//div[@class='modal-body']//*[@for='request-agree']")
    private WebElement hp_modal_write_us_agree_checkbox_text;
    @FindBy(xpath = "//div[@id='popup-request']//a[@href='/personal-data-policy']")
    private WebElement hp_modal_write_us_policy_link;
    @FindBy(xpath = "(//div[@id='popup-holder_-personal-data-policy'])//*[text()='(передача информации третьим лицам)']")
    private WebElement hp_modal_write_us_policy_final_text;
    @FindBy(xpath = "//div[@class='modal-body']//*[@for='request-mark']")
    private WebElement hp_modal_write_us_mark_text;
    @FindBy(xpath = "//div[@class='modal-body']//*[@for='request-model']")
    private WebElement hp_modal_write_us_model_text;
    @FindBy(xpath = "//div[@class='modal-body']//*[@for='request-year']")
    private WebElement hp_modal_write_us_year_text;
    @FindBy(xpath = "//div[@class='modal-body']//*[@for='request-engine']")
    private WebElement hp_modal_write_us_engine_text;
    @FindBy(xpath = "//div[@class='modal-body']//*[@for='request-transmission']")
    private WebElement hp_modal_write_us_transmission_text;
    @FindBy(xpath = "(//div[@for='request-tab-2'])[text()='марку автомобиля']")
    private WebElement hp_modal_write_us_choose_by_car_brand_link;
    @FindBy(xpath = "//div[@id='request-name']")
    private WebElement hp_modal_write_us_nameInput;
    @FindBy(xpath = "//div[@id='request-phone']")
    private WebElement hp_modal_write_us_phoneInput;
    @FindBy(xpath = "//div[@id='request-vin']")
    private WebElement hp_modal_write_us_vinInput;
    @FindBy(xpath = "//div[@id='request-msg']")
    private WebElement hp_modal_write_us_msgInput;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-block btn-lg']")
    private WebElement hp_modal_write_us_submit_btn;
    @FindBy(xpath = "//div[@id='master-popup-emi']")
    private WebElement alert_form_write_us_submission_is_successful;
    @FindBy(xpath = "//div[@id='popup-request']//*[@class='close icn icn-close']")
    private WebElement hp_modal_write_us_close_btn;
    @FindBy(xpath = "(//div[@id='popup-holder_-personal-data-policy'])//*[@class='close icn icn-close']")
    private WebElement hp_modal_write_us_policy_close_btn1;
    @FindBy(css = "#popup-holder_-personal-data-policy button.close.icn.icn-close")
    private WebElement hp_modal_write_us_policy_close_btn;





    // <------------ из хедера ----------------->


}




