package contactus;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContactUsPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ContactUsTests extends BaseTests {

    @Test
    public void testContactUsPageOpens() {
        // TODO Check page title
        // TODO Check element on page
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
        assertEquals(contactUsPage.getNameSet(), "Brad Reaney", "Error, Name not set.");
        assertEquals(contactUsPage.getOrganisationSet(), "Brad Corp", "Error, Email not set.");
        assertEquals(contactUsPage.getEmailSet(), "bradley.reaney@nimbleapproach.com", "Error, Email not set.");
        assertEquals(contactUsPage.getDropDownSet(), "Improve a product or service", "Error, Dropdown not set");
        assertEquals(contactUsPage.getFindUsSet(), "Google", "Error, Find us not set");
        assertEquals(contactUsPage.getMessageSet(), "This is a message", "Error, Message not set");
    }

    @Test
    public void testInCompleteContactUsForm() {
        ContactUsPage contactUsPage = homePage.clickContactUs();
        contactUsPage.clickSubmitButton();
        assertTrue(contactUsPage.incompleteFormErrorMessageIsDisplayed(),
                "Error, Incomplete form error message not displayed");
    }

    @Test
    public void testIncorrectEmailFormat() {
        ContactUsPage contactUsPage = homePage.clickContactUs();
        contactUsPage.setName("Brad Reaney");
        contactUsPage.setEmail("wrongemailformat.com");
        contactUsPage.setMessage("This is a message");
        contactUsPage.clickSubmitButton();
        assertTrue(contactUsPage.emailFormatErrorMessageIsDisplayed(),
                "Error, eMail format error message not displayed");
    }
}
