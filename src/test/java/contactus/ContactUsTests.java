package contactus;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import pages.ContactUsPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactUsTests extends BaseTests {

    private static final String CONTACT_US_NIMBLE_APPROACH = "Contact Us - Nimble Approach";
    private static final String CONTACT_US = "Contact us.";
    private static final String NAME = "Brad Reaney";
    private static final String ORGANISATION = "Brad Corp";
    private static final String EMAIL = "bradley.reaney@nimbleapproach.com";
    private static final String DROP_DOWN = "Improve a product or service";
    private static final String FIND_US = "Google";
    private static final String MESSAGE = "This is a message";
    private static final String INCORRECT_EMAIL = "wrongemailformat.com";

    @Test
    public void testContactUsPageOpens() {
        ContactUsPage contactUsPage = homePage.clickContactUs();
        assertEquals(contactUsPage.getContactUsPageTitle(), CONTACT_US_NIMBLE_APPROACH);
        assertEquals(contactUsPage.getContactUsPageHeading(), CONTACT_US);
    }

    @Test
    public void testCompletedContactUsForm() {
        ContactUsPage contactUsPage = homePage.clickContactUs();
        contactUsPage.fillInContactForm(NAME, ORGANISATION, EMAIL, FIND_US, MESSAGE);
        assertEquals(contactUsPage.getNameSet(), NAME);
        assertEquals(contactUsPage.getOrganisationSet(), ORGANISATION);
        assertEquals(contactUsPage.getEmailSet(), EMAIL);
        assertEquals(contactUsPage.getDropDownSet(), DROP_DOWN);
        assertEquals(contactUsPage.getFindUsSet(), FIND_US);
        assertEquals(contactUsPage.getMessageSet(), MESSAGE);
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
        contactUsPage.fillInContactForm_IncorrectEmail(NAME, INCORRECT_EMAIL, MESSAGE);
        contactUsPage.clickSubmitButton();
        assertTrue(contactUsPage.emailFormatErrorMessageIsDisplayed());
    }
}
