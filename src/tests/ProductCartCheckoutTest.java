package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;
import utils.DriverFactory;

public class ProductCartCheckoutTest {
    @BeforeClass
    public void setup() {
        DriverFactory.getDriver();
    }

    @Test
    public void testProductSelectionAndCart() {
        HomePage home = new HomePage(DriverFactory.getDriver());
        home.navigate();
        home.clickRandomCategory();
        ProductPage productPage = new ProductPage(DriverFactory.getDriver());
        productPage.addRandomProductsToCart(2);
        CartPage cartPage = new CartPage(DriverFactory.getDriver());
        cartPage.navigateToCart();
        Assert.assertTrue(cartPage.isProductInCart(""), "Products not found in cart.");
    }

    @Test
    public void testRegistrationValidation() {
        DriverFactory.getDriver().get("https://automationteststore.com/index.php?rt=account/create");
        RegistrationPage regPage = new RegistrationPage(DriverFactory.getDriver());
        regPage.fillFormWithMissingField("testdata.csv");
        regPage.submitForm();
        Assert.assertTrue(regPage.isValidationErrorDisplayed(), "Validation error not displayed");
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
