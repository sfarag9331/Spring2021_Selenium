package StepDefinition.scholastic.createAccounts;
import DriverWrapper.Web;
import Pages.Scholastic.HP_CreateAccount;
import Pages.WebCommands;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class CreateAccount {
    Web web = new Web();
    HP_CreateAccount ca = new HP_CreateAccount();

    String email = "";
    String password = "";

    @Given("I am on Scholastic Homepage.")
    public void openScholastic() {
        web.openUrl2("https://clubs3qa1.scholastic.com/home");
    }

    @When("I create a new teacher account using email '<email>' and password '<password>'.")
    public void createTeacherAccount() {
        ca.createAccount(email,password);
    }

    @And("I make the account for a taxable state using School Search.")
    public void taxableStateStateSearch(){
        ca.schoolStateSearch("New Yor","Scholastic+Book+Club");
    }

    @And("I make the account for a non-taxable state using Zip Code.")
    public void nonTaxZipCodeSearch(){
        ca.schoolZipCodeSearch("99518","ADAK SCHOO");
    }

    @And("I make the account for a taxable state using Zip Code.")
    public void taxZipCodeSearch(){
        ca.schoolZipCodeSearch("10012","Scholastic+Book+Club");
    }

    @Then("I verify there is a CLASS CODE allocated to the teacher, present on Home-Page and MyAccount-Page.")
    public void verifyAcctClassCodePresent() {
        ca.verifyClassCode();
    }

    @And("I verify same teacher name is present on My Accounts.")
    public void verifyAcctTeachNamePresent(){
        ca.verifyTeacherName();
    }

    @And("I verify same school address is present as selected while creating the account.")
    public void verifyAcctSchoolAddressPresent(){
        ca.verifySchoolAddress();
    }
}
