package initialization;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static initialization.Setup.setupDriver;

public class AssertionsMozilla extends Setup{
    @Test
    public void SoftAssertMozilla(){
        setupDriver("win", "https://www.facebook.com/", "mozilla");
        String actualTitleMoz = driver.getTitle();
        String expectedTitleSelenium = "Facebook";
        SoftAssert softy = new SoftAssert();
        try{
            softy.assertEquals(expectedTitleSelenium, actualTitleMoz);
        } catch (AssertionError ae) {
            ae.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id = 'email']")).sendKeys("username");
        driver.findElement(By.xpath("//*[@id = 'pass']")).sendKeys("password");
        driver.findElement(By.xpath("//*[@value = 'Log In']")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
