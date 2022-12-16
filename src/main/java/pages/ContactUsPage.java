package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.tracing.Span;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

    private WebDriver driver;
    private By nameField = By.cssSelector("input[placeholder='Name*']");
    private By organisationField = By.cssSelector("input[placeholder='Organisation Name']");
    private By emailField = By.cssSelector("input[placeholder='Company Email*']");
    private By dropdown = By.className("select2-selection__arrow");
    private By findUsField = By.cssSelector("input[placeholder='How did you find us?']");
    private By messageField = By.cssSelector("[placeholder='Message*']");


    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setName(String text) {
        driver.findElement(nameField).sendKeys(text);
    }

    public String getNameSet() {
        return driver.findElement(nameField).getText();
    }

    public void setOrganisation(String text) {
        driver.findElement(organisationField).sendKeys(text);
    }

    public String getOrganisationSet() {
        return driver.findElement(organisationField).getText();
    }

    public void setEmail(String text) {
        driver.findElement(emailField).sendKeys(text);
    }

    public String getEmailSet() {
        return driver.findElement(emailField).getText();
    }

    private Select findDropDownElement() {
        return new Select(driver.findElement(dropdown));
    }

    public void selectFromDropDown(String option) {
        findDropDownElement().selectByVisibleText(option);
    }

    public String getDropDownSet() {
        return driver.findElement(dropdown).getText();
    }

    public void setFindUs(String text) {
        driver.findElement(findUsField).sendKeys(text);
    }

    public String getFindUsSet() {
        return driver.findElement(findUsField).getText();
    }

    public void setMessage(String text) {
        driver.findElement(messageField).sendKeys(text);
    }

    public String getMessageSet() {
        return driver.findElement(messageField).getText();
    }
}
