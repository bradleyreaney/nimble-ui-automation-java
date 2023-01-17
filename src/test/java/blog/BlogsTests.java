package blog;

import base.BaseTests;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BlogPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("Blogs")
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
