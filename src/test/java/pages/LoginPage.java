package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ResourceBundle;

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

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/h2")
    public WebElement loginBoxTitle;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/p[2]/a")
    public WebElement registerLink;

    /**
     * Action Methods:
     * This section will contain the Commonly used actions
     */

    /**
     * This method contains valid username and password for bypassing
     * login step when it is necessary.
     */
    public void loginExpress(){
        usernameBox.sendKeys("test123");
        passwordBox.sendKeys("test123");
        loginButton.click();
    }
}
