package pages;

import org.openqa.selenium.WebDriver;

public class BlogPage {

    private WebDriver driver;

    public BlogPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getBlogPageTitle() {
        return driver.getTitle();
    }
}
