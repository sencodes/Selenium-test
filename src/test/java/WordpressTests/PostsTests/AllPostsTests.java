package WordpressTests.PostsTests;

import WordpressTests.Utilities.WordpressTest;
import javafx.geometry.Pos;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import tonefw.Pages.ListPostsPage;
import tonefw.Pages.NewPostPage;
import tonefw.Pages.PostPage;
import tonefw.Selenium.DriverClass;

/**
 * Created by SenthilKumar on 28/03/2016.
 */
public class AllPostsTests extends WordpressTest {


    @Test
    public void Added_Posts_Show_Up() throws InterruptedException {

        //Goto posts, get post count, store the count
        ListPostsPage.goTo(ListPostsPage.PostType.Post); //This lead to including Post as enum PostType in ListPostsPage.java
        ListPostsPage.storeCount();

        //Add a new post
        NewPostPage newPostPage = new NewPostPage();
        newPostPage.goTo();
        //newPostPage.createPost("This is a Test".toUpperCase()).withBody("This is the body").publish();
        newPostPage.createPost("Added post shows up Title".toUpperCase()).withBody("Added post shows up - Body").publish();


        //Check if the post count has increased as a result of new post addition - Goto ListPostsPage to check
        ListPostsPage.goTo(ListPostsPage.PostType.Post);
        //System.out.println("ListPostsPage.previousPostCount()+1 is " + (ListPostsPage.previousPostCount()+1));
        //Assert.assertEquals("Error message - Count of posts did not increase", ListPostsPage.previousPostCount()+1,ListPostsPage.currentPostCount());
        //Assert.assertEquals("Error message - Count of posts did not increase", ListPostsPage.previousPostCount() + 1,ListPostsPage.currentPostCount());
        //Get the current post count
        ListPostsPage.getCurrentPostCount();
        Assert.assertEquals("Error message - Count of posts did not increase", ListPostsPage.previousPostCount + 1,ListPostsPage.currentPostCount);

        //Check if added post is displayed in ListPostPage
        Assert.assertTrue("Added post is not displayed",ListPostsPage.isAddedPostDisplayingWithTitle("Added post shows up Title".toUpperCase()));


        //Trash Post with specified title
        //To trash first we go to List Posts Page
       // ListPostsPage.goTo(ListPostsPage.PostType.Post);
        ListPostsPage.trashPost("Added post shows up Title".toUpperCase());

        //Now the current post count should equal the previous post count as a result of trashing

        ListPostsPage.getCurrentPostCount();
        System.out.println("Post Count is "+ListPostsPage.currentPostCount);

        Assert.assertEquals("Error - Post Count not equal", ListPostsPage.previousPostCount, ListPostsPage.currentPostCount);
    }



    @Test
    public void Can_Search_Posts() throws InterruptedException {

        //Create new post
        NewPostPage newPostPage = new NewPostPage();
        newPostPage.goTo();
        newPostPage.createPost("Searching posts title").withBody("Searching posts body").publish();

        //Goto listpostspage
        ListPostsPage.goTo(ListPostsPage.PostType.Post);


        //Search for the newly created post
        ListPostsPage.searchForPost("Searching posts title".toUpperCase());


        //Check that post shows up in search results
        Assert.assertTrue("Is not displayed",ListPostsPage.isAddedPostDisplayingWithTitle("Searching posts title"));

        //Trash the created post
        ListPostsPage.trashPost("Searching posts title");
    }

}


