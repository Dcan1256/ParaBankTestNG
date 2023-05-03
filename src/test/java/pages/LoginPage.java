package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageConnection{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Elements:
     * This section will contain the WebElements related with this page
     */
    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[1]/input")
    public WebElement usernameBox;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[2]/input")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[3]/input")
    public WebElement loginButton;

    /**
     * Action Methods:
     * This section will contain the Commonly used actions
     */
}
