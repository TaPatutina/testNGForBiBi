package pages.old_stage.modal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopWriteUs {
    private WebDriver driver;





    @FindBy(xpath = "//*[@class='btn btn-outline-info write-us__btn fading__btn']") private WebElement writeUsHeaderBtn;






    //Constructor
    public TopWriteUs(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }


public void clickWriteUsHeaderBtn(){
    writeUsHeaderBtn.click();}

















}
