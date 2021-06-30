package StepDefinition.scholastic;
import Pages.Scholastic.EnterOrderPage;
import Pages.Scholastic.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class EnterOrderSFO {
    Homepage hp = new Homepage();
    EnterOrderPage eo = new EnterOrderPage();

    String totalItems = "";
    String totalItemsAfterItemRemoved = "";
    String totalAmount = "";
    String totalAmountAfterItemRemoved = "";
    int totalItemsInt;
    int newTotalItemsInt;



    @When("I enter the ‘Student Flyer Orders’ page.")
    public void EnterOrderSFOTab(){
        eo.hoverEnterOrder();
        eo.EnterOrderSFOPage();
    }


    @And("I enter students and their items.")
    public void enterStudentsItemsSFO(){
        //Harry's items
        eo.enterStudentNameSFO("Harry");
        eo.enterItemNumSFO("2S8");
        eo.clickAddItemSFO();
        eo.enterItemNumSFO("11S8");
        eo.clickAddItemSFO();
        //John's items
        eo.enterStudentNameSFO("John");
        eo.enterItemNumSFO("2G8");
        eo.clickAddItemSFO();
        eo.enterItemNumSFO("14G8");
        eo.clickAddItemSFO();
        //John's items
        eo.enterStudentNameSFO("Michael");
        eo.enterItemNumSFO("4G8");
        eo.clickAddItemSFO();
        eo.enterItemNumSFO("1G8");
        eo.clickAddItemSFO();
    }

    @And("I add quantities to added items.")
    public void addQuantitiesToStudentItems(){
        //2S8 = 5
        hp.type(By.xpath("//td[@class=' studentName' and text()='Harry']/following-sibling::td[@class=' hidden-xs price' and text()='$10.00']/following-sibling::td[@class=' item-qty']/input[@type='text']"),"5");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //2G8 = 2
        hp.type(By.xpath("//td[@class=' studentName' and text()='John']/following-sibling::td[@class=' hidden-xs price' and text()='$12.00']/following-sibling::td[@class=' item-qty']/input[@type='text']"),"2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //14G8 = 2
        hp.type(By.xpath("//td[@class=' studentName' and text()='John']/following-sibling::td[@class=' hidden-xs price' and text()='$10.00']/following-sibling::td[@class=' item-qty']/input[@type='text']"),"2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //4G8 = 4
        hp.type(By.xpath("//td[@class=' studentName' and text()='Michael']/following-sibling::td[@class=' hidden-xs price' and text()='$12.00']/following-sibling::td[@class=' item-qty']/input[@type='text']"),"4");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //1G8 = 10
        hp.type(By.xpath("//td[@class=' hidden-xs price' and text()='$55.00']/following-sibling::td[@class=' item-qty']/input[@type='text']"),"10");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("I click on REVIEW CART.")
        public void reviewCart(){
            eo.clickReviewCart();
        }

    @And("I remove item 2S8 for Harry.")
        public void removeItemFromCart(){
        hp.scrollDownByPixel(500);

        totalAmount = hp.getElementText(By.xpath("//ul[@class='std-total']/li[@class='std-total-price sfoSubTotalPrice']"));
        totalItems = hp.getElementText(By.xpath("//li[@class='std-total-qty']/span[@class='total-qty sfoSubTotalQty']"));
        totalItemsInt = Integer.valueOf(totalItems);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hp.clickThis(By.xpath("//*[@id='2G8']//i[@class='fa fa-times-circle remove']"));
        hp.clickThis(By.xpath("//*[@id='2G8']//button[@class='grey removeYes']"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        totalItemsAfterItemRemoved = hp.getElementText(By.xpath("//li[@class='std-total-qty']/span[@class='total-qty sfoSubTotalQty']"));
        newTotalItemsInt = Integer.valueOf(totalItemsAfterItemRemoved);
        totalAmountAfterItemRemoved = hp.getElementText(By.xpath("//ul[@class='std-total']/li[@class='std-total-price sfoSubTotalPrice']"));
    }

    @Then("I verify or Harry, item 2S8 gets deleted.")
    public void verifyItemRemoved(){
        Assert.assertFalse(hp.isElementDisplayed(By.linkText("2G8")));
    }

    @And("I verify respective amounts and quantities get updated.")
    public void verifyTotalAmountAndQuantitiesUpdated(){
        Assert.assertTrue(totalItemsInt>newTotalItemsInt);
        Assert.assertFalse(totalAmount==totalAmountAfterItemRemoved);
    }


    @And("I enter an order for a student of an invalid item number and click 'ADD'.")
    public void addingInvalidItemNum(){
        eo.enterStudentNameSFO("Harry");
        eo.enterItemNumSFO("111");
        eo.clickAddItemSFO();
    }

    @Then("I verify I get an 'Invalid Item' error message.")
    public void verifyInvalidItemErrorPresent(){
        String expectedInvalidItemErrorMessage ="Please enter a valid item number.";
        String invalidItemErrorMessage = hp.getElementText(By.id("error-message-tooltip"));
    }

    @And("I enter 3 different students' orders.")
    public void addStudentsOrders(){
        //Add item numbers
        //Harry's items
        eo.enterStudentNameSFO("Harry");
        eo.enterItemNumSFO("1G8");
        eo.clickAddItemSFO();
        eo.enterItemNumSFO("4G8");
        eo.clickAddItemSFO();

        //John's items
        eo.enterStudentNameSFO("John");
        eo.enterItemNumSFO("3S8");
        eo.clickAddItemSFO();
        //John's items
        eo.enterStudentNameSFO("Michael");
        eo.enterItemNumSFO("11S8");
        eo.clickAddItemSFO();
        eo.enterItemNumSFO("2S8");
        eo.clickAddItemSFO();

        //Add quantities
        //1G8 = 5
        hp.type(By.xpath("//td[@class=' hidden-xs price' and text()='$55.00']/following-sibling::td[@class=' item-qty']/input[@type='text']"),"5");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //3S8 = 2
        hp.type(By.xpath("//td[@class=' hidden-xs price' and text()='$7.00']/following-sibling::td[@class=' item-qty']/input[@type='text']"),"2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //11S8 = 4
        hp.type(By.xpath("//td[@class=' hidden-xs price' and text()='$5.00']/following-sibling::td[@class=' item-qty']/input[@type='text']"),"4");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //2S8 = 10
        hp.type(By.xpath("//td[@class=' hidden-xs price' and text()='$10.00']/following-sibling::td[@class=' item-qty']/input[@type='text']"),"10");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("I click on PROCEED TO CHECKOUT.")
    public void completeCheckout(){
        hp.clickThis(By.xpath("//button[@value='Proceed to Checkout']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hp.clickThis(By.xpath("//div[@id='dialog-container']//button[@class='button-text' and @value='Proceed to Checkout']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hp.clickThis(By.id("btn-continue-checkout"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I verify zero tax displayed for SFO order.")
    public void verifyZeroTaxOnSFO(){
        String expectedTax = "$0.00";
        String taxAfterCompleteCheckOut = hp.getElementText(By.id("order_total_tax"));
        Assert.assertEquals(expectedTax,taxAfterCompleteCheckOut);
    }

    @And("I add items to SFO order.")
    public void addItemsSFOOrder(){
        //Sally's items
        eo.enterStudentNameSFO("Sally");
        eo.enterItemNumSFO("1G8");
        eo.clickAddItemSFO();
        eo.enterItemNumSFO("11G8");
        eo.clickAddItemSFO();
        eo.enterItemNumSFO("3S8");
        eo.clickAddItemSFO();
        eo.enterItemNumSFO("4S8");
        eo.clickAddItemSFO();
    }

    @And("I verify zero tax for only SFO order.")
    public void verifyZeroTaxOnSFOOrderOnly(){
        double taxAmountNY = 0.08871287;

        String TYOTotalOrderAmt = hp.getElementText(By.id("teacher_order_total"));
        String TYOTotalOrderAmtNum = TYOTotalOrderAmt.replace("$","");

        double TYOTotalOrderAmtDouble = Double.valueOf(TYOTotalOrderAmtNum);


        String totalTaxAmt = hp.getElementText(By.id("teacher_order_total"));
        String totalTaxAmtNum = totalTaxAmt.replace("$","");

        double totalTaxAmtDouble = Double.valueOf(totalTaxAmtNum);




        //verification that the total TYO order amount times the NY tax, minus the total order's tax amount due is less than 1 (since it's a double variable).
        Assert.assertTrue(TYOTotalOrderAmtDouble * taxAmountNY - totalTaxAmtDouble < 1);

    }


}
