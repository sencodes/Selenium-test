package tonetest;

import org.junit.Assert;
import org.junit.Test;
import tonefw.*;
import tonefw.ListPostsPage;

import static junit.framework.Assert.assertEquals;

/**
 * Created by SenthilKumar on 09/02/2016.
 */
public class PageTests {

    @Test
    public void userCanEditAPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.loginAs("testdirect143").withPassword("Tasteofindia123!").login();
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

//    @After
    //   public void cleanUp(){
    //       LoginPage.driver.quit();

    //   }

}
