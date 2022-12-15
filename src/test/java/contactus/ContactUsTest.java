package contactus;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContactUsPage;

import static org.testng.Assert.assertEquals;

public class ContactUsTest extends BaseTests {

    @Test
    public void testContactUsForm() {
        ContactUsPage contactUsPage = homePage.clickContactUs();
        contactUsPage.setName("Brad");
        assertEquals(contactUsPage.getNameSet(), "Brad", "Incorrect or no name set");
    }
}
