package contactus;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContactUsPage;

import static org.testng.Assert.assertEquals;

public class ContactUsTest extends BaseTests {

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
        assertEquals(contactUsPage.getIncompleteFormErrorMessage(), "One or more fields have an error. Please check and try again.", "Error, Incomplete form error message incorrect");
    }

    @Test
    public void testIncorrectEmailFormat() {
        ContactUsPage contactUsPage = homePage.clickContactUs();
        contactUsPage.setName("Brad Reaney");
        contactUsPage.setEmail("wrongemailformat.com");
        contactUsPage.setMessage("This is a message");
        contactUsPage.clickSubmitButton();
        assertEquals(contactUsPage.getEmailFormatErrorMessage(), "The e-mail address entered is invalid.", "Error, eMail format error message incorrect");
    }
}
