package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://nimbleapproach.com/");
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
