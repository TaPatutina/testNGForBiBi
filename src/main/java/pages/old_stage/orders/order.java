package pages.old_stage.orders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class order {
    private WebDriver driver;


    @FindBy(xpath = "//*[@class='catalog-sorting']//*[@class='sorting-controls sorting-controls--desktop']//*[contains(text(),'Цене')]") private WebElement catalogSortingPriceBtn;
    @FindBy(xpath = "//*[@class='catalog-sorting']//button[contains(text(),'Названию А-Я')]") private WebElement catalogSortingNameAscIcon;
    @FindBy(xpath = "//*[@class='catalog-sorting']//*[contains(text(),'Цене')][@data-sort='price-desc']")    private WebElement catalogSortingPriceDescIcon;
    @FindBy(xpath = "//*[@class='catalog-sorting']//*[contains(text(),'Цене')][@data-sort='price-asc']/*[@class='icon icon--sorting-down']") private WebElement catalogSortingPriceAscIcon;
    @FindBy(xpath = "(//*[@data-js='listing']//*[@class='product-card__body']//*[@class='btn']/span[contains(text(),'Купить')])[1]") private WebElement btnBuyMinicartDomesticProduct1;
    @FindBy(xpath = "(//*[@data-js='listing']//*[@class='product-card__body']//*[@class='btn']/span[contains(text(),'Купить')])[3]") private WebElement btnBuyMinicartDomesticProduct2;
    @FindBy(xpath = "(//*[@data-js='listing']//*[@class='product-card__body']//*[@class='btn']/span[contains(text(),'Купить')])[5]") private WebElement btnBuyMinicartDomesticProduct3;
    @FindBy(xpath = "(//*[@data-js='listing']//*[@class='product-card__body']//*[@class='btn']/span[contains(text(),'Купить')])[7]") private WebElement btnBuyMinicartDomesticProduct4;
    @FindBy(xpath = "(//*[@data-js='listing']//*[@class='product-card__body']//*[@class='btn']/span[contains(text(),'Купить')])[9]") private WebElement btnBuyMinicartDomesticProduct5;
    @FindBy(xpath = "(//*[@data-js='listing']//*[@class='product-card__body']//*[@class='btn'][contains(text(),'Подробнее')])[1]") private WebElement btnMoreDetailMinicartMerchProduct1;
    @FindBy(xpath = "(//*[@data-js='listing']//*[@class='product-card__body']//*[@class='btn'][contains(text(),'Подробнее')])[3]") private WebElement btnMoreDetailMinicartMerchProduct2;
    @FindBy(xpath = "//*[@class='card-cols']//*[@class='card-offers']/button[contains(text(),'Показать предложения')]") private WebElement merchProductPageShowOffersBtn;
    @FindBy(xpath = "(//*[@class='card-cols']//*[@class='card-offers']//*[contains(text(),'Предложение')])[1]") private WebElement merchProductPageTextOffer1;
    @FindBy(xpath = "(//*[@class='card-cols']//*[@class='card-offers']//button[contains(text(),'Купить')])[1]") private WebElement merchProductPageBuyBtn1;
    @FindBy(xpath = "(//*[@class='card-cols']//*[@class='card-offers']//button[contains(text(),'Купить')])[2]") private WebElement merchProductPageBuyBtn2;

    @FindBy (xpath = "//*[@id='popup-cart']//*[@type='submit']") private WebElement popupAddToCartBtnForMerchProduct;
    @FindBy (xpath = "(//*[@id='popup-cart']//*[@type='submit'])[2]") private WebElement popupAddToCartBtnForDomesticProduct;
    @FindBy (xpath = "//*[@id='popup-cart']//*[text()='Перейти в корзину']") private WebElement popupMoveToCartBtnForMerchProduct;
    @FindBy (xpath = "(//*[@id='popup-cart']//*[text()='Перейти в корзину'])[2]") private WebElement popupMoveToCartBtnForDomesticProduct;
    @FindBy (xpath = "(//*[@id='popup-cart']//*[@class='popup__close'])[2]") private WebElement popupAddToCartForDomesticProductCloseBtn;


    @FindBy (xpath = "//*[@id='data-cart-content']//*[text()='Продолжить']") private WebElement pageCartContinueBtn;


    @FindBy (xpath = "//*[@class='checkout__item']//*[text()='Наличными или картой в магазине']") private WebElement paymentmodeOfflineSelectLabel;
    @FindBy (xpath = "//*[@class='checkout__item']//*[text()='Банковской картой на сайте']") private WebElement paymentmodeOnlineSelectLabel;
    @FindBy (xpath = "//*[@class='checkout__item']//*[@id='checkout-agreement-1']") private WebElement radioBtnCheckoutAgreement;
    @FindBy (xpath = "//*[@class='checkout__item']//input[@name='firstName']") private WebElement checkoutNameInput;
    @FindBy (xpath = "//*[@class='checkout__item']//input[@name='lastName']") private WebElement checkoutLastnameInput;
    @FindBy (xpath = "//*[@class='checkout__item']//input[@name='phone']") private WebElement checkoutPhoneInput;
    @FindBy (xpath = "//*[@class='checkout__item']//input[@name='email']") private WebElement checkoutEmailInput;
    @FindBy (xpath = "//button[contains(text(),'Продолжить')]") private WebElement pageCheckoutContinueBtn;


    @FindBy (xpath = "//h2[text()='Спасибо за заказ!']") private WebElement pageOrderConfirmationH2Text;
    @FindBy (xpath = "//p[text()='Ожидайте уведомление о готовности заказа']") private WebElement pageOrderConfirmationH2Subtext;



    @FindBy (xpath = "//input[@aria-label='Номер карты']") private WebElement sberCardNumberInput;
    @FindBy (xpath = "//input[@aria-label='Срок действия карты']") private WebElement sberCardExpiryInput;
    @FindBy (xpath = "//input[@aria-label='CVC/CVV-код']") private WebElement sberCardCvcInput;
    @FindBy (xpath = "//input[@name='password']") private WebElement sberCardPasswordInput;
    @FindBy (xpath = "//button[@data-test-id='submit-payment']") private WebElement sberSubmitPaymentBtn;



    //Constructor
    public order(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    //СОЗДАТЬ ОБЪЕКТ order //order order = new order(driver);


    //со страницы каталога (с сортировкой) кликнуть "Купить" в миникарточке ассортиментного товара >  откроется попап "Положить в корзину" //order.clickBuyInDomesticProdCardFromCategoryPage();
    public void clickBuyInDomesticProdCardFromCategoryPage(){
        btnBuyMinicartDomesticProduct1.click();
        WebElement isPopupAddToCartBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popupAddToCartBtnForDomesticProduct));
    }




    //добавить неассортим.товар в корзину со страницы каталога (с сортировкой) НЕ СРАБАТЫВАЕТ СОРТИРОВКА //addToCartFromCategoryPage1();
    public void addToCartFromCategoryPage111() throws InterruptedException {
        catalogSortingPriceBtn.click();
        if (catalogSortingPriceBtn.getDomAttribute("data-sort").contains("price-asc")) {
            catalogSortingPriceBtn.click();
        } else {
            btnMoreDetailMinicartMerchProduct1.click();
        }
        try {
            WebElement isMerchProductPageOffersBtnVisible1 = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(merchProductPageShowOffersBtn));
            merchProductPageShowOffersBtn.click();
            WebElement isMerchProductPageTextOffer1Visible1 = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(merchProductPageTextOffer1));
            merchProductPageBuyBtn1.click();
        } catch (Exception e) {
            driver.navigate().back();
            WebElement isNameSortingAscIconVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(catalogSortingNameAscIcon));
            catalogSortingPriceBtn.click();
            if (catalogSortingPriceBtn.getDomAttribute("data-sort").contains("price-asc")) {
                catalogSortingPriceBtn.click();
            } else {
                btnMoreDetailMinicartMerchProduct2.click();
            }
            WebElement isMerchProductPageOffersBtnVisible2 = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(merchProductPageShowOffersBtn));
            merchProductPageShowOffersBtn.click();
            WebElement isMerchProductPageTextOffer1Visible2 = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(merchProductPageTextOffer1));
            merchProductPageBuyBtn1.click();
        }
    }


    //со страницы каталога (с сортировкой) кликнуть "Подробнее" в миникарточке неассортиментного товара >  откроется страница неассортиментного товара  //order.goToMerchProdPageFromCategoryPage();
    public void goToMerchProdPageFromCategoryPage() {
        WebElement isMerchProductMinicartMoreDatailBtnVisible1 = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(btnMoreDetailMinicartMerchProduct1));
        btnMoreDetailMinicartMerchProduct1.click();
        WebElement isMerchProductPageOffersBtnVisible1 = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(merchProductPageShowOffersBtn));
    }


    //в карточке неассортиментного товара кликнуть "Показать предложения" > откроются предложения   //order.clickShowOffersBtn();
    public void clickShowOffersBtn() {
        merchProductPageShowOffersBtn.click();
        WebElement isMerchProductPageTextOffer1Visible1 = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(merchProductPageTextOffer1));
    }


    //в карточке неассортиментного товара кликнуть "Купить" > откроется попап "Положить в корзину" //order.clickBuyInMerchProdPage();
    public void clickBuyInMerchProdPage(){
        merchProductPageBuyBtn1.click();
        WebElement isPopupAddToCartBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popupAddToCartBtnForMerchProduct));
    }

    //в попапе "Купить" для неассортиментного товара кликнуть "В корзину" > кнопка изменится на "Перейти в корзину" //order.clickAddToCartBtnInPopup();
    public void clickAddToCartBtnInMerchPopup(){
        popupAddToCartBtnForMerchProduct.click();
        WebElement isPopupMoveToCartBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popupMoveToCartBtnForMerchProduct));
    }





    //в попапе "Купить" для ассортиментного товара кликнуть "В корзину" > кнопка изменится на "Перейти в корзину" //order.clickAddToCartBtnInPopup();
    public void clickAddToCartBtnInDomesticPopup(){
        try {
            popupAddToCartBtnForDomesticProduct.click();
        } catch (Exception e) {
            try {
                popupAddToCartForDomesticProductCloseBtn.click();
                btnBuyMinicartDomesticProduct2.click();
                WebElement isPopupAddToCartBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popupAddToCartBtnForDomesticProduct));
                popupAddToCartBtnForDomesticProduct.click();
            } catch (Exception ex) {
                try {
                    popupAddToCartForDomesticProductCloseBtn.click();
                    btnBuyMinicartDomesticProduct3.click();
                    WebElement isPopupAddToCartBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popupAddToCartBtnForDomesticProduct));
                    popupAddToCartBtnForDomesticProduct.click();
                } catch (Exception exception) {
                    try {
                        popupAddToCartForDomesticProductCloseBtn.click();
                        btnBuyMinicartDomesticProduct4.click();
                        WebElement isPopupAddToCartBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popupAddToCartBtnForDomesticProduct));
                        popupAddToCartBtnForDomesticProduct.click();
                    } catch (Exception e1) {
                        popupAddToCartForDomesticProductCloseBtn.click();
                        btnBuyMinicartDomesticProduct5.click();
                        WebElement isPopupAddToCartBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popupAddToCartBtnForDomesticProduct));
                        popupAddToCartBtnForDomesticProduct.click();
                    }
                }
            }
        }
        WebElement isPopupMoveToCartBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popupMoveToCartBtnForDomesticProduct));
    }

    //в попапе "Купить" для неассортиментного товара кликнуть "Перейти в корзину" > откроется страница корзины //order.clickMoveToCartBtnInMerchPopup();
    public void clickMoveToCartBtnInMerchPopup(){
        popupMoveToCartBtnForMerchProduct.click();
        Boolean isNextPageToBeCart = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlToBe("https://stageim.tomail.ru/cart")));
    }

    //в попапе "Купить" для ассортиментного товара кликнуть "Перейти в корзину" > откроется страница корзины //order.clickMoveToCartBtnInDomesticPopup();
    public void clickMoveToCartBtnInDomesticPopup(){
        popupMoveToCartBtnForDomesticProduct.click();
        Boolean isNextPageToBeCart = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlToBe("https://stageim.tomail.ru/cart")));
    }

    //на странице корзины кликнуть "Продолжить" > откроется страница чекаута //order.clickContinueBtnInCartPage();
    public void clickContinueBtnInCartPage(){
        pageCartContinueBtn.click();
        Boolean isNextPageToBeCheckout = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlToBe("https://stageim.tomail.ru/checkout/multi")));
    }

    //выбрать оплату при получении //order.selectOfflinePaymentInCheckoutPage();
        public void selectOfflinePaymentInCheckoutPage(){
            paymentmodeOfflineSelectLabel.click();
        }


    //выбрать оплату Банковской картой на сайте //order.selectOnlinePaymentInCheckoutPage();
    public void selectOnlinePaymentInCheckoutPage(){
        paymentmodeOnlineSelectLabel.click();
    }




    //заполнить данные получателя на чекауте и отправить заказ  > откроется страница "Спасибо за заказ" или страница оплаты, в зависимости от выбранного способа оплаты// order.fillDetailsAndSendOrder(добавляем сюда данные);
    public void fillDetailsAndSendOrder (String firstName, String lastName, String phone, String email) {
        checkoutNameInput.sendKeys(firstName);
        checkoutLastnameInput.sendKeys(lastName);
        checkoutPhoneInput.sendKeys(phone);
        checkoutEmailInput.sendKeys(email);
        Boolean checkoutAgreementToBeSelected = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeSelected(radioBtnCheckoutAgreement));
        pageCheckoutContinueBtn.click();
    }


    //ждем открытия страницы оплаты онлайн, оплачиваем картой MasterCard > переход на страницу "Спасибо за заказ" //order.correctOnlinePayment("0000 5555 5555 0000","1224","123");
    public void correctOnlinePaymentMasterCard(String sberCardNumber, String sberCardExpiry, String sberCardCVC){
        Boolean urlSberPaymentContains = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlContains("https://3dsec.sberbank.ru/payment/merchants/sbersafe_sberid/")));
        sberCardNumberInput.sendKeys(sberCardNumber);
        sberCardExpiryInput.sendKeys(sberCardExpiry);
        sberCardCvcInput.sendKeys(sberCardCVC);
        sberSubmitPaymentBtn.click();
        Boolean urlAfterPaymentContains = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlContains("https://bi-bi.ru/checkout/orderConfirmation")));
        WebElement isH2TextConfirmationVisibile = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(pageOrderConfirmationH2Text));
        WebElement isH2SubTextConfirmationVisibile = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(pageOrderConfirmationH2Text));
    }


    //ждем открытия страницы оплаты онлайн, оплачиваем картой VISA > переход на страницу "Спасибо за заказ" //order.correctOnlinePaymentVISA("0000 1111 1111 0000","1224","123","12345678");
    public void correctOnlinePaymentVISA(String sberCardNumber, String sberCardExpiry, String sberCardCVC, String sberCardPassword){
        Boolean urlSberPaymentContains = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlContains("https://3dsec.sberbank.ru/payment/merchants/sbersafe_sberid/")));
        sberCardNumberInput.sendKeys(sberCardNumber);
        sberCardExpiryInput.sendKeys(sberCardExpiry);
        sberCardCvcInput.sendKeys(sberCardCVC);
        sberSubmitPaymentBtn.click();
        sberCardPasswordInput.sendKeys(sberCardPassword);
        Boolean urlAfterPaymentContains = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlContains("https://bi-bi.ru/checkout/orderConfirmation")));
        WebElement isH2TextConfirmationVisibile = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(pageOrderConfirmationH2Text));
        WebElement isH2SubTextConfirmationVisibile = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(pageOrderConfirmationH2Text));
    }


    //ждем открытия страницы оплаты онлайн, оплачиваем картой МИР > переход на страницу "Спасибо за заказ" //order.correctOnlinePaymentMIR("0000 0000 0000 0000","1224","123","12345678");
    public void correctOnlinePaymentMIR(String sberCardNumber, String sberCardExpiry, String sberCardCVC, String sberCardPassword){
        Boolean urlSberPaymentContains = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlContains("https://3dsec.sberbank.ru/payment/merchants/sbersafe_sberid/")));
        sberCardNumberInput.sendKeys(sberCardNumber);
        sberCardExpiryInput.sendKeys(sberCardExpiry);
        sberCardCvcInput.sendKeys(sberCardCVC);
        sberSubmitPaymentBtn.click();
        sberCardPasswordInput.sendKeys(sberCardPassword);
        Boolean urlAfterPaymentContains = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlContains("https://bi-bi.ru/checkout/orderConfirmation")));
        WebElement isH2TextConfirmationVisibile = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(pageOrderConfirmationH2Text));
        WebElement isH2SubTextConfirmationVisibile = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(pageOrderConfirmationH2Text));
    }












}