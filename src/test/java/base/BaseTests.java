package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    private String url = "https://nimbleapproach.com/";

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        goHome();

        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get(url);
    }

    @AfterClass
    public  void tearDown() {
        driver.quit();
    }
}
