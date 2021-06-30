package Tests;

import DriverWrapper.Web;
import Pages.WebCommands;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;



import static org.openqa.selenium.By.*;

public class SprintCodeTests extends WebCommands {
@Test
public void add4thCreditCardPaymentOptionsPage(){
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://clubs3qa1.scholastic.com/home");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//    clickThis(driver.findElement(linkText("Sign In")));
        driver.findElement(linkText("Sign In")).click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeMyScholastic']")));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(xpath("//input[contains(@id,'user-text')]")).sendKeys("a@a.co" );

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(xpath("//div/button[@aria-label='submit button to continue']")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(xpath("//input[contains(@id,'password-text-field')]")).sendKeys("a123456" );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(xpath("//div/button[@aria-label='submit button to continue']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//span[@class='notification-close']")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        clickThis(By.xpath("//span[@class='hide-mobile user-account-name' and text()='My Account']"));
//        clickThis(By.xpath("//div[@class='toggle-content']//a[text()='Payment Methods']"));
        driver.findElement(xpath("//span[@class='hide-mobile user-account-name' and text()='My Account']")).click();
        driver.findElement(xpath("//div[@class='toggle-content']//a[text()='Payment Methods']")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List <WebElement> creditCards = new ArrayList<>();
        creditCards = driver.findElements(By.xpath("//div[@class='name']"));
        Assert.assertTrue(creditCards.size()==3, "You have less than 3 cards in account");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//div[@class='link link-credit-card']/a")).click();

        String expectedErrorMessage = "You can only store three credit cards";
        String adding4thCardError = driver.findElement(By.xpath("//div[@class='tooltipster-content']//div[@class='tooltipster-body']")).getText();

        Assert.assertEquals(expectedErrorMessage,adding4thCardError);
    }

@Test
public void stringShort(){
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
    WebDriver driver = new ChromeDriver();

    driver.get("https://clubs3qa1.scholastic.com/home");
    driver.manage().window().maximize();
    Actions act = new Actions(driver);

    JavascriptExecutor js = (JavascriptExecutor)driver;



    driver.findElement(linkText("Sign In")).click();


    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeMyScholastic']")));

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(xpath("//input[contains(@id,'user-text')]")).sendKeys("e@e.co" );

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//div/button[@aria-label='submit button to continue']")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//input[contains(@id,'password-text-field')]")).sendKeys("e123456" );
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//div/button[@aria-label='submit button to continue']")).click();
    try {
        Thread.sleep(7000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//span[@class='notification-close']")).click();

    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    act.moveToElement(driver.findElement(By.xpath("//div[@class='sidecar-top']/following-sibling::div//a[@id='enter-orders']"))).build().perform();

    driver.findElement(By.xpath("//div[@class='sidecar-top']/following-sibling::div//li[@id='student-flyer-orders']/a")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
//enter items per student
    //Harry
    driver.findElement(By.id("student-name")).sendKeys("Sally");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("item-number")).sendKeys("1G8");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-add")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("item-number")).sendKeys("11G8");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-add")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("item-number")).sendKeys("3S8");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-add")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("item-number")).sendKeys("4S8");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-add")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement((By.xpath("//li[@id='tab-yto']/a"))).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.xpath("//ul[@class='hidden-xs']//a[text()='By Flyer']")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.xpath("//td[@class=' item-qty']/input[@data-itemid='1S8']")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//td[@class=' item-qty']/input[@data-itemid='7S8']")).sendKeys("11");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//td[@class=' item-qty']/input[@data-itemid='15S8']")).sendKeys("3");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.xpath("//a/button[text()='Review Cart']")).click();

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//button[@value='Proceed to Checkout']")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//div[@id='dialog-container']//button[@class='button-text' and @value='Proceed to Checkout']")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-continue-checkout")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    double taxAmountNY = 0.08871287;

    String TYOTotalOrderAmt = driver.findElement(By.id("teacher_order_total")).getText();
    String TYOTotalOrderAmtNum = TYOTotalOrderAmt.replace("$","");

    double TYOTotalOrderAmtDouble = Double.valueOf(TYOTotalOrderAmtNum);



    String totalTaxAmt = driver.findElement(By.id("teacher_order_total")).getText();
    String totalTaxAmtNum = totalTaxAmt.replace("$","");

    double totalTaxAmtDouble = Double.valueOf(totalTaxAmtNum);




    //verification that the total TYO order amount times the NY tax, minus the total order's tax amount due is less than 1 (since it's a double variable).
    Assert.assertTrue(TYOTotalOrderAmtDouble * taxAmountNY - totalTaxAmtDouble < 1);
}



@Test
public void zeroTSFO(){
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
    WebDriver driver = new ChromeDriver();

    driver.get("https://clubs3qa1.scholastic.com/home");
    driver.manage().window().maximize();
    Actions act = new Actions(driver);

    JavascriptExecutor js = (JavascriptExecutor)driver;



    driver.findElement(linkText("Sign In")).click();


    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeMyScholastic']")));

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(xpath("//input[contains(@id,'user-text')]")).sendKeys("e@e.co" );

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//div/button[@aria-label='submit button to continue']")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//input[contains(@id,'password-text-field')]")).sendKeys("e123456" );
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//div/button[@aria-label='submit button to continue']")).click();
    try {
        Thread.sleep(7000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//span[@class='notification-close']")).click();

    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    act.moveToElement(driver.findElement(By.xpath("//div[@class='sidecar-top']/following-sibling::div//a[@id='enter-orders']"))).build().perform();

    driver.findElement(By.xpath("//div[@class='sidecar-top']/following-sibling::div//li[@id='student-flyer-orders']/a")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
//enter items per student
    //Harry
    driver.findElement(By.id("student-name")).sendKeys("Harry");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("item-number")).sendKeys("1G8");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-add")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.id("item-number")).sendKeys("4G8");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-add")).click();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    //John
    driver.findElement(By.id("student-name")).sendKeys("John");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("item-number")).sendKeys("3S8");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-add")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }


    //Michael
    driver.findElement(By.id("student-name")).sendKeys("Michael");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("item-number")).sendKeys("11S8");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-add")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.id("item-number")).sendKeys("2S8");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-add")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    //item quantities
    //1G8 = 5
    driver.findElement(By.xpath("//td[@class=' hidden-xs price' and text()='$55.00']/following-sibling::td[@class=' item-qty']/input[@type='text']")).sendKeys("5");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    //3S8 = 2
    driver.findElement(By.xpath("//td[@class=' hidden-xs price' and text()='$7.00']/following-sibling::td[@class=' item-qty']/input[@type='text']")).sendKeys("2");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    //11S8 = 4
    driver.findElement(By.xpath("//td[@class=' hidden-xs price' and text()='$5.00']/following-sibling::td[@class=' item-qty']/input[@type='text']")).sendKeys("4");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    //2S8 = 10
    driver.findElement(By.xpath("//td[@class=' hidden-xs price' and text()='$10.00']/following-sibling::td[@class=' item-qty']/input[@type='text']")).sendKeys("10");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.xpath("//a/button[text()='Review Cart']")).click();

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//button[@value='Proceed to Checkout']")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//div[@id='dialog-container']//button[@class='button-text' and @value='Proceed to Checkout']")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-continue-checkout")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    String expectedTax = "$0.00";
    String taxAfterCompleteCheckOut = driver.findElement(By.id("order_total_tax")).getText();
    Assert.assertEquals(expectedTax,taxAfterCompleteCheckOut);
}

@Test
public void invItemAdd(){


    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://clubs3qa1.scholastic.com/home");
    driver.manage().window().maximize();
    Actions act = new Actions(driver);


    driver.findElement(linkText("Sign In")).click();


    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeMyScholastic']")));

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(xpath("//input[contains(@id,'user-text')]")).sendKeys("d@d.co" );

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//div/button[@aria-label='submit button to continue']")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//input[contains(@id,'password-text-field')]")).sendKeys("d123456" );
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//div/button[@aria-label='submit button to continue']")).click();
    try {
        Thread.sleep(7000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//span[@class='notification-close']")).click();

    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    act.moveToElement(driver.findElement(By.xpath("//div[@class='sidecar-top']/following-sibling::div//a[@id='enter-orders']"))).build().perform();

    driver.findElement(By.xpath("//div[@class='sidecar-top']/following-sibling::div//li[@id='student-flyer-orders']/a")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    //enter items per student
    //Harry
    driver.findElement(By.id("student-name")).sendKeys("Harry");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("item-number")).sendKeys("111");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        driver.findElement(By.id("btn-add")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    String expectedInvalidItemErrorMessage ="Please enter a valid item number.";

    String invalidItemErrorMessage = driver.findElement(By.id("error-message-tooltip")).getText();

    Assert.assertEquals(invalidItemErrorMessage,expectedInvalidItemErrorMessage);
}

@Test
public void deletingItemsSFOPage(){
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
    WebDriver driver = new ChromeDriver();

    driver.get("https://clubs3qa1.scholastic.com/home");
    driver.manage().window().maximize();
    Actions act = new Actions(driver);

    JavascriptExecutor js = (JavascriptExecutor)driver;



    driver.findElement(linkText("Sign In")).click();


    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeMyScholastic']")));

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(xpath("//input[contains(@id,'user-text')]")).sendKeys("d@d.co" );

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//div/button[@aria-label='submit button to continue']")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//input[contains(@id,'password-text-field')]")).sendKeys("d123456" );
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//div/button[@aria-label='submit button to continue']")).click();
    try {
        Thread.sleep(7000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//span[@class='notification-close']")).click();

    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    act.moveToElement(driver.findElement(By.xpath("//div[@class='sidecar-top']/following-sibling::div//a[@id='enter-orders']"))).build().perform();

    driver.findElement(By.xpath("//div[@class='sidecar-top']/following-sibling::div//li[@id='student-flyer-orders']/a")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    //enter items per student
    //Harry
    driver.findElement(By.id("student-name")).sendKeys("Harry");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("item-number")).sendKeys("2S8");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-add")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.id("item-number")).sendKeys("11S8");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-add")).click();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    //John
    driver.findElement(By.id("student-name")).sendKeys("John");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("item-number")).sendKeys("2G8");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-add")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.id("item-number")).sendKeys("14G8");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-add")).click();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }


    //Michael
    driver.findElement(By.id("student-name")).sendKeys("Michael");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("item-number")).sendKeys("4G8");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-add")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.id("item-number")).sendKeys("1G8");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.id("btn-add")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    //item quantities
    //2S8 = 5
    driver.findElement(By.xpath("//td[@class=' studentName' and text()='Harry']/following-sibling::td[@class=' hidden-xs price' and text()='$10.00']/following-sibling::td[@class=' item-qty']/input[@type='text']")).sendKeys("5");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    //2G8 = 2
    driver.findElement(By.xpath("//td[@class=' studentName' and text()='John']/following-sibling::td[@class=' hidden-xs price' and text()='$12.00']/following-sibling::td[@class=' item-qty']/input[@type='text']")).sendKeys("2");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    //14G8 = 2
    driver.findElement(By.xpath("//td[@class=' studentName' and text()='John']/following-sibling::td[@class=' hidden-xs price' and text()='$10.00']/following-sibling::td[@class=' item-qty']/input[@type='text']")).sendKeys("2");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    //4G8 = 4
    driver.findElement(By.xpath("//td[@class=' studentName' and text()='Michael']/following-sibling::td[@class=' hidden-xs price' and text()='$12.00']/following-sibling::td[@class=' item-qty']/input[@type='text']")).sendKeys("4");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    //1G8 = 10
    driver.findElement(By.xpath("//td[@class=' hidden-xs price' and text()='$55.00']/following-sibling::td[@class=' item-qty']/input[@type='text']")).sendKeys("10");
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.xpath("//a/button[text()='Review Cart']")).click();

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    js.executeScript("scrollBy(0,500);");
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
//    String totalAmount = driver.findElement(By.xpath("//ul[@class='std-total']/li[@class='std-total-price sfoSubTotalPrice']")).getText();
//
//    String totalItems = driver.findElement(By.xpath("//li[@class='std-total-qty']/span[@class='total-qty sfoSubTotalQty']")).getText();
//    int totalItemsInt = Integer.valueOf(totalItems);
//    System.out.println(totalItems + "..." + totalItemsInt + "..."+totalAmount);
//    try {
//        Thread.sleep(3000);
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    }
//    //remove an item from cart
//    driver.findElement(By.xpath("//*[@id='11S8']//i[@class='fa fa-times-circle remove']")).click();
//    driver.findElement(By.xpath("//*[@id='11S8']//button[@class='grey removeYes']")).click();
//
//    try {
//        Thread.sleep(3000);
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    }
//    String totalItemsAfterItemRemoved = driver.findElement(By.xpath("//li[@class='std-total-qty']/span[@class='total-qty sfoSubTotalQty']")).getText();
//    int newTotalItemsInt = Integer.valueOf(totalItemsAfterItemRemoved);
//    String totalAmountAfterItemRemoved = driver.findElement(By.xpath("//ul[@class='std-total']/li[@class='std-total-price sfoSubTotalPrice']")).getText();
//
//
//    //verification
//
//    Assert.assertTrue(totalItemsInt>newTotalItemsInt);
//    Assert.assertFalse(totalAmount==totalAmountAfterItemRemoved);
    Assert.assertFalse(driver.findElement(By.linkText("11S8")).isDisplayed());


}



@Test
public void FlyerJumperDisappear (){
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://clubs3qa1.scholastic.com/home");
    driver.manage().window().maximize();
    Actions act = new Actions(driver);

    driver.findElement(linkText("Sign In")).click();


    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeMyScholastic']")));

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(xpath("//input[contains(@id,'user-text')]")).sendKeys("c@c.co" );

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//div/button[@aria-label='submit button to continue']")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//input[contains(@id,'password-text-field')]")).sendKeys("c123456" );
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//div/button[@aria-label='submit button to continue']")).click();
    try {
        Thread.sleep(7000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//span[@class='notification-close']")).click();

    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    act.moveToElement(driver.findElement(By.xpath("//div[@class='sidecar-top']/following-sibling::div//a[@id='enter-orders']"))).build().perform();

    driver.findElement(By.xpath("//div[@class='sidecar-top']/following-sibling::div//li[@id='your-teacher-order']/a")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    driver.findElement(By.xpath("//ul[@class='hidden-xs']//a[text()='By Flyer']")).click();
//    try {
//        Thread.sleep(1000);
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    }
    driver.findElement(By.xpath("//td[@class=' item-qty']/input[@data-itemid='1S8']")).click();
    WebElement jumper = driver.findElement(By.id("info-student-flyer-order-fee"));
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//td[@class=' item-qty']/input[@data-itemid='3S8']")).click();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    Assert.assertFalse(jumper.isDisplayed(), "Jumper is displayed again");
}

@Test
public void recmList(){

    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

    WebDriver driver = new ChromeDriver();

    driver.get("https://clubs3qa1.scholastic.com/home");

    driver.manage().window().maximize();

    Actions act = new Actions(driver);

    driver.manage().window().maximize();

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    clickThis(driver.findElement(linkText("Sign In")));
    driver.findElement(linkText("Sign In")).click();


    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeMyScholastic']")));

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(xpath("//input[contains(@id,'user-text')]")).sendKeys("b@b.co" );

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//div/button[@aria-label='submit button to continue']")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//input[contains(@id,'password-text-field')]")).sendKeys("b123456" );
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//div/button[@aria-label='submit button to continue']")).click();
    try {
        Thread.sleep(7000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//span[@class='notification-close']")).click();

    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.xpath("//a[@title='Scholastic Home']")).click();

    driver.findElement(By.xpath("//input[@class='custom-placeholder valid']")).sendKeys("Harry");
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.xpath("//button[@type='submit']/i[@class='fa fa-search']")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    String expectedBookTitle = driver.findElement(By.xpath("//a[@class='thumb-link' and @title='Harry Potter and the Goblet of Fire']")).getAttribute("title");


    act.moveToElement(driver.findElement(By.xpath("//img[@title='Harry Potter and the Goblet of Fire']"))).build().perform();

    driver.findElement(By.xpath("//a[@title='Harry Potter and the Goblet of Fire']/..//following-sibling::a[text()='QUICK LOOK']")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//i[@class='fa fa-star-o fa-2x']")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.xpath("//input[@type='checkbox' and @value='recommended']")).click();

    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    driver.findElement(By.xpath("//span[@class='tooltipster-close ']")).click();
//    try {
//        Thread.sleep(2000);
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    }
    driver.findElement(By.xpath("//a[@class='quickview-details-link']")).click();
    try {
        Thread.sleep(7000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.xpath("//a[@title='Scholastic Home']")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//li[@class='mylists toggle-menu']/a[@class='toggle-item']")).click();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//li[@class='recommend']/a")).click();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    String bookTitleRecommended = driver.findElement(By.xpath("//div[@class='product-list-item']//a[@class='quickview']")).getText();

    Assert.assertEquals(expectedBookTitle,bookTitleRecommended);
    }

@Test
public void signInTest(){
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://clubs3qa1.scholastic.com/home");
    driver.manage().window().maximize();

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    clickThis(driver.findElement(linkText("Sign In")));
    driver.findElement(linkText("Sign In")).click();


    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeMyScholastic']")));

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(xpath("//input[contains(@id,'user-text')]")).sendKeys("c@c.co" );

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//div/button[@aria-label='submit button to continue']")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//input[contains(@id,'password-text-field')]")).sendKeys("c123456" );
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(xpath("//div/button[@aria-label='submit button to continue']")).click();
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.findElement(By.xpath("//span[@class='notification-close']"));

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

@Test
public void createAcctSchoolNameSearchTest() {


    String selectedSchoolAddress = "";
    String selectedSchoolState = "";
    String email = "1a@a.ta";
    String password = "a123456";
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
    String selectedSchoolAddress2 ="";
    String state = "New Yor";
    String schoolName = "Scholastic+Book+Club";

    WebDriver driver = new ChromeDriver();

    driver.get("https://clubs3qa1.scholastic.com/home");

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.xpath("//ul//li[@class='mylists']/a[text()='Create an Account']")).click();


    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    a1.clickThis(By.xpath("//label[@for='acccountTeacther']"));
    driver.findElement(By.xpath("//label[@for='acccountTeacther']")).click();

    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    clickThis(By.id("linkChooseAcount"));
    driver.findElement(By.id("linkChooseAcount")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    clickThis(By.xpath("//div[@class='custom-select']"));
//    clickThis(By.xpath("//span[text()='Mr.']"));
    driver.findElement(By.xpath("//div[@class='custom-select']")).click();
    driver.findElement(By.xpath("//span[text()='Mr.']")).click();

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    type(By.id("dwfrm_profile_customer_firstname"), "John");
    driver.findElement(By.id("dwfrm_profile_customer_firstname")).sendKeys("John");

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    type(By.id("dwfrm_profile_customer_lastname"), "Smith");
    driver.findElement(By.id("dwfrm_profile_customer_lastname")).sendKeys("Smith");


    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    type(By.id("dwfrm_profile_customer_email"), email);
    driver.findElement(By.id("dwfrm_profile_customer_email")).sendKeys(email);

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }


//    type(By.id("dwfrm_profile_login_password"), password);
    driver.findElement(By.id("dwfrm_profile_login_password")).sendKeys(password);

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
//clickThis(By.id("dwfrm_registration_termsofuseteacher"));
    driver.findElement(By.id("dwfrm_registration_termsofuseteacher")).click();

//    clickThis(By.xpath("//button[@name='dwfrm_profile_confirm']"));
    driver.findElement(By.xpath("//button[@name='dwfrm_profile_confirm']")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    School by State Search


//    clickThis(By.xpath("//div[@class='custom-select']"));
//    driver.findElement(By.xpath("//div[@class='custom-select']")).click();
//
//    try {
//        Thread.sleep(3000);
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    }
//
    driver.findElement(By.xpath("//div[@class='selected-option input-select']")).click();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
   }
////    clickThis(driver.findElement(By.xpath("//span[text()=' New York']")));
//    driver.findElement(By.xpath("//span[text()=' New York']")).click();
//    try {
//        Thread.sleep(3000);
//    } catch (InterruptedException e) {
//        e.printStackTrace();
//    }
//    JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
//        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[text()=' New York']")));
    Select dropdown = new Select(driver.findElement(By.xpath("//div[@class='selected-option input-select']")));
    dropdown.selectByVisibleText(" New York");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//span[text()=' New York']")).click();


//    type(By.id("dwfrm_myschool_schoolcity"), state);
        driver.findElement(By.id("dwfrm_myschool_schoolcity")).sendKeys(state);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//    clickThis(By.xpath("//span[@class='ui-menu-item-wrapper']"));
        driver.findElement(By.xpath("//span[@class='ui-menu-item-wrapper']")).click();

//    clickThis(By.xpath("//button[@id='button-search' and @class='button-continue']"));
        driver.findElement(By.xpath("//button[@id='button-search' and @class='button-continue']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//    type(By.id("dwfrm_searchschool_schoolvalue"),"Scholastic+Book+Club");
        driver.findElement(By.id("dwfrm_searchschool_schoolvalue")).sendKeys(schoolName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//    clickThis(By.xpath("//span[@class='ui-menu-item-wrapper']"));
        driver.findElement(By.xpath("//span[@class='ui-menu-item-wrapper']")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        selectedSchoolAddress = getElementText(By.xpath("//div[@class='school-add']"));


//    clickThis(By.xpath("//button[@class='next-button button-continue school-search']"));
        driver.findElement(By.xpath("//button[@class='next-button button-continue school-search']")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//    clickThis(By.xpath("//div[text()='Select Role']"));
//    clickThis(By.xpath("//span[text()='Teacher (by Grade)']"));
//    clickThis(By.xpath("//div[text()='Select Grade']"));
//    clickThis(By.xpath("//span[text()='1st Grade']"));
        driver.findElement(By.xpath("//div[text()='Select Role']")).click();
        driver.findElement(By.xpath("//span[text()='Teacher (by Grade)']")).click();
        driver.findElement(By.xpath("//div[text()='Select Grade']")).click();
        driver.findElement(By.xpath("//span[text()='1st Grade']")).click();

//    type(By.xpath("//input[@name='dwfrm_myrole_students']"), "30");
        driver.findElement(By.xpath("//input[@name='dwfrm_myrole_students']")).sendKeys("30");


//    clickThis(By.xpath("//button[@class='next-button button-continue']"));
        driver.findElement(By.xpath("//button[@class='next-button button-continue']")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//    clickThis(By.xpath("//div[text()='Select Type']"));
//    clickThis(By.xpath("//span[text()='Guided Reading Level (GRL)']"));
//    clickThis(By.xpath("//button[@class='button-continue']"));
        driver.findElement(By.xpath("//div[text()='Select Type']")).click();
        driver.findElement(By.xpath("//span[text()='Guided Reading Level (GRL)']")).click();
        driver.findElement(By.xpath("//button[@class='button-continue']")).click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


}

@Test
public void openUrlTest(){
    Web w1 = new Web();
    w1.openUrl();
}

@Test
public void testCreateAcctZipCode(){


    String email = "m@a.ta";
    String password = "a123456";
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
    String selectedSchoolAddress ="";
    String state = "New Yor";
    String schoolName = "Scholastic+Book+Club";
    String zipCode = "10012";

    WebDriver driver = new ChromeDriver();

    driver.get("https://clubs3qa1.scholastic.com/home");

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    driver.findElement(By.xpath("//ul//li[@class='mylists']/a[text()='Create an Account']")).click();


    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    a1.clickThis(By.xpath("//label[@for='acccountTeacther']"));
    driver.findElement(By.xpath("//label[@for='acccountTeacther']")).click();

    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    clickThis(By.id("linkChooseAcount"));
    driver.findElement(By.id("linkChooseAcount")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    clickThis(By.xpath("//div[@class='custom-select']"));
//    clickThis(By.xpath("//span[text()='Mr.']"));
    driver.findElement(By.xpath("//div[@class='custom-select']")).click();
    driver.findElement(By.xpath("//span[text()='Mr.']")).click();

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    type(By.id("dwfrm_profile_customer_firstname"), "John");
    driver.findElement(By.id("dwfrm_profile_customer_firstname")).sendKeys("John");

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    type(By.id("dwfrm_profile_customer_lastname"), "Smith");
    driver.findElement(By.id("dwfrm_profile_customer_lastname")).sendKeys("Smith");


    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    type(By.id("dwfrm_profile_customer_email"), email);
    driver.findElement(By.id("dwfrm_profile_customer_email")).sendKeys(email);

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }


//    type(By.id("dwfrm_profile_login_password"), password);
    driver.findElement(By.id("dwfrm_profile_login_password")).sendKeys(password);

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
//clickThis(By.id("dwfrm_registration_termsofuseteacher"));
    driver.findElement(By.id("dwfrm_registration_termsofuseteacher")).click();

//    clickThis(By.xpath("//button[@name='dwfrm_profile_confirm']"));
    driver.findElement(By.xpath("//button[@name='dwfrm_profile_confirm']")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    type(By.id("dwfrm_myschool_schoolzip"),zipCode);
    driver.findElement(By.id("dwfrm_myschool_schoolzip")).sendKeys(zipCode);

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    clickThis(By.xpath("//div[@class='findschool-byzip']//div[@class='align-center']/button"));
    driver.findElement(By.xpath("//div[@class='findschool-byzip']//div[@class='align-center']/button")).click();

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    type(By.id("dwfrm_searchschool_schoolvalue"),schoolName);
    driver.findElement(By.id("dwfrm_searchschool_schoolvalue")).sendKeys(schoolName);
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    clickThis(By.xpath("//span[@class='ui-menu-item-wrapper']"));
    driver.findElement(By.xpath("//span[@class='ui-menu-item-wrapper']")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
//    selectedSchoolAddress = getElementText(By.xpath("//div[@class='school-add']"));
//    selectedSchoolState = getElementText(By.xpath("//div[@class='school-add']"));
    selectedSchoolAddress = driver.findElement(By.xpath("//div[@class='school-add']")).getText();


//    clickThis(By.xpath("//button[@class='next-button button-continue school-search']"));
    driver.findElement(By.xpath("//button[@class='next-button button-continue school-search']")).click();

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }


//    clickThis(By.xpath("//div[text()='Select Role']"));
//    clickThis(By.xpath("//span[text()='Teacher (by Grade)']"));
//    clickThis(By.xpath("//div[text()='Select Grade']"));
//    clickThis(By.xpath("//span[text()='1st Grade']"));
    driver.findElement(By.xpath("//div[text()='Select Role']")).click();
    driver.findElement(By.xpath("//span[text()='Teacher (by Grade)']")).click();
    driver.findElement(By.xpath("//div[text()='Select Grade']")).click();
    driver.findElement(By.xpath("//span[text()='1st Grade']")).click();

//    type(By.xpath("//input[@name='dwfrm_myrole_students']"), "30");
    driver.findElement(By.xpath("//input[@name='dwfrm_myrole_students']")).sendKeys("30");


//    clickThis(By.xpath("//button[@class='next-button button-continue']"));
    driver.findElement(By.xpath("//button[@class='next-button button-continue']")).click();

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    clickThis(By.xpath("//div[text()='Select Type']"));
//    clickThis(By.xpath("//span[text()='Guided Reading Level (GRL)']"));
//    clickThis(By.xpath("//button[@class='button-continue']"));
    driver.findElement(By.xpath("//div[text()='Select Type']")).click();
    driver.findElement(By.xpath("//span[text()='Guided Reading Level (GRL)']")).click();
    driver.findElement(By.xpath("//button[@class='button-continue']")).click();


    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    clickThis(By.xpath("//a[@title='Scholastic Home']"));
    driver.findElement(By.xpath("//a[@title='Scholastic Home']")).click();
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
//    String classCodeHomepage = getElementText(By.xpath("//div[text()='Class Code']/..//following-sibling::div[@class='details']//div[@class='value']"));
    String classCodeHomepage = driver.findElement(By.xpath("//div[text()='Class Code']/..//following-sibling::div[@class='details']//div[@class='value']")).getText();

//    clickThis(By.xpath("//span[@class='hide-mobile user-account-name' and text()='My Account']"));
//    clickThis(By.xpath("//div[@class='toggle-content']//a[text()='Profile']"));
    driver.findElement(By.xpath("//span[@class='hide-mobile user-account-name' and text()='My Account']")).click();
    driver.findElement(By.xpath("//div[@class='toggle-content']//a[text()='Profile']")).click();

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

//    String classCodeMyAcct = getElementText(By.xpath("//h3[text()='Class Code']/..//following-sibling::span"));
    String classCodeMyAcct = driver.findElement(By.xpath("//h3[text()='Class Code']/..//following-sibling::span")).getText();

    Assert.assertEquals(classCodeHomepage,classCodeMyAcct);

//    clickThis(By.xpath("//a[@title='Scholastic Home']"));
    driver.findElement(By.xpath("//a[@title='Scholastic Home']")).click();

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
//    String teacherNameHomepage = getElementText(By.xpath("//span[@class='teacher-name-with-salutation']"));
    String teacherNameHomepage = driver.findElement(By.xpath("//span[@class='teacher-name-with-salutation']")).getText();
    String [] teachNameHomepageArray = teacherNameHomepage.split(" ");
    String teachHomepageLastName = teachNameHomepageArray[teachNameHomepageArray.length-1];

//    clickThis(By.xpath("//span[@class='hide-mobile user-account-name' and text()='My Account']"));
//    clickThis(By.xpath("//div[@class='toggle-content']//a[text()='Profile']"));
    driver.findElement(By.xpath("//span[@class='hide-mobile user-account-name' and text()='My Account']")).click();
    driver.findElement(By.xpath("//div[@class='toggle-content']//a[text()='Profile']")).click();

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
//    String teacherNameMyAcct = getElementText(By.xpath("//span[contains(text(),'Mr.') or contains(text(),'Ms.') or contains(text(),'Mrs.')]"));
    String teacherNameMyAcct = driver.findElement(By.xpath("//span[contains(text(),'Mr.') or contains(text(),'Ms.') or contains(text(),'Mrs.')]")).getText();

    String [] teacherNameMyAcctArray = teacherNameMyAcct.split(" ");
    String teacherMyAcctLastName = teacherNameMyAcctArray[teacherNameMyAcctArray.length-1];

    Assert.assertEquals(teachHomepageLastName,teacherMyAcctLastName);

//    clickThis(By.xpath("//span[@class='hide-mobile user-account-name' and text()='My Account']"));
//    clickThis(By.xpath("//div[@class='toggle-content']//a[text()='Profile']"));
    driver.findElement(By.xpath("//span[@class='hide-mobile user-account-name' and text()='My Account']")).click();
    driver.findElement(By.xpath("//div[@class='toggle-content']//a[text()='Profile']")).click();


    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    String schoolsAddress = driver.findElement(By.xpath("//div/span[text()='SCHOLASTIC+BOOK+CLUBS']/..//following-sibling::span")).getText();

    Assert.assertTrue(schoolsAddress.contains(selectedSchoolAddress));


}



    @Test
    public void getLoggedIn () {

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://clubs3qa1.scholastic.com/home");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(driver.findElement(linkText("Sign In")));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        // driver.findElement(By.xpath("//iframe[@id='iframeMyScholastic']"));

        // System.out.println(driver.findElement(By.xpath("//iframe[@id='iframeMyScholastic']")));

        // switchToFrame(By.xpath("//iframe[@id='iframeMyScholastic']"));

        // switchToFrame("iframeMyScholastic");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeMyScholastic']")));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        type(driver.findElement(xpath("//input[contains(@id,'user-text')]")),"a@a.co" );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void launchWebPageAndLogIn () {
        String email = "sdssas@fd.co";
        String password = "Sa234593";

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://clubs3qa1.scholastic.com/home");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(driver.findElement(xpath("//ul//li[@class='mylists']/a[text()='Create an Account']")));


        Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is not found within 20 seconds");

        clickThis(driver.findElement(xpath("//label[@for='acccountTeacther']")));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(driver.findElement(id("linkChooseAcount")));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(driver.findElement(xpath("//div[@class='custom-select']")));
        clickThis(driver.findElement(xpath("//span[text()='Mr.']")));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        type(driver.findElement(id("dwfrm_profile_customer_firstname")), "John");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        type(driver.findElement(id("dwfrm_profile_customer_lastname")), "Smith");


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        type(driver.findElement(id("dwfrm_profile_customer_email")), email);


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        type(driver.findElement(id("dwfrm_profile_login_password")), password);


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(driver.findElement(name("dwfrm_registration_termsofuseteacher")));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(driver.findElement(name("dwfrm_profile_confirm")));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(driver.findElement(xpath("//div[@class='custom-select']")));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(driver.findElement(xpath("//div[@class='selected-option input-select']")));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(driver.findElement(xpath("//span[text()=' New York']")));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        type(driver.findElement(id("dwfrm_myschool_schoolcity")), "New Yor");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(driver.findElement(xpath("//span[@class='ui-menu-item-wrapper']")));


        clickThis(driver.findElement(xpath("//button[@id='button-search' and @class='button-continue']")));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        type(driver.findElement(id("dwfrm_searchschool_schoolvalue")),"Scholastic+Book+Club");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(driver.findElement(xpath("//span[@class='ui-menu-item-wrapper']")));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement selectedSchoolAddress = driver.findElement(xpath("//div[@class='school-add']"));


        clickThis(driver.findElement(xpath("//button[@class='next-button button-continue school-search']")));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(driver.findElement(xpath("//div[text()='Select Role']")));
        clickThis(driver.findElement(xpath("//span[text()='Teacher (by Grade)']")));
        clickThis(driver.findElement(xpath("//div[text()='Select Grade']")));
        clickThis(driver.findElement(xpath("//span[text()='1st Grade']")));

        type(driver.findElement(xpath("//input[@name='dwfrm_myrole_students']")), "30");

        clickThis(driver.findElement(xpath("//button[@class='next-button button-continue']")));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(driver.findElement(xpath("//div[text()='Select Type']")));

        clickThis(driver.findElement(xpath("//span[text()='Guided Reading Level (GRL)']")));

        clickThis(driver.findElement(xpath("//button[@class='button-continue']")));

    }


    @Test
    public void launchWebPageAndCreateAcct () {


        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(linkText("Create New Account")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        type(driver.findElement(name("firstname")),"First");
        type(driver.findElement(name("lastname")), "Last");
        type(driver.findElement(name("reg_email__")),"9898787800");
        type(driver.findElement(name("reg_passwd__")),"passw0rd@123");

        clickThis(driver.findElement(name("websubmit")));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();


    }


}
