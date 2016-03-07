package tonefw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

/**
 * Created by SenthilKumar on 29/01/2016.
 */
public class PostPage {

    public void goTo() throws InterruptedException {
        //Thread.sleep(5000);
      //  new WebDriverWait(DriverClass.driver,5);

        new WebDriverWait(DriverClass.driver,5).until(ExpectedConditions.elementToBeClickable(By.partialLinkText("View post")));

        WebElement viewPostLink = DriverClass.driver.findElement(By.partialLinkText("View post"));
        viewPostLink.click();

    }


    public String displayedHeaderText(){
        String headerText = DriverClass.driver.findElement(By.cssSelector("h1.entry-title")).getText();
        return headerText;
    }



}