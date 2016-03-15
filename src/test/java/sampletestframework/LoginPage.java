package sampletestframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by SenthilKumar on 25/01/2016.
 */
public class LoginPage {
    static WebDriver driver = new FirefoxDriver();
    String userName;
    String password;


    public void goTo() {
        driver.get("https://testdirect143.wordpress.com/wp-admin");

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
        driver.findElement(By.id("user_login")).sendKeys(userName);
        driver.findElement(By.id("user_pass")).sendKeys(password);
        driver.findElement(By.id("wp-submit")).click();
    }


}

