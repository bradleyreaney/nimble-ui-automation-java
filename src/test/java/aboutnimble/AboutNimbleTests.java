package aboutnimble;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AboutNimblePage;

import static org.testng.Assert.*;

public class AboutNimbleTests extends BaseTests {

    @Test
    public void testAboutNimblePageOpens() {
        AboutNimblePage aboutNimblePage = homePage.clickAboutNimble();
        assertEquals(aboutNimblePage.getAboutNimblePageTitle(), "About Nimble - Nimble Approach");
    }

    @Test
    public void testEveryoneTileHEadings() {
        //TODO
    }

    @Test
    public void testSeeWhatWeDoLink() {
        //TODO
    }
}
