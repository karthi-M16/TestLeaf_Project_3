package pages;
import org.openqa.selenium.chrome.ChromeDriver;
import org.jspecify.annotations.NonNull;
import org.openqa.selenium.By;

import base.BaseClass;

public class pg6_ViewLeadPage extends BaseClass{

     public pg6_ViewLeadPage(ChromeDriver driver){
        this.driver = driver;
    }

    public pg6_ViewLeadPage viewLead(){

         String text = driver.findElement(By.id("viewLead_lastName_sp")).getText();
        if(text.equalsIgnoreCase("Das")){
            System.out.println("Leads are created");

        }else{
            System.out.println("Leads are not created");
        }

        return new pg6_ViewLeadPage(driver);

    }
}
