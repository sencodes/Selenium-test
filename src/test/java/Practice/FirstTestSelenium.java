package Practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SenthilKumar on 07/05/2014.
 */
public class FirstTestSelenium {

    @Test
    public void testSampleMethod(){
        System.out.println("This is my first test");
        List list = new ArrayList();
        list.add("hello");
        String s = (String) list.get(0);
        System.out.println(s);
    }
}
