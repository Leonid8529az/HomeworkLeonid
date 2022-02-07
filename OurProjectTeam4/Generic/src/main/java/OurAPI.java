import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OurAPI {
        public WebDriver driver;
        @Parameters({"OS","browserName","url"})
        @BeforeMethod
        public void startingPoint(@Optional("windows") String OS, @Optional("chrome") String browserName,@Optional("https://google.com") String url) {
            System.out.println("---------------------------------------------------");
            getDriver(OS, browserName);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(url);
        }
        public WebDriver getDriver(@Optional("windows") String os, String browserName) {
            String prop = System.getProperty("user.dir");
            if (browserName.equalsIgnoreCase("chrome")) {
                if (os.equalsIgnoreCase("windows")) {
                    System.setProperty("webdriver.chrome.driver", prop + "\\src\\driver\\chromedriver.exe");
                } else if (os.equalsIgnoreCase("mac")) {
                    System.setProperty("webdriver.chrome.driver", prop + "\\src\\driver\\chromedriver");
                }
                driver = new ChromeDriver();
            }

            else if (browserName.equalsIgnoreCase("firefox")) {
                if (os.equalsIgnoreCase("windows")) {
                    System.setProperty("webdriver.chrome.driver", prop + "\\src\\driver\\geucodriver.exe");
                } else if (os.equalsIgnoreCase("mac")){
                    System.setProperty("webdriver.chrome.driver", prop + "\\src\\driver\\geucodriver");
                }
                driver = new FirefoxDriver();
            }

        return driver;
    }
    @AfterMethod
    public void endPoint() {
        driver.quit();
    }
    public String getTitle() {
           return driver.getTitle();
    }
    public void click(String locator) {
        try {
            driver.findElement(By.xpath(locator)).click();
        } catch (Exception e) {
            driver.findElement(By.cssSelector(locator)).click();
        }
    }
    public void enterText(String locator, String whichTextYouWantToEnter) {
        try {
            driver.findElement(By.xpath(locator)).sendKeys(whichTextYouWantToEnter, Keys.ENTER);
        } catch (Exception e) {
            driver.findElement(By.cssSelector(locator)).sendKeys(whichTextYouWantToEnter,Keys.ENTER);
        }
    }
    public void clickByID(String locator) {
        driver.findElement(By.id(locator)).click();
    }
    public void enterTextByID(String locator, String yourTextHere) {
        driver.findElement(By.id(locator)).sendKeys(yourTextHere,Keys.ENTER);
    }
    public void waitSeconds(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public WebElement createWebElement(String locator) {
        WebElement element = driver.findElement(By.xpath(locator));
        return element;
    }
    public WebElement createWebElementByID(String locator) {
        WebElement element = driver.findElement(By.id(locator));
        return element;
    }
    public List<WebElement> lisrOfWebElements(String dropdownLocator) {
        List<WebElement> list = driver.findElements(By.xpath(dropdownLocator));
        return list;
    }
    public List<WebElement> listOfWebElementsByID(String dropdownLocator) {
        List<WebElement> list = driver.findElements(By.id(dropdownLocator));
        return list;
    }
    public String getTextByID(String locator) {
        return driver.findElement(By.id(locator)).getText();
    }
    public String getText(String locator) {
        return driver.findElement(By.xpath(locator)).getText();
    }
    public void selectDropDownOption(String locator, String option) {
        try {
            WebElement element = driver.findElement(By.xpath(locator));
            Select select = new Select(element);
            try {
                select.selectByVisibleText(option);
            } catch (Exception e) {
                select.selectByValue(option);
            }
        } catch (Exception e) {
            WebElement element = driver.findElement(By.cssSelector(locator));
            Select select = new Select(element);
            try {
                select.selectByVisibleText(option);
            } catch (Exception e1) {
                select.selectByValue(option);
            }
        }
    }
    public void selectDropDownOptionByID(String locator, String option) {
        WebElement element = driver.findElement(By.id(locator));
        Select select = new Select(element);
        try {
            select.selectByVisibleText(option);
        } catch (Exception e) {
            select.selectByValue(option);
        }

    }
    public void switchToDifferentWindow() {
        for(String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }
    public void switchToDifferentTab() {
        String oldTab = driver.getWindowHandle();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
    }
    public void alertClick(boolean trueOrFalse) {
        if (trueOrFalse == true) {
            driver.switchTo().alert().accept();
        } else {
            driver.switchTo().alert().dismiss();
        }
    }
    public String alertTextDetector() {
        return driver.switchTo().alert().getText();
    }
    public void scroller(String howManyPixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + howManyPixels + ")");

    }
    public WebElement createWebElementFromClassName(String locator) {
        return driver.findElement(By.className(locator));
    }
    public void hoverOver(String locator) {
        Actions action = new Actions(driver);
        try {
            WebElement element = driver.findElement(By.xpath(locator));
            action.moveToElement(element).build().perform();
        } catch (Exception e) {
            WebElement element = driver.findElement(By.cssSelector(locator));
            action.moveToElement(element).build().perform();
        }
    }
    public void switchToIFrame(int index) {
        driver.switchTo().frame(index);
    }
    public void howManyIframesWeHave() {
        int size = driver.findElements(By.tagName("iframe")).size();
        for (int i = 0; i<size;i++) {
            driver.switchTo().frame(i);
            System.out.println(i + " " + driver.getTitle());
        }
    }
    public void pressEnter(String locator) {
        try {
            driver.findElement(By.xpath(locator)).sendKeys(Keys.ENTER);
        } catch (Exception e) {
            driver.findElement(By.cssSelector(locator)).sendKeys(Keys.ENTER);
        }
    }
    public void checkIfIsChecked(String locator) {
        try {
            Assert.assertTrue(driver.findElement(By.xpath(locator)).isSelected());
        } catch (Exception e) {
            Assert.assertTrue(driver.findElement(By.cssSelector(locator)).isSelected());
        }

    }
    public void checkIfIsUnChecked(String locator) {
        try {
            Assert.assertFalse(driver.findElement(By.xpath(locator)).isSelected());
        } catch (Exception e) {
            Assert.assertFalse(driver.findElement(By.cssSelector(locator)).isSelected());
        }

    }
    public void checkIfIsVisible(String locator) {
        try {
            Assert.assertTrue(driver.findElement(By.xpath(locator)).isDisplayed());
        } catch (Exception e) {
            Assert.assertTrue(driver.findElement(By.cssSelector(locator)).isDisplayed());
        }

    }
    public void checkIfIsNotVisible(String locator) {
        try {
            Assert.assertFalse(driver.findElement(By.xpath(locator)).isDisplayed());
        } catch (Exception e) {
            Assert.assertFalse(driver.findElement(By.cssSelector(locator)).isDisplayed());
        }

    }
    public void checkIfIsEnabled(String locator) {
        try {
            Assert.assertTrue(driver.findElement(By.xpath(locator)).isEnabled());
        } catch (Exception e) {
            Assert.assertTrue(driver.findElement(By.cssSelector(locator)).isEnabled());
        }

    }
    public void checkIfIsNotEnabled(String locator) {
        try {
            Assert.assertFalse(driver.findElement(By.xpath(locator)).isEnabled());
        } catch (Exception e) {
            Assert.assertFalse(driver.findElement(By.cssSelector(locator)).isEnabled());
        }

    }
    public void scrollToView(String locator) {
        try {
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath(locator)));
        } catch (Exception e) {
            JavascriptExecutor js = ((JavascriptExecutor)driver);
            js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.cssSelector(locator)));
        }
    }

    //List of same functions, but they take WebElement as an argument
    public void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            element.click();
        }
    }
    public void enterText(WebElement element, String whichTextYouWantToEnter) {
        try {
            element.sendKeys(whichTextYouWantToEnter, Keys.ENTER);
        } catch (Exception e) {
            element.sendKeys(whichTextYouWantToEnter,Keys.ENTER);
        }
    }
    public String getText(WebElement element) {
        return element.getText();
    }
    public void selectDropDownOption(WebElement element, String option) {
        try {
            Select select = new Select(element);
            try {
                select.selectByVisibleText(option);
            } catch (Exception e) {
                select.selectByValue(option);
            }
        } catch (Exception e) {
            Select select = new Select(element);
            try {
                select.selectByVisibleText(option);
            } catch (Exception e1) {
                select.selectByValue(option);
            }
        }
    }
    public void selectDropDownOptionByID(WebElement element, String option) {
        Select select = new Select(element);
        try {
            select.selectByVisibleText(option);
        } catch (Exception e) {
            select.selectByValue(option);
        }

    }
    public void hoverOver(WebElement element) {
        Actions action = new Actions(driver);
        try {
            action.moveToElement(element).build().perform();
        } catch (Exception e) {
            action.moveToElement(element).build().perform();
        }
    }
    public void pressEnter(WebElement element) {
        try {
            element.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            element.sendKeys(Keys.ENTER);
        }
    }
    public void checkIfIsChecked(WebElement element) {
        try {
            Assert.assertTrue(element.isSelected());
        } catch (Exception e) {
            Assert.assertTrue(element.isSelected());
        }

    }
    public void checkIfIsUnChecked(WebElement element) {
        try {
            Assert.assertFalse(element.isSelected());
        } catch (Exception e) {
            Assert.assertFalse(element.isSelected());
        }

    }
    public void checkIfIsVisible(WebElement element) {
        try {
            Assert.assertTrue(element.isDisplayed());
        } catch (Exception e) {
            Assert.assertTrue(element.isDisplayed());
        }

    }
    public void checkIfIsNotVisible(WebElement element) {
        try {
            Assert.assertFalse(element.isDisplayed());
        } catch (Exception e) {
            Assert.assertFalse(element.isDisplayed());
        }

    }
    public void checkIfIsEnabled(WebElement element) {
        try {
            Assert.assertTrue(element.isEnabled());
        } catch (Exception e) {
            Assert.assertTrue(element.isEnabled());
        }

    }
    public void checkIfIsNotEnabled(WebElement element) {
        try {
            Assert.assertFalse(element.isEnabled());
        } catch (Exception e) {
            Assert.assertFalse(element.isEnabled());
        }

    }
    public void scrollToView(WebElement element) {
        try {
            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("arguments[0].scrollIntoView(true)", element);
        } catch (Exception e) {
            JavascriptExecutor js = ((JavascriptExecutor)driver);
            js.executeScript("arguments[0].scrollIntoView(true)",element);
        }
    }
}
