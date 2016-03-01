package sampletest;

import org.junit.Test;
import sampletestframework.LoginPage;

/**
 * Created by SenthilKumar on 25/01/2016.
 */
public class LoginTest {

    @Test
    public void checkAdminUserCanLogin(){
        LoginPage lp1 = new LoginPage();
        lp1.goTo();
        lp1.loginAs("testdirect143").withPassword("Tasteofindia123!").login();


    }
}
