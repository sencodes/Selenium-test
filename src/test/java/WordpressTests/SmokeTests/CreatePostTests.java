package WordpressTests.SmokeTests;

import WordpressTests.Utilities.WordpressTest;
import org.junit.Assert;
import org.junit.Test;
import WordpressFramework.Pages.DashboardPage;
import WordpressFramework.Pages.NewPostPage;
import WordpressFramework.Pages.PostPage;

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
        //Goto the New Post Page and then click on Add new button
        newPostPage.goTo();
        assertEquals("test","Add New Post",NewPostPage.theHeadingDisplayed());
        //Create a new post with the specified Title and specified Body and then click 'Publish' button
        newPostPage.createPost("This is a Test".toUpperCase()).withBody("This is the body").publish();

        //Goto the View Post page
        PostPage postPage = new PostPage();
        postPage.goTo();
        Assert.assertEquals("New post is not created", "This is a Test".toUpperCase(), postPage.displayedHeaderText());

    }


}
