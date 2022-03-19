package test;

import base.Base;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.SwagPage;

public class SwagTest extends Base {
    SwagPage automationSwagPage;


    @Test
    public void verifyRadioBtn() throws InterruptedException {
        automationSwagPage = new SwagPage(driver);
        driver.get("https://www.saucedemo.com/");
        automationSwagPage.inputLogin();
        automationSwagPage.clickOnSubmitBtn();
        automationSwagPage.isProductPageLoad();
        automationSwagPage.selectPrice();
        Assert.assertEquals("PRICE (LOW TO HIGH)", automationSwagPage.getFilterText());
        automationSwagPage.addJacketToCart();
        Thread.sleep(1000);
        automationSwagPage.openShoppingCart();
        automationSwagPage.isJacketAdded();
        automationSwagPage.clickOnCheckout();
        automationSwagPage.clickOnFirstname();
        automationSwagPage.clickOnLastname();
        automationSwagPage.clickOnPostal();
        automationSwagPage.clickOnContinueBtn();
        automationSwagPage.checkTotal();
        automationSwagPage.clickOnFinishBtn();
        automationSwagPage.checkHeader();

    }

}

