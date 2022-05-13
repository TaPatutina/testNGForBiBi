package pageObject.stage.autorization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class PagesMyAccount {
    private WebDriver driver;


    @FindBy(xpath = "//*[@class='auth is-active']/a[@class='btn btn--link btn--sm auth__signout']") private WebElement header_signout_btn;

    @FindBy(xpath = "(//*[@class='breadcrumbs'])/li[1]/a") private WebElement breadcrumb1;
    @FindBy(xpath = "(//*[@class='breadcrumbs'])/li[2]") private WebElement breadcrumb2;

    @FindBy(xpath = "//*[@class='lc-nav']//li/a[contains(text(),'Мой гараж')]") private WebElement navLinkMyGarage;
    @FindBy(xpath = "//*[@class='lc-nav']//li/a[contains(text(),'Избранное')]") private WebElement navLinkFavorite;
    @FindBy(xpath = "//*[@class='lc-nav']//li/a[contains(text(),'Профиль')]") private WebElement navLinkProfile;
    @FindBy(xpath = "//*[@class='lc-nav']//li/a[contains(text(),'Мои бонусы')]") private WebElement navLinkMyBonuses;
    @FindBy(xpath = "//*[@class='lc-nav']//li/a[contains(text(),'История заказов')]") private WebElement navLinkOrders;
    @FindBy(xpath = "//*[@class='lc-nav']//li/a[contains(text(),'Мои отзывы')]") private WebElement navLinkMyReviews;
    @FindBy(xpath = "//*[@class='lc-nav']//li/a[contains(text(),'Мои обращения')]") private WebElement navLinkMyTickets;

    @FindBy(xpath = "//*[@class='profile-block__item profile-block__item--pd']") private List<WebElement> profile_favorite_store_block;
    @FindBy(xpath = "//*[@class='lc-nav']") private List<WebElement> profile_lc_nav_block;
    @FindBy(xpath = "//*[@id='profile-map']") private List<WebElement> profile_map_block;
    @FindBy(xpath = "//*[@class='profile-title__item profile-title__head mb-xs']") private WebElement name_of_store_in_profile;
    @FindBy(xpath = "//*[@class='profile-address profile-block__item profile-block__item--pd']") private List<WebElement> profile_address_block;
    @FindBy(xpath = "//*[@class='favourite-shop__btn-panel']//a[contains(text(),'Сменить магазин')]") private WebElement profile_change_store_btn;
    @FindBy(xpath = "(//*[@id='popup-delivery']//li//button[@data-shop-pos='017_Химки'])[contains(text(),'Выбрать')]") private WebElement header_map_shop_pos_017_btn;
    @FindBy(xpath = "(//*[@id='popup-delivery']//li//button[@data-shop-pos='019_Строгино'])[contains(text(),'Выбрать')]") private WebElement header_map_shop_pos_019_btn;
    @FindBy(xpath = "(//*[@id='popup-delivery']//li//*[@data-shop-pos='020_Печатники'])[contains(text(),'Выбрать')]") private WebElement header_map_shop_pos_020_btn;
    @FindBy(xpath = "(//*[@data-js='deliveryPopup']//span)[3]") private WebElement name_of_store_in_header;
    @FindBy(xpath = "//*[@id='popup_cart_delivery_new']") private WebElement profile_map_shops;
    @FindBy(xpath = "//*[@id='popup_cart_delivery_new']/h2[contains(text(), 'Выберите магазин')]") private WebElement profile_map_shop_title;
    @FindBy(xpath = "//*[@id='popup_cart_delivery_new']/*[@class='popup__close']/*[@class='icon icon--close']") private WebElement close_popup_map_delivery_new_btn;
    @FindBy(xpath = "(//*[@id='popup_cart_delivery_new']//li//button[@data-shop-pos='017_Химки'])[contains(text(),'Выбрать')]") private WebElement profile_map_shop_pos_017_btn;
    @FindBy(xpath = "(//*[@id='popup_cart_delivery_new']//li//button[@data-shop-pos='019_Строгино'])[contains(text(),'Выбрать')]") private WebElement profile_map_shop_pos_019_btn;
    @FindBy(xpath = "(//*[@id='popup_cart_delivery_new']//li//button[@data-shop-pos='020_Печатники'])[contains(text(),'Выбрать')]") private WebElement profile_map_shop_pos_020_btn;



    @FindBy(xpath = "//*[@class='profile-control']//*[text()='Изменить пароль']") private WebElement popup_profile_change_pass_btn;
    @FindBy(xpath = "//div[@data-js='changeUserPassForm']//h2[contains(text(),'Изменить')]") private WebElement popup_profile_change_pass_title;
    @FindBy(xpath = "//div[@data-js='changeUserPassForm']//label[text()='Старый пароль']") private WebElement popup_profile_change_pass_label_old_pass;
    @FindBy(xpath = "//div[@data-js='changeUserPassForm']//input[@name='currentPassword']") private WebElement popup_profile_change_pass_input_current_pass;
    @FindBy(xpath = "//div[@data-js='changeUserPassForm']//label[text()='Новый пароль']") private WebElement popup_profile_change_pass_label_new_pass;
    @FindBy(xpath = "//div[@data-js='changeUserPassForm']//input[@name='newPassword']") private WebElement popup_profile_change_pass_input_new_pass;
    @FindBy(xpath = "//div[@data-js='changeUserPassForm']//label[text()='Повторите пароль']") private WebElement popup_profile_change_pass_label_check_new_pass;
    @FindBy(xpath = "//div[@data-js='changeUserPassForm']//input[@name='checkNewPassword']") private WebElement popup_profile_change_pass_input_check_new_pass;
    @FindBy(xpath = "//div[@data-js='changeUserPassForm']//button[@type='submit'][@disabled][text()='Изменить']") private WebElement popup_profile_change_pass_submit_btn_disabled;
    @FindBy(xpath = "(//div[@data-js='changeUserPassForm']//*[@class='icon icon--close'])[1]") private WebElement popup_profile_change_pass_close_btn;
    @FindBy(xpath = "//div[@data-js='addressControl']//*[text()='Добавить новый адрес']") private WebElement profile_add_new_address_btn;
    @FindBy(xpath = "//div[@data-js='addressControl']//*[@class='icon icon--edit']") private WebElement profile_edit_address1_icon;
    @FindBy(xpath = "//div[@data-js='addressControl']//a[text()=' Изменить']") private WebElement profile_link_edit_address1_text;
    @FindBy(xpath = "//div[@id='popup-address']//*[text()='Добавить адрес доставки'][@data-type='ADD']") private WebElement profile_add_new_address_popup_title;
    @FindBy(xpath = "//div[@id='popup-address']//*[@class='icon icon--close']") private WebElement profile_address_popup_close_btn;
    @FindBy(xpath = "//div[@id='popup-address']//*[@data-js='dadata']//input[@data-field='fulladdress']") private WebElement profile_add_new_address_popup_fulladdress_input;
    @FindBy(xpath = "//div[@id='popup-address']//button[@type='submit'][@disabled][text()='Сохранить']") private WebElement popup_profile_add_new_address_submit_btn_disabled;
    @FindBy(xpath = "//div[@id='popup-address']//*[text()='Адрес доставки'][@data-type='EDIT']") private WebElement profile_edit_address_popup_title;



    @FindBy(xpath = "//*[@class='btn btn--block btn--name']") private WebElement edit_profile_info_btn;
    @FindBy(xpath = "//*[@id='popup-profile-change']/h2[text()='Персональные данные']") private WebElement popup_edit_profile_info_title;
    @FindBy(xpath = "//*[@id='popup-profile-change']//label[text()='Имя']") private WebElement popup_edit_profile_info_label_name;
    @FindBy(xpath = "//*[@id='popup-profile-change']//input[@name='firstName']") private WebElement popup_edit_profile_info_input_name;
    @FindBy(xpath = "//*[@id='popup-profile-change']//label[text()='Фамилия']") private WebElement popup_edit_profile_info_label_surname;
    @FindBy(xpath = "//*[@id='popup-profile-change']//input[@name='lastName']") private WebElement popup_edit_profile_info_input_surname;
    @FindBy(xpath = "//*[@id='popup-profile-change']//label[text()='Дата рождения']") private WebElement popup_edit_profile_info_label_birthday;
    @FindBy(xpath = "//*[@id='popup-profile-change']//input[@name='birthDate']") private WebElement popup_edit_profile_info_input_birthdate;
    @FindBy(xpath = "//*[@id='popup-profile-change']//*[@class='input-wrapper__icon input-wrapper__icon--calendar']") private WebElement popup_edit_profile_info_calendar;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']//*[@data-handler='selectYear']") private WebElement popup_edit_profile_info_select_year;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']//*[@data-handler='selectYear']/*[text()='1974']") private WebElement popup_edit_profile_info_option_1974;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']//*[@data-handler='selectMonth']/*[text()='Oct']") private WebElement popup_edit_profile_info_option_October;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']//td[@data-handler='selectDay']/*[text()='10']") private WebElement popup_edit_profile_info_option_day10;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']//td[@data-handler='selectDay']/*[text()='12']") private WebElement popup_edit_profile_info_option_day12;
    @FindBy(xpath = "//*[@id='popup-profile-change']//label[text()='Пол']") private WebElement popup_edit_profile_info_label_gender;
    @FindBy(xpath = "//*[@id='popup-profile-change']//span[@class='select2-selection__arrow']") private WebElement popup_edit_profile_info_gender_select_arrow;
    @FindBy(xpath = "//ul[@class='select2-results__options']/li[text()='Мужской']") private WebElement popup_edit_profile_info_gender_select_male;
    @FindBy(xpath = "//ul[@class='select2-results__options']/li[text()='Женский']") private WebElement popup_edit_profile_info_gender_select_female;
    @FindBy(xpath = "//*[@id='popup-profile-change']//label[text()='Телефон']") private WebElement popup_edit_profile_info_label_phone;
    @FindBy(xpath = "//*[@id='popup-profile-change']//input[@name='phoneContactInfo.mobileNumber']") private WebElement popup_edit_profile_info_input_phone;
    @FindBy(xpath = "//*[@id='popup-profile-change']//label[text()='Email']") private WebElement popup_edit_profile_info_label_email;
    @FindBy(xpath = "//*[@id='popup-profile-change']//label[text()='Я согласен получать SMS-рассылки']") private WebElement popup_edit_profile_info_label_sms_confirmation;
    @FindBy(xpath = "//*[@id='popup-profile-change']//label[text()='Подписка на новости']") private WebElement popup_edit_profile_info_label_email_confirmation;
    @FindBy(xpath = "//*[@id='popup-profile-change']//*[@name='emailConfirmation']") private WebElement popup_edit_profile_info_checkbox_email_confirmation;
    @FindBy(xpath = "//*[@id='popup-profile-change']//*[@name='smsConfirmation']") private WebElement popup_edit_profile_info_checkbox_sms_confirmation;
    @FindBy(xpath = "//*[@id='popup-profile-change']//button[@type='submit']") private WebElement popup_edit_profile_info_submit_btn;
    @FindBy(xpath = "//*[@id='popup-profile-change']//span[@data-popup='close']") private WebElement popup_edit_profile_info_close_btn;


    @FindBy(xpath = "//*[@class='profile-info profile-block__item profile-block__item--pd']") private List<WebElement> profile_info_block;
    @FindBy(xpath = "//*[@class='profile-info__block']//*[@data-profile-field='firstName']") private WebElement profile_info_firstName;
    @FindBy(xpath = "//*[@class='profile-info__block']//*[@data-profile-field='lastName']") private WebElement profile_info_lastName;
    @FindBy(xpath = "//*[@class='profile-info__block']//*[@data-profile-field='birthDate']") private WebElement profile_info_birthDate;
    @FindBy(xpath = "//*[@class='profile-info__block']//*[@data-profile-field='gender']") private WebElement profile_info_gender;






    //Constructor
    public PagesMyAccount(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }


    //====== ВСЕ СТРАНИЦЫ ЛК ===========


    //СОЗДАТЬ ОБЪЕКТ PagesMyAccount //PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

    //есть крошка Главная //pagesMyAccount.isBreadcrumb1();
    public void isBreadcrumb1(){
        String breadcrumb1_text = breadcrumb1.getText();
            Assert.assertEquals(breadcrumb1_text, "Главная");
        Boolean isBreadcrumb1_url = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeContains(breadcrumb1,"href",".ru/"));
        /*String breadcrumb1_url = breadcrumb1.getAttribute("href");
         Assert.assertEquals(breadcrumb1_url, "https://bi-bi.ru/");*/
        String breadcrumb1_itemprop = breadcrumb1.getAttribute("itemprop");
            Assert.assertEquals(breadcrumb1_itemprop, "item");
    }



    //====== СТРАНИЦА ПРОФИЛЯ ===========


    //СОЗДАТЬ ОБЪЕКТ PagesMyAccount //PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

    //открывается страница ЛК //pagesMyAccount.isPageProfileInfoToBe();
    public void isPageProfileInfoToBe(){
        List<WebElement> isProfileNavBlockVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(profile_lc_nav_block));
        List<WebElement> isProfileInfoBlockVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(profile_info_block));
        List<WebElement> isProfileMapVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(profile_map_block));
        List<WebElement> isFavoriteStoreVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(profile_favorite_store_block));
        List<WebElement> isProfileAddressVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(profile_address_block));
        Boolean profilePageCurrentUrl  = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/profile"));
        /*String myAccountProfileUrl = driver.getCurrentUrl();  Assert.assertEquals(myAccountProfileUrl, "https://bi-bi.ru/my-account/profile");*/
        String breadcrumb2_class_active = navLinkProfile.getAttribute("class");
            Assert.assertEquals(breadcrumb2_class_active, "link link--black lc-nav__link is-active");
    }

    //есть крошка Профиль, в навигации выделена соотв. ссылка//pagesMyAccount.isBreadcrumb2Profile();
    public void isBreadcrumb2Profile(){
        String breadcrumb1_text = breadcrumb2.getText();
            Assert.assertEquals(breadcrumb1_text, "Профиль");
    }

    //кликнуть Сменить магазин //pagesMyAccount.clickChangeStoreFromProfile();
    public void clickChangeStoreFromProfile(){profile_change_store_btn.click();}

    //закрыть открывшуюся карту крестиком //pagesMyAccount.clickClosePopupLocationBtn();
    public void clickClosePopupLocationBtn(){ close_popup_map_delivery_new_btn.click(); }






    //карта закрылась //Assert.assertTrue(pagesMyAccount.isProfileMapShopsInvisible());
    public boolean isProfileMapShopsInvisible(){
        Boolean profileMapShopsInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(profile_map_shops)));
        return true;
    }



    //страница профиля > блок Магазин самовывоза > кликнуть Сменить магазин > выбрать из списка на карте Полбина,6 > магаз сменился в шапке и в блоке профиля (только для БР МСК)//pagesMyAccount.changeStoreFromProfile();
    public void setStore020FromProfile() throws InterruptedException {
        profile_change_store_btn.click();
        boolean profile_map_shopsDisplayed;
        if (profile_map_shops.isDisplayed()) {
            profile_map_shopsDisplayed = true;
        } else profile_map_shopsDisplayed = false;
        WebElement isMapChangeStoreFromProfileVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(profile_map_shop_title));
        Thread.sleep(500);
        Actions action_write_us = new Actions(driver);
            action_write_us.moveToElement(profile_map_shop_pos_020_btn).click().perform();
        Boolean isNameOfStore020InProfile = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.attributeContains(name_of_store_in_profile, "textContent", "Москва Полбина"));
        Boolean isNameOfStore020InHeader = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.attributeContains(name_of_store_in_header, "textContent", "Москва Полбина"));
       }


    //нажать на кнопку Редактировать данные > откроется форма (проверка по заголовку) //pagesMyAccount.clickOnEditProfileInfoBtn();
    public void clickOnEditProfileInfoBtn(){
        edit_profile_info_btn.click();
        WebElement isPopupEditProfileInfoTitleVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popup_edit_profile_info_title));
    }



    //кликнуть Редактировать данные //pagesMyAccount.editInfoFromProfile();
    public void editInfoFromProfile(){
        edit_profile_info_btn.click();
    }

    //открывается форма редактирования личных данных //pagesMyAccount.isPopupEditProfileInfoToBe();
    public void isPopupEditProfileInfoToBe(){
        WebElement isPopupEditProfileInfoTitleVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popup_edit_profile_info_title));
        WebElement isPopupEditProfileInfoLabelNameVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_edit_profile_info_label_name));
        WebElement isPopupEditProfileInfoLabelSurnameVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_edit_profile_info_label_surname));
        WebElement isPopupEditProfileInfoLabelBirthdayVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_edit_profile_info_label_birthday));
        WebElement isPopupEditProfileInfoCalendarVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_edit_profile_info_calendar));
        WebElement isPopupEditProfileInfoLabelGenderVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_edit_profile_info_label_gender));
        WebElement isPopupEditProfileInfoLabelPhoneVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_edit_profile_info_label_phone));
        WebElement isPopupEditProfileInfoLabelEmailVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_edit_profile_info_label_email));
        WebElement isPopupEditProfileInfoLabelSmsConfirmationVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_edit_profile_info_label_sms_confirmation));
        WebElement isPopupEditProfileInfoCheckboxSmsConfirmationSelected = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_edit_profile_info_checkbox_sms_confirmation));
        WebElement isPopupEditProfileInfoLabelEmailConfirmationVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_edit_profile_info_label_email_confirmation));
        WebElement isPopupEditProfileInfoCheckboxEmailConfirmationSelected = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_edit_profile_info_checkbox_email_confirmation));
        WebElement isPopupEditProfileInfoSubmitBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_edit_profile_info_submit_btn));
        WebElement isPopupEditProfileInfoCloseBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_edit_profile_info_close_btn));
    }

    //закрыть форму редактирования личных данных > форма закрылась //pagesMyAccount.closePopupEditProfileInfo();
    public void closePopupEditProfileInfo(){
        popup_edit_profile_info_close_btn.click();
        Boolean titlePopupEditProfileInfoInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(popup_edit_profile_info_title)));
    }

    //форма редактирования личных данных закрылась //pagesMyAccount.isTitlePopupEditProfileInfoInvisible();
    public void isTitlePopupEditProfileInfoInvisible(){
        Boolean titlePopupEditProfileInfoInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(popup_edit_profile_info_title)));
    }

    //заполнить поле Имя формы редактирования данных //pagesMyAccount.inputNameToProfileInfo();
    public void inputNameToProfileInfo(String NameToProfileInfo){
        popup_edit_profile_info_input_name.clear();
        popup_edit_profile_info_input_name.sendKeys(NameToProfileInfo);
    }

    //заполнить поле Фамилия формы редактирования данных //pagesMyAccount.inputSurnameToProfileInfo();
    public void inputSurnameToProfileInfo(String SurnameToProfileInfo){
        popup_edit_profile_info_input_surname.clear();
        popup_edit_profile_info_input_surname.sendKeys(SurnameToProfileInfo);
    }

    //выбрать пол - Женский в форме редактирования данных //pagesMyAccount.selectGenderFemaleToProfileInfo();
    public void selectGenderFemaleToProfileInfo(){
        popup_edit_profile_info_gender_select_arrow.click();
        Actions action_write_us = new Actions(driver);
        action_write_us.moveToElement(popup_edit_profile_info_gender_select_female).click().perform();
    }


    //выбрать пол - Мужской в форме редактирования данных //pagesMyAccount.selectGenderMaleToProfileInfo();
    public void selectGenderMaleToProfileInfo(){
        popup_edit_profile_info_gender_select_arrow.click();
        Actions action_write_us = new Actions(driver);
        action_write_us.moveToElement(popup_edit_profile_info_gender_select_male).click().perform();
    }


    //редактировать дату рождения цифрами в форме редактирования данных //pagesMyAccount.editBirthDateToProfileInfo();
    public void editBirthDateToProfileInfo1(String new_birthday, String new_birthmonth, String new_birthyear, String new_birthdate_all){
        popup_edit_profile_info_input_birthdate.clear();
        Actions action_set_new_birthday = new Actions(driver);
            action_set_new_birthday.moveToElement(popup_edit_profile_info_input_birthdate)
                .sendKeys(popup_edit_profile_info_input_birthdate, new_birthday).perform();
        Actions action_set_new_birthmonth = new Actions(driver);
            action_set_new_birthmonth.moveToElement(popup_edit_profile_info_input_birthdate)
                .sendKeys(popup_edit_profile_info_input_birthdate, new_birthmonth).perform();
        Actions action_set_new_birthyear = new Actions(driver);
            action_set_new_birthyear.moveToElement(popup_edit_profile_info_input_birthdate)
                .sendKeys(popup_edit_profile_info_input_birthdate, new_birthyear).perform();
        popup_edit_profile_info_input_surname.click();
        Boolean hasBirthDateValue = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(popup_edit_profile_info_input_birthdate, "value", new_birthdate_all));
    }

    //редактировать дату рождения цифрами в форме редактирования данных (не работает) //pagesMyAccount.editBirthDateToProfileInfo1();
    public void editBirthDateToProfileInfo1(String new_birtdate, String new_birthdate_with_points) throws InterruptedException {
        popup_edit_profile_info_input_birthdate.clear();
        Thread.sleep(100);
        popup_edit_profile_info_input_birthdate.sendKeys(new_birtdate);
        Actions action_set_new_birthdate = new Actions(driver);
            action_set_new_birthdate.moveToElement(popup_edit_profile_info_input_birthdate).sendKeys(popup_edit_profile_info_input_birthdate, new_birtdate).perform();
        Thread.sleep(10000);
        //popup_edit_profile_info_input_surname.click();
        Boolean hasBirthDateValue = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(popup_edit_profile_info_input_birthdate, "value", new_birthdate_with_points));
    }

    //редактировать дату рождения в форме редактирования данных кликами в календаре //pagesMyAccount.editBirthDateToProfileInfo();
    public void editBirthDateToProfileInfo() throws InterruptedException {
        popup_edit_profile_info_input_birthdate.click();
        popup_edit_profile_info_select_year.click();
        popup_edit_profile_info_option_1974.click();
        popup_edit_profile_info_option_October.click();
        popup_edit_profile_info_option_day10.click();
        Boolean hasBirthDateValue = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(popup_edit_profile_info_input_birthdate, "value", "10.10.1974"));
    }

    //кликнуть Сохранить в форме редактирования //pagesMyAccount.editProfileInfoSubmit();
    public void editProfileInfoSubmit(){popup_edit_profile_info_submit_btn.click();}

    //проверить, что личные данные юзера сохранились //pagesMyAccount.checkProfileInfoUpdate();
    public void checkProfileInfoUpdate(){
        Boolean hasFirstNameText = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(profile_info_firstName, "textContent", "Татьянa"));
        Boolean hasLastNameText = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(profile_info_lastName, "textContent", "Patutina"));
        Boolean hasBirthDateText = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(profile_info_birthDate, "textContent", "10.10.1974"));
        Boolean hasGenderText = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(profile_info_gender, "textContent", "Женский"));
    }


    //кликнуть Сменить пароль //pagesMyAccount.clickChangePassBtnInProfile();
    public void clickChangePassBtnInProfile(){popup_profile_change_pass_btn.click();}

    //открылась форма смены пароля //pagesMyAccount.isPopupChangePassInProfileToBe();
    public void isPopupChangePassInProfileToBe(){
        WebElement isPopupChangePassInProfileTitleVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popup_profile_change_pass_title));
        WebElement isPopupChangePassInProfileLabelOldPassVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_profile_change_pass_label_old_pass));
        WebElement isPopupChangePassInProfileInputCurrentPassClickable  = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(popup_profile_change_pass_input_current_pass));
        WebElement isPopupChangePassInProfileLabelNewPassVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_profile_change_pass_label_new_pass));
        WebElement isPopupChangePassInProfileInputNewPassClickable  = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(popup_profile_change_pass_input_new_pass));
        WebElement isPopupChangePassInProfileLabelCheckNewPassVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_profile_change_pass_label_check_new_pass));
        WebElement isPopupChangePassInProfileInputCheckNewPassClickable  = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(popup_profile_change_pass_input_check_new_pass));
        WebElement isPopupChangePassInProfileDisabledBtnSubmitVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_profile_change_pass_submit_btn_disabled));
    }

    //закрыть форму пароля крестиком > форма закрылась //pagesMyAccount.closePopupChangePassInProfile();
    public void closePopupChangePassInProfile(){
        popup_profile_change_pass_close_btn.click();
        Boolean titlePopupChangePassInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(popup_profile_change_pass_title)));
    }

    //форма редактирования пароля закрылась //pagesMyAccount.isTitlePopupChangePassInvisible();
    public void isTitlePopupChangePassInvisible(){
        Boolean titlePopupChangePassInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(popup_profile_change_pass_title)));
    }

    //кликнуть Добавить новый адрес //pagesMyAccount.addNewAddressInProfilePage();
    public void addNewAddressInProfilePage(){profile_add_new_address_btn.click();}

    //открылась форма добавления нового адреса //pagesMyAccount.isPopupAddNewAddressInProfileToBe();
    public void isPopupAddNewAddressInProfileToBe(){
        WebElement isPopupAddNewAddressInProfileTitleVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(profile_add_new_address_popup_title));
        WebElement isPopupAddNewAddressInProfileFulladdressInputVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(profile_add_new_address_popup_fulladdress_input));
        WebElement isPopupAddNewAddressInProfileDisabledBtnSubmitVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_profile_add_new_address_submit_btn_disabled));
    }

    //закрыть форму добавления нового адреса крестиком > форма закрылась //pagesMyAccount.closePopupAddNewAddressInProfile();
    public void closePopupAddNewAddressInProfile(){
        profile_address_popup_close_btn.click();
        Boolean titlePopupAddNewAddressInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(profile_add_new_address_popup_title)));
    }

    //кликнуть на иконку Изменить адрес у первого адреса //pagesMyAccount.clickToIconEditAddress1FromProfilePage();
    public void clickToIconEditAddress1FromProfilePage(){ profile_edit_address1_icon.click();  }

    //открылась форма редактирования адреса //pagesMyAccount.isPopupEditAddressInProfileToBe();
    public void isPopupEditAddressInProfileToBe(){
        WebElement isPopupEditAddressInProfileTitleVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(profile_edit_address_popup_title));
        WebElement isPopupAddNewAddressInProfileFulladdressInputVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(profile_add_new_address_popup_fulladdress_input));
        WebElement isPopupAddNewAddressInProfileDisabledBtnSubmitVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popup_profile_add_new_address_submit_btn_disabled));
    }

    //закрыть форму редактирования адреса крестиком > форма закрылась //pagesMyAccount.closePopupEditAddressInProfile();
    public void closePopupEditAddressInProfile(){
        profile_address_popup_close_btn.click();
        Boolean titlePopupAddNewAddressInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(profile_edit_address_popup_title)));
    }








    //====== СТРАНИЦА МОЙ ГАРАЖ ===========


    //создать объект  PagesMyAccount //PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

    //есть крошка Мой Гараж, в навигации выделена соотв. ссылка //pagesMyAccount.isBreadcrumb2Garage();
    public void isBreadcrumb2Garage(){
        String breadcrumb1_text = breadcrumb2.getText();
            Assert.assertEquals(breadcrumb1_text, "Мой Гараж");
        Boolean garagePageCurrentUrl  = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/garage"));
        String breadcrumb2_class_active = navLinkMyGarage.getAttribute("class");
            Assert.assertEquals(breadcrumb2_class_active, "link link--black lc-nav__link is-active");
    }



    //====== СТРАНИЦА ИЗБРАННОЕ В ЛК ===========


    //создать объект  PagesMyAccount //PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

    //есть крошка Избранное, в навигации выделена соотв. ссылка //pagesMyAccount.isBreadcrumb2Favorite();
    public void isBreadcrumb2Favorite(){
        String breadcrumb1_text = breadcrumb2.getText();
            Assert.assertEquals(breadcrumb1_text, "Избранное");
        Boolean favoritePageCurrentUrl  = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/favorite"));
        String breadcrumb2_class_active = navLinkFavorite.getAttribute("class");
            Assert.assertEquals(breadcrumb2_class_active, "link link--black lc-nav__link is-active");
    }



    //====== СТРАНИЦА МОИ БОНУСЫ В ЛК ===========


    //создать объект  PagesMyAccount //PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

    //есть крошка Мои бонусы, в навигации выделена соотв. ссылка //pagesMyAccount.isBreadcrumb2MyBonuses();
    public void isBreadcrumb2MyBonuses(){
        String breadcrumb1_text = breadcrumb2.getText();
            Assert.assertEquals(breadcrumb1_text, "Мои бонусы");
        Boolean bonusesPageCurrentUrl  = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/bonuses"));
        String breadcrumb2_class_active = navLinkMyBonuses.getAttribute("class");
            Assert.assertEquals(breadcrumb2_class_active, "link link--black lc-nav__link is-active");
    }



    //====== СТРАНИЦА ИСТОРИЯ ЗАКАЗОВ В ЛК ===========


    //создать объект  PagesMyAccount //PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

    //есть крошка История заказов, в навигации выделена соотв. ссылка //pagesMyAccount.isBreadcrumb2MyOrders();
    public void isBreadcrumb2MyOrders(){
        String breadcrumb1_text = breadcrumb2.getText();
            Assert.assertEquals(breadcrumb1_text, "История заказов");
        Boolean ordersPageCurrentUrl  = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/orders"));
        String breadcrumb2_class_active = navLinkOrders.getAttribute("class");
            Assert.assertEquals(breadcrumb2_class_active, "link link--black lc-nav__link is-active");
    }



    //====== СТРАНИЦА МОИ ОТЗЫВЫ В ЛК ===========


    //создать объект  PagesMyAccount //PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

    //есть крошка Мои отзывы, в навигации выделена соотв. ссылка //pagesMyAccount.isBreadcrumb2MyReviews();
    public void isBreadcrumb2MyReviews(){
        String breadcrumb1_text = breadcrumb2.getText();
        Assert.assertEquals(breadcrumb1_text, "Мои отзывы");
        Boolean reviewsPageCurrentUrl  = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/reviews"));
        String breadcrumb2_class_active = navLinkMyReviews.getAttribute("class");
        Assert.assertEquals(breadcrumb2_class_active, "link link--black lc-nav__link is-active");
    }



    //====== СТРАНИЦА МОИ ОБРАЩЕНИЯ В ЛК ===========


    //создать объект  PagesMyAccount //PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

    //есть крошка Мои обращения, в навигации выделена соотв. ссылка //pagesMyAccount.isBreadcrumb2MyTickets();
    public void isBreadcrumb2MyTickets(){
        String breadcrumb1_text = breadcrumb2.getText();
        Assert.assertEquals(breadcrumb1_text, "Мои обращения");
        Boolean ticketsPageCurrentUrl  = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/tickets"));
        String breadcrumb2_class_active = navLinkMyTickets.getAttribute("class");
        Assert.assertEquals(breadcrumb2_class_active, "link link--black lc-nav__link is-active");
    }








}
