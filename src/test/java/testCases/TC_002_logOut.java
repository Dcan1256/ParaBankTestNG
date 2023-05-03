package testCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import testBase.TestBase;

public class TC_002_logOut extends TestBase {

    @Test
    public void logOut(){
        //Logging-in
        LoginPage lp=new LoginPage(driver);
        lp.loginExpress();

        // We are in the main page and clicking logout at side menu
        MainPage mp=new MainPage(driver);
        mp.logoutButton.click();
        String actualTitle=lp.loginBoxTitle.getText();
        String expectedTitle="Customer Login";

        // Verifying logged out successful by the text at above username section
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
