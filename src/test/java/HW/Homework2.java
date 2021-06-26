package HW;

import DriverWrapper.Web;
import Pages.WebCommands;
import cucumber.api.java.en.And;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.openqa.selenium.By.*;

public class Homework2 extends WebCommands {

    /**
     * Task 1:
     * Write code to perform below steps:
     * 1. Launch facebook.com
     * 2. Enter "myemail@gmail.com" in Email or Phone Number
     * 3. Enter "passw0rd" in password
     * 4. Click Log In button
     * 5. Close the browser window
     */

@Test
public void bla() {
    WebCommands a1 = new WebCommands();

    String selectedSchoolAddress = "";
    String selectedSchoolState = "";
    String email = "j@a.ta";
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
        selectedSchoolAddress2 = getElementText(By.xpath("//div[@class='school-add']"));


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
public void bla2(){
    Web w1 = new Web();
    w1.openUrl();
}

@Test
public void bla3(){
    WebCommands a1 = new WebCommands();

    String selectedSchoolAddress = "";
    String selectedSchoolState = "";
    String email = "j@a.ta";
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

    type(By.id("dwfrm_myschool_schoolzip"),zipCode);

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    clickThis(By.xpath("//div[@class='findschool-byzip']//div[@class='align-center']/button"));

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    type(By.id("dwfrm_searchschool_schoolvalue"),schoolName);

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    clickThis(By.xpath("//span[@class='ui-menu-item-wrapper']"));

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    selectedSchoolAddress = getElementText(By.xpath("//div[@class='school-add']"));
    selectedSchoolState = getElementText(By.xpath("//div[@class='school-add']"));

    clickThis(By.xpath("//button[@class='next-button button-continue school-search']"));

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    clickThis(By.xpath("//div[text()='Select Role']"));
    clickThis(By.xpath("//span[text()='Teacher (by Grade)']"));
    clickThis(By.xpath("//div[text()='Select Grade']"));
    clickThis(By.xpath("//span[text()='1st Grade']"));

    type(By.xpath("//input[@name='dwfrm_myrole_students']"),"30");

    clickThis(By.xpath("//button[@class='next-button button-continue']"));

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    clickThis(By.xpath("//div[text()='Select Type']"));

    clickThis(By.xpath("//span[text()='Guided Reading Level (GRL)']"));

    clickThis(By.xpath("//button[@class='button-continue']"));

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



    /**
     * Task 2:
     * Write code to perform below steps:
     * 1. Launch facebook.com
     * 2. Click on "Create New Account"
     * 3. Enter "First" in Firstname
     * 4. Enter "Last" in Lastname
     * 5. Enter "9898787800" in Mobile number or Email
     * 6. Enter "passw0rd@123" in New pasword
     * 7. Click on "Sign Up" button
     * 8. Close the browser window
     */
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
