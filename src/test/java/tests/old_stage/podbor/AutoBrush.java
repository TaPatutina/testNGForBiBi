package tests.old_stage.podbor;

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
import pages.old_stage.header.Plashka;
import pages.old_stage.podbor.CompilerByСar;

import java.time.Duration;

public class AutoBrush {
    WebDriver driver;


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1400, 1300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }


    @Test
    public void PodborAvtoshhetki() throws InterruptedException {
        try {
            //открыть страницу каталога
            driver.get("https://stageim.tomail.ru/catalog/avtoaksessuary/avtoshhetki-stekloochistitelja/");
            Thread.sleep(1000);


            //проверить title
            String title = driver.getTitle();
            Assert.assertEquals(title, "Щетки стеклоочистителя: купить дворники автомобильные по цене от 78 рублей");


            //проверить description
            WebElement description = driver.findElement(By.xpath("/html/head/meta[6]"));
            String descr = description.getDomProperty("content");
            Assert.assertEquals(descr, "В интернет-магазине «БИ-БИ» представлен большой выбор различных дворников в машину! Цены на дворники от 78 рублей!");


            //создать объект Plashka
            Plashka plashka = new Plashka(driver);


            //согласиться с городом
            plashka.clickAgreeWithTheCity();


            //создать объект CompilerByСar
            CompilerByСar compilerByCar = new CompilerByСar(driver);


            //заголовок подборщика Подбор по автомобилю
            Assert.assertTrue(compilerByCar.isFilterListTitleText());


            // текст Марка автомобиля
            Assert.assertTrue(compilerByCar.isCarMarkaText());


            //поле Выберите марку пустое, с плейсхолдером Выберите марку
            Assert.assertTrue(compilerByCar.isPlaceholderMarkaText());


            //кликнуть на поле выбора марки
            compilerByCar.clickSelectMarkaArea();


            //кликнуть на первую марку в селекте (BMW)
            compilerByCar.clickSelectMarkaBMW();


            //выбрана марка BMW
            Assert.assertTrue(compilerByCar.isCarMarkaTextBMW());


            //поле Выберите модель пустое, с плейсхолдером Выберите модель
            Assert.assertTrue(compilerByCar.isPlaceholderModelText());


            //кликнуть на поле Выберите модель
            compilerByCar.clickSelectModelArea();

            Thread.sleep(500);


            //выбрать модель BMW X5
            compilerByCar.clickModelBMW_X5();


            //модель BMW X5 отмечена как выбранная
            Assert.assertTrue(compilerByCar.isSelectedModelX5());


            //при наведении курсора на модель отображается "X5"
            Assert.assertTrue(compilerByCar.isTitleModelX5());


            //поле поколения пустое, с плейсхолдером "Поколение"
            Assert.assertTrue(compilerByCar.isPlaceholderSeriesText());


            //кликнуть на поле Поколение
            compilerByCar.clickSelectSeriesArea();


            //выбрать поколение BMW_X5_II
            compilerByCar.clickSeriesBMW_X5_II();


            //серия BMW X5 II отмечена как выбранная
            Assert.assertTrue(compilerByCar.isSelectedSeriesBMW_X5_II());


            //при наведении курсора на модель отображается "X5 II"
            Assert.assertTrue(compilerByCar.isTitleSeriesBMW_X5_II());


            //поле модификации пустое, с плейсхолдером Выберите модификацию
            Assert.assertTrue(compilerByCar.isPlaceholderModificationText());


            //кликнуть на поле модификации
            compilerByCar.clickSelectModificationArea();


            //выбрать модификацию BMW_X5_II_3.0 d M57 D30 (306D3) 3 235 Дизель 2006-2010
            compilerByCar.clickModificationBMW_X5_II_306D3();


            //модификация BMW_X5_II_3.0 d M57 D30 (306D3) 3 235 Дизель 2006-2010 отмечена как выбранная
            Assert.assertTrue(compilerByCar.isSelectedModificationBMW_X5_II_306D3());


            //при наведении курсора на модификацию  отображается "BMW_X5_II_3.0 d M57 D30 (306D3) 3 235 Дизель 2006-2010"
            Assert.assertTrue(compilerByCar.isTitleModificationBMW_X5_II_306D3());


            //кликнуть Подобрать
            compilerByCar.clickSubmit();


            // url меняется
            WebDriverWait wait_new_url = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait_new_url.until(ExpectedConditions.urlToBe("https://stageim.tomail.ru/catalog/avtoaksessuary/avtoshhetki-stekloochistitelja/podbor/bmw/x5/ii_e70_2006-2013/3_0_d_m57_d30_306d3_3_235_diesel_2006-2010/"));


            //есть кнопка Выбрать другой автомобиль
            Assert.assertTrue(compilerByCar.isChangeCarButton());


            //есть кнопка Сбросить все
            Assert.assertTrue(compilerByCar.isClearFilterButton());



            //появилась минимум 1 карточка товара
            Assert.assertTrue(compilerByCar.isProductAutoBrush1());


            //есть текст Возможно, вас заинтересует:
            Assert.assertTrue(compilerByCar.isForInterestText());


            //проверить url в одной из предлагаемых модификаций (3.0 sd M57 D30 (306D5) 3 286 Дизель 2007-2010)
            String tab_306D5_url = compilerByCar.isURLmodificationBMW_X5_II_306D5();
            Assert.assertEquals(tab_306D5_url, "/catalog/avtoaksessuary/avtoshhetki-stekloochistitelja/podbor/bmw/x5/ii_e70_2006-2013/3_0_sd_m57_d30_306d5_3_286_diesel_2007-2010/");




            Thread.sleep(1000);
            System.out.println("Автотест: Подборщик автощетки на странице категории - ОК");

        } catch (InterruptedException e) {
            e.printStackTrace();

        } finally {
            Thread.sleep(1000);
            driver.quit();
        }
    }
}