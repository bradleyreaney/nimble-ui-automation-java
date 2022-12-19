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
        // assertEquals(contactUsPage.getNameSet(), "Brad Reaney", "Error, Name not set.");
        // assertEquals(contactUsPage.getOrganisationSet(), "Brad Corp", "Error, Email not set.");
        // assertEquals(contactUsPage.getEmailSet(), "bradley.reaney@nimbleapproach.com", "Error, Email not set.");
        assertEquals(contactUsPage.getDropDownSet(), "Improve a product or service", "Error, Dropdown not set");
        // assertEquals(contactUsPage.getFindUsSet(), "Google", "Error, Find us not set");
        // assertEquals(contactUsPage.getMessageSet(), "This is a message", "Error, Message not set");
    }

    @Test
    public void textInCompleteContactUsForm() {
        ContactUsPage contactUsPage = homePage.clickContactUs();
        contactUsPage.clickSubmitButton();
    }

    @Test
    public void testIncorrectEmailFormat() {
        // TODO
    }
}
