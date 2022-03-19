package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "a[href='https://auto.am/']")
    WebElement autoAmLink;

    @FindBy(css = "[name = 'btnK']")
    WebElement googleSearchButton;

    @FindBy(css = "[name = 'q']")
    WebElement googleSearchField;


    public void searchGoogle(String searchText){
        googleSearchField.clear();
        googleSearchField.sendKeys(searchText);
        googleSearchButton.click();
    }

    public void autoAmClick(){
        autoAmLink.click();
    }


}
