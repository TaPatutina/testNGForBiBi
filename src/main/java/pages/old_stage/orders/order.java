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


    @FindBy(xpath = "//*[@class='catalog-sorting']//*[@class='sorting-controls sorting-controls--desktop']//*[contains(text(),'Цене')]") private WebElement catalog_sorting_price_btn;
    @FindBy(xpath = "//*[@class='catalog-sorting']//button[contains(text(),'Названию А-Я')]") private WebElement catalog_sorting_name_asc_icon;
    @FindBy(xpath = "//*[@class='catalog-sorting']//*[contains(text(),'Цене')][@data-sort='price-desc']")    private WebElement catalog_sorting_price_desc_icon;
    @FindBy(xpath = "//*[@class='catalog-sorting']//*[contains(text(),'Цене')][@data-sort='price-asc']/*[@class='icon icon--sorting-down']") private WebElement catalog_sorting_price_asc_icon;
    @FindBy(xpath = "(//*[@data-js='listing']//*[@class='product-card__body']//*[@class='btn']/span[contains(text(),'Купить')])[1]") private WebElement btn_buy_minicart_domestic_product_1;
    @FindBy(xpath = "(//*[@data-js='listing']//*[@class='product-card__body']//*[@class='btn']/span[contains(text(),'Купить')])[3]") private WebElement btn_buy_minicart_domestic_product_2;
    @FindBy(xpath = "(//*[@data-js='listing']//*[@class='product-card__body']//*[@class='btn']/span[contains(text(),'Купить')])[5]") private WebElement btn_buy_minicart_domestic_product_3;
    @FindBy(xpath = "(//*[@data-js='listing']//*[@class='product-card__body']//*[@class='btn']/span[contains(text(),'Купить')])[7]") private WebElement btn_buy_minicart_domestic_product_4;
    @FindBy(xpath = "(//*[@data-js='listing']//*[@class='product-card__body']//*[@class='btn']/span[contains(text(),'Купить')])[9]") private WebElement btn_buy_minicart_domestic_product_5;
    @FindBy(xpath = "(//*[@data-js='listing']//*[@class='product-card__body']//*[@class='btn'][contains(text(),'Подробнее')])[1]") private WebElement btn_more_detail_minicart_merch_product_1;
    @FindBy(xpath = "(//*[@data-js='listing']//*[@class='product-card__body']//*[@class='btn'][contains(text(),'Подробнее')])[3]") private WebElement btn_more_detail_minicart_merch_product_2;
    @FindBy(xpath = "//*[@class='card-cols']//*[@class='card-offers']/button[contains(text(),'Показать предложения')]") private WebElement merch_product_page_show_offers_btn;
    @FindBy(xpath = "(//*[@class='card-cols']//*[@class='card-offers']//*[contains(text(),'Предложение')])[1]") private WebElement merch_product_page_text_offer_1;
    @FindBy(xpath = "(//*[@class='card-cols']//*[@class='card-offers']//button[contains(text(),'Купить')])[1]") private WebElement merch_product_page_buy_btn_1;
    @FindBy(xpath = "(//*[@class='card-cols']//*[@class='card-offers']//button[contains(text(),'Купить')])[2]") private WebElement merch_product_page_buy_btn_2;

    @FindBy (xpath = "//*[@id='popup-cart']//*[@type='submit']") private WebElement popup_add_to_cart_btn_for_merch_product;
    @FindBy (xpath = "(//*[@id='popup-cart']//*[@type='submit'])[2]") private WebElement popup_add_to_cart_btn_for_domestic_product;
    @FindBy (xpath = "//*[@id='popup-cart']//*[text()='Перейти в корзину']") private WebElement popup_move_to_cart_btn_for_merch_product;
    @FindBy (xpath = "(//*[@id='popup-cart']//*[text()='Перейти в корзину'])[2]") private WebElement popup_move_to_cart_btn_for_domestic_product;
    @FindBy (xpath = "(//*[@id='popup-cart']//*[@class='popup__close'])[2]") private WebElement popup_add_to_cart_for_domestic_product_close_btn;


    @FindBy (xpath = "//*[@id='data-cart-content']//*[text()='Продолжить']") private WebElement page_cart_continue_btn;


    @FindBy (xpath = "//*[@class='checkout__item']//*[text()='Наличными или картой в магазине']") private WebElement paymentmode_offline_select_label;
    @FindBy (xpath = "//*[@class='checkout__item']//*[text()='Банковской картой на сайте']") private WebElement paymentmode_online_select_label;
    @FindBy (xpath = "//*[@class='checkout__item']//*[@id='checkout-agreement-1']") private WebElement radio_btn_checkout_agreement;
    @FindBy (xpath = "//*[@class='checkout__item']//input[@name='firstName']") private WebElement checkout_nameInput;
    @FindBy (xpath = "//*[@class='checkout__item']//input[@name='lastName']") private WebElement checkout_lastnameInput;
    @FindBy (xpath = "//*[@class='checkout__item']//input[@name='phone']") private WebElement checkout_phoneInput;
    @FindBy (xpath = "//*[@class='checkout__item']//input[@name='email']") private WebElement checkout_emailInput;
    @FindBy (xpath = "//button[contains(text(),'Продолжить')]") private WebElement page_checkout_continue_btn;


    @FindBy (xpath = "//h2[text()='Спасибо за заказ!']") private WebElement page_order_confirmation_h2_text;
    @FindBy (xpath = "//p[text()='Ожидайте уведомление о готовности заказа']") private WebElement page_order_confirmation_h2_subtext;



    @FindBy (xpath = "//input[@aria-label='Номер карты']") private WebElement sber_card_numberInput;
    @FindBy (xpath = "//input[@aria-label='Срок действия карты']") private WebElement sber_card_expiryInput;
    @FindBy (xpath = "//input[@aria-label='CVC/CVV-код']") private WebElement sber_card_cvcInput;
    @FindBy (xpath = "//input[@name='password']") private WebElement sber_card_passwordInput;
    @FindBy (xpath = "//button[@data-test-id='submit-payment']") private WebElement sber_submit_payment_btn;



    //Constructor
    public order(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    //СОЗДАТЬ ОБЪЕКТ order //order order = new order(driver);


    //со страницы каталога (с сортировкой) кликнуть "Купить" в миникарточке ассортиментного товара >  откроется попап "Положить в корзину" //order.clickBuyInDomesticProdCardFromCategoryPage();
    public void clickBuyInDomesticProdCardFromCategoryPage(){
        btn_buy_minicart_domestic_product_1.click();
        WebElement isPopupAddToCartBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popup_add_to_cart_btn_for_domestic_product));
    }




    //добавить неассортим.товар в корзину со страницы каталога (с сортировкой) НЕ СРАБАТЫВАЕТ СОРТИРОВКА //addToCartFromCategoryPage1();
    public void addToCartFromCategoryPage111() throws InterruptedException {
        catalog_sorting_price_btn.click();
        if (catalog_sorting_price_btn.getDomAttribute("data-sort").contains("price-asc")) {
            catalog_sorting_price_btn.click();
        } else {
            btn_more_detail_minicart_merch_product_1.click();
        }
        try {
            WebElement isMerchProductPageOffersBtnVisible1 = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(merch_product_page_show_offers_btn));
            merch_product_page_show_offers_btn.click();
            WebElement isMerchProductPageTextOffer1Visible1 = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(merch_product_page_text_offer_1));
            merch_product_page_buy_btn_1.click();
        } catch (Exception e) {
            driver.navigate().back();
            WebElement isNameSortingAscIconVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(catalog_sorting_name_asc_icon));
            catalog_sorting_price_btn.click();
            if (catalog_sorting_price_btn.getDomAttribute("data-sort").contains("price-asc")) {
                catalog_sorting_price_btn.click();
            } else {
                btn_more_detail_minicart_merch_product_2.click();
            }
            WebElement isMerchProductPageOffersBtnVisible2 = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(merch_product_page_show_offers_btn));
            merch_product_page_show_offers_btn.click();
            WebElement isMerchProductPageTextOffer1Visible2 = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(merch_product_page_text_offer_1));
            merch_product_page_buy_btn_1.click();
        }
    }


    //со страницы каталога (с сортировкой) кликнуть "Подробнее" в миникарточке неассортиментного товара >  откроется страница неассортиментного товара  //order.goToMerchProdPageFromCategoryPage();
    public void goToMerchProdPageFromCategoryPage() {
        WebElement isMerchProductMinicartMoreDatailBtnVisible1 = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(btn_more_detail_minicart_merch_product_1));
        btn_more_detail_minicart_merch_product_1.click();
        WebElement isMerchProductPageOffersBtnVisible1 = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(merch_product_page_show_offers_btn));
    }


    //в карточке неассортиментного товара кликнуть "Показать предложения" > откроются предложения   //order.clickShowOffersBtn();
    public void clickShowOffersBtn() {
        merch_product_page_show_offers_btn.click();
        WebElement isMerchProductPageTextOffer1Visible1 = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(merch_product_page_text_offer_1));
    }


    //в карточке неассортиментного товара кликнуть "Купить" > откроется попап "Положить в корзину" //order.clickBuyInMerchProdPage();
    public void clickBuyInMerchProdPage(){
        merch_product_page_buy_btn_1.click();
        WebElement isPopupAddToCartBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popup_add_to_cart_btn_for_merch_product));
    }

    //в попапе "Купить" для неассортиментного товара кликнуть "В корзину" > кнопка изменится на "Перейти в корзину" //order.clickAddToCartBtnInPopup();
    public void clickAddToCartBtnInMerchPopup(){
        popup_add_to_cart_btn_for_merch_product.click();
        WebElement isPopupMoveToCartBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popup_move_to_cart_btn_for_merch_product));
    }





    //в попапе "Купить" для ассортиментного товара кликнуть "В корзину" > кнопка изменится на "Перейти в корзину" //order.clickAddToCartBtnInPopup();
    public void clickAddToCartBtnInDomesticPopup(){
        try {
            popup_add_to_cart_btn_for_domestic_product.click();
        } catch (Exception e) {
            try {
                popup_add_to_cart_for_domestic_product_close_btn.click();
                btn_buy_minicart_domestic_product_2.click();
                WebElement isPopupAddToCartBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popup_add_to_cart_btn_for_domestic_product));
                popup_add_to_cart_btn_for_domestic_product.click();
            } catch (Exception ex) {
                try {
                    popup_add_to_cart_for_domestic_product_close_btn.click();
                    btn_buy_minicart_domestic_product_3.click();
                    WebElement isPopupAddToCartBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popup_add_to_cart_btn_for_domestic_product));
                    popup_add_to_cart_btn_for_domestic_product.click();
                } catch (Exception exception) {
                    try {
                        popup_add_to_cart_for_domestic_product_close_btn.click();
                        btn_buy_minicart_domestic_product_4.click();
                        WebElement isPopupAddToCartBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popup_add_to_cart_btn_for_domestic_product));
                        popup_add_to_cart_btn_for_domestic_product.click();
                    } catch (Exception e1) {
                        popup_add_to_cart_for_domestic_product_close_btn.click();
                        btn_buy_minicart_domestic_product_5.click();
                        WebElement isPopupAddToCartBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popup_add_to_cart_btn_for_domestic_product));
                        popup_add_to_cart_btn_for_domestic_product.click();
                    }
                }
            }
        }
        WebElement isPopupMoveToCartBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popup_move_to_cart_btn_for_domestic_product));
    }

    //в попапе "Купить" для неассортиментного товара кликнуть "Перейти в корзину" > откроется страница корзины //order.clickMoveToCartBtnInMerchPopup();
    public void clickMoveToCartBtnInMerchPopup(){
        popup_move_to_cart_btn_for_merch_product.click();
        Boolean isNextPageToBeCart = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlToBe("https://stageim.tomail.ru/cart")));
    }

    //в попапе "Купить" для ассортиментного товара кликнуть "Перейти в корзину" > откроется страница корзины //order.clickMoveToCartBtnInDomesticPopup();
    public void clickMoveToCartBtnInDomesticPopup(){
        popup_move_to_cart_btn_for_domestic_product.click();
        Boolean isNextPageToBeCart = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlToBe("https://stageim.tomail.ru/cart")));
    }

    //на странице корзины кликнуть "Продолжить" > откроется страница чекаута //order.clickContinueBtnInCartPage();
    public void clickContinueBtnInCartPage(){
        page_cart_continue_btn.click();
        Boolean isNextPageToBeCheckout = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlToBe("https://stageim.tomail.ru/checkout/multi")));
    }

    //выбрать оплату при получении //order.selectOfflinePaymentInCheckoutPage();
        public void selectOfflinePaymentInCheckoutPage(){
            paymentmode_offline_select_label.click();
        }


    //выбрать оплату Банковской картой на сайте //order.selectOnlinePaymentInCheckoutPage();
    public void selectOnlinePaymentInCheckoutPage(){
        paymentmode_online_select_label.click();
    }




    //заполнить данные получателя на чекауте и отправить заказ  > откроется страница "Спасибо за заказ" или страница оплаты, в зависимости от выбранного способа оплаты// order.fillDetailsAndSendOrder(добавляем сюда данные);
    public void fillDetailsAndSendOrder (String firstName, String lastName, String phone, String email) {
        checkout_nameInput.sendKeys(firstName);
        checkout_lastnameInput.sendKeys(lastName);
        checkout_phoneInput.sendKeys(phone);
        checkout_emailInput.sendKeys(email);
        Boolean checkoutAgreementToBeSelected = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeSelected(radio_btn_checkout_agreement));
        page_checkout_continue_btn.click();
    }


    //ждем открытия страницы оплаты онлайн, оплачиваем картой MasterCard > переход на страницу "Спасибо за заказ" //order.correctOnlinePayment("0000 5555 5555 0000","1224","123");
    public void correctOnlinePaymentMasterCard(String sberCardNumber, String sberCardExpiry, String sberCardCVC){
        Boolean urlSberPaymentContains = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlContains("https://3dsec.sberbank.ru/payment/merchants/sbersafe_sberid/")));
        sber_card_numberInput.sendKeys(sberCardNumber);
        sber_card_expiryInput.sendKeys(sberCardExpiry);
        sber_card_cvcInput.sendKeys(sberCardCVC);
        sber_submit_payment_btn.click();
        Boolean urlAfterPaymentContains = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlContains("https://bi-bi.ru/checkout/orderConfirmation")));
        WebElement isH2TextConfirmationVisibile = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(page_order_confirmation_h2_text));
        WebElement isH2SubTextConfirmationVisibile = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(page_order_confirmation_h2_text));
    }


    //ждем открытия страницы оплаты онлайн, оплачиваем картой VISA > переход на страницу "Спасибо за заказ" //order.correctOnlinePaymentVISA("0000 1111 1111 0000","1224","123","12345678");
    public void correctOnlinePaymentVISA(String sberCardNumber, String sberCardExpiry, String sberCardCVC, String sberCardPassword){
        Boolean urlSberPaymentContains = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlContains("https://3dsec.sberbank.ru/payment/merchants/sbersafe_sberid/")));
        sber_card_numberInput.sendKeys(sberCardNumber);
        sber_card_expiryInput.sendKeys(sberCardExpiry);
        sber_card_cvcInput.sendKeys(sberCardCVC);
        sber_submit_payment_btn.click();
        sber_card_passwordInput.sendKeys(sberCardPassword);
        Boolean urlAfterPaymentContains = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlContains("https://bi-bi.ru/checkout/orderConfirmation")));
        WebElement isH2TextConfirmationVisibile = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(page_order_confirmation_h2_text));
        WebElement isH2SubTextConfirmationVisibile = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(page_order_confirmation_h2_text));
    }


    //ждем открытия страницы оплаты онлайн, оплачиваем картой МИР > переход на страницу "Спасибо за заказ" //order.correctOnlinePaymentMIR("0000 0000 0000 0000","1224","123","12345678");
    public void correctOnlinePaymentMIR(String sberCardNumber, String sberCardExpiry, String sberCardCVC, String sberCardPassword){
        Boolean urlSberPaymentContains = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlContains("https://3dsec.sberbank.ru/payment/merchants/sbersafe_sberid/")));
        sber_card_numberInput.sendKeys(sberCardNumber);
        sber_card_expiryInput.sendKeys(sberCardExpiry);
        sber_card_cvcInput.sendKeys(sberCardCVC);
        sber_submit_payment_btn.click();
        sber_card_passwordInput.sendKeys(sberCardPassword);
        Boolean urlAfterPaymentContains = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlContains("https://bi-bi.ru/checkout/orderConfirmation")));
        WebElement isH2TextConfirmationVisibile = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(page_order_confirmation_h2_text));
        WebElement isH2SubTextConfirmationVisibile = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(page_order_confirmation_h2_text));
    }












}