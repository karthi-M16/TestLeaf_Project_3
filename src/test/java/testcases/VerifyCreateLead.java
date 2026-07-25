package testcases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.pg1_LoginCredentials;


public class VerifyCreateLead  extends BaseClass {


@Test    
public void creatingLead(){
    pg1_LoginCredentials vcl = new pg1_LoginCredentials(driver);
    vcl.username().password().logIn().clickCrmSfa().homePage().createLead().cName().fName().lName().submit().viewLead();
}
}
