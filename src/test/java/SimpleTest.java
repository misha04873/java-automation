
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SimpleTest {

    public WebDriver driver ;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }

    @Test
    public void simpleTest() {
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.name("q")).sendKeys("java");
        driver.findElement(By.name("q")).submit();
        String title = driver.getTitle();
        Assert.assertEquals(title,"java - Пошук Google");
        System.out.println("test");
    }


}
