package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageConnection{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Elements:
     * This section will contain the WebElements related with this page
     */
    @FindBy(xpath = "//*[@id=\"leftPanel\"]/h2")
    public WebElement mainMenuTitle;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[8]/a")
    public WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[1]/a")
    public WebElement openNewAccountButton;

    /**
     * Action Methods:
     * This section will contain the Commonly used actions
     */
}
