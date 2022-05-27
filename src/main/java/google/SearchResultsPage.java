package google;

import org.openqa.selenium.WebDriver;

public class SearchResultsPage {

    final WebDriver driver;


    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void printTitle() {
        System.out.println(driver.getTitle());
    }
}
