package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ResourceBundle;

public class RegistrationPage extends PageConnection {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    //Elements
    @FindBy(xpath = "//*[@id=\"customer.firstName\"]")
    public WebElement firstNameBox;
    @FindBy(xpath = "//*[@id=\"customer.lastName\"]")
    public WebElement lastNameBox;

    @FindBy(xpath = "//*[@id=\"customer.address.street\"]")
    public WebElement addressBox;

    @FindBy(xpath = "//*[@id=\"customer.address.city\"]")
    public WebElement cityBox;

    @FindBy(xpath = "//*[@id=\"customer.address.state\"]")
    public WebElement stateBox;

    @FindBy(xpath = "//*[@id=\"customer.address.zipCode\"]")
    public WebElement zipCodeBox;

    @FindBy(xpath = "//*[@id=\"customer.phoneNumber\"]")
    public WebElement phoneNumberBox;

    @FindBy(xpath = "//*[@id=\"customer.ssn\"]")
    public WebElement ssnBox;

    @FindBy(xpath = "//*[@id=\"customer.username\"]")
    public WebElement userNameBox;

    @FindBy(xpath = "//*[@id=\"customer.password\"]")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"repeatedPassword\"]")
    public WebElement passwordConfirmationBox;

    @FindBy(xpath = "//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@id=\"rightPanel\"]/p")
    public WebElement verficationText;


    //Action Methods
    public void fillRegistrationForm(){
        ResourceBundle config=ResourceBundle.getBundle("config");
        firstNameBox.sendKeys(config.getString("first_name"));
        lastNameBox.sendKeys(config.getString("last_name"));
        addressBox.sendKeys(config.getString("address"));
        cityBox.sendKeys(config.getString("city"));
        stateBox.sendKeys(config.getString("state"));
        zipCodeBox.sendKeys(config.getString("zipcode"));
        phoneNumberBox.sendKeys(config.getString("phone"));
        ssnBox.sendKeys(config.getString("ssn"));
        userNameBox.sendKeys(config.getString("user_name"));
        passwordBox.sendKeys(config.getString("password"));
        passwordConfirmationBox.sendKeys(config.getString("password"));
        registerButton.click();
    }
}
