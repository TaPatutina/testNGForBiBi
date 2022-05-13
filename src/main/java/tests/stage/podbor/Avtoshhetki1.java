package tests.stage.podbor;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Avtoshhetki1 {
    WebDriver driver;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1400, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }


    @Test
    public void PodborAvtoshhetki1() throws InterruptedException {
        try {
            driver.get("https://stageim.tomail.ru/catalog/avtoaksessuary/avtoshhetki-stekloochistitelja/");
            Thread.sleep(500);



            String title = driver.getTitle();
            Assert.assertEquals(title, "Щетки стеклоочистителя: купить дворники автомобильные по цене от 78 рублей");



            WebElement description = driver.findElement(By.xpath("/html/head/meta[6]"));
            String descr = description.getDomProperty("content");
            Assert.assertEquals(descr, "В интернет-магазине «БИ-БИ» представлен большой выбор различных дворников в машину! Цены на дворники от 78 рублей!");


            /*согласиться с городом*/
            WebElement plashka = (new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.cssSelector("button.btn.btn--white.js-close-panel.js-region-select-link"))));
            plashka.click();




            WebElement avtoshhetki_car_selector = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'filter-list__title filter-list__title--car']"))));
            String avtoshhetki_car_selector_text = avtoshhetki_car_selector.getText();
            Assert.assertEquals(avtoshhetki_car_selector_text, "Подбор по автомобилю");



/*выбрать марку*/
            WebElement car_marka = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'car-selector']/label"))));
            String car_marka_text = car_marka.getText();
            Assert.assertEquals(car_marka_text, "Марка автомобиля");



/* поле Выберите марку пустое, с плейсхолдером*/
            WebElement placeholder_marka = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id = 'mc-mark-list']"))));
            String placeholder_marka_text = placeholder_marka.getAttribute("data-placeholder");
            Assert.assertEquals(placeholder_marka_text, "Выберите марку");




            WebElement select_marka = driver.findElement(By.xpath("//*[@aria-labelledby='select2-mc-mark-list-container']"));
            select_marka.click();
            Thread.sleep(1000);

            List<WebElement> result_marka = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'select2-results mCustomScrollbar _mCS_1']"))));


//кликнуть на марку
            WebElement marka_BMW = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .presenceOfElementLocated(By.xpath("//*[@id = 'select2-mc-mark-list-results']/li[contains(text(), 'BMW')]"))));


            Actions select_marka_BMW = new Actions(driver);
            select_marka_BMW.moveToElement(marka_BMW).click(marka_BMW).perform();
//выбрана марка BMW
            WebElement marka_BMW_selected = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id = 'select2-mc-mark-list-container']"))));

            String selected_marka_title = marka_BMW_selected.getAttribute("title");
            Assert.assertEquals(selected_marka_title, "\n" +
                    "                                BMW\n" +
                    "                            ");
            String selected_marka_text = marka_BMW_selected.getText();
            Assert.assertEquals(selected_marka_text, "BMW");





/*выбрать модель*/
/* поле Выберите модель пустое, с плейсхолдером*/
            WebElement placeholder_model = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id = 'mc-model-list']"))));
            String placeholder_model_text = placeholder_model.getAttribute("data-placeholder");
            Assert.assertEquals(placeholder_model_text, "Выберите модель");

 /* кликнуть на поле Выберите модель */
            WebElement select_model = driver.findElement(By.xpath("//*[@aria-labelledby='select2-mc-model-list-container']"));
            select_model.click();
            Thread.sleep(1000);

            WebElement model_BMW_X5 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .presenceOfElementLocated(By.xpath("//*[@id = 'select2-mc-model-list-results']/li[contains(text(),'X5')]"))));

            Actions select_model_BMW_X5 = new Actions(driver);
            select_model_BMW_X5.moveToElement(model_BMW_X5).click(model_BMW_X5).perform();

            WebElement model_BMW_X5_selected = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id = 'select2-mc-model-list-container']"))));

            String selected_model_X5_title = model_BMW_X5_selected.getAttribute("title");
            Assert.assertEquals(selected_model_X5_title, "X5");
            String selected_model_X5_text = model_BMW_X5_selected.getText();
            Assert.assertEquals(selected_model_X5_text, "X5");








/* поле Поколение пустое, с плейсхолдером "Поколение" */
            WebElement placeholder_pokolenie = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id = 'mc-series-list']"))));
            String placeholder_pokolenie_text = placeholder_pokolenie.getAttribute("data-placeholder");
            Assert.assertEquals(placeholder_pokolenie_text, "Поколение");

            WebElement select_pokolenie = driver.findElement(By.xpath("(//*[@class = 'select2 select2-container select2-container--default'])[2]"));
            select_pokolenie.click();
            Thread.sleep(1000);

            WebElement pokolenie_BMW_X5_II = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .presenceOfElementLocated(By.xpath("(//*[@class = 'select2-results__option select2-results__option--highlighted'])[text()='X5 II']"))));

            Actions select_pokolenie_BMW_X5_II = new Actions(driver);
            select_pokolenie_BMW_X5_II.moveToElement(pokolenie_BMW_X5_II).click(pokolenie_BMW_X5_II).perform();

            WebElement pokolenie_BMW_X5_II_selected = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id = 'select2-mc-series-list-container']"))));

            String selected_pokolenie_X5_II_title = pokolenie_BMW_X5_II_selected.getAttribute("title");
            Assert.assertEquals(selected_pokolenie_X5_II_title, "X5 II");
            String selected_pokolenie_X5_II_text = pokolenie_BMW_X5_II_selected.getText();
            Assert.assertEquals(selected_pokolenie_X5_II_text, "X5 II");








/* поле модификации пустое, с плейсхолдером Выберите модификацию */
            WebElement placeholder_modification = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id = 'mc-modification-list']"))));
            String placeholder_modification_text = placeholder_modification.getAttribute("data-placeholder");
            Assert.assertEquals(placeholder_modification_text, "Выберите модификацию");

            WebElement select_modification = driver.findElement(By.xpath("//*[@id = 'select2-mc-modification-list-container']"));
            select_modification.click();
            Thread.sleep(1000);

            WebElement modification_BMW_X5_II = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .presenceOfElementLocated(By.xpath("(//*[@class = 'select2-results__option select2-results__option--highlighted'])[text() = '3.0 d M57 D30 (306D3) 3 235 Дизель 2006-2010']"))));

            Actions select_modification_BMW_X5_II = new Actions(driver);
            select_modification_BMW_X5_II.moveToElement(modification_BMW_X5_II).click(modification_BMW_X5_II).perform();


            WebElement modification_BMW_X5_II_selected = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id = 'select2-mc-modification-list-container']"))));

            String selected_modification_X5_II_title = modification_BMW_X5_II_selected.getAttribute("title");
            Assert.assertEquals(selected_modification_X5_II_title, "3.0 d M57 D30 (306D3) 3 235 Дизель 2006-2010");
            String selected_modification_X5_II_text = modification_BMW_X5_II_selected.getText();
            Assert.assertEquals(selected_modification_X5_II_text, "3.0 d M57 D30 (306D3) 3 235 Дизель 2006-2010");



/*кликнуть Подобрать*/
            WebElement submit_btn = driver.findElement(By.xpath("//button[@class = 'catalog-car-change__btn btn js-mc-filter-submit']"));
            submit_btn.click();



/*текст названия подбора верхняя строка*/
            WebElement catalog_car_name = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//p[@class = 'catalog-car__name mb-0 js-mc-filter-result__name']"))));
            String catalog_car_name_text = catalog_car_name.getText();
            Assert.assertEquals(catalog_car_name_text, "BMW X5");




/*текст  названия подбора нижняя строка*/
            WebElement catalog_car_name_desc = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//p[@class = 'catalog-car__desc js-mc-filter-result__desc']"))));
            String catalog_car_name_desc_text = catalog_car_name_desc.getText();
            Assert.assertEquals(catalog_car_name_desc_text, "X5 II 3.0 d");

// url меняется
            WebDriverWait wait_new_url = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait_new_url.until(ExpectedConditions.urlToBe("https://stageim.tomail.ru/catalog/avtoaksessuary/avtoshhetki-stekloochistitelja/podbor/bmw/x5/ii_e70_2006-2013/3_0_d_m57_d30_306d3_3_235_diesel_2006-2010/"));





//есть кнопка Выбрать другой автомобиль
            WebElement change_car_btn = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//button[@class = 'catalog-car-change__btn btn js-mc-filter-change']"))));
            String change_car_btn_text = change_car_btn.getText();
            Assert.assertEquals(change_car_btn_text, "Выбрать другой автомобиль");



//есть кнопка Сбросить все
            WebElement catalog_filter_clear_btn1 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class='catalog-filter__clear btn btn--grey-border btn--block btn--lg']"))));
            Boolean catalog_filter_clear_btn = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .textToBe(By.xpath("//*[@class = 'catalog-filter__clear btn btn--grey-border btn--block btn--lg']"), "Сбросить все фильтры")));




/*наличие текста Возможно, вас заинтересует:*/
            WebElement for_interest1 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//div[@class = 'catalog-cols__item loading-block__item listing']//div[@class='h4']"))));
            Boolean for_interest = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .textToBe(By.xpath("//div[@class = 'catalog-cols__item loading-block__item listing']//div[@class='h4']"), "Возможно, вас заинтересует:")));





            List<WebElement> for_interest_list = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'search-categories']"))));


//проверить url в одной из предлагаемых модификаций
            WebElement for_interest2 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class='search-categories__item'])[text() = '3.0 sd M57 D30 (306D5) 3 286 Дизель 2007-2010']"))));
            String for_interest2_text = for_interest2.getText();
            Assert.assertEquals(for_interest2_text, "3.0 sd M57 D30 (306D5) 3 286 Дизель 2007-2010");
            String for_interest2_url = for_interest2.getDomAttribute("href");
            Assert.assertEquals(for_interest2_url, "/catalog/avtoaksessuary/avtoshhetki-stekloochistitelja/podbor/bmw/x5/ii_e70_2006-2013/3_0_sd_m57_d30_306d5_3_286_diesel_2007-2010/");


/*кликнуть Выбрать другой авто*/
            change_car_btn.click();


/*кликнуть на другую модель*/
            WebElement select_new_model = driver.findElement(By.xpath("//*[@aria-labelledby='select2-mc-model-list-container']"));
            select_new_model.click();
            Thread.sleep(1000);

            WebElement model_BMW_7s = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .presenceOfElementLocated(By.xpath("(//*[@class = 'select2-results__option'])[text()='7-серия']"))));

            Actions select_model_BMW_7s = new Actions(driver);
            select_model_BMW_7s.moveToElement(model_BMW_7s).click(model_BMW_7s).perform();

            WebElement model_BMW_7s_selected = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id = 'select2-mc-model-list-container']"))));

            String selected_model_7s_title = model_BMW_7s_selected.getAttribute("title");
            Assert.assertEquals(selected_model_7s_title, "7-серия");
            String selected_model_7s_text = model_BMW_7s_selected.getText();
            Assert.assertEquals(selected_model_7s_text, "7-серия");


/*кликнуть Подобрать */
            WebElement submit_btn1 = driver.findElement(By.xpath("//button[@class = 'catalog-car-change__btn btn js-mc-filter-submit']"));
            submit_btn1.click();


/*дождаться исчезновения названия подбора*/
            WebDriverWait wait_change_catalog_car_name = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait_change_catalog_car_name.until(ExpectedConditions.stalenessOf(catalog_car_name));


/*новое название подбора*/
            Boolean catalog_car_name_new = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .textToBe(By.xpath("//*[@class = 'catalog-car__name mb-0 js-mc-filter-result__name']"), "BMW 7-серия")));


/*прежняя серия появилась в Возможно, вас заинтересует*/
            WebElement search_X5 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                     .until(ExpectedConditions
                             .visibilityOfElementLocated(By.xpath("(//*[@class = 'search-categories__item'])[text()='X5']"))));


/*кликнуть Сбросить все*/
            WebElement catalog_filter_clear_btn2 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class='catalog-filter__clear btn btn--grey-border btn--block btn--lg']"))));
            catalog_filter_clear_btn2.click();


/* поле Выберите марку очистилось, с плейсхолдером*/
            WebElement placeholder_marka1 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id = 'mc-mark-list']"))));
            String placeholder_marka_text1 = placeholder_marka1.getAttribute("data-placeholder");
            Assert.assertEquals(placeholder_marka_text1, "Выберите марку");


/* поле Выберите модель очистилось, с плейсхолдером*/
            WebElement placeholder_model1 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id = 'mc-model-list']"))));
            String placeholder_model_text1 = placeholder_model1.getAttribute("data-placeholder");
            Assert.assertEquals(placeholder_model_text1, "Выберите модель");


/* поле Поколение очистилось, с плейсхолдером*/
            WebElement placeholder_pokolenie1 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id = 'mc-series-list']"))));
            String placeholder_pokolenie_text1 = placeholder_pokolenie1.getAttribute("data-placeholder");
            Assert.assertEquals(placeholder_pokolenie_text1, "Поколение");


/* поле Выберите модификацию очистилось, с плейсхолдером*/
            WebElement placeholder_modification1 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@id = 'mc-modification-list']"))));
            String placeholder_modification_text1 = placeholder_modification1.getAttribute("data-placeholder");
            Assert.assertEquals(placeholder_modification_text1, "Выберите модификацию");


/*появился сео-текст с заголовком*/
            Boolean seotitle = new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions.textToBe(By.xpath("//*[@class = 'seo-block__title-txt']"), "Авто щетки стеклоочистителя"));


            Boolean seotext = new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions.attributeContains(By.xpath("//*[@class = 'seo-block__desc accordion__body']/p[text()]"), "textContent", "В каталоге представлены"));







            System.out.println("Автотест: Подборщик автощетки на странице категории - ОК");


        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            Thread.sleep(1000);
            driver.quit();
        }
    }
}

