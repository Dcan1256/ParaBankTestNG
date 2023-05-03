package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenNewAccountPage extends PageConnection{
    public OpenNewAccountPage(WebDriver driver) {
        super(driver);
    }
    /**
     * Elements:
     * This section will contain the WebElements related with this page
     */
    @FindBy(xpath = "//*[@id=\"type\"]")
    public WebElement accountTypeDropdown;

    @FindBy(xpath = "//*[@id=\"fromAccountId\"]")
    public WebElement newAccountNumberDropdown;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/form/div/input")
    public WebElement openMyAccountButton;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/div/div/p[1]")
    public WebElement confirmationText;

    @FindBy(xpath = "//*[@id=\"newAccountId\"]")
    public WebElement newAccountNumber;

    /**
     * Action Methods:
     * This section will contain the Commonly used actions
     */
}
