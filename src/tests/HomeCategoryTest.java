package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.CategoryPage;
import pages.HomePage;
import utils.DriverFactory;

public class HomeCategoryTest {
    @BeforeClass
    public void setup() {
        DriverFactory.getDriver();
    }

    @Test
    public void testHomepageCategoryFlow() {
        HomePage homePage = new HomePage(DriverFactory.getDriver());
        homePage.navigate();
        homePage.clickRandomCategory();
        CategoryPage categoryPage = new CategoryPage(DriverFactory.getDriver());
        Assert.assertTrue(categoryPage.hasAtLeastThreeProducts(), "Less than 3 products found!");
    }

    @AfterClass
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
