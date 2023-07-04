package homepage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utility.Utilities;

public class TopMenuTest extends Utilities {
    String baseUrl = "http://tutorialsninja.com/demo/index.php?";

    @Before
    public void test() {
        openBrowser(baseUrl);
    }

   /* @Test
    public void selectMenu(String menu) {

    }
*/
    @Test//1
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        WebElement desktop = driver.findElement(By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]"));
        WebElement showall =  driver.findElement(By.xpath("//a[contains(text(),'Show AllDesktops')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(desktop).moveToElement(showall).click().perform();

        Select dropDown = new Select(desktop);
        dropDown.selectByValue("Show AllDesktops");

        String expectedelement = "Desktops";
        String actualresult = driver.findElement(By.xpath("//a[contains(text(),'Show AllDesktops')]")).getText();
        Assert.assertEquals("Desktops is not printed", expectedelement, actualresult);
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        WebElement LaptopsNotebooks = driver.findElement(By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(LaptopsNotebooks).click().perform();
        WebElement showall = driver.findElement(By.xpath("//a[contains(text(),'Show AllLaptops & Notebooks')]"));

        Select dropDown = new Select(showall);
        dropDown.selectByValue("Show AllLaptops & Notebooks");

        String expected = "Laptops & Notebooks";
        String actualresult =  driver.findElement(By.xpath("//h2[contains(text(),'Laptops & Notebooks')]")).getText();
        Assert.assertEquals("Laptops & Notebooks",expected,actualresult);

    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        WebElement Components = driver.findElement(By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(Components).click().perform();
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Show AllComponents')]"));
        Select dropDown = new Select(element);
        dropDown.selectByValue("Show AllComponents");
        String expected = "Components";
        String actualresult =  driver.findElement(By.xpath("//h2[contains(text(),'Components')]")).getText();
        Assert.assertEquals("Components",expected,actualresult);


    }

    public void testdraw() {
        closeBrowser();
    }
}