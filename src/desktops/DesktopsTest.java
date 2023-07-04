package desktops;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utility.Utilities;

import java.util.List;


public class DesktopsTest extends Utilities {
    String baseUrl = "http://tutorialsninja.com/demo/index.php?";

    @Before
    public void test() {
        openBrowser(baseUrl);
    }


    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        WebElement desktop = driver.findElement(By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]"));
        WebElement showall =  driver.findElement(By.xpath("//a[contains(text(),'Show AllDesktops')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(desktop).moveToElement(showall).click().perform();
        WebElement dropDown = driver.findElement(By.xpath("//body/div[@id='product-category']/div[1]/div[1]/div[3]/div[3]"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Name: Z to A");
        List<WebElement> sort = driver.findElements(By.xpath("//select[@id='input-sort']"));
        System.out.println(sort.size());
        for (WebElement ee: sort){
            System.out.println(ee.getText());
        }

    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        WebElement desktop = driver.findElement(By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]"));
        WebElement showall =  driver.findElement(By.xpath("//a[contains(text(),'Show AllDesktops')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(desktop).moveToElement(showall).click().perform();
    }

    public void testdraw() {
        closeBrowser();
    }

}
