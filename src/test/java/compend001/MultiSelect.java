package compend001;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by SenthilKumar on 10/01/2016.
 */
public class MultiSelect {
    WebDriver driver = new FirefoxDriver();


    @Before
    public void setUp() throws InterruptedException {
        driver.get("http://compendiumdev.co.uk/selenium/basic_html_form.html");
        Thread.sleep(3500);
    }

    @Test
    public void main(){

        WebElement multiSelect = driver.findElement(By.cssSelector("select[multiple='multiple']"));
        Select mSel = new Select(multiSelect);
        List<WebElement> slist = mSel.getAllSelectedOptions();
        System.out.println("slist size is "+slist.size());
        for(int i=0; i<slist.size(); i++)
        {
            System.out.println("Element is "+slist.get(i).getText());
        }

        Select mSe1 = new Select(driver.findElement(By.cssSelector("select[multiple='multiple']")));
        List<WebElement> allOpt = mSe1.getOptions();
        System.out.println("All options size is "+allOpt.size());

        for (int j=0; j<allOpt.size(); j++)
        {
            System.out.println("All Option is "+allOpt.get(j).getText());
        }

        mSe1.selectByVisibleText("Selection Item 1");
        mSe1.selectByVisibleText("Selection Item 2");
        mSe1.selectByVisibleText("Selection Item 4");

    }




}
