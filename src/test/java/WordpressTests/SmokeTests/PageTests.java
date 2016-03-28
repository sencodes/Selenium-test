package WordpressTests.SmokeTests;

import WordpressTests.Utilities.WordpressTest;
import org.junit.Assert;
import org.junit.Test;
import tonefw.Pages.DashboardPage;
import tonefw.Pages.ListPostsPage;
import tonefw.Pages.NewPostPage;

import static junit.framework.Assert.assertEquals;

/**
 * Created by SenthilKumar on 09/02/2016.
 */
public class PageTests extends WordpressTest {

    @Test
    public void userCanEditAPage() throws InterruptedException {

        Assert.assertTrue("Expected dashboard page is not displayed", DashboardPage.isDisplaying());

        ListPostsPage listPostsPage = new ListPostsPage();
        listPostsPage.goTo(ListPostsPage.PostType.Page);
        listPostsPage.selectPost("Sample One");
        //Assert.assertTrue("Expected Edit page is not displayed", ListPostsPage.isInEditMode());
        NewPostPage newPostPage = new NewPostPage();
        Assert.assertTrue("Expected Edit page is not displayed", newPostPage.isInEditMode());
        Assert.assertEquals("Title did not match", "Sample One", newPostPage.title());

        /*PostPage postPage = new PostPage();
        Assert.assertTrue("Expected Edit page is not displayed", postPage.isInEditMode());
        Assert.assertEquals("Title did not match", "Sample One", postPage.title());
        */

    }



}
