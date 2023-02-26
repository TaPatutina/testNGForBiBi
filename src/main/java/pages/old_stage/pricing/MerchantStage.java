package pages.old_stage.pricing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MerchantStage {
    private WebDriver driver;


    @FindBy(xpath = "//*[@class = 'js-pricing']") private List<WebElement> prising_list;
    @FindBy(xpath = "//*[@id='original-list']") private WebElement prising_original_list;
    @FindBy(xpath = "(//*[@title = 'API 00000000-0000-0000-0000-000000000000'])[1]") private WebElement guid_supplier1;
    @FindBy(xpath = "(//*[@title = 'API 00000000-0000-0000-0000-000000000001'])[1]") private WebElement guid_supplier2;



    //Constructor
    public MerchantStage(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }



    //дождаться появления предложений // merchantStage.waitPricingOriginalListVisible();
    public void waitPricingOriginalListVisible() {
        WebElement isPricingOriginalListVisible = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(prising_original_list));
    }





    //есть предложение поставщика1  для Стейджа//merchantStage.isOfferFromSupplier1ForStage();
    public void isOfferFromSupplier1ForStage() {
        try {
            Boolean offerFromSupplier1 = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.attributeToBe(guid_supplier1,"title", "API 00000000-0000-0000-0000-000000000000"));
            System.out.println("Поставщик1  - предложения есть = OK");
        } catch(Exception e) {
            try {
                driver.get("https://bi-bi.ru/productPricing?oem=OF0137&brand=GREEN%20FILTER");
                WebElement isPricingOriginalListVisible = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(prising_original_list));
                Boolean offerFromSupplier1 = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.attributeToBe(guid_supplier1,"title", "API 00000000-0000-0000-0000-000000000000"));
                System.out.println("Поставщик1  - предложения есть = OK");
                driver.get("https://bi-bi.ru/productPricing?oem=OP595&brand=FILTRON");
            } catch (Exception ex) {
                System.out.println("Поставщик1 -  предложений нет = FAIL");
            }
        }
    }



    //есть предложение поставщика 2 для Стейджа  //merchantStage.isOfferFromSupplier2ForStage();
    public void isOfferFromSupplier2ForStage() {
        try {
            Boolean offerFromSupplier2 = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeToBe(guid_supplier2,"title", "API 00000000-0000-0000-0000-000000000001"));
            System.out.println("Поставщик2 - предложения есть = FAIL (не поставщик а/з)");
        } catch(Exception e) {
            try {
                driver.get("https://bi-bi.ru/productPricing?oem=93165290&brand=GENERAL%20MOTORS");
                WebElement isPricingOriginalListVisible = new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(prising_original_list));
                Boolean offerFromSupplier2 = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.attributeToBe(guid_supplier2,"title", "API 00000000-0000-0000-0000-000000000001"));
                System.out.println("Поставщик2 - предложения есть = FAIL (не поставщик а/з)");
                driver.get("https://bi-bi.ru/productPricing?oem=OP595&brand=FILTRON");
            } catch (Exception ex) {
                System.out.println("Поставщик2 -  предложений нет - так и д.б. (не поставщик а/з) = OK");
            }
        }
    }









}


