package initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.sql.SQLOutput;

import static initialization.TakeScreenShot.getScreenShot;

public class SeleniumMethods extends Setup {
    @Test
    public void justTest (String[] args) throws InterruptedException {
        setupDriver("win", "https://www.ebay.com", "chrome");
        String title = driver.getTitle();
        System.out.println(title);


        String actualURL = driver.getCurrentUrl();
        System.out.println(actualURL);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        WebElement saved = driver.findElement(By.linkText("Saved"));


        driver.navigate();
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().refresh();


        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
        @Test
        public void pocketsSiteTest () throws InterruptedException {
            setupDriver("win", "http://www.pocketsdeveloper.com/", "chrome");
            driver.findElement(By.xpath("//*[@id=\"menu-item-20\"]")).click();
            Thread.sleep(2000);
            JavascriptExecutor Scroll = (JavascriptExecutor) driver;
            Scroll.executeScript("window.scrollBy(0, 900);");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"wpcf7-f84-p14-o1\"]/form/p[1]/label/span/input")).sendKeys("Misha");
            driver.findElement(By.xpath("//*[@id=\"wpcf7-f84-p14-o1\"]/form/p[2]/label/span/input")).sendKeys("gggggg@gmail.com");
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"wpcf7-f84-p14-o1\"]/form/p[5]/input")).click();
            Thread.sleep(3000);
            String omg = driver.findElement(By.xpath("//*[@id=\"wpcf7-f84-p14-o1\"]/form/div[2]")).getText();
            System.out.println(omg);
            getScreenShot(driver);
            Thread.sleep(3000);
            driver.close();
            driver.quit();
        }
        @Test
        public void amazonTest() throws InterruptedException {
            setupDriver("win", "https://www.amazon.com/", "chrome");
            String expectedMessAmazon = "Important Message!";
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
            driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("Misha");
            driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("123");
            driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
            Thread.sleep(2000);
            String actualMessAmazon = driver.findElement(By.xpath("//*[@id=\"auth-warning-message-box\"]/div/h4")).getText();
            Assert.assertEquals(expectedMessAmazon, actualMessAmazon);
            System.out.println("Test Succeed");
            getScreenShot(driver);
            driver.close();
            driver.quit();
        }
        @Test
        public void ipTestCase() throws InterruptedException {
            setupDriver("win", "https://www.ip2location.com/", "chrome");
            String expectedCityIp2Loc = "Flushing";
            Thread.sleep(2000);
            JavascriptExecutor Scroll = (JavascriptExecutor) driver;
            Scroll.executeScript("window.scrollBy(0, 800);");
            Thread.sleep(5000);
            Actions act = new Actions(driver);
            act.moveToElement(driver.findElement(By.xpath("//*[@id=\"city-name\"]"))).build().perform();
            Thread.sleep(2000);
            String actualCityIp2Loc = driver.findElement(By.xpath("//*[@id=\"city-name\"]")).getText();
            Assert.assertEquals(expectedCityIp2Loc, actualCityIp2Loc);
            System.out.println("Test succeed");
            getScreenShot(driver);
            driver.close();
            driver.quit();

        }

        @Test
        public void youtubeTest() throws InterruptedException {
            setupDriver("win", "https://www.youtube.com/", "chrome");
            driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Fun videos");
            driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
            Thread.sleep(3000);
            String expectedTitle = "Youtube";
            String actualTitle = driver.getTitle();
            if (actualTitle.equalsIgnoreCase(expectedTitle)) {
                System.out.println("Success");
            }
            Actions act = new Actions(driver);
            act.moveToElement(driver.findElement(By.xpath("//*[@id=\"img\"]"))).click().build().perform();
            Thread.sleep(3000);
            getScreenShot(driver);
            driver.close();
            driver.quit();
        }

        @Test
        public void facebookTest(){
            setupDriver("win", "https://www.facebook.com/", "chrome");
            driver.findElement(By.xpath("//*[@id = 'email']")).sendKeys("username");
            driver.findElement(By.xpath("//*[@id = 'pass']")).sendKeys("password");
            driver.findElement(By.xpath("//*[@value = 'Log In']")).click();
            try{
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        driver.close();
        driver.quit();

        }





    }

