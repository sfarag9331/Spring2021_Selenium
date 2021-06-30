package StepDefinition.scholastic;
import Pages.Scholastic.EnterOrderPage;
import Pages.Scholastic.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class EnterOrderYTO {
    Homepage hp = new Homepage();
    EnterOrderPage eo = new EnterOrderPage();
    WebElement jumper;

    @When("I enter the 'Your Teacher Order' page.")
    public void EnterOrderYTOTab(){
        eo.hoverEnterOrder();
        eo.EnterOrderYTOPage();
    }

    @And("I click the 'Your Teacher Order' tab.")
    public void YTOTab(){
        eo.EnterOrdersYTOTab();
    }

    @And("I click on the 'By Flyer' tab.")
    public void byFlyerTab(){
        eo.YTOPageByFlyerTab();
    }

    @And("I click on one of the price QTY boxes, verify I got a jumper and close that window.")
    public void priceQTYJumper() {
        eo.clickQTYBox(By.xpath("//td[@class=' item-qty']/input[@data-itemid='1S8']"));
        jumper = hp.getElement(By.id("info-student-flyer-order-fee"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I click another price QTY box and verify jumper is not displayed.")
    public void jumperNotDisplayed() {
        eo.clickQTYBox(By.xpath("//td[@class=' item-qty']/input[@data-itemid='3S8']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertFalse(hp.isElementDisplayed(jumper), "Jumper is displayed again");
    }

    @And("I add quantity in items-box.")
    public void addQuantityYTO(){
        hp.clickThis(By.xpath("//td[@class=' item-qty']/input[@data-itemid='1S8']"));
        hp.type(By.xpath("//td[@class=' item-qty']/input[@data-itemid='7S8']"),"11");
        hp.type(By.xpath("//td[@class=' item-qty']/input[@data-itemid='15S8']"),"3");
    }


}
