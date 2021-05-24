import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Homework4 {
    /**
     * Task1: (darksky.net)
     *
     * 1. Open darksky page
     * 2. Scroll to Today timeline
     * 3. Click the + button
     * 4. Verify tempValues (low and high) on timeline is same as tempValue in the Today's detail
     *
     */
    @Test
    public void verifyTempValues () {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://darksky.net/");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,900);");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//a[@data-day='0']/span[@class='toggle']/span[@class='open']")).click();


        String todayLowTemp = driver.findElement(By.xpath("//a[@data-day='0']//span[@class='tempRange']//span[@class='minTemp']")).getText();
        String todayHiTemp = driver.findElement(By.xpath("//a[@data-day='0']//span[@class='tempRange']//span[@class='maxTemp']")).getText();

        String timelineLowTemp = driver.findElement(By.xpath("//div[@id ='title']//span[@class='low-temp-text']")).getText();
        String timelineHiTemp = driver.findElement(By.xpath("//div[@id ='title']//span[@class='high-temp-text']")).getText();

        Assert.assertEquals(todayLowTemp,timelineLowTemp,"tempValue of timeline is not the same as tempValue in the Today's detail");
        Assert.assertEquals(todayHiTemp,timelineHiTemp, "tempValue of timeline is not the same as tempValue in the Today's detail");

        driver.close();
    }

    /**
     * Task2: (darksky.net)
     *
     * 1. Open darksky page
     * 2. Click Time Machine button
     * 3. Verify current date is selected
     *
     */
    @Test
    public void verifyCurrentTimeSelected () {
    System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
    WebDriver driver = new ChromeDriver();
        driver.get("https://darksky.net/");

        try {
        Thread.sleep(2000);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }

    JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,1000);");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//a[text()='Time Machine']")).click();

        String monthSelected = driver.findElement(By.xpath("//select[@class='pika-select pika-select-month']//*[@selected='selected']")).getText();
        String dayOfMonthSelected = driver.findElement(By.xpath("//*[@class='is-today']")).getText();
        String yearSelected = driver.findElement(By.xpath("//select[@class='pika-select pika-select-year']//*[@selected='selected']")).getText();

        String dateSelected = monthSelected + " " + dayOfMonthSelected + " " + yearSelected;

        Date currentTimeDate = new Date();
        SimpleDateFormat date = new SimpleDateFormat("MMMM dd yyyy");
        String currDate = date.format(currentTimeDate);

        Assert.assertEquals(dateSelected,currDate,"Incorrect date selected");

        driver.close();
    }

    /**
     * Task3: (darksky.net) - NOT COMPLETED
     *
     * 1. Open darksky page
     * 2. Click DarkSky API on header
     * 3. Click the 'blog post' link
     * 4. Verify that all article dates are in MonthName Date, Year format
     * 5. Verify article dates are in reverse chronological order (recent date first)
     *
     */
    @Test
    public void verifyDateFormat () {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://darksky.net/");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//a[contains(text(),'API')]")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//a[contains(text(),'blog')]")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> allArticleDatesWeb = (List<WebElement>) driver.findElement(By.xpath("//time[contains(@datetime, '31T13')]"));

        System.out.println(allArticleDatesWeb.size());

        driver.close();

    }


    /**
     * Task4: (https://classroomessentialsonline.com/)
     *
     * 1. Open classroom essentials
     * 2. Verify 'School Furniture' has maximum number of options.
     * 3. Verify 'Church Chairs' menu has 7 options
     */
    @Test
    public void verifyNumOfOptions () {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://classroomessentialsonline.com/");

        By churchChairs = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Church Chairs')]");

        Actions act = new Actions(driver);

        act.moveToElement(driver.findElement(churchChairs)).build().perform();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Church Chairs Options
        By churchChairsOptions = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Church Chairs')]/following-sibling::div//a");

        List<WebElement> chruchChairsOptionsList = driver.findElements(churchChairsOptions);

        int numChurchChairsOptions = chruchChairsOptionsList.size();

        int expectedNumChurchChairsOptions = 7;

        //Verifying Church Chairs has 7 options in total

        Assert.assertEquals(numChurchChairsOptions,expectedNumChurchChairsOptions,"Church Chairs dropdown menu does not consist of 7 options");

        //Chiavari Chairs Options Total

        By chiavariChairs = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Chiavari Chairs')]");

        Actions act2 = new Actions(driver);

        act2.moveToElement(driver.findElement(chiavariChairs)).build().perform();

        By chiavariChairsOptions = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Chiavari Chairs')]/following-sibling::div//a");

        List<WebElement> chiavariChairsOptionsList = driver.findElements(chiavariChairsOptions);

        int numChiavariChairsOptions = chiavariChairsOptionsList.size();

        //Banquet Tables Options Total

        By banquetTables = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Banquet Tables')]");

        Actions act3 = new Actions(driver);

        act3.moveToElement(driver.findElement(banquetTables)).build().perform();

        By banquetTablesOptions = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Banquet Tables')]/following-sibling::div//a");

        List<WebElement> banquetTablesOptionsList = driver.findElements(banquetTablesOptions);

        int numBanquetTablesOptions = banquetTablesOptionsList.size();

        //Banquet Chairs Options Total
        By banquetChairs = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Banquet Chairs')]");

        Actions act4 = new Actions(driver);

        act3.moveToElement(driver.findElement(banquetChairs)).build().perform();

        By banquetChairsOptions = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Banquet Chairs')]/following-sibling::div//a");

        List<WebElement> banquetChairsOptionsList = driver.findElements(banquetChairsOptions);

        int numBanquetChairsOptions = banquetChairsOptionsList.size();

        //Folding Chairs Options Total
        By foldingChairs = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Folding Chairs')]");

        Actions act5 = new Actions(driver);

        act3.moveToElement(driver.findElement(foldingChairs)).build().perform();

        By foldingChairsOptions = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Folding Chairs')]/following-sibling::div//a");

        List<WebElement> foldingChairsOptionsList = driver.findElements(foldingChairsOptions);

        int numFoldingChairsOptions = foldingChairsOptionsList.size();

        //Folding Tables Options Total
        By foldingTables = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Folding Tables')]");

        Actions act6 = new Actions(driver);

        act3.moveToElement(driver.findElement(foldingTables)).build().perform();

        By foldingTablesOptions = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Folding Tables')]/following-sibling::div//a");

        List<WebElement> foldingTablesOptionsList = driver.findElements(foldingTablesOptions);

        int numFoldingTablesOptions = foldingTablesOptionsList.size();

        //Office Furniture Options Total
        By officeFurniture = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Office Furniture')]");

        Actions act7 = new Actions(driver);

        act3.moveToElement(driver.findElement(officeFurniture)).build().perform();

        By officeFurnitureOptions = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Office Furniture')]/following-sibling::div//a");

        List<WebElement> officeFurnitureOptionsList = driver.findElements(officeFurnitureOptions);

        int numOfficeFurnitureOptions = officeFurnitureOptionsList.size();

        //School Furniture Options Total
        By schoolFurniture = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'School Furniture')]");

        Actions act11 = new Actions(driver);

        act3.moveToElement(driver.findElement(schoolFurniture)).build().perform();

        By schoolFurnitureOptions = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'School Furniture')]/following-sibling::div//a");

        List<WebElement> schoolFurnitureOptionsList = driver.findElements(schoolFurnitureOptions);

        int numSchoolFurnitureOptions =schoolFurnitureOptionsList.size();

        //Restaurant Furniture Options Total
        By restaurantFurniture = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Restaurant Furniture')]");

        Actions act8 = new Actions(driver);

        act3.moveToElement(driver.findElement(restaurantFurniture)).build().perform();

        By restaurantFurnitureOptions = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Restaurant Furniture')]/following-sibling::div//a");

        List<WebElement> restaurantFurnitureOptionsList = driver.findElements(restaurantFurnitureOptions);

        int numRestaurantFurnitureOptions = restaurantFurnitureOptionsList.size();

        //Stacking Chairs Options Total
        By stackingChairs = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Stacking Chairs')]");

        Actions act9 = new Actions(driver);

        act3.moveToElement(driver.findElement(stackingChairs)).build().perform();

        By stackingChairsOptions = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'Stacking Chairs')]/following-sibling::div//a");

        List<WebElement> stackingChairsOptionsList = driver.findElements(stackingChairsOptions);

        int numStackingChairsOptions = stackingChairsOptionsList.size();

        //X-back Chairs Options Total
        By xBackChairs = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'X-back Chairs')]");

        Actions act10 = new Actions(driver);

        act3.moveToElement(driver.findElement(xBackChairs)).build().perform();

        By xBackChairsOptions = By.xpath("//a[starts-with(@class, 'navPages-action') and contains(text(), 'X-back Chairs')]/following-sibling::div//a");

        List<WebElement> xBackChairsOptionsList = driver.findElements(xBackChairsOptions);

        int numXBackChairsOptions = xBackChairsOptionsList.size();


        //Verify if School Furniture has max num of options
        if (numSchoolFurnitureOptions> numChurchChairsOptions && numSchoolFurnitureOptions> numChiavariChairsOptions && numSchoolFurnitureOptions> numBanquetTablesOptions
                && numSchoolFurnitureOptions>numBanquetChairsOptions && numSchoolFurnitureOptions>numFoldingChairsOptions && numSchoolFurnitureOptions>numOfficeFurnitureOptions
                && numSchoolFurnitureOptions>numFoldingTablesOptions && numSchoolFurnitureOptions>numStackingChairsOptions && numSchoolFurnitureOptions>numXBackChairsOptions && numSchoolFurnitureOptions>numRestaurantFurnitureOptions){
            System.out.println("School Furniture has maximum number of options");
        } else {
            System.out.println("School Furniture does not have maximum number of options");
        }


        driver.close();
    }



}
