import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class MainSetUpClass {

    public static WebDriver driver = null;
    public static WebDriverWait wait = null;

    @Parameters({"url"})
    @BeforeMethod
    public static WebDriver setUpMyWebdriver(String url){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\wormi\\IdeaProjects\\mentoringMavenProject\\generic\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        wait = new WebDriverWait(driver, 30);
        return driver;
    }

    @AfterMethod
    public static void closeDriver(){
        driver.close();
        driver.quit();
    }


}
