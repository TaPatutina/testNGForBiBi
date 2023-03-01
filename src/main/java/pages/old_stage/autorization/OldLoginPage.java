package pages.old_stage.autorization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OldLoginPage {
    private final WebDriver driver;

    @FindBy(xpath = "//*[@id='auth-signin']/*[text() = 'Войти']") private WebElement headerSigninBtn;
    @FindBy(xpath = "//*[@class='icon icon--logout']") private WebElement headerSignoutBtnIcon;
    @FindBy(xpath = "//*[@class='auth is-active']//span[@class= 'btn__text']") private WebElement headerProfileBtnText;
    @FindBy(xpath = "//*[@id='popup-auth']") private WebElement popupAuth;
    @FindBy(xpath = "//*[@id='popup-auth']/h2[text()='Авторизация']") private WebElement popupAuthTitleText;
    @FindBy(xpath = "//*[@id='popup-auth']/p[text()='Если у Вас нет личного кабинета,']") private WebElement popupAuthSubheadingText1;
    @FindBy(xpath = "//*[@id='popup-auth']/p/a[text()='зарегистрируйтесь']") private WebElement popupAuthSubheadingRegisterText;
    @FindBy(xpath = "//*[@id='popup-auth']//label[@for='j_username'][text()='Email']") private WebElement popupAuthLabelUsernameText;
    @FindBy(xpath = "//*[@id='popup-auth']//label[@for='j_password'][text()='Пароль']") private WebElement popupAuthLabelPasswordText;
    @FindBy(xpath = "//*[@id='popup-auth']//input[@id='j_username']") private WebElement popupAuthInputUsername;
    @FindBy(xpath = "//*[@id='popup-auth']//input[@id='j_password']") private WebElement popupAuthInputPassword;
    @FindBy(xpath = "//*[@id='popup-auth']//span[@data-js='showPassword']") private WebElement popupAuthShowPasswordBtn;
    @FindBy(xpath = "//*[@id='popup-auth']//*[@class='icon icon--eye']") private WebElement popupAuthShowPasswordIcon;
    @FindBy(xpath = "//*[@id='popup-auth']//a[text()='Забыли пароль?']") private WebElement popupAuthRecoverPasswordLink;
    @FindBy(xpath = "//*[@id='popup-auth']//button[text()='Войти']") private WebElement popupAuthSubmitBtn;
    @FindBy(xpath = "//*[@id='popup-auth']/span[@class='popup__close']") private WebElement popupAuthCloseBtn;
    @FindBy(xpath = "//*[@class='auth is-active']/a[@class='btn btn--link btn--sm auth__signout']") private WebElement headerSignoutBtn;



    //Constructor
    public OldLoginPage(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }


    //СОЗДАТЬ ОБЪЕКТ  LoginPage //LoginPage loginPage = new LoginPage(driver);

    //кликнуть Войти в шапке > отображается попап авторизации (проверка по заголовку) //loginPage.logInFromHeader();
    public void SignInFromHeader(){
       headerSigninBtn.click();
        WebElement hasPopupAuthTitleText = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(popupAuthTitleText));
    }

    //отображается попап авторизации //Assert.assertTrue(loginPage.isPopupAuthorizationToBe());
    public boolean isPopupAuthorizationToBe(){
        WebElement hasPopupAuthTitleText = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(popupAuthTitleText));
        WebElement hasPopupAuthSubheadingText1 = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupAuthSubheadingText1));
        Boolean isRegisterLink = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(popupAuthSubheadingRegisterText, "pathname", "/register"));
        WebElement hasPopupAuthLabelUsernameText = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupAuthLabelUsernameText));
        WebElement hasPopupAuthUsernameInput = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupAuthInputUsername));
        WebElement hasPopupAuthLabelPasswordText = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupAuthLabelPasswordText));
        WebElement hasPopupAuthPasswordInput = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupAuthInputPassword));
        WebElement hasPopupAuthShowPasswordIcon = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupAuthShowPasswordIcon));
        Boolean isRecoverPasswordLink = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(popupAuthRecoverPasswordLink,"data-href","#popup-recover-pass"));
        WebElement hasPopupAuthSubmitBtn = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupAuthSubmitBtn));
        WebElement hasPopupAuthCloseBtn = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupAuthCloseBtn));
        return true;
    }

    //залогинится > отображается кнопка Выйти в хедере //loginPage.login("bi-bi@ya.ru", "123456");
    public void signIn (String login, String pass) {
        WebElement hasPopupAuthTitleText = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(popupAuthTitleText));
        popupAuthInputUsername.sendKeys(login);
        popupAuthInputPassword.sendKeys(pass);
        popupAuthSubmitBtn.click();
        Boolean isSignOutBtnTitle = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.domPropertyToBe(headerSignoutBtn, "title", "Выйти"));
        Boolean isSignOutBtnHref = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(headerSignoutBtn, "pathname", "/logout"));
        WebElement isSignOutBtnIcon = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(headerSignoutBtnIcon));
    }

    //отображается кнопка Выйти в хедере //loginPage.isSignOutBtnToBe();
    public void isSignOutBtnToBe(){
        Boolean isSignOutBtnTitle = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.domPropertyToBe(headerSignoutBtn, "title", "Выйти"));
        Boolean isSignOutBtnHref = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(headerSignoutBtn, "pathname", "/logout"));
        WebElement isSignOutBtnIcon = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(headerSignoutBtnIcon));
    }

    //кликнуть на имя профиля в хедере > переход на стр профиля //loginPage.clickOnProfileBtn();
    public void clickOnProfileBtn(){
        headerProfileBtnText.click();
        Boolean newUr = (new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/profile")));
    }

    //залогиниться как bi-bi@ya.ru > отображается кнопка Выйти в хедере //loginPage.signInAsTapatutinaYaRu();
    public void signInAsTapatutinaYaRu () {
        WebElement hasPopupAuthTitleText = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(popupAuthTitleText));
        popupAuthInputUsername.sendKeys("bi-bi@ya.ru");
        popupAuthInputPassword.sendKeys("123456");
        popupAuthSubmitBtn.click();
        Boolean isSignOutBtnTitle = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.domPropertyToBe(headerSignoutBtn, "title", "Выйти"));
        Boolean isSignOutBtnHref = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(headerSignoutBtn, "pathname", "/logout"));
        WebElement isSignOutBtnIcon = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(headerSignoutBtnIcon));
    }




}

