import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverExecutor {
    public static void main(String[] args) {
        DriverMain dm = new DriverMain();
        WebDriver driver = dm.setupDriver();
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement something = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[6]/tbody/tr/td[1]/table/tbody/tr/td/a"));
        JavascriptExecutor java = (JavascriptExecutor)driver;
        java.executeScript("arguments[0].scrollIntoView(true);", something);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[1]/tbody/tr/td/table/tbody/tr[2]/td[3]/select/option[2]"))));

    }
}
