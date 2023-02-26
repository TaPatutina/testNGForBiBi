package pages.old_stage.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageBanners {
    private WebDriver driver;


    //общее
    @FindBy(xpath = "//*[@class='breadcrumbs__item']//span[text()='Главная']") private WebElement breadcrumbs_1;
    @FindBy(xpath = "(//*[@class='header-logo__img'])[2]") private WebElement logo_1;


    //широкий баннер
    @FindBy(xpath = "//*[@class='col-12 col-md-6 rotating-slider js-rotating-slider']") private WebElement banners_wide;
    @FindBy(xpath = "(//*[@class='banner rotating-slider__item js-rotating-slider__item active']//img)[1]") private WebElement banner_wide_active_img;
    @FindBy(xpath = "(//*[@class='col-12 col-md-6 rotating-slider js-rotating-slider']//picture)[1]") private WebElement banner_wide_1;
    @FindBy(xpath = "(//*[@class='col-12 col-md-6 rotating-slider js-rotating-slider']//picture)[2]") private WebElement banner_wide_2;
    @FindBy(xpath = "(//*[@class='col-12 col-md-6 rotating-slider js-rotating-slider']//picture)[3]") private WebElement banner_wide_3;
    @FindBy(xpath = "(//*[@class='slider-points'])[1]") private WebElement banner_wide_slider_points;
    @FindBy(xpath = "//*[@class='col-12 col-md-6 rotating-slider js-rotating-slider']//li[1]") private WebElement banner_wide_slider_point_1;
    @FindBy(xpath = "//*[@class='col-12 col-md-6 rotating-slider js-rotating-slider']//li[2]") private WebElement banner_wide_slider_point_2;


    //узкий баннер
    @FindBy(xpath = "//*[@class='col-12 col-md-4 rotating-slider']") private WebElement banners_thin;
    @FindBy(xpath = "(//*[@class='banner rotating-slider__item js-rotating-slider__item active']//img)[2]") private WebElement banner_thin_active_img;
    @FindBy(xpath = "(//*[@class='col-12 col-md-4 rotating-slider'])//li[1]") private WebElement banner_thin_slider_point_1;
    @FindBy(xpath = "(//*[@class='col-12 col-md-4 rotating-slider'])//li[2]") private WebElement banner_thin_slider_point_2;

    //верхний и нижний баннеры
    @FindBy(xpath = "//*[@class='col-12 col-md-4']/a") private WebElement banner_top;
    @FindBy(xpath = "//*[@class='col-12 col-md-4']//img") private WebElement banner_top_img;
    @FindBy(xpath = "//*[@class='col-12 col-md-8 d-md-flex a-items-md-end']/a") private WebElement banner_bottom;
    @FindBy(xpath = "//*[@class='col-12 col-md-8 d-md-flex a-items-md-end']//img") private WebElement banner_bottom_img;





    //Constructor
    public HomePageBanners(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }


    //общее
    public String isURL(){ return driver.getCurrentUrl();}
    public void clickOnBreadcrumbs_1(){breadcrumbs_1.click();  }
    public void clickOnLogo_1(){logo_1.click();  }


    //широкий баннер
    public String isBannerWideWithAltOpened(){ return banner_wide_active_img.getAttribute("alt"); }
    public boolean isActiveBannerWideSliderPoint1(){ return banner_wide_slider_point_1.getAttribute("class").contentEquals("js-rotating-slider__point active"); }
    public boolean isActiveBannerWideSliderPoint2(){ return banner_wide_slider_point_2.getAttribute("class").contentEquals("js-rotating-slider__point active"); }
    public void clickBannerWide(){ banners_wide.click();  }
    public void clickBannerWideSliderPoint1(){ banner_wide_slider_point_1.click();  }
    public void clickBannerWideSliderPoint2(){ banner_wide_slider_point_2.click();  }

    //узкий баннер
    public String isBannerThinWithAltOpened(){ return banner_thin_active_img.getAttribute("alt"); }
    public boolean isActiveBannerThinSliderPoint1(){ return banner_thin_slider_point_1.getAttribute("class").contentEquals("js-rotating-slider__point active"); }
    public boolean isActiveBannerThinSliderPoint2(){ return banner_thin_slider_point_2.getAttribute("class").contentEquals("js-rotating-slider__point active"); }
    public void clickBannerThin(){ banners_thin.click();  }
    public void clickBannerThinSliderPoint1(){ banner_thin_slider_point_1.click();  }
    public void clickBannerThinSliderPoint2(){ banner_thin_slider_point_2.click();  }

    //верхний и нижний баннеры
    public String isBannerTopWithAltOpened(){ return banner_top_img.getAttribute("alt"); }
    public void clickBannerTop(){ banner_top.click();  }
    public String isBannerBottomWithAltOpened(){ return banner_bottom_img.getAttribute("alt"); }
    public void clickBannerBottom(){ banner_bottom.click();  }













}
