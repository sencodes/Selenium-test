package tonefw;

import org.openqa.selenium.By;

/**
 * Created by SenthilKumar on 24/03/2016.
 */
public class LeftNavigation {


    public static class Posts {

        public static class AddNew {

            public static void Select() throws InterruptedException {
                DriverClass.driver.findElement(By.cssSelector("li[id='menu-posts']>a>div.wp-menu-name")).click();
                Thread.sleep(2000);
                DriverClass.driver.findElement(By.partialLinkText("Add New")).click();
            }

        }
    }

    public static class Pages {

        public static class AllPages {

            public static void Select(){
                DriverClass.driver.findElement(By.id("menu-pages")).click();
                DriverClass.driver.findElement(By.linkText("All Pages")).click();

            }
        }
    }
}
