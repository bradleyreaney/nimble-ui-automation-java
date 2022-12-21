package whatwedo;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WhatWeDoPage;

import static org.testng.Assert.*;

public class WhatWeDoTests extends BaseTests {

    @Test
    public void testWhatWeDoPageOpens() {
        WhatWeDoPage whatWeDoPage = homePage.clickWhatWeDo();
        assertEquals(whatWeDoPage.getWhatWeDoPageTitle(), "What we do - Nimble Approach");
        assertEquals(whatWeDoPage.getWhatWeDoText(), "What we do");
    }
}
