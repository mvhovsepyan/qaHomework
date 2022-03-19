package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

public class SwagPage extends Base {

    WebDriver driver;

    public SwagPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement password;


    @FindBy(name = "login-button")
    WebElement submitBtn;


    @FindBy(css = "span[class=\"title\"]")
    WebElement productsPage;


    @FindBy(xpath = "//*[@class='product_sort_container']")
    WebElement selectPrice;

    @FindBy(xpath = "//*[@class='active_option']")
    WebElement activeFilter;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement jacket;

    @FindBy(xpath = "//*[@class='shopping_cart_link']")
    WebElement shoppingCart;

    @FindBy(xpath = "//*[@class='inventory_item_name']")
    WebElement isItemAdded;

    @FindBy(id = "checkout")
    WebElement checkout;

    @FindBy(id = "first-name")
    WebElement firstname;

    @FindBy(id = "last-name")
    WebElement lastname;

    @FindBy(id = "postal-code")
    WebElement postal;

    @FindBy(id = "continue")
    WebElement continueBtn;

    @FindBy(className = "summary_total_label")
    WebElement totalPrice;

    @FindBy(id = "finish")
    WebElement finishBtn;

    @FindBy(className = "complete-header")
    WebElement header;


    public void inputLogin() {
        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
    }

    public void clickOnSubmitBtn() {
        submitBtn.click();
    }


    public void isJacketAdded() {
        String text = isItemAdded.getText();
        Assert.assertEquals(text, "Sauce Labs Fleece Jacket", "the item is wrong");
    }

    public void openShoppingCart() {
        shoppingCart.click();
    }


    public void addJacketToCart() {
        jacket.click();
    }

    public String getFilterText() {
        return activeFilter.getText();
    }

    public void selectPrice() {
        Select select = new Select(selectPrice);
        select.selectByVisibleText("Price (low to high)");
    }

    public void isProductPageLoad() {
        if (productsPage != null && driver.getTitle().equals("Swag Labs")) {
            assertTrue(true, "Products Page loaded");
        } else {
            fail("Products Page not loaded");
        }
    }

    public void clickOnCheckout() {
        checkout.click();

    }

    public void clickOnFirstname() {
        firstname.sendKeys("asd");

    }

    public void clickOnLastname() {
        lastname.sendKeys("dsa");

    }

    public void clickOnPostal() {
        postal.sendKeys("sad");

    }

    public void clickOnContinueBtn() {
        continueBtn.click();
    }

    public void checkTotal() {
        Assert.assertTrue(totalPrice.getText().contains("53.99"));
    }

    public void clickOnFinishBtn() {
        finishBtn.click();
    }

    public void checkHeader() {
        Assert.assertTrue(header.getText().contains("THANK YOU FOR YOUR ORDER"));

    }
}

