import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class MyStepdefs extends MainSetUpClass {
    @Given("^I go to http://pocketsdeveloper\\.com/contacts/$")
    public void iGoToHttpPocketsdeveloperComContacts() {
       driver.get("http://pocketsdeveloper.com/contacts/");
    }

    @When("^I parse my name$")
    public void iParseMyName() {
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f84-p14-o1\"]/form/p[1]/label/span/input")).sendKeys("Mike");
    }

    @And("^I parse my email$")
    public void iParseMyEmail() {
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f84-p14-o1\"]/form/p[2]/label/span/input")).sendKeys("wormike864@gmail.com");
    }

    @And("^I parse the subject$")
    public void iParseTheSubject() {
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f84-p14-o1\"]/form/p[3]/label/span/input")).sendKeys("I need help");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f84-p14-o1\"]/form/p[4]/label/span/textarea")).sendKeys("Please confrim if you are interested in creating a website for me");
    }

    @And("^I click send Button$")
    public void iClickSendButton() {
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f84-p14-o1\"]/form/p[5]/input")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("^I get the message \"([^\"]*)\"$")
    public void iGetTheMessage(String arg0) throws Throwable {
        if(driver.findElement(By.xpath("//*[@id=\"wpcf7-f84-p14-o1\"]/form/div[2]")).isDisplayed()){
            System.out.println("Test case passed. The message from the website is :" + driver.findElement(By.xpath("//*[@id=\"wpcf7-f84-p14-o1\"]/form/div[2]")).getText());
        }
        throw new PendingException();
    }
}
