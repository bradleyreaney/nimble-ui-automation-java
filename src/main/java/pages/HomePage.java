package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLink(String linkText){
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
}
