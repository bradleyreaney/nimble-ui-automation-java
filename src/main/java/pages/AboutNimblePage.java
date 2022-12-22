package pages;

import org.openqa.selenium.WebDriver;

public class AboutNimblePage {

    private WebDriver driver;

    public AboutNimblePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAboutNimblePageTitle() {
        return driver.getTitle();
    }
}
