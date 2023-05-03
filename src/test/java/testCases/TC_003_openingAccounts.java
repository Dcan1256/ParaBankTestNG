package testCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.OpenNewAccountPage;
import testBase.TestBase;

public class TC_003_openingAccounts extends TestBase {

    @Test
    public void openingCheckingAccount() throws InterruptedException {
        LoginPage lp=new LoginPage(driver);
        lp.loginExpress();

        MainPage mp=new MainPage(driver);
        mp.openNewAccountButton.click();

        OpenNewAccountPage onap=new OpenNewAccountPage(driver);
        Select select=new Select(onap.accountTypeDropdown);
        select.selectByValue("0");
        onap.accountTypeDropdown.click();
        onap.openMyAccountButton.click();


        String actualText=onap.confirmationText.getText();
        String expectedText="Congratulations, your account is now open.";
        Assert.assertEquals(actualText,expectedText);

    }

    @Test
    public void openingSavingsAccount(){
        LoginPage lp=new LoginPage(driver);
        lp.loginExpress();

        MainPage mp=new MainPage(driver);
        mp.openNewAccountButton.click();

        OpenNewAccountPage onap=new OpenNewAccountPage(driver);
        Select select=new Select(onap.accountTypeDropdown);
        select.selectByValue("1");
        onap.accountTypeDropdown.click();
        onap.openMyAccountButton.click();


        String actualText=onap.confirmationText.getText();
        String expectedText="Congratulations, your account is now open.";
        Assert.assertEquals(actualText,expectedText);
    }
}
