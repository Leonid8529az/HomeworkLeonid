import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExecutorClass {

    public WebDriver driver = null;

    @BeforeClass
    public WebDriver startTheDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wormi\\IdeaProjects\\DeloVseiZhizni\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/watch?v=UCqyB156lLY&t=1s");
        return driver;
    }


    @Test
    public void commentOnThatShit(){
        //driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("wc3 дело всей жизни");
        //driver.findElement(By.id("search-icon-legacy")).click();
        //waitFor(2);
        //driver.findElement(By.id("img")).click();
        //driver.findElement(By.xpath("//*[@id=\"dismissable\"]/div")).click();
        //driver.findElement(By.cssSelector("#dismissable > div")).click();
        waitFor(5);
        //driver.findElement(By.xpath("//*[@id=\"button\"]")).click();
        //driver.findElement(By.id("button")).click();
        driver.findElement(By.cssSelector("#buttons > ytd-button-renderer > a")).click();
        waitFor(2);
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("migorine25@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        waitFor(2);
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("318292ne");
        waitFor(2);
        driver.findElement(By.id("passwordNext")).click();
        waitFor(5);



        driver.findElement(By.cssSelector("#top-level-buttons > ytd-toggle-button-renderer:nth-child(1) > a")).click();



        driver.findElement(By.xpath("//*[@id=\"subscribe-button\"]/ytd-subscribe-button-renderer/paper-button")).click();
        JavascriptExecutor jx = (JavascriptExecutor)driver;
        jx.executeScript("scroll(0,350);");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"placeholder-area\"]"))).click(driver.findElement(By.xpath("//*[@id=\"placeholder-area\"]"))).sendKeys("Marica Yo").build().perform();
        waitFor(4);
        driver.findElement(By.cssSelector("#submit-button > a")).click();
        waitFor(2);

    }



    public void waitFor(int sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    @AfterClass
    public void driverQuit(){
        driver.close();
        driver.quit();
    }
}
