package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import testBase.TestBase;

public class TC_001_login extends TestBase {

    @Test
    public void login(){
        // We are in the login page and logging in
        LoginPage lp=new LoginPage(driver);
        lp.usernameBox.sendKeys(config.getString("user_name"));
        lp.passwordBox.sendKeys(config.getString("password"));
        lp.loginButton.click();

        // We are in the main page and validating we logged in successfully
        // via Main page's menu title
        MainPage mp= new MainPage(driver);
        String actualTitle=mp.mainMenuTitle.getText();
        String expectedTitle="Account Services";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
