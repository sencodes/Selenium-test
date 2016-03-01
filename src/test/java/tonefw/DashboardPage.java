package tonefw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

/**
 * Created by SenthilKumar on 28/01/2016.
 */
public class DashboardPage {

    static Boolean textIsDisplaying;

    public static boolean isDisplaying(){
        /*String dashboardpageText = LoginPage.driver.findElement(By.cssSelector("div.wrap>h1")).getText();

        if(dashboardpageText.equals("Dashboard"))
            textIsDisplaying = Boolean.TRUE;
        else textIsDisplaying = Boolean.FALSE;
        System.out.println(textIsDisplaying);
        return textIsDisplaying;*/
        List<WebElement> dashBoard = LoginPage.driver.findElements(By.cssSelector("div.wrap>h1"));
        if(dashBoard.size()!=0){
            return true;}
            else return false;
    }



}
