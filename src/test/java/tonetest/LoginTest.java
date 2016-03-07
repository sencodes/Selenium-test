package tonetest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tonefw.DashboardPage;
import tonefw.DriverClass;
import tonefw.LoginPage;

/**
 * Created by SenthilKumar on 25/01/2016.
 */
public class LoginTest extends WordpressTest {

    @Before
    public void testInitialize(){
        DriverClass driverclass = new DriverClass();
        driverclass.initialize();
    }

    @Test
    public void checkAdminUserCanLogin(){
        LoginPage lp1 = new LoginPage();
        lp1.goTo();
        lp1.loginAs("testdirect143").withPassword("Tasteofindia123!").login();
        Assert.assertTrue("Expected dashboard page is not displayed", DashboardPage.isDisplaying());

    }



  /*  @After
    public void cleanUp(){
        LoginPage.driver.quit();

    } */
}
