package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageConnection {
    WebDriver driver;

    public PageConnection(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
