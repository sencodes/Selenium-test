package WordpressFramework.Navigation;

import org.openqa.selenium.By;
import WordpressFramework.Selenium.DriverClass;

/**
 * Created by SenthilKumar on 26/03/2016.
 */
public class MenuSelector {


    public static void Select(String topLevelMenuCSS, String subMenuPartialLinkText) throws InterruptedException {

        //DriverClass.driver.findElement(By.cssSelector(topLevelMenuCSS)).click();
        Thread.sleep(2500);
        DriverClass.driver.findElement(By.cssSelector(topLevelMenuCSS)).click();
        Thread.sleep(2000);
        DriverClass.driver.findElement(By.partialLinkText(subMenuPartialLinkText)).click();
    }
}
