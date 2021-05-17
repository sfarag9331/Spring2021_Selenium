import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework2 {

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
    public void launchWebPageAndLogIn () {

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("email")).sendKeys("myemail@gmail.com");

        driver.findElement(By.name("pass")).sendKeys("passw0rd");

        driver.findElement(By.name("login")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();

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

        driver.findElement(By.linkText("Create New Account")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.name("firstname")).sendKeys("First");

        driver.findElement(By.name("lastname")).sendKeys("Last");

        driver.findElement(By.name("reg_email__")).sendKeys("9898787800");

        driver.findElement(By.name("reg_passwd__")).sendKeys("passw0rd@123");

        driver.findElement(By.name("websubmit")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();


    }


}
