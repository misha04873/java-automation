package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(final String query) {
        driver.findElement(By.name("q")).sendKeys(query);
        driver.findElement(By.name("q")).submit();
    }
}
