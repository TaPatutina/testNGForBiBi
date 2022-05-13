package pageObject.stage.modal;

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

public class TopWriteUs {
    private WebDriver driver;





    @FindBy(xpath = "//*[@class='btn btn-outline-info write-us__btn fading__btn']") private WebElement write_us_header_btn;






    //Constructor
    public TopWriteUs(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }


public void clickWriteUsHeaderBtn(){write_us_header_btn.click();}

















}
