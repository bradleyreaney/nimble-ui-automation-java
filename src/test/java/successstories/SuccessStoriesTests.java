package successstories;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SuccessStoriesPage;

import static org.testng.Assert.*;

public class SuccessStoriesTests extends BaseTests {

    @Test
    public void testSuccessStoriesPageOpens() {
        SuccessStoriesPage successStoriesPage = homePage.clickSuccessStories();
        assertEquals(successStoriesPage.getSuccessStoriesPageTitle(), "Success Stories - Nimble Approach");
    }
}
