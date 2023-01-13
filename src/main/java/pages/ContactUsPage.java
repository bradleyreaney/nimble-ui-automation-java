package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ContactUsPage {

    private final WebDriver driver;
    private final By nameField = By.cssSelector("input[placeholder='Name*']");
    private final By organisationField = By.cssSelector("input[placeholder='Organisation Name']");
    private final By emailField = By.cssSelector("input[placeholder='Company Email*']");
    private final By dropdownArrow = By.className("select2-selection--single");
    private final By dropdownOption = By.xpath("//li[text()='Improve a product or service']");
    private final By dropdownText = By.className("select2-selection__rendered");
    private final By findUsField = By.cssSelector("input[placeholder='How did you find us?']");
    private final By messageField = By.cssSelector("[placeholder='Message*']");
    private final By pageHeading = By.cssSelector("h1");
    private final By submitButton = By.className("wpcf7-submit");
    private final By incompleteFormErrorMessage = By.className("wpcf7-response-output");
    private final By emailFormatErrorMessage = By.className("wpcf7-not-valid-tip");

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setName(String text) {
        driver.findElement(nameField).sendKeys(text);
    }

    public String getNameSet() {
        return driver.findElement(nameField).getAttribute("value");
    }

    public void setOrganisation(String text) {
        driver.findElement(organisationField).sendKeys(text);
    }

    public String getOrganisationSet() {
        return driver.findElement(organisationField).getAttribute("value");
    }

    public void setEmail(String text) {
        driver.findElement(emailField).sendKeys(text);
    }

    public String getEmailSet() {
        return driver.findElement(emailField).getAttribute("value");
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
        return driver.findElement(findUsField).getAttribute("value");
    }

    public void setMessage(String text) {
        driver.findElement(messageField).sendKeys(text);
    }

    public String getMessageSet() {
        return driver.findElement(messageField).getAttribute("value");
    }

    public void clickSubmitButton() {
        WebElement submitButtonWebElement = driver.findElement(submitButton);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", submitButtonWebElement);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(submitButtonWebElement));
        jse.executeScript("arguments[0].click();", submitButtonWebElement);
    }

    public boolean incompleteFormErrorMessageIsDisplayed() {
        WebElement incompleteFormErrorMessageWebElement = driver.findElement(incompleteFormErrorMessage);
        return new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.textToBePresentInElement(
                        incompleteFormErrorMessageWebElement, "One or more fields have an error. Please check and try again."));
    }

    public boolean emailFormatErrorMessageIsDisplayed() {
        WebElement emailFormatErrorMessageWebElement = driver.findElement(emailFormatErrorMessage);
        return new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.textToBePresentInElement(
                        emailFormatErrorMessageWebElement, "The e-mail address entered is invalid."));
    }

    public String getContactUsPageTitle() {
        return driver.getTitle();
    }

    public String getContactUsPageHeading() {
        return driver.findElement(pageHeading).getText();
    }

    public void fillInContactForm(String name, String org, String email, String findUs, String message) {
        this.setName(name);
        this.setOrganisation(org);
        this.setEmail(email);
        this.selectDropdownOption();
        this.setFindUs(findUs);
        this.setMessage(message);
    }

    public void fillInContactForm_IncorrectEmail(String name, String email, String message) {
        this.setName(name);
        this.setEmail(email);
        this.setMessage(message);
    }
}