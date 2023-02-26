package pages.old_stage.pricing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OP595BrandFiltron {
    private WebDriver driver;

    //Page URL
    private static String PAGE_URL ="https://bi-bi.ru/product/e0000034180";


    @FindBy (xpath = "/html/head/meta[10]") private WebElement description;
    @FindBy (xpath = "//ul[@class='breadcrumbs']/li[1]") private WebElement breadcrumb1;
    @FindBy (xpath = "//ul[@class='breadcrumbs']/li[2]") private WebElement breadcrumb2;




    //Constructor
    public OP595BrandFiltron(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }


    public String isPageTitle(){ return driver.getTitle(); }
    public boolean isBreadcrumb1Text(){ return breadcrumb1.getText().contentEquals("Главная"); }
    public boolean isBreadcrumb1SEOitem(){ return breadcrumb1.getAttribute("itemprop").contentEquals("item"); }








}
