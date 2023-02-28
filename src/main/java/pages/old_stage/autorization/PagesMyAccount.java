package pages.old_stage.autorization;

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


    @FindBy(xpath = "//*[@class='auth is-active']/a[@class='btn btn--link btn--sm auth__signout']")
    private WebElement headerSignoutBtn;

    @FindBy(xpath = "(//*[@class='breadcrumbs'])/li[1]/a")
    private WebElement breadcrumb1;
    @FindBy(xpath = "(//*[@class='breadcrumbs'])/li[2]")
    private WebElement breadcrumb2;

    @FindBy(xpath = "//*[@class='lc-nav']//li/a[contains(text(),'Мой гараж')]")
    private WebElement navLinkMyGarage;
    @FindBy(xpath = "//*[@class='lc-nav']//li/a[contains(text(),'Избранное')]")
    private WebElement navLinkFavorite;
    @FindBy(xpath = "//*[@class='lc-nav']//li/a[contains(text(),'Профиль')]")
    private WebElement navLinkProfile;
    @FindBy(xpath = "//*[@class='lc-nav']//li/a[contains(text(),'Мои бонусы')]")
    private WebElement navLinkMyBonuses;
    @FindBy(xpath = "//*[@class='lc-nav']//li/a[contains(text(),'История заказов')]")
    private WebElement navLinkOrders;
    @FindBy(xpath = "//*[@class='lc-nav']//li/a[contains(text(),'Мои отзывы')]")
    private WebElement navLinkMyReviews;
    @FindBy(xpath = "//*[@class='lc-nav']//li/a[contains(text(),'Мои обращения')]")
    private WebElement navLinkMyTickets;

    @FindBy(xpath = "//*[@class='profile-block__item profile-block__item--pd']")
    private List<WebElement> profileFavoriteStoreBlock;
    @FindBy(xpath = "//*[@class='lc-nav']")
    private List<WebElement> profileLcNavBlock;
    @FindBy(xpath = "//*[@id='profile-map']")
    private List<WebElement> profileMapBlock;
    @FindBy(xpath = "//*[@class='profile-title__item profile-title__head mb-xs']")
    private WebElement nameOfStoreInProfile;
    @FindBy(xpath = "//*[@class='profile-address profile-block__item profile-block__item--pd']")
    private List<WebElement> profileAddressBlock;
    @FindBy(xpath = "//*[@class='favourite-shop__btn-panel']//a[contains(text(),'Сменить магазин')]")
    private WebElement profileChangeStoreBtn;
    @FindBy(xpath = "(//*[@id='popup-delivery']//li//button[@data-shop-pos='017_Химки'])[contains(text(),'Выбрать')]")
    private WebElement headerMapShopPos017Btn;
    @FindBy(xpath = "(//*[@id='popup-delivery']//li//button[@data-shop-pos='019_Строгино'])[contains(text(),'Выбрать')]")
    private WebElement headerMapShopPos019Btn;
    @FindBy(xpath = "(//*[@id='popup-delivery']//li//*[@data-shop-pos='020_Печатники'])[contains(text(),'Выбрать')]")
    private WebElement headerMapShopPos020Btn;
    @FindBy(xpath = "(//*[@data-js='deliveryPopup']//span)[3]")
    private WebElement nameOfStoreInHeader;
    @FindBy(xpath = "//*[@id='popup_cart_delivery_new']")
    private WebElement profileMapShops;
    @FindBy(xpath = "//*[@id='popup_cart_delivery_new']/h2[contains(text(), 'Выберите магазин')]")
    private WebElement profileMapShopTitle;
    @FindBy(xpath = "//*[@id='popup_cart_delivery_new']/*[@class='popup__close']/*[@class='icon icon--close']")
    private WebElement closePopupMapDeliveryNewBtn;
    @FindBy(xpath = "(//*[@id='popup_cart_delivery_new']//li//button[@data-shop-pos='017_Химки'])[contains(text(),'Выбрать')]")
    private WebElement profileMapShopPos017Btn;
    @FindBy(xpath = "(//*[@id='popup_cart_delivery_new']//li//button[@data-shop-pos='019_Строгино'])[contains(text(),'Выбрать')]")
    private WebElement profileMapShopPos019Btn;
    @FindBy(xpath = "(//*[@id='popup_cart_delivery_new']//li//button[@data-shop-pos='020_Печатники'])[contains(text(),'Выбрать')]")
    private WebElement profileMapShopPos020Btn;


    @FindBy(xpath = "//*[@class='profile-control']//*[text()='Изменить пароль']")
    private WebElement popupProfileChangePassBtn;
    @FindBy(xpath = "//div[@data-js='changeUserPassForm']//h2[contains(text(),'Изменить')]")
    private WebElement popupProfileChangePassTitle;
    @FindBy(xpath = "//div[@data-js='changeUserPassForm']//label[text()='Старый пароль']")
    private WebElement popupProfileChangePassLabelOldPass;
    @FindBy(xpath = "//div[@data-js='changeUserPassForm']//input[@name='currentPassword']")
    private WebElement popupProfileChangePassInputCurrentPass;
    @FindBy(xpath = "//div[@data-js='changeUserPassForm']//label[text()='Новый пароль']")
    private WebElement popupProfileChangePassLabelNewPass;
    @FindBy(xpath = "//div[@data-js='changeUserPassForm']//input[@name='newPassword']")
    private WebElement popupProfileChangePassInputNewPass;
    @FindBy(xpath = "//div[@data-js='changeUserPassForm']//label[text()='Повторите пароль']")
    private WebElement popupProfileChangePassLabelCheckNewPass;
    @FindBy(xpath = "//div[@data-js='changeUserPassForm']//input[@name='checkNewPassword']")
    private WebElement popupProfileChangePassInputCheckNewPass;
    @FindBy(xpath = "//div[@data-js='changeUserPassForm']//button[@type='submit'][@disabled][text()='Изменить']")
    private WebElement popupProfileChangePassSubmitBtnDisabled;
    @FindBy(xpath = "(//div[@data-js='changeUserPassForm']//*[@class='icon icon--close'])[1]")
    private WebElement popupProfileChangePassCloseBtn;
    @FindBy(xpath = "//div[@data-js='addressControl']//*[text()='Добавить новый адрес']")
    private WebElement profileAddNewAddressBtn;
    @FindBy(xpath = "//div[@data-js='addressControl']//*[@class='icon icon--edit']")
    private WebElement profileEditAddress1Icon;
    @FindBy(xpath = "//div[@data-js='addressControl']//a[text()=' Изменить']")
    private WebElement profileLinkEditAddress1Text;
    @FindBy(xpath = "//div[@id='popup-address']//*[text()='Добавить адрес доставки'][@data-type='ADD']")
    private WebElement profileAddNewAddressPopupTitle;
    @FindBy(xpath = "//div[@id='popup-address']//*[@class='icon icon--close']")
    private WebElement profileAddressPopupCloseBtn;
    @FindBy(xpath = "//div[@id='popup-address']//*[@data-js='dadata']//input[@data-field='fulladdress']")
    private WebElement profileAddNewAddressPopupFulladdressInput;
    @FindBy(xpath = "//div[@id='popup-address']//button[@type='submit'][@disabled][text()='Сохранить']")
    private WebElement popupProfileAddNewAddressSubmitBtnDisabled;
    @FindBy(xpath = "//div[@id='popup-address']//*[text()='Адрес доставки'][@data-type='EDIT']")
    private WebElement profileEditAddressPopupTitle;


    @FindBy(xpath = "//*[@class='btn btn--block btn--name']")
    private WebElement editProfileInfoBtn;
    @FindBy(xpath = "//*[@id='popup-profile-change']/h2[text()='Персональные данные']")
    private WebElement popupEditProfileInfoTitle;
    @FindBy(xpath = "//*[@id='popup-profile-change']//label[text()='Имя']")
    private WebElement popupEditProfileInfoLabelName;
    @FindBy(xpath = "//*[@id='popup-profile-change']//input[@name='firstName']")
    private WebElement popupEditProfileInfoInputName;
    @FindBy(xpath = "//*[@id='popup-profile-change']//label[text()='Фамилия']")
    private WebElement popupEditProfileInfoLabelSurname;
    @FindBy(xpath = "//*[@id='popup-profile-change']//input[@name='lastName']")
    private WebElement popupEditProfileInfoInputSurname;
    @FindBy(xpath = "//*[@id='popup-profile-change']//label[text()='Дата рождения']")
    private WebElement popupEditProfileInfoLabelBirthday;
    @FindBy(xpath = "//*[@id='popup-profile-change']//input[@name='birthDate']")
    private WebElement popupEditProfileInfoInputBirthdate;
    @FindBy(xpath = "//*[@id='popup-profile-change']//*[@class='input-wrapper__icon input-wrapper__icon--calendar']")
    private WebElement popupEditProfileInfoCalendar;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']//*[@data-handler='selectYear']")
    private WebElement popupEditProfileInfoSelectYear;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']//*[@data-handler='selectYear']/*[text()='1974']")
    private WebElement popupEditProfileInfoOption1974;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']//*[@data-handler='selectMonth']/*[text()='Oct']")
    private WebElement popupEditProfileInfoOptionOctober;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']//td[@data-handler='selectDay']/*[text()='10']")
    private WebElement popupEditProfileInfoOptionDay10;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']//td[@data-handler='selectDay']/*[text()='12']")
    private WebElement popupEditProfileInfoOptionDay12;
    @FindBy(xpath = "//*[@id='popup-profile-change']//label[text()='Пол']")
    private WebElement popupEditProfileInfoLabelGender;
    @FindBy(xpath = "//*[@id='popup-profile-change']//span[@class='select2-selection__arrow']")
    private WebElement popupEditProfileInfoGenderSelectArrow;
    @FindBy(xpath = "//ul[@class='select2-results__options']/li[text()='Мужской']")
    private WebElement popupEditProfileInfoGenderSelectMale;
    @FindBy(xpath = "//ul[@class='select2-results__options']/li[text()='Женский']")
    private WebElement popupEditProfileInfoGenderSelectFemale;
    @FindBy(xpath = "//*[@id='popup-profile-change']//label[text()='Телефон']")
    private WebElement popupEditProfileInfoLabelPhone;
    @FindBy(xpath = "//*[@id='popup-profile-change']//input[@name='phoneContactInfo.mobileNumber']")
    private WebElement popupEditProfileInfoInputPhone;
    @FindBy(xpath = "//*[@id='popup-profile-change']//label[text()='Email']")
    private WebElement popupEditProfileInfoLabelEmail;
    @FindBy(xpath = "//*[@id='popup-profile-change']//label[text()='Я согласен получать SMS-рассылки']")
    private WebElement popupEditProfileInfoLabelSmsConfirmation;
    @FindBy(xpath = "//*[@id='popup-profile-change']//label[text()='Подписка на новости']")
    private WebElement popupEditProfileInfoLabelEmailConfirmation;
    @FindBy(xpath = "//*[@id='popup-profile-change']//*[@name='emailConfirmation']")
    private WebElement popupEditProfileInfoCheckboxEmailConfirmation;
    @FindBy(xpath = "//*[@id='popup-profile-change']//*[@name='smsConfirmation']")
    private WebElement popupEditProfileInfoCheckboxSmsConfirmation;
    @FindBy(xpath = "//*[@id='popup-profile-change']//button[@type='submit']")
    private WebElement popupEditProfileInfoSubmitBtn;
    @FindBy(xpath = "//*[@id='popup-profile-change']//span[@data-popup='close']")
    private WebElement popupEditProfileInfoCloseBtn;


    @FindBy(xpath = "//*[@class='profile-info profile-block__item profile-block__item--pd']")
    private List<WebElement> profileInfoBlock;
    @FindBy(xpath = "//*[@class='profile-info__block']//*[@data-profile-field='firstName']")
    private WebElement profileInfoFirstName;
    @FindBy(xpath = "//*[@class='profile-info__block']//*[@data-profile-field='lastName']")
    private WebElement profileInfoLastName;
    @FindBy(xpath = "//*[@class='profile-info__block']//*[@data-profile-field='birthDate']")
    private WebElement profileInfoBirthDate;
    @FindBy(xpath = "//*[@class='profile-info__block']//*[@data-profile-field='gender']")
    private WebElement profileInfoGender;


    //Constructor
    public PagesMyAccount(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }


    //====== ВСЕ СТРАНИЦЫ ЛК ===========


    //СОЗДАТЬ ОБЪЕКТ PagesMyAccount //PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

    //есть крошка Главная //pagesMyAccount.isBreadcrumb1();
    public void isBreadcrumb1() {
        String breadcrumb1_text = breadcrumb1.getText();
        Assert.assertEquals(breadcrumb1_text, "Главная");
        Boolean isBreadcrumb1_url = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.attributeContains(breadcrumb1, "href", ".ru/"));
        /*String breadcrumb1_url = breadcrumb1.getAttribute("href");
         Assert.assertEquals(breadcrumb1_url, "https://bi-bi.ru/");*/
        String breadcrumb1_itemprop = breadcrumb1.getAttribute("itemprop");
        Assert.assertEquals(breadcrumb1_itemprop, "item");
    }


    //====== СТРАНИЦА ПРОФИЛЯ ===========


    //СОЗДАТЬ ОБЪЕКТ PagesMyAccount //PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

    //открывается страница ЛК //pagesMyAccount.isPageProfileInfoToBe();
    public void isPageProfileInfoToBe() {
        List<WebElement> isProfileNavBlockVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(profileLcNavBlock));
        List<WebElement> isProfileInfoBlockVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(profileInfoBlock));
        List<WebElement> isProfileMapVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(profileMapBlock));
        List<WebElement> isFavoriteStoreVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(profileFavoriteStoreBlock));
        List<WebElement> isProfileAddressVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(profileAddressBlock));
        Boolean profilePageCurrentUrl = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/profile"));
        /*String myAccountProfileUrl = driver.getCurrentUrl();  Assert.assertEquals(myAccountProfileUrl, "https://bi-bi.ru/my-account/profile");*/
        String breadcrumb2_class_active = navLinkProfile.getAttribute("class");
        Assert.assertEquals(breadcrumb2_class_active, "link link--black lc-nav__link is-active");
    }

    //есть крошка Профиль, в навигации выделена соотв. ссылка//pagesMyAccount.isBreadcrumb2Profile();
    public void isBreadcrumb2Profile() {
        String breadcrumb1_text = breadcrumb2.getText();
        Assert.assertEquals(breadcrumb1_text, "Профиль");
    }

    //кликнуть Сменить магазин //pagesMyAccount.clickChangeStoreFromProfile();
    public void clickChangeStoreFromProfile() {
        profileChangeStoreBtn.click();
    }

    //закрыть открывшуюся карту крестиком //pagesMyAccount.clickClosePopupLocationBtn();
    public void clickClosePopupLocationBtn() {
        closePopupMapDeliveryNewBtn.click();
    }


    //карта закрылась //Assert.assertTrue(pagesMyAccount.isProfileMapShopsInvisible());
    public boolean isProfileMapShopsInvisible() {
        Boolean profileMapShopsInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(profileMapShops)));
        return true;
    }


    //страница профиля > блок Магазин самовывоза > кликнуть Сменить магазин > выбрать из списка на карте Полбина,6 > магаз сменился в шапке и в блоке профиля (только для БР МСК)//pagesMyAccount.changeStoreFromProfile();
    public void setStore020FromProfile() throws InterruptedException {
        profileChangeStoreBtn.click();
        boolean profileMapShopsDisplayed;
        if (profileMapShops.isDisplayed()) {
            profileMapShopsDisplayed = true;
        } else profileMapShopsDisplayed = false;
        WebElement isMapChangeStoreFromProfileVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(profileMapShopTitle));
        Thread.sleep(500);
        Actions action_write_us = new Actions(driver);
        action_write_us.moveToElement(profileMapShopPos020Btn).click().perform();
        Boolean isNameOfStore020InProfile = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.attributeContains(nameOfStoreInProfile, "textContent", "Москва Полбина"));
        Boolean isNameOfStore020InHeader = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.attributeContains(nameOfStoreInHeader, "textContent", "Москва Полбина"));
    }


    //нажать на кнопку Редактировать данные > откроется форма (проверка по заголовку) //pagesMyAccount.clickOnEditProfileInfoBtn();
    public void clickOnEditProfileInfoBtn() {
        editProfileInfoBtn.click();
        WebElement isPopupEditProfileInfoTitleVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popupEditProfileInfoTitle));
    }


    //кликнуть Редактировать данные //pagesMyAccount.editInfoFromProfile();
    public void editInfoFromProfile() {
        editProfileInfoBtn.click();
    }

    //открывается форма редактирования личных данных //pagesMyAccount.isPopupEditProfileInfoToBe();
    public void isPopupEditProfileInfoToBe() {
        WebElement isPopupEditProfileInfoTitleVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popupEditProfileInfoTitle));
        WebElement isPopupEditProfileInfoLabelNameVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupEditProfileInfoLabelName));
        WebElement isPopupEditProfileInfoLabelSurnameVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupEditProfileInfoLabelSurname));
        WebElement isPopupEditProfileInfoLabelBirthdayVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupEditProfileInfoLabelBirthday));
        WebElement isPopupEditProfileInfoCalendarVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupEditProfileInfoCalendar));
        WebElement isPopupEditProfileInfoLabelGenderVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupEditProfileInfoLabelGender));
        WebElement isPopupEditProfileInfoLabelPhoneVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupEditProfileInfoLabelPhone));
        WebElement isPopupEditProfileInfoLabelEmailVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupEditProfileInfoLabelEmail));
        WebElement isPopupEditProfileInfoLabelSmsConfirmationVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupEditProfileInfoLabelSmsConfirmation));
        WebElement isPopupEditProfileInfoCheckboxSmsConfirmationSelected = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupEditProfileInfoCheckboxSmsConfirmation));
        WebElement isPopupEditProfileInfoLabelEmailConfirmationVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupEditProfileInfoLabelEmailConfirmation));
        WebElement isPopupEditProfileInfoCheckboxEmailConfirmationSelected = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupEditProfileInfoCheckboxEmailConfirmation));
        WebElement isPopupEditProfileInfoSubmitBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupEditProfileInfoSubmitBtn));
        WebElement isPopupEditProfileInfoCloseBtnVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupEditProfileInfoCloseBtn));
    }

    //закрыть форму редактирования личных данных > форма закрылась //pagesMyAccount.closePopupEditProfileInfo();
    public void closePopupEditProfileInfo() {
        popupEditProfileInfoCloseBtn.click();
        Boolean titlePopupEditProfileInfoInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(popupEditProfileInfoTitle)));
    }

    //форма редактирования личных данных закрылась //pagesMyAccount.isTitlePopupEditProfileInfoInvisible();
    public void isTitlePopupEditProfileInfoInvisible() {
        Boolean titlePopupEditProfileInfoInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(popupEditProfileInfoTitle)));
    }

    //заполнить поле Имя формы редактирования данных //pagesMyAccount.inputNameToProfileInfo();
    public void inputNameToProfileInfo(String NameToProfileInfo) {
        popupEditProfileInfoInputName.clear();
        popupEditProfileInfoInputName.sendKeys(NameToProfileInfo);
    }

    //заполнить поле Фамилия формы редактирования данных //pagesMyAccount.inputSurnameToProfileInfo();
    public void inputSurnameToProfileInfo(String SurnameToProfileInfo) {
        popupEditProfileInfoInputSurname.clear();
        popupEditProfileInfoInputSurname.sendKeys(SurnameToProfileInfo);
    }

    //выбрать пол - Женский в форме редактирования данных //pagesMyAccount.selectGenderFemaleToProfileInfo();
    public void selectGenderFemaleToProfileInfo() {
        popupEditProfileInfoGenderSelectArrow.click();
        Actions actionWriteUs = new Actions(driver);
        actionWriteUs.moveToElement(popupEditProfileInfoGenderSelectFemale).click().perform();
    }


    //выбрать пол - Мужской в форме редактирования данных //pagesMyAccount.selectGenderMaleToProfileInfo();
    public void selectGenderMaleToProfileInfo() {
        popupEditProfileInfoGenderSelectArrow.click();
        Actions actionWriteUs = new Actions(driver);
        actionWriteUs.moveToElement(popupEditProfileInfoGenderSelectMale).click().perform();
    }


    //редактировать дату рождения цифрами в форме редактирования данных //pagesMyAccount.editBirthDateToProfileInfo();
    public void editBirthDateToProfileInfo1(String new_birthday, String new_birthmonth, String new_birthyear, String new_birthdate_all) {
        popupEditProfileInfoInputBirthdate.clear();
        Actions actionSetNewBirthday = new Actions(driver);
        actionSetNewBirthday.moveToElement(popupEditProfileInfoInputBirthdate)
                .sendKeys(popupEditProfileInfoInputBirthdate, new_birthday).perform();
        Actions actionSetNewBirthmonth = new Actions(driver);
        actionSetNewBirthmonth.moveToElement(popupEditProfileInfoInputBirthdate)
                .sendKeys(popupEditProfileInfoInputBirthdate, new_birthmonth).perform();
        Actions actionSetNewBirthyear = new Actions(driver);
        actionSetNewBirthyear.moveToElement(popupEditProfileInfoInputBirthdate)
                .sendKeys(popupEditProfileInfoInputBirthdate, new_birthyear).perform();
        popupEditProfileInfoInputSurname.click();
        Boolean hasBirthDateValue = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(popupEditProfileInfoInputBirthdate, "value", new_birthdate_all));
    }

    //редактировать дату рождения цифрами в форме редактирования данных (не работает) //pagesMyAccount.editBirthDateToProfileInfo1();
    public void editBirthDateToProfileInfo1(String new_birtdate, String new_birthdate_with_points) throws InterruptedException {
        popupEditProfileInfoInputBirthdate.clear();
        Thread.sleep(100);
        popupEditProfileInfoInputBirthdate.sendKeys(new_birtdate);
        Actions actionSetNewBirthdate = new Actions(driver);
        actionSetNewBirthdate.moveToElement(popupEditProfileInfoInputBirthdate).sendKeys(popupEditProfileInfoInputBirthdate, new_birtdate).perform();
        Thread.sleep(10000);
        popupEditProfileInfoInputSurname.click();
        Boolean hasBirthDateValue = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(popupEditProfileInfoInputBirthdate, "value", new_birthdate_with_points));
    }

    //редактировать дату рождения в форме редактирования данных кликами в календаре //pagesMyAccount.editBirthDateToProfileInfo();
    public void editBirthDateToProfileInfo() throws InterruptedException {
        popupEditProfileInfoInputBirthdate.click();
        popupEditProfileInfoSelectYear.click();
        popupEditProfileInfoOption1974.click();
        popupEditProfileInfoOptionOctober.click();
        popupEditProfileInfoOptionDay10.click();
        Boolean hasBirthDateValue = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(popupEditProfileInfoInputBirthdate, "value", "10.10.1974"));
    }

    //кликнуть Сохранить в форме редактирования //pagesMyAccount.editProfileInfoSubmit();
    public void editProfileInfoSubmit() {
        popupEditProfileInfoSubmitBtn.click();
    }

    //проверить, что личные данные юзера сохранились //pagesMyAccount.checkProfileInfoUpdate();
    public void checkProfileInfoUpdate() {
        Boolean hasFirstNameText = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(profileInfoFirstName, "textContent", "Татьянa"));
        Boolean hasLastNameText = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(profileInfoLastName, "textContent", "Patutina"));
        Boolean hasBirthDateText = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(profileInfoBirthDate, "textContent", "10.10.1974"));
        Boolean hasGenderText = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.attributeToBe(profileInfoGender, "textContent", "Женский"));
    }


    //кликнуть Сменить пароль //pagesMyAccount.clickChangePassBtnInProfile();
    public void clickChangePassBtnInProfile() {
        popupProfileChangePassBtn.click();
    }

    //открылась форма смены пароля //pagesMyAccount.isPopupChangePassInProfileToBe();
    public void isPopupChangePassInProfileToBe() {
        WebElement isPopupChangePassInProfileTitleVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(popupProfileChangePassTitle));
        WebElement isPopupChangePassInProfileLabelOldPassVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupProfileChangePassLabelOldPass));
        WebElement isPopupChangePassInProfileInputCurrentPassClickable = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(popupProfileChangePassInputCurrentPass));
        WebElement isPopupChangePassInProfileLabelNewPassVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupProfileChangePassLabelNewPass));
        WebElement isPopupChangePassInProfileInputNewPassClickable = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(popupProfileChangePassInputNewPass));
        WebElement isPopupChangePassInProfileLabelCheckNewPassVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupProfileChangePassLabelCheckNewPass));
        WebElement isPopupChangePassInProfileInputCheckNewPassClickable = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(popupProfileChangePassInputCheckNewPass));
        WebElement isPopupChangePassInProfileDisabledBtnSubmitVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupProfileChangePassSubmitBtnDisabled));
    }

    //закрыть форму пароля крестиком > форма закрылась //pagesMyAccount.closePopupChangePassInProfile();
    public void closePopupChangePassInProfile() {
        popupProfileChangePassCloseBtn.click();
        Boolean titlePopupChangePassInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(popupProfileChangePassTitle)));
    }

    //форма редактирования пароля закрылась //pagesMyAccount.isTitlePopupChangePassInvisible();
    public void isTitlePopupChangePassInvisible() {
        Boolean titlePopupChangePassInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(popupProfileChangePassTitle)));
    }

    //кликнуть Добавить новый адрес //pagesMyAccount.addNewAddressInProfilePage();
    public void addNewAddressInProfilePage() {
        profileAddNewAddressBtn.click();
    }

    //открылась форма добавления нового адреса //pagesMyAccount.isPopupAddNewAddressInProfileToBe();
    public void isPopupAddNewAddressInProfileToBe() {
        WebElement isPopupAddNewAddressInProfileTitleVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(profileAddNewAddressPopupTitle));
        WebElement isPopupAddNewAddressInProfileFulladdressInputVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(profileAddNewAddressPopupFulladdressInput));
        WebElement isPopupAddNewAddressInProfileDisabledBtnSubmitVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupProfileAddNewAddressSubmitBtnDisabled));
    }

    //закрыть форму добавления нового адреса крестиком > форма закрылась //pagesMyAccount.closePopupAddNewAddressInProfile();
    public void closePopupAddNewAddressInProfile() {
        profileAddressPopupCloseBtn.click();
        Boolean titlePopupAddNewAddressInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(profileAddNewAddressPopupTitle)));
    }

    //кликнуть на иконку Изменить адрес у первого адреса //pagesMyAccount.clickToIconEditAddress1FromProfilePage();
    public void clickToIconEditAddress1FromProfilePage() {
        profileEditAddress1Icon.click();
    }

    //открылась форма редактирования адреса //pagesMyAccount.isPopupEditAddressInProfileToBe();
    public void isPopupEditAddressInProfileToBe() {
        WebElement isPopupEditAddressInProfileTitleVisible = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(profileEditAddressPopupTitle));
        WebElement isPopupAddNewAddressInProfileFulladdressInputVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(profileAddNewAddressPopupFulladdressInput));
        WebElement isPopupAddNewAddressInProfileDisabledBtnSubmitVisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(popupProfileAddNewAddressSubmitBtnDisabled));
    }

    //закрыть форму редактирования адреса крестиком > форма закрылась //pagesMyAccount.closePopupEditAddressInProfile();
    public void closePopupEditAddressInProfile() {
        profileAddressPopupCloseBtn.click();
        Boolean titlePopupAddNewAddressInvisible = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(profileEditAddressPopupTitle)));
    }


    //====== СТРАНИЦА МОЙ ГАРАЖ ===========


    //создать объект  PagesMyAccount //PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

    //есть крошка Мой Гараж, в навигации выделена соотв. ссылка //pagesMyAccount.isBreadcrumb2Garage();
    public void isBreadcrumb2Garage() {
        String breadcrumb1Text = breadcrumb2.getText();
        Assert.assertEquals(breadcrumb1Text, "Мой Гараж");
        Boolean garagePageCurrentUrl = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/garage"));
        String breadcrumb2ClassActive = navLinkMyGarage.getAttribute("class");
        Assert.assertEquals(breadcrumb2ClassActive, "link link--black lc-nav__link is-active");
    }


    //====== СТРАНИЦА ИЗБРАННОЕ В ЛК ===========


    //создать объект  PagesMyAccount //PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

    //есть крошка Избранное, в навигации выделена соотв. ссылка //pagesMyAccount.isBreadcrumb2Favorite();
    public void isBreadcrumb2Favorite() {
        String breadcrumb2Text = breadcrumb2.getText();
        Assert.assertEquals(breadcrumb2Text, "Избранное");
        Boolean favoritePageCurrentUrl = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/favorite"));
        String breadcrumb2ClassActive = navLinkFavorite.getAttribute("class");
        Assert.assertEquals(breadcrumb2ClassActive, "link link--black lc-nav__link is-active");
    }


    //====== СТРАНИЦА МОИ БОНУСЫ В ЛК ===========


    //создать объект  PagesMyAccount //PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

    //есть крошка Мои бонусы, в навигации выделена соотв. ссылка //pagesMyAccount.isBreadcrumb2MyBonuses();
    public void isBreadcrumb2MyBonuses() {
        String breadcrumb2Text = breadcrumb2.getText();
        Assert.assertEquals(breadcrumb2Text, "Мои бонусы");
        Boolean bonusesPageCurrentUrl = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/bonuses"));
        String breadcrumb2ClassActive = navLinkMyBonuses.getAttribute("class");
        Assert.assertEquals(breadcrumb2ClassActive, "link link--black lc-nav__link is-active");
    }


    //====== СТРАНИЦА ИСТОРИЯ ЗАКАЗОВ В ЛК ===========


    //создать объект  PagesMyAccount //PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

    //есть крошка История заказов, в навигации выделена соотв. ссылка //pagesMyAccount.isBreadcrumb2MyOrders();
    public void isBreadcrumb2MyOrders() {
        String breadcrumb2Text = breadcrumb2.getText();
        Assert.assertEquals(breadcrumb2Text, "История заказов");
        Boolean ordersPageCurrentUrl = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/orders"));
        String breadcrumb2ClassActive = navLinkOrders.getAttribute("class");
        Assert.assertEquals(breadcrumb2ClassActive, "link link--black lc-nav__link is-active");
    }


    //====== СТРАНИЦА МОИ ОТЗЫВЫ В ЛК ===========


    //создать объект  PagesMyAccount //PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

    //есть крошка Мои отзывы, в навигации выделена соотв. ссылка //pagesMyAccount.isBreadcrumb2MyReviews();
    public void isBreadcrumb2MyReviews() {
        String breadcrumb2Text = breadcrumb2.getText();
        Assert.assertEquals(breadcrumb2Text, "Мои отзывы");
        Boolean reviewsPageCurrentUrl = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/reviews"));
        String breadcrumb2ClassActive = navLinkMyReviews.getAttribute("class");
        Assert.assertEquals(breadcrumb2ClassActive, "link link--black lc-nav__link is-active");
    }


    //====== СТРАНИЦА МОИ ОБРАЩЕНИЯ В ЛК ===========


    //создать объект  PagesMyAccount //PagesMyAccount pagesMyAccount = new PagesMyAccount(driver);

    //есть крошка Мои обращения, в навигации выделена соотв. ссылка //pagesMyAccount.isBreadcrumb2MyTickets();
    public void isBreadcrumb2MyTickets() {
        String breadcrumb2Text = breadcrumb2.getText();
        Assert.assertEquals(breadcrumb2Text, "Мои обращения");
        Boolean ticketsPageCurrentUrl = new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.urlContains("/my-account/tickets"));
        String breadcrumb2ClassActive = navLinkMyTickets.getAttribute("class");
        Assert.assertEquals(breadcrumb2ClassActive, "link link--black lc-nav__link is-active");
    }


}
