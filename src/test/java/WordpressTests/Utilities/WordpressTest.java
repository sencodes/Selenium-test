package WordpressTests.Utilities;

import com.google.common.base.Function;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import tonefw.Selenium.DriverClass;
import tonefw.Pages.LoginPage;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * Created by SenthilKumar on 23/02/2016.
 */
public class WordpressTest {

    @Before
    public void testInitialize(){
        DriverClass driverclass = new DriverClass();
        driverclass.initialize();
        LoginPage lp1 = new LoginPage();
        lp1.goTo();
        lp1.loginAs("testdirect143").withPassword("Tasteofindia123!").login();
    }

/*    @After
    public void cleanUp() {
        DriverClass.driver.quit();
    } */

    //Fluent wait added
    public static WebElement findElement(WebDriver driver, final By locator,int timeseconds){
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(timeseconds, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);

        return wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
    }

}
