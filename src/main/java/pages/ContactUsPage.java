package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

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
        WebElement submitButton = driver.findElement(By.className("wpcf7-submit"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", submitButton);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(submitButton));
        jse.executeScript("arguments[0].click();", submitButton);
    }

    public boolean incompleteFormErrorMessageIsDisplayed() {
        WebElement incompleteFormErrorMessage = driver.findElement(By.className("wpcf7-response-output"));
        return new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.textToBePresentInElement(
                        incompleteFormErrorMessage, "One or more fields have an error. Please check and try again."));
    }

    public boolean emailFormatErrorMessageIsDisplayed() {
        WebElement emailFormatErrorMessage = driver.findElement(By.className("wpcf7-not-valid-tip"));
        return new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.textToBePresentInElement(
                        emailFormatErrorMessage, "The e-mail address entered is invalid."));
    }
}