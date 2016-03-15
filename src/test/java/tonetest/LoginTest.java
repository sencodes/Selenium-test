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



    @Test
    public void checkAdminUserCanLogin(){

        Assert.assertTrue("Expected dashboard page is not displayed", DashboardPage.isDisplaying());

    }




}
