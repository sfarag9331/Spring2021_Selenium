import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework3 {

    /**
     * Homework3
     *
     *
     * Testcase 1: (darsky.net) Verify the feelsLike temp is :
     *      greater or equal than Low-Temp
     *          and
     *      less or equal than high-temp
     *
     */

    @Test
    public void verifyFeelLikeTemp () {

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://darksky.net/");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String feelLikeTemp = driver.findElement(By.xpath("//span[@class='high-temp-text']")).getText();

        String highTemp = driver.findElement(By.xpath("//span[@class='high-temp-text']")).getText();

        String lowTemp = driver.findElement(By.xpath("//span[@class='low-temp-text']")).getText();

        driver.close();

        int feelLikeTempInt = Integer.valueOf(feelLikeTemp);
        int highTempInt = Integer.valueOf(highTemp);
        int lowTempInt = Integer.valueOf(lowTemp);



        if (feelLikeTempInt>=lowTempInt && feelLikeTempInt<=highTempInt){
            System.out.println("feelsLike temp verified");
        }

    }



    /**
     *
     * Testcase 2: (darksky.net) Verify correct temp value is displayed based on selected temp unit
     *      1. Go to darksky.net
     *      2. Change the temp unit
     *      3. Verify the temp value is converted as expected
     */

    @Test
    public void verifyIsCorrectTempDisplayed () {

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://darksky.net/");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/b[1]")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]")).click();

        String tempFahrenheit = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/span[1]/span[2]/span[1]")).getText();

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/b[1]")).click();

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[4]")).click();

        String tempCelsius = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/span[1]/span[2]/span[1]")).getText();

        driver.close();

        int tempFahrenheitInt = Integer.valueOf(tempFahrenheit);
        int tempCelsiusInt = Integer.valueOf(tempCelsius);

        if (tempFahrenheitInt == tempCelsiusInt*1.8+32){
            System.out.println("Correct Temperature Displayed");
        }



    }


    /**
     * Testcase 3: (facebook.com)
     *      1. Go to facebook.com
     *      2. Click on "Create New Account"
     *      3. Enter "First" in Firstname
     *      4. Enter "Last" in Lastname
     *      5. Enter "9898787800" in Mobile number or Email
     *      6. Enter "passw0rd@123" in New pasword
     *      7. Click on "Sign Up" button
     *      8. Verify gender error is displayed: Please choose a gender. You can change who can see this later.
     *
     *
     */

    @Test
    public void verifyGenderErrorIsDisplayed () {
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

        String errorMessage = driver.findElement(By.xpath("/html[1]/body[1]/div[8]/div[1]/div[1]/div[1]")).getText();

        String expectedErrorMessage = "Please choose a gender. You can change who can see this later.";

        Assert.assertEquals(expectedErrorMessage,errorMessage);

        driver.close();


    }

}
