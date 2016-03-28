package WordpressTests.SmokeTests;

import WordpressTests.Utilities.WordpressTest;
import org.junit.Assert;
import org.junit.Test;
import tonefw.Pages.DashboardPage;

/**
 * Created by SenthilKumar on 25/01/2016.
 */
public class LoginTest extends WordpressTest {



    @Test
    public void checkAdminUserCanLogin(){

        Assert.assertTrue("Expected dashboard page is not displayed", DashboardPage.isDisplaying());

    }




}
