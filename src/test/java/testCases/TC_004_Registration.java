package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPage;
import testBase.TestBase;

public class TC_004_Registration extends TestBase {

    @Test
    /**
     * This method will navigate to the login page first and click to the register link
     * at the registration page it will fill the form with provided data from config,properties file
     * and it will validate the creation of an account
     */
    public void firstTimeRegister(){
        LoginPage lp=new LoginPage(driver);
        lp.registerLink.click();

        RegistrationPage rp=new RegistrationPage(driver);
        rp.fillRegistrationForm();

        String expectedText="Your account was created successfully. You are now logged in.";
        String actualText=rp.verficationText.getText();

        Assert.assertEquals(actualText,expectedText);

    }
}
