package tonefw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by SenthilKumar on 29/01/2016.
 */
public class PostPage {

    public void goTo() {
        WebElement viewPostLink = LoginPage.driver.findElement(By.partialLinkText("View post"));
        viewPostLink.click();

    }

    public String displayedHeaderText(){
        String headerText = LoginPage.driver.findElement(By.cssSelector("h1.entry-title")).getText();
        return headerText;
    }



}