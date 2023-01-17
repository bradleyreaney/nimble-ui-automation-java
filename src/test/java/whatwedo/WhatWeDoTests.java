package whatwedo;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import pages.WhatWeDoPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
