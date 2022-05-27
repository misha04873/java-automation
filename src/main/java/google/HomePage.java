package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(name = "q")
    WebElement searchInput;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void search(final String query) {
        searchInput.sendKeys(query);
        searchInput.submit();
    }
}
