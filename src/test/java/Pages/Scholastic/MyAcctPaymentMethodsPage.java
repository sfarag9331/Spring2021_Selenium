package Pages.Scholastic;

import Pages.WebCommands;
import org.openqa.selenium.By;

public class MyAcctPaymentMethodsPage extends WebCommands {

    public void paymentOptionsPage(){
        clickThis(By.xpath("//span[@class='hide-mobile user-account-name' and text()='My Account']"));
        clickThis(By.xpath("//div[@class='toggle-content']//a[text()='Payment Methods']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addCreditCard(){
        clickThis(By.xpath("//div[@class='link link-credit-card']/a"));
    }

}
