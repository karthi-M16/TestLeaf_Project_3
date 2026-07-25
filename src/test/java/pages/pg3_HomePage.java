package pages;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import base.BaseClass;

public class pg3_HomePage extends BaseClass {

    public pg3_HomePage(ChromeDriver driver){
        this.driver = driver;
    }


    public pg4_CreateLead homePage(){

        driver.findElement(By.linkText("Leads")).click();
        return new pg4_CreateLead(driver);
    }

     

}
