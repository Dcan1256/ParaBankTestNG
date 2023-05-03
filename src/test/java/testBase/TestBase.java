package testBase;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

public class TestBase {
    public static WebDriver driver;
    public static ResourceBundle config;

    /**
     * This method will set up web browser for us depending on the
     * type of browser and Url address provided by the user before each method
     */
    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser){
        config=ResourceBundle.getBundle("config");

        if(browser.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            driver=new FirefoxDriver();
        }
        else{
            driver=new InternetExplorerDriver();
        }
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(config.getString("appURL"));
        driver.manage().window().maximize();
    }

    /**
     * This method will terminate the web browser after each method
     */
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    public String captureScreen(String tname) throws IOException {
        String timeStamp= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String destination= System.getProperty("user.dir")+"\\Screenshots\\"+tname+"_"+timeStamp+".png";

        try {
            FileUtils.copyFile(source, new File(destination));
        }catch (Exception e){
            e.getMessage();
        }
        return destination;
    }
}
