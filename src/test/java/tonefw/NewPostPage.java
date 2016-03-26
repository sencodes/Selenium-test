package tonefw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static tonetest.WordpressTest.findElement;

/**
 * Created by SenthilKumar on 29/01/2016.
 */
public class NewPostPage {

    String newPostTitle;
    String newPostBody;

    public static void goTo() throws InterruptedException {

        //CLASS CHAINING
        LeftNavigation.Posts.AddNew.Select();

        //Please note that the above line of class chaining can be replaced with the following 2 lines of method chaining:
        //LeftNavigationX leftNavigationX = new LeftNavigationX();
        //leftNavigationX.Posts().AddNew().Select();


    }

    public static String theHeadingDisplayed() {
        String addNewPostHeaderText = DriverClass.driver.findElement(By.cssSelector("div>h1")).getText();
        return addNewPostHeaderText;
    }


    public NewPostPage createPost(String newPostTitle){
            this.newPostTitle = newPostTitle;
            return this;

    }

    public NewPostPage withBody(String newPostBody){
        this.newPostBody = newPostBody;
        return this;

    }

    public void publish() throws InterruptedException {
        DriverClass.driver.findElement(By.cssSelector("input[id='title']")).sendKeys(newPostTitle);
        DriverClass.driver.switchTo().frame("content_ifr");
        DriverClass.driver.switchTo().activeElement().sendKeys(newPostBody);
        DriverClass.driver.switchTo().defaultContent();
        //publish button click does not work - hence introduced Thread.sleep here - inspite of the publish fluent wait
        Thread.sleep(5000);
        WebElement publish = findElement(DriverClass.driver, By.id("publish"), 5);
        publish.click();

        //new WebDriverWait(DriverClass.driver,5).until(ExpectedConditions.elementToBeClickable(By.id("publish")));
        //DriverClass.driver.findElement(By.id("publish")).click();
       // new WebDriverWait(DriverClass.driver,5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.wrap>h1")));
    }





    public boolean isInEditMode() {

        return DriverClass.driver.findElement(By.cssSelector("div.wrap>h1"))!=null;
    }

    public String title(){

        //System.out.println(LoginPage.driver.findElement(By.id("title")).getAttribute("value"));
        return DriverClass.driver.findElement(By.id("title")).getAttribute("value");


    }


}



