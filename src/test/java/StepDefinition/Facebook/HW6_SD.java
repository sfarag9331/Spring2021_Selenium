package StepDefinition.Facebook;
import DriverWrapper.Web;
import Pages.Facebook.Facebook_Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW6_SD {

    //Verify no gender-radio button is selected on Facebook sign up form
    @Given("I am on Facebook Homepage")
    public void openFacebook() {
        Web web = new Web();
        web.openUrl2("https://www.facebook.com/");
    }

    @When("I click the 'Create New Account' button")
    public void enterLoginEmail(String email) {
        Facebook_Homepage hp = new Facebook_Homepage();
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.linkText("Create New Account"));
        hp.isElementSelected();
        // hp.typeInField("login", email);
    }

    @Then("I verify that no gender-radio button is selected")
    public void enterLoginPassword(String password) {
        Facebook_Homepage hp = new Facebook_Homepage();
        WebDriver driver = new ChromeDriver();
        List<WebElement> radioButtonsLocator = driver.findElements(By.xpath("input[@type='radio']"));
        boolean isRadioButtonSelected = true;
        for (WebElement radioButtons : radioButtonsLocator){
            hp.isElementSelected(radioButtons);
            }
        }


    //Verify user see "Incorrect credentials" error msg when login with no credentials on facebook messenger
    @Given("I am on Facebook Homepage")
            web.openUrl2("https://www.facebook.com/");
    }

    @When("I click the 'Messenger' button")
            driver.findElement(By.xpath("//a[text()='Messenger']")).click();

    @And("I click the 'Login' button (no credentials were filled in)")
            driver.findElement(By.id("loginbutton")).click();

    @Then("I verify that user see "Incorrect credentials" error msg")
            String expectedErrorMessage = "Incorrect credentials";
            String errorMessage = driver.findElement(By.linkText("Incorrect credentials")).getText();
            Assert.assertEquals(errorMessage,expectedErrorMessage, "Error msg not shown when login with no credentials on facebook messenger");
}
