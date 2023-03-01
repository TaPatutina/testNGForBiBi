package pages.otherObjects;

import common.RandomData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;

import java.time.Duration;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='auth-signin']/*[text() = 'Войти']")
    private WebElement headerSigninBtn;
    @FindBy(xpath = "//*[@class='icon icon--logout']")
    private WebElement headerSignoutBtnIcon;
    @FindBy(xpath = "//*[@class='auth is-active']//span[@class= 'btn__text']")
    private WebElement headerProfileBtnText;
    @FindBy(xpath = "//*[@id='popup-auth']")
    private WebElement popupAuth;
    @FindBy(xpath = "//*[@id='popup-auth']/h2[text()='Авторизация']")
    private WebElement popupAuthTitleText;
    @FindBy(xpath = "//*[@id='popup-auth']/p[text()='Если у Вас нет личного кабинета,']")
    private WebElement popupAuthSubheadingText1;
    @FindBy(xpath = "//*[@id='popup-auth']/p/a[text()='зарегистрируйтесь']")
    private WebElement popupAuthSubheadingRegisterText;
    @FindBy(xpath = "//*[@id='popup-auth']//label[@for='j_username'][text()='Email']")
    private WebElement popupAuthLabelUsernameText;
    @FindBy(xpath = "//*[@id='popup-auth']//label[@for='j_password'][text()='Пароль']")
    private WebElement popupAuthLabelPasswordText;
    @FindBy(xpath = "//*[@id='popup-auth']//input[@id='j_username']")
    private WebElement popupAuthInputUsername;
    @FindBy(xpath = "//*[@id='popup-auth']//input[@id='j_password']")
    private WebElement popupAuthInputPassword;
    @FindBy(xpath = "//*[@id='popup-auth']//span[@data-js='showPassword']")
    private WebElement popupAuthShowPasswordBtn;
    @FindBy(xpath = "//*[@id='popup-auth']//*[@class='icon icon--eye']")
    private WebElement popupAuthShowPasswordIcon;
    @FindBy(xpath = "//*[@id='popup-auth']//a[text()='Забыли пароль?']")
    private WebElement popupAuthRecoverPasswordLink;
    @FindBy(xpath = "//*[@id='popup-auth']//button[text()='Войти']")
    private WebElement popupAuthSubmitBtn;
    @FindBy(xpath = "//*[@id='popup-auth']/span[@class='popup__close']")
    private WebElement popupAuthCloseBtn;
    @FindBy(xpath = "//*[@class='auth is-active']/a[@class='btn btn--link btn--sm auth__signout']")
    private WebElement headerSignoutBtn;


    //кликнуть Войти в шапке > отображается попап авторизации (проверка по заголовку)
    public void clickSigninInHeader() {
        headerSigninBtn.click();
    }

    //отображается попап авторизации
    public void isPopupAuthorizationVisible() {
        waitElementVisible(popupAuthTitleText);
        waitElementVisible(popupAuthSubheadingText1);
        Assert.assertTrue(checkPresenceAttribute(popupAuthSubheadingRegisterText, "pathname", "/register"));
        waitElementVisible(popupAuthLabelUsernameText);
        waitElementVisible(popupAuthInputUsername);
        waitElementVisible(popupAuthLabelPasswordText);
        waitElementVisible(popupAuthInputPassword);
        waitElementVisible(popupAuthShowPasswordIcon);
        Assert.assertTrue(checkPresenceAttribute(popupAuthRecoverPasswordLink, "data-href", "#popup-recover-pass"));
        waitElementVisible(popupAuthSubmitBtn);
        waitElementVisible(popupAuthCloseBtn);


    }

    //попытка залогиниться с валидными несуществующими в системе данными
    public void checkSigninWithRandomValidData() {
        String randomEmail = RandomData.getOrdinaryValidEmail();
        String randomPass = RandomData.getOrdinaryValidPass();
        System.out.println("Email в тесте: " + randomEmail);
        System.out.println("Password в тесте: " + randomPass);
        popupAuthInputUsername.sendKeys(randomEmail);
        popupAuthInputPassword.sendKeys(randomPass);
        popupAuthSubmitBtn.click();
        //проверить на текст "Неправильная электронная почта или пароль"
    }

    //отображается кнопка Выйти в хедере //loginPage.isSignOutBtnToBe();
    public void isSignOutBtnToBe() {
        Boolean isSignOutBtnTitle = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.domPropertyToBe(headerSignoutBtn, "title", "Выйти"));
        Boolean isSignOutBtnHref = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(headerSignoutBtn, "pathname", "/logout"));
        WebElement isSignOutBtnIcon = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(headerSignoutBtnIcon));
    }

    //кликнуть на имя профиля в хедере > переход на стр профиля //loginPage.clickOnProfileBtn();
    public void clickOnProfileBtn() {
        headerProfileBtnText.click();
        Boolean newUr = (new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/profile")));
    }

    //залогиниться как bi-bi@ya.ru > отображается кнопка Выйти в хедере //loginPage.signInAsTapatutinaYaRu();
    public void signInAsTapatutinaYaRu() {
        WebElement hasPopupAuthTitleText = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(popupAuthTitleText));
        popupAuthInputUsername.sendKeys("bi-bi@ya.ru");
        popupAuthInputPassword.sendKeys("123456");
        popupAuthSubmitBtn.click();
        Boolean isSignOutBtnTitle = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.domPropertyToBe(headerSignoutBtn, "title", "Выйти"));
        Boolean isSignOutBtnHref = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(headerSignoutBtn, "pathname", "/logout"));
        WebElement isSignOutBtnIcon = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(headerSignoutBtnIcon));
    }


}

