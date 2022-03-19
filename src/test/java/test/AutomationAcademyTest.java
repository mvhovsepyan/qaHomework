package test;

import base.Base;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.AutomationAcademyPage;

public class AutomationAcademyTest extends Base {
    AutomationAcademyPage automationAcademyPage;


    @Test
    public void verifyRadioBtn(){
        automationAcademyPage = new AutomationAcademyPage(driver);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        automationAcademyPage.clickOnRadioButton();
    }

    @Test
    public void verifyInputField(){
        automationAcademyPage = new AutomationAcademyPage(driver);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        automationAcademyPage.inputCountry("Armenia");
    }

    @Test
    public void verifySelectingDropdown(){
        automationAcademyPage = new AutomationAcademyPage(driver);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        automationAcademyPage.dropdownExample();
    }

    @Test
    public void verifyCheckbox(){
        automationAcademyPage = new AutomationAcademyPage(driver);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        automationAcademyPage.checkBoxOption1();
    }

    @Test
    public void textText(){
        automationAcademyPage = new AutomationAcademyPage(driver);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Assert.assertTrue(automationAcademyPage.getText().equals("Advanced Selenium Framework Pageobject, TestNG, Maven, Jenkins,C"));
    }



    @Test
    public void verifyRadioButton() {
        automationAcademyPage = new AutomationAcademyPage(driver);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        automationAcademyPage.dropdownExample();
        automationAcademyPage.checkBoxOption1();
        automationAcademyPage.switchWindow();
        automationAcademyPage.switchTab();
        automationAcademyPage.switchToAlert();


    }
}
