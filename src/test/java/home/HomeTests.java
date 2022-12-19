package home;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomeTests extends BaseTests {

    @Test
    public void testMenuLinksList() {
        assertTrue(homePage.linkIsDisplayed("What we do"), "Error, 'What wo do' link not displayed");
        assertTrue(homePage.linkIsDisplayed("Success Stories"), "Error, 'Success Stories' link not displayed");
        assertTrue(homePage.linkIsDisplayed("About Nimble"), "Error, 'About Nimble' link not displayed");
        assertTrue(homePage.linkIsDisplayed("Blog"), "Error, 'Blog' link not displayed");
        assertTrue(homePage.linkIsDisplayed("Careers"), "Error, 'Careers' link not displayed");
    }

    @Test
    public void testContactInfo() {
        assertEquals(homePage.getContactEmail(), "info@nimbleapproach.com", "Error, Contact eMail incorrect");
        assertEquals(homePage.getContactTelephone(), "+44) 0 114 345 0540", "Error, Contact telephone incorrect");
        assertEquals(homePage.getContactAddress1(), "Nimble HQ", "Error, Contact address 1 incorrect");
        assertEquals(homePage.getContactAddress2(), "Floor 8, Balm Green Wing", "Error, Contact address 2 incorrect");
        assertEquals(homePage.getContactAddress3(), "Fountain Precinct", "Error, Contact address 3 incorrect");
        assertEquals(homePage.getContactAddressCity(), "Sheffield", "Error, Contact address city incorrect");
        assertEquals(homePage.getContactAddressPostcode(), "S1 2JA", "Error, Contact address postcode incorrect");
    }

    @Test
    public void testSocialMediaLinks() {
        assertTrue(homePage.isTwitterLinkDisplayed(), "Error, Twitter link not displayed");
        assertTrue(homePage.isFacebookLinkDisplayed(), "Error, Facebook link not displayed");
        assertTrue(homePage.isLinkedinLinkDisplayed(), "Error, Linkedin link not displayed");
    }
}
