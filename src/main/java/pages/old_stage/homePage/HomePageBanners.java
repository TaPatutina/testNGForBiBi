package pages.old_stage.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageBanners {
    private WebDriver driver;


    //общее
    @FindBy(xpath = "//*[@class='breadcrumbs__item']//span[text()='Главная']") private WebElement breadcrumbs1;
    @FindBy(xpath = "(//*[@class='header-logo__img'])[2]") private WebElement logo1;


    //широкий баннер
    @FindBy(xpath = "//*[@class='col-12 col-md-6 rotating-slider js-rotating-slider']") private WebElement bannersWide;
    @FindBy(xpath = "(//*[@class='banner rotating-slider__item js-rotating-slider__item active']//img)[1]") private WebElement bannerWideActiveImg;
    @FindBy(xpath = "(//*[@class='col-12 col-md-6 rotating-slider js-rotating-slider']//picture)[1]") private WebElement bannerWide1;
    @FindBy(xpath = "(//*[@class='col-12 col-md-6 rotating-slider js-rotating-slider']//picture)[2]") private WebElement bannerWide2;
    @FindBy(xpath = "(//*[@class='col-12 col-md-6 rotating-slider js-rotating-slider']//picture)[3]") private WebElement bannerWide3;
    @FindBy(xpath = "(//*[@class='slider-points'])[1]") private WebElement bannerWideSliderPoints;
    @FindBy(xpath = "//*[@class='col-12 col-md-6 rotating-slider js-rotating-slider']//li[1]") private WebElement bannerWideSliderPoint1;
    @FindBy(xpath = "//*[@class='col-12 col-md-6 rotating-slider js-rotating-slider']//li[2]") private WebElement bannerWideSliderPoint2;


    //узкий баннер
    @FindBy(xpath = "//*[@class='col-12 col-md-4 rotating-slider']") private WebElement bannersThin;
    @FindBy(xpath = "(//*[@class='banner rotating-slider__item js-rotating-slider__item active']//img)[2]") private WebElement bannerThinActiveImg;
    @FindBy(xpath = "(//*[@class='col-12 col-md-4 rotating-slider'])//li[1]") private WebElement bannerThinSliderPoint1;
    @FindBy(xpath = "(//*[@class='col-12 col-md-4 rotating-slider'])//li[2]") private WebElement bannerThinSliderPoint2;

    //верхний и нижний баннеры
    @FindBy(xpath = "//*[@class='col-12 col-md-4']/a") private WebElement bannerTop;
    @FindBy(xpath = "//*[@class='col-12 col-md-4']//img") private WebElement bannerTopImg;
    @FindBy(xpath = "//*[@class='col-12 col-md-8 d-md-flex a-items-md-end']/a") private WebElement bannerBottom;
    @FindBy(xpath = "//*[@class='col-12 col-md-8 d-md-flex a-items-md-end']//img") private WebElement bannerBottomImg;





    //Constructor
    public HomePageBanners(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }


    //общее
    public String isURL(){ return driver.getCurrentUrl();}
    public void clickOnBreadcrumbs_1(){
        breadcrumbs1.click();  }
    public void clickOnLogo_1(){
        logo1.click();  }


    //широкий баннер
    public String isBannerWideWithAltOpened(){ return bannerWideActiveImg.getAttribute("alt"); }
    public boolean isActiveBannerWideSliderPoint1(){ return bannerWideSliderPoint1.getAttribute("class").contentEquals("js-rotating-slider__point active"); }
    public boolean isActiveBannerWideSliderPoint2(){ return bannerWideSliderPoint2.getAttribute("class").contentEquals("js-rotating-slider__point active"); }
    public void clickBannerWide(){ bannersWide.click();  }
    public void clickBannerWideSliderPoint1(){ bannerWideSliderPoint1.click();  }
    public void clickBannerWideSliderPoint2(){ bannerWideSliderPoint2.click();  }

    //узкий баннер
    public String isBannerThinWithAltOpened(){ return bannerThinActiveImg.getAttribute("alt"); }
    public boolean isActiveBannerThinSliderPoint1(){ return bannerThinSliderPoint1.getAttribute("class").contentEquals("js-rotating-slider__point active"); }
    public boolean isActiveBannerThinSliderPoint2(){ return bannerThinSliderPoint2.getAttribute("class").contentEquals("js-rotating-slider__point active"); }
    public void clickBannerThin(){ bannersThin.click();  }
    public void clickBannerThinSliderPoint1(){ bannerThinSliderPoint1.click();  }
    public void clickBannerThinSliderPoint2(){ bannerThinSliderPoint2.click();  }

    //верхний и нижний баннеры
    public String isBannerTopWithAltOpened(){ return bannerTopImg.getAttribute("alt"); }
    public void clickBannerTop(){ bannerTop.click();  }
    public String isBannerBottomWithAltOpened(){ return bannerBottomImg.getAttribute("alt"); }
    public void clickBannerBottom(){ bannerBottom.click();  }













}
