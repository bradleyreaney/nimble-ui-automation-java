package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhatWeDoPage {

    private final WebDriver driver;
    private final By whatWeDoText = By.className("vc_custom_1658411741718");

    public WhatWeDoPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getWhatWeDoText() {
        return driver.findElement(whatWeDoText).getText();
    }

    public String getWhatWeDoPageTitle() {
        return driver.getTitle();
    }
}
