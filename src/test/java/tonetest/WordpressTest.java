package tonetest;

import org.junit.After;
import org.junit.Before;
import tonefw.DriverClass;
import tonefw.LoginPage;

/**
 * Created by SenthilKumar on 23/02/2016.
 */
public class WordpressTest {

    @Before
    public void testInitialize(){
        DriverClass driverclass = new DriverClass();
        driverclass.initialize();
    }

    @After
    public void cleanUp() {
        DriverClass.driver.quit();
    }

}
