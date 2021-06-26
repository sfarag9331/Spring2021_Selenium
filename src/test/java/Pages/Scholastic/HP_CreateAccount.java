package Pages.Scholastic;

import Pages.WebCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HP_CreateAccount extends WebCommands {
    String selectedSchoolAddress = "";
    String selectedSchoolState = "";

    public void createAccount(String email, String password) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(By.xpath("//ul//li[@class='mylists']/a[text()='Create an Account']"));


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(By.xpath("//label[@for='acccountTeacther']"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(By.id("linkChooseAcount"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(By.xpath("//div[@class='custom-select']"));
        clickThis(By.xpath("//span[text()='Mr.']"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        type(By.id("dwfrm_profile_customer_firstname"), "John");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        type(By.id("dwfrm_profile_customer_lastname"), "Smith");


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        type(By.id("dwfrm_profile_customer_email"), email);


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        type(By.id("dwfrm_profile_login_password"), password);


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(By.id("dwfrm_registration_termsofuseteacher"));
        clickThis(By.xpath("//button[@name='dwfrm_profile_confirm']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void schoolStateSearch (String state, String schoolName){

        clickThis(By.xpath("//div[@class='custom-select']"));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        By autoSuggestionLocator = By.xpath("//li[@class='custom-option select-option']");

        List<WebElement> allSuggestions = getElements(autoSuggestionLocator);

        String optionToSelect = "New York";

        for (WebElement suggestionElement : allSuggestions) {
            String suggestion = suggestionElement.getText();
            if (suggestion.equalsIgnoreCase(optionToSelect)) {
                suggestionElement.click();
                break;
            }

        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        type(By.id("dwfrm_myschool_schoolcity"), state);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(By.xpath("//span[@class='ui-menu-item-wrapper']"));


        clickThis(By.xpath("//button[@id='button-search' and @class='button-continue']"));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        type(By.id("dwfrm_searchschool_schoolvalue"),"Scholastic+Book+Club");

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
        WebElement selectedSchoolAddress = getElement(By.xpath("//div[@class='school-add']"));


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

        type(By.xpath("//input[@name='dwfrm_myrole_students']"), "30");

        clickThis(By.xpath("//button[@class='next-button button-continue']"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickThis(By.xpath("//div[text()='Select Type']"));

        clickThis(By.xpath("//span[text()='Guided Reading Level (GRL)']"));

        clickThis(By.xpath("//button[@class='button-continue']"));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void schoolZipCodeSearch(String zipCode, String schoolName){
        clickThis(By.name("dwfrm_profile_confirm"));

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

    public void verifyClassCode(){
        clickThis(By.xpath("//a[@title='Scholastic Home']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String classCodeHomepage = getElementText(By.xpath("//div[text()='Class Code']/..//following-sibling::div[@class='details']//div[@class='value']"));

        clickThis(By.xpath("//span[@class='hide-mobile user-account-name' and text()='My Account']"));
        clickThis(By.xpath("//div[@class='toggle-content']//a[text()='Profile']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String classCodeMyAcct = getElementText(By.xpath("//h3[text()='Class Code']/..//following-sibling::span"));

        Assert.assertEquals(classCodeHomepage,classCodeMyAcct);
    }

    public void verifyTeacherName (){
        clickThis(By.xpath("//a[@title='Scholastic Home']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String teacherNameHomepage = getElementText(By.xpath("//span[@class='teacher-name-with-salutation']"));
        String [] teachNameHomepageArray = teacherNameHomepage.split(" ");
        String teachHomepageLastName = teachNameHomepageArray[teachNameHomepageArray.length-1];

        clickThis(By.xpath("//span[@class='hide-mobile user-account-name' and text()='My Account']"));
        clickThis(By.xpath("//div[@class='toggle-content']//a[text()='Profile']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String teacherNameMyAcct = getElementText(By.xpath("//span[contains(text(),'Mr.') or contains(text(),'Ms.') or contains(text(),'Mrs.')]"));
        String [] teacherNameMyAcctArray = teacherNameMyAcct.split(" ");
        String teacherMyAcctLastName = teacherNameMyAcctArray[teacherNameMyAcctArray.length-1];

        Assert.assertEquals(teachHomepageLastName,teacherMyAcctLastName);
    }

    public void verifySchoolAddress(){
        clickThis(By.xpath("//span[@class='hide-mobile user-account-name' and text()='My Account']"));
        clickThis(By.xpath("//div[@class='toggle-content']//a[text()='Profile']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> schoolsAddress = new ArrayList<>();
        schoolsAddress = getElements(By.xpath("//div/span[text()='SCHOLASTIC+BOOK+CLUBS']/..//following-sibling::span"));

        Assert.assertTrue(schoolsAddress.contains(selectedSchoolAddress));
        Assert.assertTrue(schoolsAddress.contains(selectedSchoolState));

    }


}
