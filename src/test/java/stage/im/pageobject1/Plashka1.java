package stage.im.pageobject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Plashka1 {
    private WebDriver driver;


    @FindBy(css = "button.btn.btn--white.js-close-panel.js-region-select-link")
    private WebElement close_panel_btn;

    //Constructor
    public Plashka1(WebDriver driver){
        this.driver=driver;

        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    /*//We will use this boolean for assertion. To check if page is opened
    public boolean isPageOpened(){
        return heading.getText().toString().contains("Developer portal");
    }*/

    public void clikOnClose_panel(){
        close_panel_btn.click();
    }
}











