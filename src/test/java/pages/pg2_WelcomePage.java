package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.By;

import base.BaseClass;

public class pg2_WelcomePage extends BaseClass {

    public pg2_WelcomePage(ChromeDriver driver){
        this.driver = driver;
    }

    public pg3_HomePage clickCrmSfa(){

        driver.findElement(By.linkText("CRM/SFA")).click();
        return new pg3_HomePage(driver);
    }



}
