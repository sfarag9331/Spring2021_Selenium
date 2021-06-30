package StepDefinition.scholastic;
import Pages.Scholastic.Homepage;
import Pages.Scholastic.RecommendationListPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RecommendationListQuickLook {
    Homepage hp = new Homepage();
    RecommendationListPage book = new RecommendationListPage();
    String email = "";
    String password = "a123456";
    String expectedBookTitle = "";


    @When("I search a book in the search bar, using a keyword.")
    public void bookSearchByName(){
        book.bookSearch("Harry");
        expectedBookTitle = hp.getElementAttributeValue(By.xpath("//a[@class='thumb-link' and @title='Harry Potter and the Goblet of Fire']"),"title");
    }

    @And("I click on ‘Quick Look’ on a book from results.")
    public void quickLook(){
        book.hoverBook();
        hp.clickThis(By.xpath("//a[@title='Harry Potter and the Goblet of Fire']/..//following-sibling::a[text()='QUICK LOOK']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("I click on Recommend.")
    public void recommend(){
        book.clickRecommend();
    }

    @And("Select ‘Recommendations to Students’ from options.")
    public void recommendationsToStudents(){
        book.addToRecommendationsToStudentsList();
    }

    @Then("I verify the item is added in Recommendations to Students Lists under My Lists.")
    public void verifyItemAddedToRecommendationsList(){
        book.recommendationsToStudentsListPage();
        String bookTitleRecommended = hp.getElementText(By.xpath("//div[@class='product-list-item']//a[@class='quickview']"));

        Assert.assertEquals(expectedBookTitle,bookTitleRecommended);
    }
}
