package pageObject.stage.autorization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id='auth-signin']/*[text() = 'Войти']") private WebElement header_signin_btn;
    @FindBy(xpath = "//*[@class='icon icon--logout']") private WebElement header_signout_btn_icon;
    @FindBy(xpath = "//*[@class='auth is-active']//span[@class= 'btn__text']") private WebElement header_profile_btn_text;
    @FindBy(xpath = "//*[@id='popup-auth']") private WebElement popup_auth;
    @FindBy(xpath = "//*[@id='popup-auth']/h2[text()='Авторизация']") private WebElement popup_auth_title_text;
    @FindBy(xpath = "//*[@id='popup-auth']/p[text()='Если у Вас нет личного кабинета,']") private WebElement popup_auth_subheading_text1;
    @FindBy(xpath = "//*[@id='popup-auth']/p/a[text()='зарегистрируйтесь']") private WebElement popup_auth_subheading_register_text;
    @FindBy(xpath = "//*[@id='popup-auth']//label[@for='j_username'][text()='Email']") private WebElement popup_auth_label_username_text;
    @FindBy(xpath = "//*[@id='popup-auth']//label[@for='j_password'][text()='Пароль']") private WebElement popup_auth_label_password_text;
    @FindBy(xpath = "//*[@id='popup-auth']//input[@id='j_username']") private WebElement popup_auth_input_username;
    @FindBy(xpath = "//*[@id='popup-auth']//input[@id='j_password']") private WebElement popup_auth_input_password;
    @FindBy(xpath = "//*[@id='popup-auth']//span[@data-js='showPassword']") private WebElement popup_auth_show_password_btn;
    @FindBy(xpath = "//*[@id='popup-auth']//*[@class='icon icon--eye']") private WebElement popup_auth_show_password_icon;
    @FindBy(xpath = "//*[@id='popup-auth']//a[text()='Забыли пароль?']") private WebElement popup_auth_recover_password_link;
    @FindBy(xpath = "//*[@id='popup-auth']//button[text()='Войти']") private WebElement popup_auth_submit_btn;
    @FindBy(xpath = "//*[@id='popup-auth']/span[@class='popup__close']") private WebElement popup_auth_close_btn;
    @FindBy(xpath = "//*[@class='auth is-active']/a[@class='btn btn--link btn--sm auth__signout']") private WebElement header_signout_btn;



    //Constructor
    public LoginPage(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }


    //СОЗДАТЬ ОБЪЕКТ  LoginPage //LoginPage loginPage = new LoginPage(driver);

    //кликнуть Войти в шапке > отображается попап авторизации (проверка по заголовку) //loginPage.logInFromHeader();
    public void SignInFromHeader(){
       header_signin_btn.click();
        WebElement hasPopupAuthTitleText = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(popup_auth_title_text));
    }

    //отображается попап авторизации //Assert.assertTrue(loginPage.isPopupAuthorizationToBe());
    public boolean isPopupAuthorizationToBe(){
        WebElement hasPopupAuthTitleText = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(popup_auth_title_text));
        WebElement hasPopupAuthSubheadingText1 = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_auth_subheading_text1));
        Boolean isRegisterLink = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(popup_auth_subheading_register_text, "pathname", "/register"));
        WebElement hasPopupAuthLabelUsernameText = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_auth_label_username_text));
        WebElement hasPopupAuthUsernameInput = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_auth_input_username));
        WebElement hasPopupAuthLabelPasswordText = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_auth_label_password_text));
        WebElement hasPopupAuthPasswordInput = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_auth_input_password));
        WebElement hasPopupAuthShowPasswordIcon = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_auth_show_password_icon));
        Boolean isRecoverPasswordLink = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(popup_auth_recover_password_link,"data-href","#popup-recover-pass"));
        WebElement hasPopupAuthSubmitBtn = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_auth_submit_btn));
        WebElement hasPopupAuthCloseBtn = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_auth_close_btn));
        return true;
    }

    //залогиниться > отображается кнопка Выйти в хедере //loginPage.login("bi-bi@ya.ru", "123456");
    public void signIn (String login, String pass) {
        WebElement hasPopupAuthTitleText = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(popup_auth_title_text));
        popup_auth_input_username.sendKeys(login);
        popup_auth_input_password.sendKeys(pass);
        popup_auth_submit_btn.click();
        Boolean isSignOutBtnTitle = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.domPropertyToBe(header_signout_btn, "title", "Выйти"));
        Boolean isSignOutBtnHref = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(header_signout_btn, "pathname", "/logout"));
        WebElement isSignOutBtnIcon = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(header_signout_btn_icon));
    }

    //отображается кнопка Выйти в хедере //loginPage.isSignOutBtnToBe();
    public void isSignOutBtnToBe(){
        Boolean isSignOutBtnTitle = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.domPropertyToBe(header_signout_btn, "title", "Выйти"));
        Boolean isSignOutBtnHref = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(header_signout_btn, "pathname", "/logout"));
        WebElement isSignOutBtnIcon = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(header_signout_btn_icon));
    }

    //кликнуть на имя профиля в хедере > переход на стр профиля //loginPage.clickOnProfileBtn();
    public void clickOnProfileBtn(){
        header_profile_btn_text.click();
        Boolean newUr = (new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/profile")));
    }

    //залогиниться как bi-bi@ya.ru > отображается кнопка Выйти в хедере //loginPage.signInAsTapatutinaYaRu();
    public void signInAsTapatutinaYaRu () {
        WebElement hasPopupAuthTitleText = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(popup_auth_title_text));
        popup_auth_input_username.sendKeys("bi-bi@ya.ru");
        popup_auth_input_password.sendKeys("123456");
        popup_auth_submit_btn.click();
        Boolean isSignOutBtnTitle = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.domPropertyToBe(header_signout_btn, "title", "Выйти"));
        Boolean isSignOutBtnHref = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(header_signout_btn, "pathname", "/logout"));
        WebElement isSignOutBtnIcon = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(header_signout_btn_icon));
    }




}

