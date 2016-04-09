package tonefw.Pages;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tonefw.Selenium.DriverClass;
import tonefw.Navigation.LeftNavigation;

import java.util.List;

/**
 * Created by SenthilKumar on 09/02/2016.
 * This will select the Pages > All Pages link
 * This will select the Posts > All Posts link
 *
 */
public class ListPostsPage {

    public static int lastPostCount;
    public static int previousPostCount;


    public static int currentPostCount;


    public static void goTo(PostType postType) throws InterruptedException {

        switch (postType)
        {
            case Page:

                //CLASS CHAINING
                LeftNavigation.Pages.AllPages.Select();
                //Please note that the above line of class chaining can be replaced with the following 2 lines of method chaining:
                //LeftNavigationX leftNavigationX = new LeftNavigationX();
                //leftNavigationX.Pages().AllPages().Select();


                //DriverClass.driver.findElement(By.id("menu-pages")).click();
                //DriverClass.driver.findElement(By.linkText("All Pages")).click();
                break;

            case Post:

                LeftNavigation.Posts.AllPosts.Select();
                break;
        }

    }

    public void selectPost(String s) {
        DriverClass.driver.findElement(By.linkText(s)).click();

    }

    public static void searchForPost(String Title) {

        DriverClass.driver.findElement(By.id("post-search-input")).sendKeys(Title);
        DriverClass.driver.findElement(By.id("search-submit")).click();

    }


    public enum PostType{
        Post, Page
    }

    public static int storeCount(){
        previousPostCount = previousPostCount();
        System.out.println("Prev post count is "+previousPostCount);
        return previousPostCount;

    }

    public static int previousPostCount(){
        String lastPostCountText = DriverClass.driver.findElement(By.className("displaying-num")).getText();
        lastPostCount = Integer.parseInt(lastPostCountText.substring(0, 1));
        System.out.println("Prev Post Count is " + lastPostCount);
        return lastPostCount;
    }

    public static int getCurrentPostCount(){
        currentPostCount = currentPostCount();
        return currentPostCount;
    }


    public static int currentPostCount() {
        currentPostCount = 0;
        String currentCountText = DriverClass.driver.findElement(By.className("displaying-num")).getText();
        currentPostCount = Integer.parseInt(currentCountText.substring(0, 1));
        System.out.println("Current Post Count is " + (currentPostCount));
        return currentPostCount;
    }

    public static Boolean isAddedPostDisplayingWithTitle(String title){
        System.out.println("Inside method title to search is "+title);
        Boolean isPresent = false;
        List<WebElement> titlesText = DriverClass.driver.findElements(By.cssSelector("tr[id*='post']>td.title>strong>a"));
        //System.out.println("size of table is "+titlesText.size());
        for (int i=0; i<titlesText.size(); i++) {
            System.out.println("Actual title is "+titlesText.get(i).getText());
              if (titlesText.get(i).getText().equals(title)){
                  System.out.println("Actual title is "+titlesText.get(i).getText());
                  isPresent = true;
                  break;
              }
        }
        System.out.println("isPresent value is "+isPresent);
        return isPresent;
    }

    public static void trashPost(String Title) throws InterruptedException {

        //List<WebElement> titlesPost = DriverClass.driver.findElements(By.cssSelector(".row-title"));
        List<WebElement> titlesPost = DriverClass.driver.findElements(By.xpath("//*[@id='the-list']//tr//td[1]//strong//a"));
        for (int i=1; i<=titlesPost.size(); i++){
//          System.out.println("post title is "+titlesPost.get(i-1).getText());
            if(titlesPost.get(i-1).getText().equals(Title)){
                Actions action = new Actions(DriverClass.driver);
                WebElement titleElement = DriverClass.driver.findElement(By.xpath("//*[@id='the-list']//tr["+i+"]//td[1]//strong//a"));
                action.moveToElement(titleElement).build().perform();
                DriverClass.driver.findElement(By.cssSelector("a.submitdelete")).click();
                Thread.sleep(6000);
                break;
            }

        }

        //Wait till WebElement that is deleted becomes invisible

        //new WebDriverWait(DriverClass.driver,3).until(ExpectedConditions.invisibilityOfElementLocated(By.partialLinkText(Title)));


    }
}
