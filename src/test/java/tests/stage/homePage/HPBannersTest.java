package tests.stage.homePage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.stage.homePage.HomePagePlashka;
import pageObject.stage.homePage.HomePageBanners;

import java.time.Duration;

public class HPBannersTest {


        WebDriver driver;


        @BeforeTest (groups = {"smokeTest", "regress"})
        public void setup() {
            System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().setSize(new Dimension(1400, 1300));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }





        @Test  (groups = {"smokeTest", "regress"})
        public void HPBannersTest() throws InterruptedException {
            try {
                driver.get("https://bi-bi.ru/");
                Thread.sleep(1000);


                //создать объект  HomePagePlashka
                HomePagePlashka homePagePlashka = new HomePagePlashka(driver);
                //согласиться с городом
                //homePagePlashka.clickAgreeWithTheCityIndex();
                //плашка закрылась
                Assert.assertFalse(homePagePlashka.isPanelOpenedIndex());





                //создать объект  IndexPageBanners
                HomePageBanners homePageBanners = new HomePageBanners(driver);



                //отображается Home Page Banner 2022 TOP
                String BannerTopWithAlt = homePageBanners.isBannerTopWithAltOpened();
                Assert.assertEquals(BannerTopWithAlt, "Home Page Banner 2022 TOP");
                //отображается Home Page Banner 2022 BOTTOM
                String BannerBottomWithAlt = homePageBanners.isBannerBottomWithAltOpened();
                Assert.assertEquals(BannerBottomWithAlt, "Home Page Banner 2022 BOTTOM");




                //отображается BannerWide_1
                String BannerWideWithAlt1 = homePageBanners.isBannerWideWithAltOpened();
                Assert.assertEquals(BannerWideWithAlt1, "banner_TCP");
                //активна точка1 слайдера BannerWide
                Assert.assertTrue(homePageBanners.isActiveBannerWideSliderPoint1());
                //неактивна точка2 слайдера BannerWide
                Assert.assertFalse(homePageBanners.isActiveBannerWideSliderPoint2());


                //отображается BannerThin_1
                String BannerThinWithAlt1 = homePageBanners.isBannerThinWithAltOpened();
                Assert.assertEquals(BannerThinWithAlt1, "Вертикальный баннер 1");
                //активна точка1 слайдера BannerThin
                Assert.assertTrue(homePageBanners.isActiveBannerThinSliderPoint1());
                //неактивна точка2 слайдера BannerThin
                Assert.assertFalse(homePageBanners.isActiveBannerThinSliderPoint2());


                //кликнуть на BannerWide_1
                homePageBanners.clickBannerWide();
                //откроется страница "https://bi-bi.ru/promo/promo-tcp/"
                String url_1 = homePageBanners.isURL();
                Assert.assertEquals(url_1, "https://bi-bi.ru/promo/promo-tcp/");
                //кликнуть на главную хлебную крошку, чтобы вернуться на HomePage
                homePageBanners.clickOnBreadcrumbs_1();



                //кликнуть на BannerThin_1
                homePageBanners.clickBannerThin();
                //откроется страница "https://bi-bi.ru/promo/"
                String url_2 = homePageBanners.isURL();
                Assert.assertEquals(url_2, "https://bi-bi.ru/promo/");
                //кликнуть на логотип, чтобы вернуться на HomePage
                homePageBanners.clickOnLogo_1();




                //кликнуть на BannerTop
                homePageBanners.clickBannerTop();
                //откроется страница "https://bi-bi.ru/"
                String url_3 = homePageBanners.isURL();
                Assert.assertEquals(url_3, "https://bi-bi.ru/");
                //кликнуть на главную хлебную крошку, чтобы вернуться на HomePage
                //homePageBanners.clickOnBreadcrumbs_1();




                //кликнуть на BannerBottom
                homePageBanners.clickBannerBottom();
                //откроется страница "https://bi-bi.ru/content/delivery"
                String url_4 = homePageBanners.isURL();
                Assert.assertEquals(url_4, "https://bi-bi.ru/content/delivery");
                //кликнуть на логотип, чтобы вернуться на HomePage
                homePageBanners.clickOnLogo_1();













                Thread.sleep(12000);



                //отображается BannerWide_2
                String BannerWideWithAlt2 = homePageBanners.isBannerWideWithAltOpened();
                Assert.assertEquals(BannerWideWithAlt2, "banner_SBER");
                //активна точка2 слайдера BannerWide
                Assert.assertTrue(homePageBanners.isActiveBannerWideSliderPoint2());
                //неактивна точка1 слайдера BannerWide
                Assert.assertFalse(homePageBanners.isActiveBannerWideSliderPoint1());



                //отображается BannerThin_2
                String BannerThinWithAlt2 = homePageBanners.isBannerThinWithAltOpened();
                Assert.assertEquals(BannerThinWithAlt2, "Вертикальный баннер 2");
                //активна точка2 слайдера BannerThin
                Assert.assertTrue(homePageBanners.isActiveBannerThinSliderPoint2());
                //неактивна точка1 слайдера BannerThin
                Assert.assertFalse(homePageBanners.isActiveBannerThinSliderPoint1());



                //кликнуть на точку1 слайдера BannerWide
                homePageBanners.clickBannerWideSliderPoint1();
                Thread.sleep(500);

                //отобразится BannerWide_1
                String BannerWideWithAlt12 = homePageBanners.isBannerWideWithAltOpened();
                Assert.assertEquals(BannerWideWithAlt12, "banner_TCP");



                //кликнуть на точку1 слайдера BannerThin
                homePageBanners.clickBannerThinSliderPoint1();
                //отобразится BannerThin_1
                String BannerThinWithAlt12 = homePageBanners.isBannerThinWithAltOpened();
                Assert.assertEquals(BannerThinWithAlt12, "Вертикальный баннер 1");









                System.out.println("HPBannersTest: Баннеры на гл.странице = ОК");
                Thread.sleep(100);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally  {
                Thread.sleep(50);
                driver.quit();
            }
        }
}