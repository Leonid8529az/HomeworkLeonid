package initialization;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static initialization.Setup.driver;
import static initialization.Setup.setupDriver;

public class TakeScreenShot {

    public static void main(String[] args) {
        getScreenShot(driver);
    }

    public static void getScreenShot(WebDriver driver) {

        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        String name = df.format(date);


        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("C:\\Users\\wormi\\IdeaProjects\\Google\\src\\main\\resources\\screenshots\\new.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
