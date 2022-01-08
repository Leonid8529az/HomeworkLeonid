import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class AmazonSignInTest extends MainSetUpClass {

    public void testSignInPage(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"))).build().perform();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"nav-al-signin\"]"))));
        driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div/form/div/div/div/h1"))));
        String expectedString = "Sign-In";
        String actualString = driver.getPageSource();
        if (actualString.contains(expectedString)){
            System.out.println("Testcase is passed");
        }
    }

}
