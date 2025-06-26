package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addRandomProductsToCart(int count) {
        List<WebElement> products = driver.findElements(By.cssSelector(".fixed_wrapper .prdocutname"));
        int added = 0;
        for (int i = 0; i < products.size() && added < count; i++) {
            WebElement product = products.get(i);
            try {
                String name = product.getText();
                product.click();
                WebElement price = driver.findElement(By.cssSelector(".productfilneprice"));
                WebElement addButton = driver.findElement(By.cssSelector(".cart a"));
                addButton.click();
                System.out.println("✔ Added to cart: " + name + " | Price: " + price.getText());
                driver.navigate().back();
                added++;
            } catch (Exception e) {
                System.out.println("✖ Skipped (maybe out of stock): " + product.getText());
                driver.navigate().back();
            }
        }
    }
}
