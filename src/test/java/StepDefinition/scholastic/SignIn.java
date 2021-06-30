package StepDefinition.scholastic;
import Pages.Scholastic.Homepage;
import cucumber.api.java.en.Given;

public class SignIn {
    Homepage hp = new Homepage();

    @Given("^I am logged in to my Scholastic teacher account using email '(.*)' and password '(.*)'.$")
    public void signIn(String email, String password){
        hp.login(email, password);
    }
}
