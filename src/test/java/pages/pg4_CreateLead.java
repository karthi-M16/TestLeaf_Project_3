package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import base.BaseClass;

public class pg4_CreateLead extends BaseClass{

     public pg4_CreateLead(ChromeDriver driver){
        this.driver = driver;
    }

    public pg5_InputData createLead(){

        driver.findElement(By.linkText("Create Lead")).click();
        return new pg5_InputData(driver);
    }


     
}
