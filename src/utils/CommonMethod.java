package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class CommonMethod {

    public WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        ConfigReader.readProperties("src/config/Config.properties");

        switch (ConfigReader.getPropertiesValue("browser")){

            case "chrome":
                System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
                driver=new ChromeDriver();
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
               driver=new FirefoxDriver();
               break;

            default:
                throw new RuntimeException("Invalid browser name");
        }
        driver.get(ConfigReader.getPropertiesValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }


    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }

}
