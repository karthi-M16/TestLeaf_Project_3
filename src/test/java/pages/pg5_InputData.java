package pages;
import org.openqa.selenium.chrome.ChromeDriver;
import org.jspecify.annotations.NonNull;
import org.openqa.selenium.By;

import base.BaseClass;

public class pg5_InputData extends BaseClass {

     public pg5_InputData(ChromeDriver driver){
        this.driver = driver;
    }

    public pg5_InputData cName(){

        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("das&co");
        return this;
    }

     public pg5_InputData fName(){

        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("leo");
        return this;
    }

     public pg5_InputData lName(){

        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("das");
        return this;
    }

     public pg6_ViewLeadPage submit(){

         driver.findElement(By.name("submitButton")).click();
        return new pg6_ViewLeadPage(driver);
    }
}
 
 
 
 