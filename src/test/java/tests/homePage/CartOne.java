//аноним, элементы попапа "Купить" для ассортим.товара Аккумулятор FORSE 60 Ач 600А
package tests.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.time.Duration;


public class CartOne extends BaseTest {


    @Test(groups = {"elements", "regress"})
    public void popapAddToCartBI30200Elements() throws InterruptedException {
        try {

            //открыть страницу товара BI30200
            basePage.open("https://bi-bi.ru/product/e0000034180");
            Thread.sleep(1000);


            //согласиться с городом
            localizationPanel.waitAndClickAgreeRegionBtn();


            //есть текст Купить на кнопке
            Assert.assertTrue(popupAddToCart.isClickAddToCartButtonText());


            //кликнуть на Add_to_cartButton
            popupAddToCart.clickAddToCartButton();


            //есть текст Аккумулятор FORSE 60 Ач 600А на попапе
            String H1Text = popupAddToCart.isH1Text();
            Assert.assertEquals(H1Text, "Аккумулятор FORSE 60 Ач 600А");


            //есть текст Производитель:
            Assert.assertTrue(popupAddToCart.isVendorText());


            //есть текст  FORSE
            String popupCartBrandName = popupAddToCart.isVendorName();
            Assert.assertEquals(popupCartBrandName, "FORSE");


            //есть текст Код товара:
            Assert.assertTrue(popupAddToCart.isOemText());


            //есть текст  BI30200
            String OemCode = popupAddToCart.isOemCode();
            Assert.assertEquals(OemCode, "BI30200");


            //есть текст Магазин:
            Assert.assertTrue(popupAddToCart.isStoreText());


            //есть текст Москва Строгинский б-р:
            String popupCartAddStoreText = popupAddToCart.isPopupCartAddStoreText();
            Assert.assertEquals(popupCartAddStoreText, "Москва Строгинский б-р");


            //есть текст Доступно для заказа:
            Assert.assertTrue(popupAddToCart.isPopupCartAvailableText());


            //есть цена
            WebElement popupCartPrice = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class='price price--lg']"))));


            //есть текст Срок поставки:  от 0 дней:
            String deliveryTimeText = popupAddToCart.isDeliveryTimeText();
            Assert.assertEquals(deliveryTimeText, "Срок поставки:  от 0 дней");


            //есть предустановленное мин кол-во "1"
            String popupCartSpinnerInputText = popupAddToCart.isPopupCartSpinnerInputText();
            Assert.assertEquals(popupCartSpinnerInputText, "1");


            //есть кнопка В корзину
            Assert.assertTrue(popupAddToCart.isPopupCartAddBtnText());


            //есть кнопка Выберите другой магазин
            Assert.assertTrue(popupAddToCart.isPopupBtnChangeAnotherStoreText());


            //закрыть попап
            popupAddToCart.clickClosePopupCartAdd();


            Thread.sleep(100);
            System.out.println("Cart_108(popapAddToCart_BI30200_elements): Элементы попапа 'Купить' = аноним, ассортим.товар, в наличии = ОК");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
            
        }
    }



