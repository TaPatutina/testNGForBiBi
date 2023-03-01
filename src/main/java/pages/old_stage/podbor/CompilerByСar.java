package pages.old_stage.podbor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompilerByСar {
    private WebDriver driver;


    @FindBy (xpath = "//*[@class = 'filter-list__title filter-list__title--car']") private WebElement avtoshhetkiCarSelector;
    @FindBy (xpath = "//*[@class = 'car-selector']/label") private WebElement carMarka;
    @FindBy (xpath = "//*[@id = 'mc-mark-list']") private WebElement placeholderMarka;
    @FindBy (xpath = "//*[@aria-labelledby='select2-mc-mark-list-container']") private WebElement selectMarkaArea;
    @FindBy (xpath = "//*[@id = 'select2-mc-mark-list-results']/li[contains(text(),'BMW')]") private WebElement selectMarkaBmw;
    @FindBy (xpath = "//*[@id = 'select2-mc-mark-list-container']") private WebElement markaBmwSelected;
    @FindBy (xpath = "//*[@id = 'mc-model-list']") private WebElement placeholderModel;
    @FindBy (xpath = "//*[@aria-labelledby='select2-mc-model-list-container']") private WebElement selectModelArea;
    @FindBy (xpath = "//*[@id = 'select2-mc-model-list-results']/li[contains(text(),'X5')]") private WebElement modelBmwX5;
    @FindBy (xpath = "//*[@id = 'select2-mc-model-list-container']") private WebElement modelBmwX5Selected;
    @FindBy (xpath = "//*[@id = 'mc-series-list']") private WebElement placeholderPokolenie;
    @FindBy (xpath = "(//*[@class = 'select2 select2-container select2-container--default'])[2]") private WebElement selectPokolenieArea;
    @FindBy (xpath = "//*[@id = 'select2-mc-series-list-results']/li[contains(text(),'X5 II')]") private WebElement pokolenieBmwX5Ii;
    @FindBy (xpath = "//*[@id = 'select2-mc-series-list-container']") private WebElement seriesBmw_X5_II_Selected;
    @FindBy (xpath = "//*[@id = 'mc-modification-list']") private WebElement placeholderModification;
    @FindBy (xpath = "//*[@id = 'select2-mc-modification-list-container']") private WebElement selectModificationArea;
    @FindBy (xpath = "//*[@id = 'select2-mc-modification-list-results']/li[contains(text(),'3.0 d M57 D30 (306D3) 3 235 Дизель 2006-2010')]") private WebElement modificationBmwX5_II_306D3;
    @FindBy (xpath = "//*[@id = 'select2-mc-modification-list-container']") private WebElement modificationBmxX5_II_306D3_Selected;
    @FindBy (xpath = "(//*[@class = 'catalog-car-change__btn btn js-mc-filter-submit'])[text()='Подобрать']") private WebElement submitBtn;
    @FindBy (xpath = "//*[@class = 'catalog-cols__item loading-block__item listing']//li[@class ='product-card  '][1]") private WebElement productCard1;
    @FindBy (xpath = "//button[@class = 'catalog-car-change__btn btn js-mc-filter-change']") private WebElement changeCarBtn;
    @FindBy (xpath = "//*[@class='catalog-filter__clear btn btn--grey-border btn--block btn--lg']") private WebElement catalogFilterClearBtn;
    @FindBy (xpath = "//div[@class = 'catalog-cols__item loading-block__item listing']//div[@class='h4']") private WebElement forInterestText;
    @FindBy (xpath = "(//*[@class='search-categories__item'])[text() = '3.0 sd M57 D30 (306D5) 3 286 Дизель 2007-2010']") private WebElement tabModificationBmwX5_II_306D5;




    //Constructor
    public CompilerByСar(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public boolean isFilterListTitleText(){ return avtoshhetkiCarSelector.getText().toString().contentEquals("Подбор по автомобилю"); }
    public boolean isCarMarkaText(){ return carMarka.getText().contentEquals("Марка автомобиля"); }
    public boolean isPlaceholderMarkaText(){ return placeholderMarka.getAttribute("data-placeholder").contains("Выберите марку"); }
    public void clickSelectMarkaArea(){ selectMarkaArea.click();  }
    public void clickSelectMarkaBMW(){ selectMarkaBmw.click();  }
    public boolean isCarMarkaTextBMW(){ return markaBmwSelected.getText().contains("BMW"); }
    public boolean isPlaceholderModelText(){ return placeholderModel.getAttribute("data-placeholder").contains("Выберите модель"); }
    public void clickSelectModelArea(){ selectModelArea.click();  }
    public void clickModelBMW_X5(){ Actions actions = new Actions(driver);
        actions.moveToElement(modelBmwX5);
        actions.perform(); modelBmwX5.click();  }
    public boolean isSelectedModelX5(){ return modelBmwX5Selected.getText().contains("X5"); }
    public boolean isTitleModelX5(){ return modelBmwX5Selected.getAttribute("title").contains("X5"); }
    public boolean isPlaceholderSeriesText(){ return placeholderPokolenie.getAttribute("data-placeholder").contains("Поколение"); }
    public void clickSelectSeriesArea(){ selectPokolenieArea.click();  }
    public void clickSeriesBMW_X5_II(){ Actions actions = new Actions(driver);
        actions.moveToElement(pokolenieBmwX5Ii);
        actions.perform(); pokolenieBmwX5Ii.click();  }
    public boolean isSelectedSeriesBMW_X5_II(){ return seriesBmw_X5_II_Selected.getText().contains("X5 II"); }
    public boolean isTitleSeriesBMW_X5_II(){ return seriesBmw_X5_II_Selected.getAttribute("title").contains("X5 II"); }
    public boolean isPlaceholderModificationText(){ return placeholderModification.getAttribute("data-placeholder").contentEquals("Выберите модификацию"); } /*здесь убрала .toString()*/
    public void clickSelectModificationArea(){ selectModificationArea.click();  }
    public void clickModificationBMW_X5_II_306D3(){ Actions actions = new Actions(driver);
        actions.moveToElement(modificationBmwX5_II_306D3);
        actions.perform(); modificationBmwX5_II_306D3.click();  }
    public boolean isSelectedModificationBMW_X5_II_306D3(){ return modificationBmxX5_II_306D3_Selected.getText().contentEquals("3.0 d M57 D30 (306D3) 3 235 Дизель 2006-2010"); }
    public boolean isTitleModificationBMW_X5_II_306D3() { return modificationBmxX5_II_306D3_Selected.getAttribute("title").contentEquals("3.0 d M57 D30 (306D3) 3 235 Дизель 2006-2010"); }
    public void clickSubmit(){ submitBtn.click();  }
    public boolean isProductAutoBrush1() { return productCard1.getText().contains("Щетка стеклоочистителя"); }
    public boolean isChangeCarButton() { return changeCarBtn.getText().contentEquals("Выбрать другой автомобиль"); }
    public boolean isClearFilterButton() { return catalogFilterClearBtn.getText().contentEquals("Сбросить все фильтры"); }
    public boolean isForInterestText() { return forInterestText.getText().contentEquals("Возможно, вас заинтересует:"); }
    public String isURLmodificationBMW_X5_II_306D5(){ return tabModificationBmwX5_II_306D5.getDomAttribute("href"); }






















    }

