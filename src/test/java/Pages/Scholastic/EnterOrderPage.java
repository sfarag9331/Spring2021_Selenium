package Pages.Scholastic;

import org.openqa.selenium.By;

public class EnterOrderPage {
    Homepage hp = new Homepage();

    public void hoverEnterOrder(){
        hp.moveMouseOverElement(By.xpath("//div[@class='sidecar-top']/following-sibling::div//a[@id='enter-orders']"));
    }

    public void EnterOrderYTOPage(){
        hp.clickThis(By.xpath("//div[@class='sidecar-top']/following-sibling::div//li[@id='your-teacher-order']/a"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void YTOPageByFlyerTab(){
        hp.clickThis(By.xpath("//ul[@class='hidden-xs']//a[text()='By Flyer']"));
    }

    public void EnterOrdersYTOTab(){
        hp.clickThis(By.xpath("//li[@id='tab-yto']/a"));

    }

    public void EnterOrderSFOPage(){
        hp.clickThis(By.xpath("//div[@class='sidecar-top']/following-sibling::div//li[@id='student-flyer-orders']/a"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void YTOPageByItemTab(){
        hp.clickThis(By.xpath("//ul[@class='hidden-xs']//a[text()='By Item#']"));
    }

    public void enterStudentNameSFO(String studentName){
        hp.type(By.id("student-name"), studentName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void enterItemNumSFO(String itemNum){
        hp.type(By.id("item-number"),itemNum);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickQTYBox(By locator){
        hp.clickThis(locator);
    }

    public void clickAddItemSFO(){
        hp.clickThis(By.id("item-number"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickReviewCart(){
        hp.clickThis(By.xpath("//a/button[text()='Review Cart']"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
