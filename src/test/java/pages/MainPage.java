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

    /**
     * Action Methods:
     * This section will contain the Commonly used actions
     */
}
