package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.CommonMethod;

import java.time.Duration;

public class LoginTest extends CommonMethod {

   /* public WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://dreamhiringacademy.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }*/


    @Test
    public void validateTitle(){
        String expectedTitle="Login Page - HRM";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Title is correct "+actualTitle);

    }

    @Test
    public void loginTextValidation(){
        WebElement login=driver.findElement(By.xpath("//h2[text()='Login In']"));
        boolean isLoginTextDisplayed=login.isDisplayed();// this method uot put is true or false
        Assert.assertTrue(isLoginTextDisplayed);

    }

    @Test
    public void loginMethod(){
        driver.findElement(By.name("name")).sendKeys("admin@gmail.com");
        driver.findElement(By.id("Psw")).sendKeys("admin#123");
        driver.findElement(By.className("login")).click();
    }

   /* @AfterMethod( alwaysRun = true)
    public void closeBrowser(){
        driver.quit();
    }*/
}
