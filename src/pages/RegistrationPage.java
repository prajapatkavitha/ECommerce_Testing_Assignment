package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CSVReaderUtil;
import java.util.List;

public class RegistrationPage {
    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillFormWithMissingField(String csvPath) {
        List<String[]> data = CSVReaderUtil.readCSV(csvPath);
        String[] user = data.get(1);
        driver.findElement(By.name("firstname")).sendKeys(user[0]);
        // Missing lastname intentionally
        driver.findElement(By.name("email")).sendKeys(user[2]);
        driver.findElement(By.name("password")).sendKeys(user[3]);
    }

    public void submitForm() {
        driver.findElement(By.cssSelector("button[title='Continue']")).click();
    }

    public boolean isValidationErrorDisplayed() {
        return driver.getPageSource().contains("required");
    }
}
