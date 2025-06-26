<placeholder - already displayed>package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;

public class CategoryPage {
    WebDriver driver;

    public CategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean hasAtLeastThreeProducts() {
        List<WebElement> products = driver.findElements(By.cssSelector(".fixed_wrapper .prdocutname"));
        return products.size() >= 3;
    }
}
