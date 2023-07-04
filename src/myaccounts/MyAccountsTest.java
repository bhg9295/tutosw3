package myaccounts;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.Utilities;

public class MyAccountsTest extends Utilities {
    String baseUrl = "http://tutorialsninja.com/demo/index.php?";

    @Before
    public void test() {
        openBrowser(baseUrl);
    }


    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
        WebElement myaccount =  driver.findElement(By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]"));
        Select dropDown = new Select( myaccount);
        dropDown.selectByValue("select my account");

        String expected = "Register Account";
        String actualresult = driver.findElement(By.xpath("//h1[contains(text(),'Register Account')]")).getText();
        Assert.assertEquals("Register Account is not dispaly", expected, actualresult);

    }
@Test
public void verifyUserShouldNavigateToLoginPageSuccessfully(){
    driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
    String expected = "Returning Customer";
    String actualresult = driver.findElement(By.xpath("//h2[contains(text(),'Returning Customer')]")).getText();
    Assert.assertEquals("Returning Customer is not dispaly", expected, actualresult);
}
@Test
public void verifyThatUserRegisterAccountSuccessfully(){
    driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
sendTextToElement(By.xpath("//input[@id='input-firstname']"),"Prime");
sendTextToElement(By.xpath("//input[@id='input-lastname']"),"Patel");
sendTextToElement(By.xpath("//input[@id='input-email']"),"bh1234@gmail.com");
sendTextToElement(By.xpath("//input[@id='input-telephone']"),"123prime");
sendTextToElement(By.xpath("//input[@id='input-password']"),"prime123");
sendTextToElement(By.xpath("//input[@id='input-confirm']']"),"prime123");
sendTextToElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]"),"yes");
clickOnElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
clickOnElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]"));

}
    @After
    public void testdraw() {
        closeBrowser();
    }

}
