package laptopsandnotebooks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.Utilities;

public class LaptopsAndNotebooksTest extends Utilities {
    String baseUrl = "http://tutorialsninja.com/demo/index.php?";

    @Before
    public void test() {
        openBrowser(baseUrl);
    }


    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        WebElement LaptopsNotebooks = driver.findElement(By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(LaptopsNotebooks).click().perform();
        WebElement showall = driver.findElement(By.xpath("//a[contains(text(),'Show AllLaptops & Notebooks')]"));


    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        WebElement LaptopsNotebooks = driver.findElement(By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(LaptopsNotebooks).click().perform();
        WebElement showall = driver.findElement(By.xpath("//a[contains(text(),'Show AllLaptops & Notebooks')]"));
    }

@After
    public void testdraw() {
        closeBrowser();
    }


}
