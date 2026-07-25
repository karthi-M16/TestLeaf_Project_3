package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class pg1_LoginCredentials extends BaseClass {

    public pg1_LoginCredentials(ChromeDriver driver){
        this.driver = driver;
    }

    public pg1_LoginCredentials username(){

        driver.findElement(By.id("username")).sendKeys("demoCSR2");
        return this;
    }

    public pg1_LoginCredentials password(){
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        return this;
    }

    public pg2_WelcomePage logIn(){
      driver.findElement(By.className("decorativeSubmit")).click();

     return new pg2_WelcomePage(driver);

    }
}
