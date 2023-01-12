package pages;

import org.openqa.selenium.WebDriver;

public class CareersPage {

    private final WebDriver driver;

    public CareersPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCareersPageTitle() {
        return driver.getTitle();
    }
}
