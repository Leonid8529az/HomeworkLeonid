package initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class Setup {
    public static WebDriver driver = null;
    //ToDo: Setup the path for the Mozilla (by tomorrow)

    public static WebDriver setupDriver(String platform, String url, String browser){
        if(platform.equalsIgnoreCase("win") && browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\wormi\\IdeaProjects\\Google\\src\\main\\resources\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(url);
        }
        if(platform.equalsIgnoreCase("win") && browser.equalsIgnoreCase("mozilla")){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\wormi\\IdeaProjects\\Google\\src\\main\\resources\\drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(url);
        }

        return  driver;

    }

}
