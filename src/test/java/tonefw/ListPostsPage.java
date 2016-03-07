package tonefw;

import org.openqa.selenium.By;

/**
 * Created by SenthilKumar on 09/02/2016.
 */
public class ListPostsPage {

    public static void goTo(PostType postType){

        switch (postType)
        {
            case Page:
                DriverClass.driver.findElement(By.id("menu-pages")).click();
                DriverClass.driver.findElement(By.linkText("All Pages")).click();
                break;
        }

    }

    public void selectPost(String s) {
        DriverClass.driver.findElement(By.linkText(s)).click();

    }


    public enum PostType{
        Page
    }
}
