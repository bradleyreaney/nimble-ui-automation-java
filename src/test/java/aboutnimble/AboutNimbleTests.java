package aboutnimble;

import base.BaseTests;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AboutNimblePage;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("AboutNimble")
public class AboutNimbleTests extends BaseTests {

    private static final String ABOUT_NIMBLE_NIMBLE_APPROACH = "About Nimble - Nimble Approach";

    @Test
    public void testAboutNimblePageOpens() {
        AboutNimblePage aboutNimblePage = homePage.clickAboutNimble();
        assertEquals(aboutNimblePage.getAboutNimblePageTitle(), ABOUT_NIMBLE_NIMBLE_APPROACH);
    }

    @Test
    public void testEveryoneTileHeadings() {
        //TODO
    }

    @Test
    public void testSeeWhatWeDoLink() {
        //TODO
    }
}
