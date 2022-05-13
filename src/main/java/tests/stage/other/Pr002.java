package tests.stage.other;/*аноним, карточка ассортим товар op595*/

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;


public class Pr002 {



    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().setSize(new Dimension(1400, 1300));






        try {
            driver.get("https://bi-bi.ru/product/e0000042894");
            Thread.sleep(2000);



            /*согласиться с городом*/
            WebElement plashka = (new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.cssSelector("button.btn.btn--white.js-close-panel.js-region-select-link"))));
            plashka.click();




            List<WebElement> header = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'header-main header-main--search']"))));




            WebElement breadcrumb_section = (new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//div[@class='breadcrumb-section']"))));





            WebElement breadcrumb1 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class='breadcrumbs__link'])[1]"))));
                String breadcrumb1_text = breadcrumb1.getText();
                Assert.assertEquals(breadcrumb1_text, "Главная");

                String breadcrumb1_url = breadcrumb1.getAttribute("href");
                Assert.assertEquals(breadcrumb1_url, "https://bi-bi.ru/");

                String breadcrumb1_itemprop = breadcrumb1.getAttribute("itemprop");
                Assert.assertEquals(breadcrumb1_itemprop, "item");





            WebElement breadcrumb2 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class='breadcrumbs__link'])[2]"))));
                String breadcrumb2_text = breadcrumb2.getText();
                Assert.assertEquals(breadcrumb2_text, "Каталог");

                String breadcrumb2_url = breadcrumb2.getAttribute("href");
                Assert.assertEquals(breadcrumb2_url, "https://bi-bi.ru/catalog/");

                String breadcrumb2_itemprop = breadcrumb2.getAttribute("itemprop");
                Assert.assertEquals(breadcrumb2_itemprop, "item");





            WebElement breadcrumb3 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class='breadcrumbs__link'])[3]"))));
            String breadcrumb3_text = breadcrumb3.getText();
            Assert.assertEquals(breadcrumb3_text, "Фильтры для авто");

            String breadcrumb3_url = breadcrumb3.getAttribute("href");
            Assert.assertEquals(breadcrumb3_url, "https://bi-bi.ru/catalog/filtry-dlya-avto/");

            String breadcrumb3_itemprop = breadcrumb3.getAttribute("itemprop");
            Assert.assertEquals(breadcrumb3_itemprop, "item");





            WebElement breadcrumb4 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class='breadcrumbs__link'])[4]"))));
            String breadcrumb4_text = breadcrumb4.getText();
            Assert.assertEquals(breadcrumb4_text, "Масляный фильтр");

            String breadcrumb4_url = breadcrumb4.getAttribute("href");
            Assert.assertEquals(breadcrumb4_url, "https://bi-bi.ru/catalog/filtry-dlya-avto/masljanyj-filtr/");

            String breadcrumb4_itemprop = breadcrumb4.getAttribute("itemprop");
            Assert.assertEquals(breadcrumb4_itemprop, "item");





            WebElement breadcrumb5 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class='breadcrumbs__link'])[5]"))));
            String breadcrumb5_text = breadcrumb5.getText();
            Assert.assertEquals(breadcrumb5_text, "FILTRON");

            String breadcrumb5_url = breadcrumb5.getAttribute("href");
            Assert.assertEquals(breadcrumb5_url, "https://bi-bi.ru/catalog/filtry-dlya-avto/masljanyj-filtr/filtron/");

            String breadcrumb5_itemprop = breadcrumb5.getAttribute("itemprop");
            Assert.assertEquals(breadcrumb5_itemprop, "item");






            WebElement breadcrumb6 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class='breadcrumbs__link is-active']"))));
            String breadcrumb6_text = breadcrumb6.getText();
            Assert.assertEquals(breadcrumb6_text, "Масляный фильтр FILTRON OP595");

            Boolean breadcrumb6_item = new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions.not(ExpectedConditions
                            .attributeToBeNotEmpty(breadcrumb6, "itemprop")));






            WebElement section__hl = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class='section__hl']"))));
            String section__hl_text = section__hl.getText();
            Assert.assertEquals(section__hl_text, "Масляный фильтр FILTRON OP595");





            WebElement card_image__carousel = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'card-image__carousel-item slick-slide slick-current slick-active']"))));





            List<WebElement> card_image_mini = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("(//*[@class = 'slick-dots'])[1]"))));





            WebElement fototext = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'text-specify']"))));
            String text_specify = fototext.getText();
            Assert.assertEquals(text_specify, "Внешний вид может отличаться от фотографии на сайте.");





            List<WebElement> item_inside_decorative_block = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'card-desc card-cols__item--inside decorative-block']"))));





            WebElement card_brand = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'card-list__name'])[1]"))));
            String brand = card_brand.getText();
            Assert.assertEquals(brand, "Производитель:");



            WebElement card_brandName = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'link link--black link--dotted'])[2]"))));
            String brandName = card_brandName.getText();
            Assert.assertEquals(brandName, "FILTRON");



            WebElement card_oem = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'card-list__name'])[2]"))));
            String oem = card_oem.getText();
            Assert.assertEquals(oem, "Код товара:");




            WebElement card_oemCode = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'card-list__value'])[1]"))));
            String oemCode = card_oemCode.getText();
            Assert.assertEquals(oemCode, "OP595");



            WebElement card_erp = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'card-list__name'])[3]"))));
            String erp = card_erp.getText();
            Assert.assertEquals(erp, "Внутренний код:");




            WebElement card_erpCode = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'card-list__value'])[2]"))));
            String erpCode = card_erpCode.getText();
            Assert.assertEquals(erpCode, "465470");




            WebElement card_desc_btn = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'card-desc__btn btn'])[2]"))));
            String card_desc_btn_text = card_desc_btn.getText();
            Assert.assertEquals(card_desc_btn_text, "Купить");




            WebElement card_icon_compare = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'icon icon--compare'])[2]"))));




            WebElement card_compare = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'btn btn--link-grey btn--sm js-compare__add js-tooltip']"))));
            String card_compare_text = card_compare.getText();
            Assert.assertEquals(card_compare_text, "Сравнить");




            WebElement card_bonus_image = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'card-bonus-image'])[2]"))));




            WebElement card_bonus_text = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//a[@class = 'link link--black link--dotted'])[3]"))));
            String bonus_text = card_bonus_text.getText();
            Assert.assertEquals(bonus_text, "Получить бонусную карту");




            WebElement price = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'price card-price__cur'])[2]"))));
            String price_title = price.getAttribute("title");
            Assert.assertEquals(price_title, "Цена действительна только в Интернет-магазине");




            List<WebElement> card_rating = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("(//*[@class = 'sp-product-inline-rating-widget'])[2]"))));




            WebElement price__text = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class='cl-grey mt-s']"))));
            String price_text = price__text.getText();
            Assert.assertEquals(price_text, "Цена действительна только в Интернет-магазине");




            List<WebElement> card_bonuses = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='card-desc__block card-desc__block--no-border card-bonuses']"))));




            WebElement bonuses = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class='card-bonuses__title']"))));
            String bonuses_text = bonuses.getText();
            Assert.assertEquals(bonuses_text, "Бонусы:");




            WebElement bonus_stand = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class='card-bonuses__type'])[1]"))));
            String bonus_standart = bonus_stand.getText();
            Assert.assertEquals(bonus_standart, "Стандартный");




            WebElement bonus_silver = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class='card-bonuses__type'])[2]"))));
            String bonus_silver_text = bonus_silver.getText();
            Assert.assertEquals(bonus_silver_text, "Серебряный");




            WebElement bonus_gold = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class='card-bonuses__type'])[3]"))));
            String bonus_gold_text = bonus_gold.getText();
            Assert.assertEquals(bonus_gold_text, "Золотой");




            List<WebElement> card_availability = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("(//*[@class='card-desc__block'])[2]"))));




            WebElement availability = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class='card-desc__block'])[2]/h3"))));
            String availability_text = availability.getText();
            Assert.assertEquals(availability_text, "Наличие");




            List<WebElement> card_delivery = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'card-desc__block js-show-more']"))));




            WebElement show_all = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'card-desc__more-links']/a)[1]"))));
            String show_all_text = show_all.getText();
            Assert.assertEquals(show_all_text, "Показать все");




            WebElement all_stores = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'card-desc__more-links']/a)[2]"))));
            String all_stores_text = all_stores.getText();
            Assert.assertEquals(all_stores_text, "Все магазины автозапчастей на карте");




            WebElement delivery = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'card-desc__block js-show-more']/h3"))));
            String delivery_text = delivery.getText();
            Assert.assertEquals(delivery_text, "Условия доставки");




            WebElement pickup = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'card-desc__block js-show-more']//th"))));
            String pickup_text = pickup.getText();
            Assert.assertEquals(pickup_text, "Самовывоз");




            WebElement pickup1 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'card-desc__block js-show-more']//td"))));
            String pickup1_text = pickup1.getText();
            Assert.assertEquals(pickup1_text, "Бесплатно, от 3 дней");




            WebElement tabs_title__features = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'tabs__title js-tabs-title js-tabs-title__features is-active']"))));
            String features_text = tabs_title__features.getText();
            Assert.assertEquals(features_text, "Характеристики");




            WebElement type = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'definition-table definition-table--card mv-m']//th"))));
            String type_text = type.getText();
            Assert.assertEquals(type_text, "Тип фильтра");




            WebElement oil_filter = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'definition-table definition-table--card mv-m']//td"))));
            String oil_filter_text = oil_filter.getText();
            Assert.assertEquals(oil_filter_text, "Масляный фильтр");




            WebElement text_features = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'show-more__block show-more__block--hidden product-description js-show-more__hidden']"))));




            WebElement card_reviews = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id = 'tab-review']"))));
            String card_reviews_text = card_reviews.getText();
            Assert.assertEquals(card_reviews_text, "Отзывы  1");



            card_reviews.click();




            WebElement card_reviews_counter = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//span[@id='tab-review-num']"))));




            List<WebElement> card_reviews_list = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'card-reviews-block tabs__content is-open']"))));




            WebElement card_reviews_h2 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'card-reviews-block tabs__content is-open']/h2"))));
            String card_reviews_text_h2 = card_reviews_h2.getText();
            Assert.assertEquals(card_reviews_text_h2, "Отзывы о Масляный фильтр FILTRON OP595");




            WebElement card_reviews_sorting = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'sorting']"))));
            String card_reviews_text_sorting = card_reviews_sorting.getText();
            Assert.assertEquals(card_reviews_text_sorting, "Сортировать по: Дате  Оценке ");




            WebElement card_reviews_sorting_date = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@data-sort-type='date']"))));
            String card_reviews_text_sorting_date = card_reviews_sorting_date.getText();
            Assert.assertEquals(card_reviews_text_sorting_date, "Дате ");




            WebElement card_reviews_sorting_rating = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@data-sort-type='rating']"))));
            String card_reviews_text_sorting_rating = card_reviews_sorting_rating.getText();
            Assert.assertEquals(card_reviews_text_sorting_rating, "Оценке ");




            WebElement write_review_button = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//button[@class = 'btn btn--black pull-right js-shoppilot-popup']"))));
            String write_review_button_text = write_review_button.getText();
            Assert.assertEquals(write_review_button_text, "Написать отзыв");

            write_review_button.click();




            List<WebElement> review_form_page = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'sp-page sp-review-form-page']"))));




            WebElement recently_watched = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'section section--bg-grey section--big']//span"))));
            String recently_watched_text = recently_watched.getText();
            Assert.assertEquals(recently_watched_text, "Недавно вы смотрели");




            WebElement recently_watched_op595 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'section section--bg-grey section--big']//a)[2]"))));
            String recently_watched_op595_text = recently_watched_op595.getText();
            Assert.assertEquals(recently_watched_op595_text, "Масляный фильтр FILTRON OP595");




            List<WebElement> footer = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'footer-main']"))));


















            System.out.println("Автотест: Элементы карточки ассортиментного товара, аноним  = ОК");

        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            Thread.sleep(2000);
            driver.quit();
        }





    }
}
