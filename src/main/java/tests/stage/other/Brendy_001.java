package tests.stage.other;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Brendy_001 {
    WebDriver driver;




    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1400, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }



    @Test

    public void Brendy_001() throws InterruptedException {
        try {
            driver.get("https://bi-bi.ru/brendy");
            Thread.sleep(500);



            String title = driver.getTitle();
            Assert.assertEquals(title, "Бренды автозапчастей в каталоге интернет-магазина | Би-Би");



            WebElement description = driver.findElement(By.xpath("/html/head/meta[10]"));
            String descr = description.getDomProperty("content");
            Assert.assertEquals(descr, "Широкий выбор оригинальных автозапчастей в ассортименте каталога интернет-магазина Би-Би");



            /*согласиться с городом*/
            WebElement plashka = (new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.cssSelector("button.btn.btn--white.js-close-panel.js-region-select-link"))));


            plashka.click();




            List<WebElement> header = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'header-main header-main--search']"))));




            List<WebElement> breadcrumb_section = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='breadcrumb-section']"))));




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
                            .visibilityOfElementLocated(By.xpath("//*[@class='breadcrumbs__link is-active']"))));
            String breadcrumb2_text = breadcrumb2.getText();
            Assert.assertEquals(breadcrumb2_text, "Бренды");

            /*WebElement  breadcrumb2_itemprop = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions.not(ExpectedConditions
                    .presenceOfAllElementsLocatedBy(By.xpath("//*[@class='breadcrumbs__link is-active']")))));*/





            List<WebElement> section_alphabet = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'alphabet-index brands-list-page__alphabet-index']"))));




            List<WebElement> section_pop_brands = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("(//*[@class = 'section-brand list-brand-group__section-brand'])[1]"))));




            WebElement pop_brands = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class = 'section-brand list-brand-group__section-brand'])[1]//h2"))));
            String pop_brands_text = pop_brands.getText();
            Assert.assertEquals(pop_brands_text, "Популярные бренды");




            /* ----------- Переходы на стр букв со страницы всех брендов ----------- */





            WebElement symbol_A = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='symbol-A']/div/a/span)[1]"))));

            symbol_A.click();
            Thread.sleep(2000);


            List<WebElement> page_symbol_A = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='main-container']/section"))));


            WebElement breadcrumb_symbol_A = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='breadcrumb-list']/li)[3]"))));
            String breadcrumb_symbol_A_text = breadcrumb_symbol_A.getText();
            Assert.assertEquals(breadcrumb_symbol_A_text, "Бренды на A");


            WebElement h1_symbol_A = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'title-link__header']"))));
            String h1_symbol_A_text = h1_symbol_A.getText();
            Assert.assertEquals(h1_symbol_A_text, "Бренды на «A»43");





            WebElement breadcrumb_brendy = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@class='breadcrumbs__link'])[2]"))));
            String breadcrumb_brendy_text = breadcrumb_brendy.getText();
            Assert.assertEquals(breadcrumb_brendy_text, "Бренды");

            String breadcrumb_brendy_url = breadcrumb_brendy.getAttribute("href");
            Assert.assertEquals(breadcrumb_brendy_url, "https://bi-bi.ru/brendy/");

            String breadcrumb_brendy_itemprop = breadcrumb_brendy.getAttribute("itemprop");
            Assert.assertEquals(breadcrumb_brendy_itemprop, "item");

            breadcrumb_brendy.click();







            WebElement symbol_B = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='symbol-B']/div/a/span)[1]"))));

            symbol_B.click();

            List<WebElement> page_symbol_B = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='main-container']/section"))));

            WebElement breadcrumb_symbol_B = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='breadcrumb-list']/li)[3]"))));
            String breadcrumb_symbol_B_text = breadcrumb_symbol_B.getText();
            Assert.assertEquals(breadcrumb_symbol_B_text, "Бренды на B");

            WebElement h1_symbol_B = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'title-link__header']"))));
            String h1_symbol_B_text = h1_symbol_B.getText();
            Assert.assertEquals(h1_symbol_B_text, "Бренды на «B»25");

            driver.get("https://bi-bi.ru/brendy");





            WebElement symbol_C = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='symbol-C']/div/a/span)[1]"))));

            symbol_C.click();

            List<WebElement> page_symbol_C = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='main-container']/section"))));

            WebElement breadcrumb_symbol_C = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='breadcrumb-list']/li)[3]"))));
            String breadcrumb_symbol_C_text = breadcrumb_symbol_C.getText();
            Assert.assertEquals(breadcrumb_symbol_C_text, "Бренды на C");

            WebElement h1_symbol_C = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'title-link__header']"))));
            String h1_symbol_C_text = h1_symbol_C.getText();
            Assert.assertEquals(h1_symbol_C_text, "Бренды на «C»27");

            driver.get("https://bi-bi.ru/brendy");





            WebElement symbol_D = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='symbol-D']/div/a/span)[1]"))));

            symbol_D.click();

            List<WebElement> page_symbol_D = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='main-container']/section"))));

            WebElement breadcrumb_symbol_D = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='breadcrumb-list']/li)[3]"))));
            String breadcrumb_symbol_D_text = breadcrumb_symbol_D.getText();
            Assert.assertEquals(breadcrumb_symbol_D_text, "Бренды на D");

            WebElement h1_symbol_D = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'title-link__header']"))));
            String h1_symbol_D_text = h1_symbol_D.getText();
            Assert.assertEquals(h1_symbol_D_text, "Бренды на «D»21");

            driver.get("https://bi-bi.ru/brendy");





            WebElement symbol_E = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='symbol-E']/div/a/span)[1]"))));

            symbol_E.click();

            List<WebElement> page_symbol_E = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='main-container']/section"))));

            WebElement breadcrumb_symbol_E = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='breadcrumb-list']/li)[3]"))));
            String breadcrumb_symbol_E_text = breadcrumb_symbol_E.getText();
            Assert.assertEquals(breadcrumb_symbol_E_text, "Бренды на E");

            WebElement h1_symbol_E = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'title-link__header']"))));
            String h1_symbol_E_text = h1_symbol_E.getText();
            Assert.assertEquals(h1_symbol_E_text, "Бренды на «E»14");

            driver.get("https://bi-bi.ru/brendy");






            WebElement symbol_F = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='symbol-F']/div/a/span)[1]"))));

            symbol_F.click();

            List<WebElement> page_symbol_F = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='main-container']/section"))));

            WebElement breadcrumb_symbol_F = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='breadcrumb-list']/li)[3]"))));
            String breadcrumb_symbol_F_text = breadcrumb_symbol_F.getText();
            Assert.assertEquals(breadcrumb_symbol_F_text, "Бренды на F");

            WebElement h1_symbol_F = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'title-link__header']"))));
            String h1_symbol_F_text = h1_symbol_F.getText();
            Assert.assertEquals(h1_symbol_F_text, "Бренды на «F»27");

            driver.get("https://bi-bi.ru/brendy");






            WebElement symbol_G = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='symbol-G']/div/a/span)[1]"))));

            symbol_G.click();

            List<WebElement> page_symbol_G = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='main-container']/section"))));

            WebElement breadcrumb_symbol_G = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='breadcrumb-list']/li)[3]"))));
            String breadcrumb_symbol_G_text = breadcrumb_symbol_G.getText();
            Assert.assertEquals(breadcrumb_symbol_G_text, "Бренды на G");

            WebElement h1_symbol_G = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'title-link__header']"))));
            String h1_symbol_G_text = h1_symbol_G.getText();
            Assert.assertEquals(h1_symbol_G_text, "Бренды на «G»20");

            driver.get("https://bi-bi.ru/brendy");






            WebElement symbol_H = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='symbol-H']/div/a/span)[1]"))));

            symbol_H.click();

            List<WebElement> page_symbol_H = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='main-container']/section"))));

            WebElement breadcrumb_symbol_H = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='breadcrumb-list']/li)[3]"))));
            String breadcrumb_symbol_H_text = breadcrumb_symbol_H.getText();
            Assert.assertEquals(breadcrumb_symbol_H_text, "Бренды на H");

            WebElement h1_symbol_H = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'title-link__header']"))));
            String h1_symbol_H_text = h1_symbol_H.getText();
            Assert.assertEquals(h1_symbol_H_text, "Бренды на «H»13");

            driver.get("https://bi-bi.ru/brendy");






            WebElement symbol_I = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='symbol-I']/div/a/span)[1]"))));

            symbol_I.click();

            List<WebElement> page_symbol_I = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='main-container']/section"))));

            WebElement breadcrumb_symbol_I = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='breadcrumb-list']/li)[3]"))));
            String breadcrumb_symbol_I_text = breadcrumb_symbol_I.getText();
            Assert.assertEquals(breadcrumb_symbol_I_text, "Бренды на I");

            WebElement h1_symbol_I = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'title-link__header']"))));
            String h1_symbol_I_text = h1_symbol_I.getText();
            Assert.assertEquals(h1_symbol_I_text, "Бренды на «I»10");

            driver.get("https://bi-bi.ru/brendy");






            WebElement symbol_J = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='symbol-J']/div/a/span)[1]"))));

            symbol_J.click();

            List<WebElement> page_symbol_J = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='main-container']/section"))));

            WebElement breadcrumb_symbol_J = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='breadcrumb-list']/li)[3]"))));
            String breadcrumb_symbol_J_text = breadcrumb_symbol_J.getText();
            Assert.assertEquals(breadcrumb_symbol_J_text, "Бренды на J");

            WebElement h1_symbol_J = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'title-link__header']"))));
            String h1_symbol_J_text = h1_symbol_J.getText();
            Assert.assertEquals(h1_symbol_J_text, "Бренды на «J»2");

            driver.get("https://bi-bi.ru/brendy");






            WebElement symbol_K = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='symbol-K']/div/a/span)[1]"))));

            symbol_K.click();

            List<WebElement> page_symbol_K = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='main-container']/section"))));

            WebElement breadcrumb_symbol_K = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='breadcrumb-list']/li)[3]"))));
            String breadcrumb_symbol_K_text = breadcrumb_symbol_K.getText();
            Assert.assertEquals(breadcrumb_symbol_K_text, "Бренды на K");

            WebElement h1_symbol_K = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'title-link__header']"))));
            String h1_symbol_K_text = h1_symbol_K.getText();
            Assert.assertEquals(h1_symbol_K_text, "Бренды на «K»20");

            driver.get("https://bi-bi.ru/brendy");






            WebElement symbol_L = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='symbol-L']/div/a/span)[1]"))));

            symbol_L.click();

            List<WebElement> page_symbol_L = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='main-container']/section"))));

            WebElement breadcrumb_symbol_L = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='breadcrumb-list']/li)[3]"))));
            String breadcrumb_symbol_L_text = breadcrumb_symbol_L.getText();
            Assert.assertEquals(breadcrumb_symbol_L_text, "Бренды на L");

            WebElement h1_symbol_L = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'title-link__header']"))));
            String h1_symbol_L_text = h1_symbol_L.getText();
            Assert.assertEquals(h1_symbol_L_text, "Бренды на «L»19");

            driver.get("https://bi-bi.ru/brendy");

























            WebElement symbol_RU_SH = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='symbol-Ш']/div/a/span)[1]"))));

            symbol_RU_SH.click();

            List<WebElement> page_symbol_RU_SH = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='main-container']/section"))));

            WebElement breadcrumb_symbol_RU_SH = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='breadcrumb-list']/li)[3]"))));
            String breadcrumb_symbol_RU_SH_text = breadcrumb_symbol_RU_SH.getText();
            Assert.assertEquals(breadcrumb_symbol_RU_SH_text, "Бренды на Ш");

            WebElement h1_symbol_RU_SH = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'title-link__header']"))));
            String h1_symbol_RU_SH_text = h1_symbol_RU_SH.getText();
            Assert.assertEquals(h1_symbol_RU_SH_text, "Бренды на «Ш»2");

            driver.get("https://bi-bi.ru/brendy");







            WebElement symbol_3 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='symbol-3']/div/a/span)[1]"))));

            symbol_3.click();

            List<WebElement> page_symbol_3 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='main-container']/section"))));

            WebElement breadcrumb_symbol_3 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("(//*[@id='breadcrumb-list']/li)[3]"))));
            String breadcrumb_symbol_3_text = breadcrumb_symbol_3.getText();
            Assert.assertEquals(breadcrumb_symbol_3_text, "Бренды на 3");

            WebElement h1_symbol_3 = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfElementLocated(By.xpath("//*[@class = 'title-link__header']"))));
            String h1_symbol_3_text = h1_symbol_3.getText();
            Assert.assertEquals(h1_symbol_3_text, "Бренды на «3»3");

            driver.get("https://bi-bi.ru/brendy");





            /* ----------- Окончание блока переходов на стр букв со страницы всех брендов ----------- */

            List<WebElement> footer = (new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions
                            .visibilityOfAllElementsLocatedBy(By.xpath("//*[@class = 'footer-main']"))));



            System.out.println("Brendy_001: Переходы на стр букв en_A-L, ru_Ш, цифру 3 со страницы всех брендов - ОК");


        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            Thread.sleep(100);
            driver.quit();
        }
    }
}