package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPageTest {

    public WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://dreamhiringacademy.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @Test( groups = "sprint1")
    public void validateTitle(){
        // System.out.println(driver.getTitle());
        String expectedTitle="Login Page - HRM";
        String actualTitle= driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Title is correct "+actualTitle);

    }

    @Test(groups = "sprint1")
    public void loginTextValidation(){
        WebElement login=driver.findElement(By.xpath("//h2[text()='Login In']"));
        boolean isLoginTextDisplayed=login.isDisplayed();// this method uot put is true or false
        Assert.assertTrue(isLoginTextDisplayed);

    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }


}
