package home;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeTests extends BaseTests {

    final private static String HOME_PAGE_TITLE = "Nimble Approach - Technology consultancy focused on quality";
    final private static String HOME_PAGE_HEADING = "Discover\n" + "what's possible";
    final private static String WHAT_WE_DO_LINK_TEXT = "What we do";
    final private static String SUCCESS_STORIES_LINK_TEXT = "Success Stories";
    final private static String ABOUT_NIMBLE_LINK_TEXT = "About Nimble";
    final private static String BLOG_LINK_TEXT = "Blog";
    final private static String CAREERS_LINK_TEXT = "Careers";
    final private static String CONTACT_EMAIL = "info@nimbleapproach.com";
    final private static String CONTACT_TELEPHONE = "+44) 0 114 345 0540";
    final private static String CONTACT_ADDRESS_1 = "Nimble HQ";
    final private static String CONTACT_ADDRESS_2 = "Floor 8, Balm Green Wing";
    final private static String CONTACT_ADDRESS_3 = "Fountain Precinct";
    final private static String CONTACT_ADDRESS_CITY = "Sheffield";
    final private static String CONTACT_ADDRESS_POSTCODE = "S1 2JA";

    @Test
    public void testHomePageOpens() {
        assertEquals(homePage.getHomePageTitle(), HOME_PAGE_TITLE);
        assertEquals(homePage.getHomePageHeading(), HOME_PAGE_HEADING);
    }

    @Test
    public void testMenuLinksList() {
        assertTrue(homePage.linkIsDisplayed(WHAT_WE_DO_LINK_TEXT));
        assertTrue(homePage.linkIsDisplayed(SUCCESS_STORIES_LINK_TEXT));
        assertTrue(homePage.linkIsDisplayed(ABOUT_NIMBLE_LINK_TEXT));
        assertTrue(homePage.linkIsDisplayed(BLOG_LINK_TEXT));
        assertTrue(homePage.linkIsDisplayed(CAREERS_LINK_TEXT));
    }

    @Test
    public void testSubMenuLinks() {
        //TODO
    }

    @Test
    public void testContactInfo() {
        assertEquals(homePage.getContactEmail(), CONTACT_EMAIL);
        assertEquals(homePage.getContactTelephone(), CONTACT_TELEPHONE);
        assertEquals(homePage.getContactAddress1(), CONTACT_ADDRESS_1);
        assertEquals(homePage.getContactAddress2(), CONTACT_ADDRESS_2);
        assertEquals(homePage.getContactAddress3(), CONTACT_ADDRESS_3);
        assertEquals(homePage.getContactAddressCity(), CONTACT_ADDRESS_CITY);
        assertEquals(homePage.getContactAddressPostcode(), CONTACT_ADDRESS_POSTCODE);
    }

    @Test
    public void testSocialMediaLinks() {
        assertTrue(homePage.isTwitterLinkDisplayed());
        assertTrue(homePage.isFacebookLinkDisplayed());
        assertTrue(homePage.isLinkedinLinkDisplayed());
    }
}
