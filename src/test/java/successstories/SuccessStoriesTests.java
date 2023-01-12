package successstories;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SuccessStoriesPage;

import static org.testng.Assert.*;

public class SuccessStoriesTests extends BaseTests {

    final private static String SUCCESS_STORIES_NIMBLE_APPROACH = "Success Stories - Nimble Approach";

    @Test
    public void testSuccessStoriesPageOpens() {
        SuccessStoriesPage successStoriesPage = homePage.clickSuccessStories();
        assertEquals(successStoriesPage.getSuccessStoriesPageTitle(), SUCCESS_STORIES_NIMBLE_APPROACH);
    }

    @Test
    public void testClickingSBGTile() {
        //TODO
    }
}
