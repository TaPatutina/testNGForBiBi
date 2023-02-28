package pages.otherObjects.productPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.base.BasePage;


public class PopupAddToCart extends BasePage {


    public PopupAddToCart(WebDriver driver) {
        super(driver);
    }


    private final By addToCartButton = By.cssSelector(".card-desc__cols--buy .card-desc__btn");
    private final By popupCart = By.xpath("//div[@id='popup-cart']");
    private final By popupCartHl = By.xpath("//div[@class='h2 popup__hl popup__hl--small']");
    private final By popupCartBrand = By.xpath("(//span[@class='product-about__key'])[1]");
    private final By popupCartBrandName = By.xpath("(//span[@class='product-about__value'])[1]");
    private final By popupCartOem = By.xpath("(//span[@class='product-about__key'])[2]");
    private final By popupCartOemCode = By.xpath("(//span[@class='product-about__value'])[2]");
    private final By popupIconStore = By.xpath("//*[@class='icon icon--store product-about__icon']");
    private final By popupCartStore = By.xpath("//*[@id='addToCartForm']/div[2]/div/span[1]/b");
    private final By popupCartPos = By.xpath("//*[@id='addToCartForm']/div[2]/div/span[1]/span");
    private final By popupCartAvailable = By.xpath("//*[@id='addToCartForm']/div[2]/div/span[2]/b");
    private final By popupCartPosCount = By.xpath("//*[@id='addToCartForm']/div[2]/div/span[2]/span");
    private final By popupCartChangeAnotherStore = By.xpath("//*[@class='btn btn--grey-border mb-0 js-pos-btn']");
    private final By popupCartDeliveryTimeText = By.xpath("//*[@class='mb-0']");
    private final By popupCartSpinnerDec = By.xpath("//*[@class='spinner__dec is-disabled']");
    private final By popupCartSpinnerInc = By.xpath("//*[@class='spinner__inc']");
    private final By popupCartSpinnerInput = By.xpath("//input[@id='qty']");
    private final By popupCartAddBtn = By.xpath("//*[@id='popup-cart']//*[@type='submit']");
    private final By popupCartAddIcon = By.xpath("(//*[@class='icon icon--cart'])[4]");
    private final By popupCartCloseIcon = By.xpath("(//*[@class='icon icon--close'])[6]");
    private final By popupCartAddStore = By.xpath("//*[@class = 'product-about__store']//span/span");
    private final By popupCartAddPrice = By.xpath("//*[@class = 'price price--lg']");
    private final By popupCartAddCloseBtn = By.xpath("(//*[@class = 'popup__close'])[3]");


    public void clickAddToCartButton() {
        WebElement addToCartBtn = driver.findElement(addToCartButton);
        addToCartBtn.click();
    }

    public boolean isClickAddToCartButtonText() {
        WebElement CartButtonText = driver.findElement(addToCartButton);
        return CartButtonText.getText().contentEquals("Купить");
    }

    public String isH1Text() {
        WebElement popupCart_Hl = driver.findElement(popupCartHl);
        return popupCart_Hl.getText();
    }

    public boolean isVendorText() {
        WebElement popupCart_Brand = driver.findElement(popupCartBrand);
        return popupCart_Brand.getText().contentEquals("Производитель:");
    }

    public String isVendorName() {
        WebElement popupCartBrand_Name = driver.findElement(popupCartBrandName);
        return popupCartBrand_Name.getText();
    }

    public boolean isOemText() {
        WebElement popupCart_Oem = driver.findElement(popupCartOem);
        return popupCart_Oem.getText().contentEquals("Код товара:");
    }

    public String isOemCode() {
        WebElement popupCart_OemCode = driver.findElement(popupCartOemCode);
        return popupCart_OemCode.getText();
    }

    public boolean isStoreText() {
        WebElement popupCart_Store = driver.findElement(popupCartStore);
        return popupCart_Store.getText().contentEquals("Магазин:");
    }

    public boolean isPopupCartAvailableText() {
        WebElement popupCart_Available = driver.findElement(popupCartAvailable);
        return popupCart_Available.getText().contentEquals("Доступно для заказа:");
    }

    public String isDeliveryTimeText() {
        WebElement popupCartDeliveryTime_Text = driver.findElement(popupCartDeliveryTimeText);
        return popupCartDeliveryTime_Text.getText();
    }

    public String isPopupCartSpinnerInputText() {
        WebElement popupCartSpinner_Input = driver.findElement(popupCartSpinnerInput);
        return popupCartSpinner_Input.getAttribute("data-min");
    }

    public boolean isPopupCartAddBtnText() {
        WebElement popupCartAdd_Btn = driver.findElement(popupCartAddBtn);
        return popupCartAdd_Btn.getText().contentEquals("В корзину");
    }

    public String isPopupCartAddStoreText() {
        WebElement popupCartAdd_Store = driver.findElement(popupCartAddStore);
        return popupCartAdd_Store.getText();
    }

    public boolean isPopupBtnChangeAnotherStoreText() {
        WebElement popupCartChangeAnother_Store = driver.findElement(popupCartChangeAnotherStore);
        return popupCartChangeAnother_Store.getText().contentEquals("Выберите другой магазин");
    }

    public void clickClosePopupCartAdd() {
        driver.findElement(popupCartAddCloseBtn).click();
    }


}

