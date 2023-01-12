package whatwedo;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WhatWeDoPage;

import static org.testng.Assert.*;

public class WhatWeDoTests extends BaseTests {

    private final static String WHAT_WE_DO = "What we do";

    @Test
    public void testWhatWeDoPageOpens() {
        WhatWeDoPage whatWeDoPage = homePage.clickWhatWeDo();
        assertEquals(whatWeDoPage.getWhatWeDoPageTitle(), WHAT_WE_DO + " - Nimble Approach");
        assertEquals(whatWeDoPage.getWhatWeDoText(), WHAT_WE_DO);
    }

    @Test void testClickingTestingTile() {
        //TODO
    }
}
