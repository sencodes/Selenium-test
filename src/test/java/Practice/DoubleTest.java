package Practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by SenthilKumar on 02/11/2014.
 */
public class    DoubleTest {

    private static WebDriver driver;
    private static int xyz;

    @Test
    public void mainTest(){
        driver = new FirefoxDriver();
        driver.get("http://the-internet.herokuapp.com/tables");
        new WebDriverWait(driver,7).until(ExpectedConditions.titleIs("The Internet"));
        String title01 = driver.getTitle();
        if (title01.equals("The Internet")) {
            System.out.println("The title is as expected");}
        else System.out.println("The title is not as expected");

        //WebElement ele01 = driver.findElement(By.cssSelector("div.row:nth-child(2)>div[id='content']>div.example>table.tablesorter>thead>tr>th.header"));
        //System.out.println("The text in the first line of table header is "+ele01.getText());

        WebElement table01 = driver.findElement(By.cssSelector("table[id='table1']"));

        List<WebElement> rowcount = table01.findElements(By.cssSelector("tbody>tr"));
        System.out.println("rowcount size is "+rowcount.size());


        List<WebElement> coltotal = table01.findElements(By.cssSelector("tbody>tr>td"));
        System.out.println(coltotal.size());

        List<WebElement> col1total = table01.findElements(By.cssSelector("tbody>tr>td:nth-child(1)"));
        System.out.println("Column one size is "+col1total.size());

        List<WebElement> col2total = table01.findElements(By.cssSelector("tbody>tr>td:nth-child(2)"));
        System.out.println("Column one size is "+col2total.size());

        List<WebElement> col3total = table01.findElements(By.cssSelector("tbody>tr>td:nth-child(3)"));
        System.out.println("Column one size is "+col3total.size());

        List<WebElement> col4total = table01.findElements(By.cssSelector("tbody>tr>td:nth-child(4)"));
        System.out.println("Column one size is "+col4total.size());

        List<WebElement> col5total = table01.findElements(By.cssSelector("tbody>tr>td:nth-child(5)"));
        System.out.println("Column one size is "+col5total.size());

            for (int col1count=0; col1count<col1total.size();col1count++)
            {
                int col1num = col1count+1;
                System.out.println("Row number "+col1num+" and Column number 1 is "+col1total.get(col1count).getText());
            }

        for (int col2count=0; col2count<col2total.size();col2count++)
        {
            int col2num = col2count+1;
            System.out.println("Row number "+col2num+" and Column number 2 is "+col2total.get(col2count).getText());
        }

        for (int col3count=0; col3count<col3total.size();col3count++)
        {
            int col3num = col3count+1;
            System.out.println("Row number "+col3num+" and Column number 3 is "+col3total.get(col3count).getText());
        }
        for (int col4count=0; col4count<col4total.size();col4count++)
        {
            int col4num = col4count+1;
            System.out.println("Row number "+col4num+" and Column number 4 is "+col4total.get(col4count).getText());
        }
        for (int col5count=0; col5count<col5total.size();col5count++)
        {
            int col3num = col5count+1;
            System.out.println("Row number "+col3num+" and Column number 5 is "+col5total.get(col5count).getText());
        }
    }
}
