package pageObject.stage.podbor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompilerByСar {
    private WebDriver driver;


    @FindBy (xpath = "//*[@class = 'filter-list__title filter-list__title--car']") private WebElement avtoshhetki_car_selector;
    @FindBy (xpath = "//*[@class = 'car-selector']/label") private WebElement car_marka;
    @FindBy (xpath = "//*[@id = 'mc-mark-list']") private WebElement placeholder_marka;
    @FindBy (xpath = "//*[@aria-labelledby='select2-mc-mark-list-container']") private WebElement select_marka_area;
    @FindBy (xpath = "//*[@id = 'select2-mc-mark-list-results']/li[contains(text(),'BMW')]") private WebElement select_marka_BMW;
    @FindBy (xpath = "//*[@id = 'select2-mc-mark-list-container']") private WebElement marka_BMW_selected;
    @FindBy (xpath = "//*[@id = 'mc-model-list']") private WebElement placeholder_model;
    @FindBy (xpath = "//*[@aria-labelledby='select2-mc-model-list-container']") private WebElement select_model_area;
    @FindBy (xpath = "//*[@id = 'select2-mc-model-list-results']/li[contains(text(),'X5')]") private WebElement model_BMW_X5;
    @FindBy (xpath = "//*[@id = 'select2-mc-model-list-container']") private WebElement model_BMW_X5_selected;
    @FindBy (xpath = "//*[@id = 'mc-series-list']") private WebElement placeholder_pokolenie;
    @FindBy (xpath = "(//*[@class = 'select2 select2-container select2-container--default'])[2]") private WebElement select_pokolenie_area;
    @FindBy (xpath = "//*[@id = 'select2-mc-series-list-results']/li[contains(text(),'X5 II')]") private WebElement pokolenie_BMW_X5_II;
    @FindBy (xpath = "//*[@id = 'select2-mc-series-list-container']") private WebElement series_BMW_X5_II_selected;
    @FindBy (xpath = "//*[@id = 'mc-modification-list']") private WebElement placeholder_modification;
    @FindBy (xpath = "//*[@id = 'select2-mc-modification-list-container']") private WebElement select_modification_area;
    @FindBy (xpath = "//*[@id = 'select2-mc-modification-list-results']/li[contains(text(),'3.0 d M57 D30 (306D3) 3 235 Дизель 2006-2010')]") private WebElement modification_BMW_X5_II_306D3;
    @FindBy (xpath = "//*[@id = 'select2-mc-modification-list-container']") private WebElement modification_BMW_X5_II_306D3_selected;
    @FindBy (xpath = "(//*[@class = 'catalog-car-change__btn btn js-mc-filter-submit'])[text()='Подобрать']") private WebElement submit_btn;
    @FindBy (xpath = "//*[@class = 'catalog-cols__item loading-block__item listing']//li[@class ='product-card  '][1]") private WebElement product_card_1;
    @FindBy (xpath = "//button[@class = 'catalog-car-change__btn btn js-mc-filter-change']") private WebElement change_car_btn;
    @FindBy (xpath = "//*[@class='catalog-filter__clear btn btn--grey-border btn--block btn--lg']") private WebElement catalog_filter_clear_btn;
    @FindBy (xpath = "//div[@class = 'catalog-cols__item loading-block__item listing']//div[@class='h4']") private WebElement for_interest_text;
    @FindBy (xpath = "(//*[@class='search-categories__item'])[text() = '3.0 sd M57 D30 (306D5) 3 286 Дизель 2007-2010']") private WebElement tab_modification_BMW_X5_II_306D5;




    //Constructor
    public CompilerByСar(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public boolean isFilterListTitleText(){ return avtoshhetki_car_selector.getText().toString().contentEquals("Подбор по автомобилю"); }
    public boolean isCarMarkaText(){ return car_marka.getText().contentEquals("Марка автомобиля"); }
    public boolean isPlaceholderMarkaText(){ return placeholder_marka.getAttribute("data-placeholder").contains("Выберите марку"); }
    public void clickSelectMarkaArea(){ select_marka_area.click();  }
    public void clickSelectMarkaBMW(){ select_marka_BMW.click();  }
    public boolean isCarMarkaTextBMW(){ return marka_BMW_selected.getText().contains("BMW"); }
    public boolean isPlaceholderModelText(){ return placeholder_model.getAttribute("data-placeholder").contains("Выберите модель"); }
    public void clickSelectModelArea(){ select_model_area.click();  }
    public void clickModelBMW_X5(){ Actions actions = new Actions(driver);
        actions.moveToElement(model_BMW_X5);
        actions.perform(); model_BMW_X5.click();  }
    public boolean isSelectedModelX5(){ return model_BMW_X5_selected.getText().contains("X5"); }
    public boolean isTitleModelX5(){ return model_BMW_X5_selected.getAttribute("title").contains("X5"); }
    public boolean isPlaceholderSeriesText(){ return placeholder_pokolenie.getAttribute("data-placeholder").contains("Поколение"); }
    public void clickSelectSeriesArea(){ select_pokolenie_area.click();  }
    public void clickSeriesBMW_X5_II(){ Actions actions = new Actions(driver);
        actions.moveToElement(pokolenie_BMW_X5_II);
        actions.perform(); pokolenie_BMW_X5_II.click();  }
    public boolean isSelectedSeriesBMW_X5_II(){ return series_BMW_X5_II_selected.getText().contains("X5 II"); }
    public boolean isTitleSeriesBMW_X5_II(){ return series_BMW_X5_II_selected.getAttribute("title").contains("X5 II"); }
    public boolean isPlaceholderModificationText(){ return placeholder_modification.getAttribute("data-placeholder").contentEquals("Выберите модификацию"); } /*здесь убрала .toString()*/
    public void clickSelectModificationArea(){ select_modification_area.click();  }
    public void clickModificationBMW_X5_II_306D3(){ Actions actions = new Actions(driver);
        actions.moveToElement(modification_BMW_X5_II_306D3);
        actions.perform(); modification_BMW_X5_II_306D3.click();  }
    public boolean isSelectedModificationBMW_X5_II_306D3(){ return modification_BMW_X5_II_306D3_selected.getText().contentEquals("3.0 d M57 D30 (306D3) 3 235 Дизель 2006-2010"); }
    public boolean isTitleModificationBMW_X5_II_306D3() { return modification_BMW_X5_II_306D3_selected.getAttribute("title").contentEquals("3.0 d M57 D30 (306D3) 3 235 Дизель 2006-2010"); }
    public void clickSubmit(){ submit_btn.click();  }
    public boolean isProductAutoBrush1() { return product_card_1.getText().contains("Щетка стеклоочистителя"); }
    public boolean isChangeCarButton() { return change_car_btn.getText().contentEquals("Выбрать другой автомобиль"); }
    public boolean isClearFilterButton() { return catalog_filter_clear_btn.getText().contentEquals("Сбросить все фильтры"); }
    public boolean isForInterestText() { return for_interest_text.getText().contentEquals("Возможно, вас заинтересует:"); }
    public String isURLmodificationBMW_X5_II_306D5(){ return tab_modification_BMW_X5_II_306D5.getDomAttribute("href"); }






















    }

