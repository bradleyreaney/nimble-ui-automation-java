package pages;

import org.openqa.selenium.WebDriver;

public class SuccessStoriesPage {

    private WebDriver driver;

    public SuccessStoriesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSuccessStoriesPageTitle() {
        return driver.getTitle();
    }
}
