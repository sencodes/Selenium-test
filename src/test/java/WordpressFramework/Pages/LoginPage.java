package WordpressFramework.Pages;

import org.openqa.selenium.By;
import WordpressFramework.Selenium.DriverClass;
import WordpressTests.Utilities.WordpressTest;

/**
 * Created by SenthilKumar on 25/01/2016.
 */
public class LoginPage extends WordpressTest {
   // public static WebDriver driver = new FirefoxDriver();
    String userName;
    String password;


    public void goTo() {
        DriverClass.driver.get("https://testdirect143.wordpress.com/wp-admin");

    }

    public LoginPage loginAs(String userName){
        this.userName = userName;
        return this;

    }

    public LoginPage withPassword(String password){
        this.password = password;
        return this;
    }

    public void login(){
        DriverClass.driver.findElement(By.id("user_login")).sendKeys(userName);
        DriverClass.driver.findElement(By.id("user_pass")).sendKeys(password);
        DriverClass.driver.findElement(By.id("wp-submit")).click();
    }


}

