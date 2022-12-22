package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By contactEmail = By.cssSelector("a[itemprop='email']");
    private By contactTelephone = By.cssSelector("span[itemprop='telephone']");
    private By contactAddress1 = By.className("jetpack-address__address1");
    private By contactAddress2 = By.className("jetpack-address__address2");
    private By contactAddress3 = By.className("jetpack-address__address3");
    private By contactAddressCity = By.className("jetpack-address__city");
    private By contactAddressPostcode = By.className("jetpack-address__postal");
    private By twitterLink = By.className("fa-twitter");
    private By facebookLink = By.className("fa-facebook");
    private By linkedinLink = By.className("fa-linkedin");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    public WhatWeDoPage clickWhatWeDo() {
        clickLink("What we do");
        return new WhatWeDoPage(driver);
    }

    public ContactUsPage clickContactUs() {
        clickLink("Contact Us");
        return new ContactUsPage(driver);
    }

    public AboutNimblePage clickAboutNimble() {
        clickLink("About Nimble");
        return new AboutNimblePage(driver);
    }

    public BlogPage clickBlog() {
        clickLink("Blog");
        return new BlogPage(driver);
    }

    public CareersPage clickCareers() {
        clickLink("Careers");
        return new CareersPage(driver);
    }

    public SuccessStoriesPage clickSuccessStories() {
        clickLink("Success Stories");
        return new SuccessStoriesPage(driver);
    }

    public boolean linkIsDisplayed(String linkText) {
        return driver.findElement(By.linkText(linkText)).isDisplayed();
    }

    public String getContactEmail() {
        return driver.findElement(contactEmail).getText();
    }

    public String getContactTelephone() {
        return driver.findElement(contactTelephone).getText();
    }

    public String getContactAddress1() {
        return driver.findElement(contactAddress1).getText();
    }

    public String getContactAddress2() {
        return driver.findElement(contactAddress2).getText();
    }

    public String getContactAddress3() {
        return driver.findElement(contactAddress3).getText();
    }

    public String getContactAddressCity() {
        return driver.findElement(contactAddressCity).getText();
    }

    public String getContactAddressPostcode() {
        return driver.findElement(contactAddressPostcode).getText();
    }

    public boolean isTwitterLinkDisplayed() {
        return driver.findElement(twitterLink).isDisplayed();
    }

    public boolean isFacebookLinkDisplayed() {
        return driver.findElement(facebookLink).isDisplayed();
    }

    public boolean isLinkedinLinkDisplayed() {
        return driver.findElement(linkedinLink).isDisplayed();
    }
}
