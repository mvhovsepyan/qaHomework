package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AutomationAcademyPage {

    WebDriver driver;

    public void select(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public AutomationAcademyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy(css = "[value='radio1']")
    WebElement radioButton;
    @FindBy(id = "autocomplete")
    WebElement SuggestionClassExample;
    @FindBy(id = "dropdown-class-example")
    WebElement dropdownExample;
    @FindBy(id = "checkBoxOption1")
    WebElement checkBoxOption1;
    @FindBy(id="openwindow")
    WebElement switchWindow;
    @FindBy(id="opentab")
    WebElement switchTab;
    @FindBy(id="name")
    WebElement switchToAlert;
    @FindBy(name = "courses")
    WebElement  webTable;
    @FindBy(xpath = "((//*[@name='courses']/tbody/tr)[10]/td)[2]")
    WebElement text;
    @FindBy(id="hide-textbox")
    WebElement hide;
    @FindBy(xpath = "//*[@id='product'][1]")
    WebElement prod;

    public String getText(){
        return text.getText();
    }


    public void clickOnRadioButton() {
        radioButton.click();
    }

    public void inputCountry(String value) {
        SuggestionClassExample.click();
        SuggestionClassExample.sendKeys(value);
    }

    public void dropdownExample() {
        Select select = new Select(dropdownExample);
        select.selectByValue("option2");
    }

    public void checkBoxOption1() {
        checkBoxOption1.click();
    }



    public void switchWindow(){
        switchWindow.click();
    }
    public void switchTab(){
        switchTab.click();
    }
    public void switchToAlert(){
        switchToAlert.click();
        switchToAlert.sendKeys("Vardan");

    }
    public void webTable () {
        webTable.click();
    }

    public String preLastRawTextOfTable() {
        List<WebElement> tr = webTable.findElements(By.tagName("tr"));
        WebElement preLasTr = tr.get(tr.size() - 2);
        return preLasTr.findElements(By.tagName("td")).get(1).getText();
    }
    public void clickOnHide(){
        hide.click();
    }

    public List<String> findSecondRowOfProductTable() {
        List<String> values = new LinkedList<>();
        List<WebElement> tr = prod.findElements(By.tagName("tr"));
        WebElement secondRow = tr.get(1);
        values.add(secondRow.findElements(By.tagName("td")).get(0).getText());
        values.add(secondRow.findElements(By.tagName("td")).get(1).getText());
        values.add(secondRow.findElements(By.tagName("td")).get(2).getText());
        values.add(secondRow.findElements(By.tagName("td")).get(3).getText());

        return values;
    }



}