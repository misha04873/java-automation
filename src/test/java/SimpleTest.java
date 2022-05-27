import google.HomePage;
import google.SearchResultsPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SimpleTest {

    final DriverWrapper driverWrapper = new DriverWrapper();

    @BeforeTest
    public void setUp() {
        driverWrapper.setUp();
    }

    @AfterTest
    public void tearDown() {
        driverWrapper.tearDown();
    }

    @Test
    public void searchTest() {
        HomePage homePage = new HomePage(driverWrapper.getDriver());
        homePage.search("java");
        SearchResultsPage searchResultsPage = new SearchResultsPage(driverWrapper.getDriver());
        searchResultsPage.printTitle();
    }


}
