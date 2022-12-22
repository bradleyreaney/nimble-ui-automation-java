package blog;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.BlogPage;

import static org.testng.Assert.*;

public class BlogsTests extends BaseTests {

    @Test
    public void testBlogPageOpens() {
        BlogPage blogPage = homePage.clickBlog();
        assertEquals(blogPage.getBlogPageTitle(), "Blog - Nimble Approach");
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
