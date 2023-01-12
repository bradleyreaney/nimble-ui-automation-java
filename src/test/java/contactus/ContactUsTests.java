package contactus;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContactUsPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ContactUsTests extends BaseTests {

    @Test
    public void testContactUsPageOpens() {
        ContactUsPage contactUsPage = homePage.clickContactUs();
        assertEquals(contactUsPage.getContactUsPageTitle(), "Contact Us - Nimble Approach");
        assertEquals(contactUsPage.getContactUsPageHeading(), "Contact us.");
    }

    @Test
    public void testCompletedContactUsForm() {
        ContactUsPage contactUsPage = homePage.clickContactUs();
        contactUsPage.setName("Brad Reaney");
        contactUsPage.setOrganisation("Brad Corp");
        contactUsPage.setEmail("bradley.reaney@nimbleapproach.com");
        contactUsPage.selectDropdownOption();
        contactUsPage.setFindUs("Google");
        contactUsPage.setMessage("This is a message");
        assertEquals(contactUsPage.getNameSet(), "Brad Reaney");
        assertEquals(contactUsPage.getOrganisationSet(), "Brad Corp");
        assertEquals(contactUsPage.getEmailSet(), "bradley.reaney@nimbleapproach.com");
        assertEquals(contactUsPage.getDropDownSet(), "Improve a product or service");
        assertEquals(contactUsPage.getFindUsSet(), "Google");
        assertEquals(contactUsPage.getMessageSet(), "This is a message");
    }

    @Test
    public void testInCompleteContactUsForm() {
        ContactUsPage contactUsPage = homePage.clickContactUs();
        contactUsPage.clickSubmitButton();
        assertTrue(contactUsPage.incompleteFormErrorMessageIsDisplayed());
    }

    @Test
    public void testIncorrectEmailFormat() {
        ContactUsPage contactUsPage = homePage.clickContactUs();
        contactUsPage.setName("Brad Reaney");
        contactUsPage.setEmail("wrongemailformat.com");
        contactUsPage.setMessage("This is a message");
        contactUsPage.clickSubmitButton();
        assertTrue(contactUsPage.emailFormatErrorMessageIsDisplayed());
    }
}
