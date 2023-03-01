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


    @FindBy(xpath = "//*[@class='auth is-active']/a[@class='btn btn--link btn--sm auth__signout']") private WebElement headerSignoutBtn;
    @FindBy(xpath = "//*[@id='auth-signin']/*[text() = 'Войти']") private WebElement headerSigninBtn;
    @FindBy(xpath = "//*[@class='icon icon--logout']") private WebElement headerSignoutBtnIcon;
    @FindBy(xpath = "//*[@class='auth is-active']//span[@class= 'btn__text']") private WebElement headerProfileBtnText;



    //Constructor
    public HeaderTop(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }


    //СОЗДАТЬ ОБЪЕКТ HeaderTop //HeaderTop headerTop = new HeaderTop(driver);

    //отображается кнопка Войти в хедере //headerTop.isSignInBtnToBe();
    public void isSignInBtnToBe(){
        WebElement isSignInBtnIcon = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(headerSigninBtn));
    }


    //отображается кнопка Выйти в хедере //headerTop.isSignOutBtnToBe();
    public void isSignOutBtnToBe(){
        Boolean isSignOutBtnTitle = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.domPropertyToBe(headerSignoutBtn, "title", "Выйти"));
        Boolean isSignOutBtnHref = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(headerSignoutBtn, "pathname", "/logout"));
        WebElement isSignOutBtnIcon = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(headerSignoutBtnIcon));
    }

   //кликнуть на имя профиля в хедере //headerTop.clickOnProfileBtn();
    public void clickOnProfileBtn(){
        headerProfileBtnText.click();
    }






}
