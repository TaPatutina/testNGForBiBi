package pageObject.stage.orders;/*аноним, элементы попапа "Купить"*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PopapAddToCart {
    private WebDriver driver;

    //Page URL
    //private static String PAGE_URL ="https://bi-bi.ru/product/e0000034180";


    @FindBy (css = ".card-desc__cols--buy .card-desc__btn")     private WebElement add_to_cart_button;
    @FindBy (xpath = "//div[@id='popup-cart']")     private WebElement popup_cart;
    @FindBy (xpath = "//div[@class='h2 popup__hl popup__hl--small']")     private WebElement popup_cart_hl;
    @FindBy (xpath = "(//span[@class='product-about__key'])[1]")     private WebElement popup_cart_brand;
    @FindBy (xpath = "(//span[@class='product-about__value'])[1]")     private WebElement popup_cart_brandName;
    @FindBy (xpath = "(//span[@class='product-about__key'])[2]")     private WebElement popup_cart_oem;
    @FindBy (xpath = "(//span[@class='product-about__value'])[2]")     private WebElement popup_cart_oemCode;
    @FindBy (xpath = "//*[@class='icon icon--store product-about__icon']")     private WebElement popup_icon_store;
    @FindBy (xpath = "//*[@id='addToCartForm']/div[2]/div/span[1]/b")     private WebElement popup_cart_store;
    @FindBy (xpath = "//*[@id='addToCartForm']/div[2]/div/span[1]/span")     private WebElement popup_cart_POS ;
    @FindBy (xpath = "//*[@id='addToCartForm']/div[2]/div/span[2]/b")     private WebElement popup_cart_available ;
    @FindBy (xpath = "//*[@id='addToCartForm']/div[2]/div/span[2]/span")     private WebElement popup_cart_pos_count ;
    @FindBy (xpath = "//*[@class='btn btn--grey-border mb-0 js-pos-btn']")     private WebElement popup_cart_change_another_store;
    @FindBy (xpath = "//*[@class='mb-0']")     private WebElement popup_cart_delivery_time_text ;
    @FindBy (xpath = "//*[@class='spinner__dec is-disabled']")     private WebElement popup_cart_spinner__dec ;
    @FindBy (xpath = "//*[@class='spinner__inc']")     private WebElement popup_cart_spinner__inc ;
    @FindBy (xpath = "//input[@id='qty']")     private WebElement popup_cart_spinner_input ;
    @FindBy (xpath = "//*[@id='popup-cart']//*[@type='submit']")     private WebElement popup_cart_add_btn ;
    @FindBy (xpath = "(//*[@class='icon icon--cart'])[4]")     private WebElement popup_cart_add_icon ;
    @FindBy (xpath = "(//*[@class='icon icon--close'])[6]")     private WebElement popup_cart_close_icon ;
    @FindBy (xpath = "//*[@class = 'product-about__store']//span/span") private WebElement popup_cart_add_store;
    @FindBy (xpath = "//*[@class = 'price price--lg']") private WebElement popup_cart_add_price;
    @FindBy (xpath = "(//*[@class = 'popup__close'])[3]") private WebElement popup_cart_add_close_btn;



    //Constructor
    public PopapAddToCart(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void clickAdd_to_cartButton(){ add_to_cart_button.click();  }
    public boolean isClickAdd_to_cartButtonText(){ return add_to_cart_button.getText().contentEquals("Купить"); }
    public String isH1Text() {return popup_cart_hl.getText(); }
    public boolean isVendorText(){
        return popup_cart_brand.getText().contentEquals("Производитель:");
    }
    public String isVendorName(){
        return popup_cart_brandName.getText();
    }
    public boolean isOemText(){
        return popup_cart_oem.getText().contentEquals("Код товара:");
    }
    public String isOemCode(){
        return popup_cart_oemCode.getText();
    }
    public boolean isStoreText(){
        return popup_cart_store.getText().contentEquals("Магазин:");
    }
    public boolean isPopup_cart_availableText(){ return popup_cart_available.getText().contentEquals("Доступно для заказа:"); }
    public String isDelivery_time_text(){ return popup_cart_delivery_time_text.getText(); }
    public String isPopup_cart_spinner_input_text(){ return popup_cart_spinner_input.getAttribute("data-min"); }
    public boolean isPopup_cart_add_btn_text(){ return popup_cart_add_btn.getText().contentEquals("В корзину"); }
    public String isPopup_cart_add_Store_text(){ return popup_cart_add_store.getText(); }
    public boolean isPopup_btn_change_another_store_text(){ return popup_cart_change_another_store.getText().contentEquals("Выберите другой магазин"); }
    public void clickClosePopup_cart_add(){ popup_cart_add_close_btn.click();  }



}

