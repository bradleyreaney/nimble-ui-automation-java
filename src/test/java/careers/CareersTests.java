package careers;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CareersPage;

import static org.testng.Assert.*;

public class CareersTests extends BaseTests {

    @Test
    public void testCareersPageOpens() {
        CareersPage careersPage = homePage.clickCareers();
        assertEquals(careersPage.getCareersPageTitle(), "Careers - Nimble Approach");
    }
}
