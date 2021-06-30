package Pages.Scholastic;

import Pages.WebCommands;
import org.openqa.selenium.By;

public class RecommendationListPage extends WebCommands {

    public void bookSearch(String searchWord){
        type(By.xpath("//input[@class='custom-placeholder valid']"),searchWord);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(By.xpath("//button[@type='submit']/i[@class='fa fa-search']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickRecommend(){
        clickThis(By.xpath("//i[@class='fa fa-star-o fa-2x']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addToRecommendationsToStudentsList(){
        clickThis(By.xpath("//input[@type='checkbox' and @value='recommended']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(By.xpath("//a[@class='quickview-details-link']"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(By.xpath("//a[@title='Scholastic Home']"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void recommendationsToStudentsListPage(){
        clickThis(By.xpath("//li[@class='mylists toggle-menu']/a[@class='toggle-item']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickThis(By.xpath("//li[@class='recommend']/a"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void hoverBook(){
        moveMouseOverElement(By.xpath("//img[@title='Harry Potter and the Goblet of Fire']"));
    }

}
