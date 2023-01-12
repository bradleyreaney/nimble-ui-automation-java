package blog;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.BlogPage;

import static org.testng.Assert.*;

public class BlogsTests extends BaseTests {

    private static final String BLOG_NIMBLE_APPROACH = "Blog - Nimble Approach";

    @Test
    public void testBlogPageOpens() {
        BlogPage blogPage = homePage.clickBlog();
        assertEquals(blogPage.getBlogPageTitle(), BLOG_NIMBLE_APPROACH);
    }

    @Test
    public void testEdTechCategoryLink() {
        //TODO
    }

    @Test
    public void testMovingToTheSecondPage() {
        //TODO
    }
}
