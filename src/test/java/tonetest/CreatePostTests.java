package tonetest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import tonefw.DashboardPage;
import tonefw.LoginPage;
import tonefw.NewPostPage;
import tonefw.PostPage;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by SenthilKumar on 29/01/2016.
 */
public class CreatePostTests {

    @Test
    public void userCanCreatePost() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.loginAs("testdirect143").withPassword("Tasteofindia123!").login();
        Assert.assertTrue("Expected dashboard page is not displayed", DashboardPage.isDisplaying());


        NewPostPage newPostPage = new NewPostPage();
        newPostPage.goTo();
        assertEquals("test","Add New Post",NewPostPage.theHeadingDisplayed());
        newPostPage.createPost("This is a Test".toUpperCase()).withBody("This is the body").publish();

        PostPage postPage = new PostPage();
        postPage.goTo();
        Assert.assertEquals("New post is not created", "This is a Test".toUpperCase(), postPage.displayedHeaderText());

    }

//    @After
 //   public void cleanUp(){
 //       LoginPage.driver.quit();

 //   }
}
