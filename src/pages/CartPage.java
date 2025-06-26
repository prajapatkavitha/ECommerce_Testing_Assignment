package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToCart() {
        driver.findElement(By.cssSelector("#topnav a[title='Cart']")).click();
    }

    public boolean isProductInCart(String productName) {
        return driver.getPageSource().contains(productName);
    }
}
