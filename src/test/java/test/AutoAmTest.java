package test;


import base.Base;
import org.testng.annotations.Test;
import pages.AutoAmPage;
import pages.GooglePage;

public class AutoAmTest extends Base {
    GooglePage googlePage;
    AutoAmPage autoAmPage;

    @Test
    public void teslaTest() throws InterruptedException {
        googlePage = new GooglePage(driver);
        autoAmPage = new AutoAmPage(driver);
        driver.get("https://www.google.com/");
        googlePage.searchGoogle("Auto.am");
        googlePage.autoAmClick();
        autoAmPage.selectMark("Tesla");
        autoAmPage.selectModel("Model Y");
        autoAmPage.selectYear("2018");
        autoAmPage.customCheck("Մաքսազերծված");
        autoAmPage.clickOnSearchBtn();
        autoAmPage.isPriceCorrect("$ 67 000");
    }
}
