package WordpressTests.SmokeTests;

import WordpressTests.Utilities.WordpressTest;
import org.junit.Assert;
import org.junit.Test;
import tonefw.Pages.DashboardPage;
import tonefw.Pages.NewPostPage;
import tonefw.Pages.PostPage;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by SenthilKumar on 29/01/2016.
 */
public class CreatePostTests extends WordpressTest {

    @Test
    public void userCanCreatePost() throws InterruptedException {

        Assert.assertTrue("Expected dashboard page is not displayed", DashboardPage.isDisplaying());


        NewPostPage newPostPage = new NewPostPage();
        newPostPage.goTo();
        assertEquals("test","Add New Post",NewPostPage.theHeadingDisplayed());
        newPostPage.createPost("This is a Test".toUpperCase()).withBody("This is the body").publish();

        PostPage postPage = new PostPage();
        postPage.goTo();
        Assert.assertEquals("New post is not created", "This is a Test".toUpperCase(), postPage.displayedHeaderText());

    }


}
