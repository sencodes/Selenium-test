package tonefw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.rmi.runtime.Log;

/**
 * Created by SenthilKumar on 29/01/2016.
 */
public class NewPostPage {

    String newPostTitle;
    String newPostBody;

    public void goTo() throws InterruptedException {
        DriverClass.driver.findElement(By.cssSelector("li[id='menu-posts']>a>div.wp-menu-name")).click();
        Thread.sleep(2000);
        DriverClass.driver.findElement(By.partialLinkText("Add New")).click();


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
       // Thread.sleep(1000);
       // Thread.sleep(5000);
        DriverClass.driver.findElement(By.id("publish")).click();
        new WebDriverWait(DriverClass.driver,5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.wrap>h1")));
    }


    public boolean isInEditMode() {

        return DriverClass.driver.findElement(By.cssSelector("div.wrap>h1"))!=null;
    }

    public String title(){

        //System.out.println(LoginPage.driver.findElement(By.id("title")).getAttribute("value"));
        return DriverClass.driver.findElement(By.id("title")).getAttribute("value");


    }


}


