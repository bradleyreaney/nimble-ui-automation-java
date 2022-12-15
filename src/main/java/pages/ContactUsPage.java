package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

    private WebDriver driver;
    private By nameField = By.cssSelector("input[name='your-name']");

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public String getNameSet() {
        return driver.findElement(nameField).getText();
    }
}
