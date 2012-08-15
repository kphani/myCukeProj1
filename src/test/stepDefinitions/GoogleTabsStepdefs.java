

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: kphani
 * Date: 7/8/12
 * Time: 3:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class GoogleTabsStepdefs {

    private final WebDriver driver;

    public GoogleTabsStepdefs(SharedDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("^click.*")
    public void clickGmailTab() {
        driver.findElement(By.id("gb_23")).click();
    }

    @Then("^browser.*")
    public void cardShouldBeReturned() {
           assertTrue(driver.findElement(By.linkText("Create an account")).isDisplayed());
        driver.findElement(By.linkText("Create an account")).click();



    }
}
