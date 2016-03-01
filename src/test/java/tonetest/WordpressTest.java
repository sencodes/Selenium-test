package tonetest;

import org.junit.After;
import tonefw.LoginPage;

/**
 * Created by SenthilKumar on 23/02/2016.
 */
public class WordpressTest {

    @After
    public void cleanUp() {
        LoginPage.driver.quit();
    }

}
