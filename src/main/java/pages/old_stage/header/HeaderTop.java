package pages.old_stage.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeaderTop {
    private WebDriver driver;


    @FindBy(xpath = "//*[@class='auth is-active']/a[@class='btn btn--link btn--sm auth__signout']") private WebElement header_signout_btn;
    @FindBy(xpath = "//*[@id='auth-signin']/*[text() = 'Войти']") private WebElement header_signin_btn;
    @FindBy(xpath = "//*[@class='icon icon--logout']") private WebElement header_signout_btn_icon;
    @FindBy(xpath = "//*[@class='auth is-active']//span[@class= 'btn__text']") private WebElement header_profile_btn_text;



    //Constructor
    public HeaderTop(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }


    //СОЗДАТЬ ОБЪЕКТ HeaderTop //HeaderTop headerTop = new HeaderTop(driver);

    //отображается кнопка Войти в хедере //headerTop.isSignInBtnToBe();
    public void isSignInBtnToBe(){
        WebElement isSignInBtnIcon = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(header_signin_btn));
    }


    //отображается кнопка Выйти в хедере //headerTop.isSignOutBtnToBe();
    public void isSignOutBtnToBe(){
        Boolean isSignOutBtnTitle = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.domPropertyToBe(header_signout_btn, "title", "Выйти"));
        Boolean isSignOutBtnHref = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(header_signout_btn, "pathname", "/logout"));
        WebElement isSignOutBtnIcon = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(header_signout_btn_icon));
    }

   //кликнуть на имя профиля в хедере //headerTop.clickOnProfileBtn();
    public void clickOnProfileBtn(){
        header_profile_btn_text.click();
    }






}
