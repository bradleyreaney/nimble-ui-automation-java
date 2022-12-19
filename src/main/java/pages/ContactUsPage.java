package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {

    private WebDriver driver;
    private By nameField = By.cssSelector("input[placeholder='Name*']");
    private By organisationField = By.cssSelector("input[placeholder='Organisation Name']");
    private By emailField = By.cssSelector("input[placeholder='Company Email*']");
    private By dropdownArrow = By.className("select2-selection--single");
    private By dropdownOption = By.xpath("//li[text()='Improve a product or service']");
    private By dropdownText = By.className("select2-selection__rendered");
    private By findUsField = By.cssSelector("input[placeholder='How did you find us?']");
    private By messageField = By.cssSelector("[placeholder='Message*']");
    private By submitButton = By.className("wpcf7-submit");
    private By emailFormatErrorMessage = By.className("wpcf7-not-valid-tip");
    private By incompleteFormErrorMessage = By.className("wpcf7-response-output");


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

    public void selectDropdownOption() {
        driver.findElement(dropdownArrow).click();
        driver.findElement(dropdownOption).click();
    }

    public String getDropDownSet() {
        return driver.findElement(dropdownText).getText();
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

    public void clickSubmitButton() {
        WebElement submitButton = driver.findElement(By.className("wpcf7-submit"));
        if (submitButton.isDisplayed()) {
            submitButton.click();
        }
    }

    public String getEmailFormatErrorMessage() {
        return driver.findElement(emailFormatErrorMessage).getText();
    }

    public String getIncompleteFormErrorMessage() {
        return driver.findElement(incompleteFormErrorMessage).getText();
    }
}