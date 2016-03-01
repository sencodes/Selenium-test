package tonefw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sun.rmi.runtime.Log;

/**
 * Created by SenthilKumar on 29/01/2016.
 */
public class NewPostPage {

    String newPostTitle;
    String newPostBody;

    public void goTo() throws InterruptedException {
        LoginPage.driver.findElement(By.cssSelector("li[id='menu-posts']>a>div.wp-menu-name")).click();
        Thread.sleep(2000);
        LoginPage.driver.findElement(By.partialLinkText("Add New")).click();


    }

    public static String theHeadingDisplayed() {
        String addNewPostHeaderText = LoginPage.driver.findElement(By.cssSelector("div>h1")).getText();
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
        LoginPage.driver.findElement(By.cssSelector("input[id='title']")).sendKeys(newPostTitle);
        LoginPage.driver.switchTo().frame("content_ifr");
        LoginPage.driver.switchTo().activeElement().sendKeys(newPostBody);
        LoginPage.driver.switchTo().defaultContent();
        Thread.sleep(1000);
        LoginPage.driver.findElement(By.id("publish")).click();
    }


    public boolean isInEditMode() {

        return LoginPage.driver.findElement(By.cssSelector("div.wrap>h1"))!=null;
    }

    public String title(){

        //System.out.println(LoginPage.driver.findElement(By.id("title")).getAttribute("value"));
        return LoginPage.driver.findElement(By.id("title")).getAttribute("value");


    }


}


