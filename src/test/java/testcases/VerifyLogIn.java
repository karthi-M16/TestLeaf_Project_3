package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import base.BaseClass;
import pages.pg1_LoginCredentials;

public class VerifyLogIn extends BaseClass {

    @Test
    public void logInVerification(){

        pg1_LoginCredentials lc = new pg1_LoginCredentials(driver);
        lc.username().password().logIn();
    }
}
