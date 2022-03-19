package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class AutoAmPage {
    WebDriver driver;

    public AutoAmPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='filter-make']")
    WebElement mark;

    @FindBy(css = "[id='v-model']")
    WebElement model;

    @FindBy(css = "[name='year[gt]']")
    WebElement teslaYear;

    @FindBy(css = ".switch.bold")
    List<WebElement> cleared;

    @FindBy(xpath = "//*[@id='search-btn']")
    WebElement searchBtn;

    @FindBy(css = ".price.bold.blue-text")
    List<WebElement> searchResults;

    public boolean checkPrice(String price) {
        boolean priceCheck = false;
        for (WebElement element : searchResults) {
            if (element.getText().contains(price)) {
                priceCheck = true;
                return priceCheck;
            }
        }
        return priceCheck;
    }

    public void isPriceCorrect(String price){
        Assert.assertTrue(checkPrice(price));

    }
    public void selectDropDown(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void selectMark(String value){
        selectDropDown(mark, value);
    }

    public void selectModel(String value) {
        selectDropDown(model, value);
    }

    public void selectYear(String year) {
        selectDropDown(teslaYear, year);
    }

    public void customCheck(String opt) {
        for (WebElement elem:cleared) {
            if(elem.getText().contains(opt)){
                elem.click();
            }

        }

    }

    public void clickOnSearchBtn(){
        searchBtn.click();
    }
}
