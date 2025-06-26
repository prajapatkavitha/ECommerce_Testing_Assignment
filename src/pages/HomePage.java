package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.get("https://automationteststore.com/");
    }

    public void clickRandomCategory() {
        List<WebElement> categories = driver.findElements(By.cssSelector("#categorymenu li a"));
        categories.get(new Random().nextInt(categories.size())).click();
    }
}
