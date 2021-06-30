package StepDefinition.scholastic;
import Pages.Scholastic.Homepage;
import Pages.Scholastic.MyAcctPaymentMethodsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;


public class AddCreditCards {
    Homepage hp = new Homepage();
    MyAcctPaymentMethodsPage pm = new MyAcctPaymentMethodsPage();

        @And("I am on 'Payment Options' page.")
        public void paymentOptionsPage(){
            pm.paymentOptionsPage();
        }

        @When("I verify I have 3 cards under my payment options.")
        public void verify3CardsPresent(){
            List <WebElement> creditCards = new ArrayList<>();
            creditCards = hp.getElements(By.xpath("//div[@class='name']"));
            Assert.assertTrue(creditCards.size()==3, "You have less than 3 cards in account");
        }

        @And("I add a credit card to my Payment Options.")
        public void add4thCreditCard (){
            pm.addCreditCard();
        }

        @Then("I verify I receive an error message.")
        public void maxNumCreditCardsErrorMessage(){
            String expectedErrorMessage = "You can only store three credit cards";
            String adding4thCardError = hp.getElementText(By.xpath("//div[@class='tooltipster-content']//div[@class='tooltipster-body']"));

            Assert.assertEquals(expectedErrorMessage,adding4thCardError);
        }

}
