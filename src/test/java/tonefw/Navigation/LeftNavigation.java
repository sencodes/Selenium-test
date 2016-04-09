package tonefw.Navigation;

/**
 * Created by SenthilKumar on 24/03/2016.
 */
public class LeftNavigation {


    public static class Posts {



        public static class AllPosts {

            public static void Select() throws InterruptedException {
                //MenuSelector.Select("menu-posts", "All Posts");
                MenuSelector.Select("[id='menu-posts'] div.wp-menu-name", "All Posts");


            }
        }


        public static class AddNew {

            public static void Select() throws InterruptedException {
                //MenuSelector.Select("li[id='menu-posts']>a>div.wp-menu-name","Add New");
                //MenuSelector.Select("menu-posts", "Add New");
                MenuSelector.Select("[id='menu-posts'] div.wp-menu-name", "Add New");

            }

        }



    }



    public static class Pages {

        public static class AllPages {

            public static void Select() throws InterruptedException {

                MenuSelector.Select("menu-pages","All Pages");
                //DriverClass.driver.findElement(By.id("menu-pages")).click();
                //DriverClass.driver.findElement(By.linkText("All Pages")).click();

            }
        }
    }
}
