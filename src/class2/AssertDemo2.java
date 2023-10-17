package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AssertDemo2 {

    public WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://dreamhiringacademy.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    @Test
    public void validateTitle(){
        // System.out.println(driver.getTitle());
        String expectedTitle="Login Page - HRM";
        String actualTitle= driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Title is correct "+actualTitle);

       /* if (expectedTitle.equals(actualTitle)){
            System.out.println("title is correct");
        }else{
            System.out.println("title is incorrect");
        }*/
    }
     @Test
    public void loginTextValidation(){
        WebElement login=driver.findElement(By.xpath("//h2[text()='Login In']"));
        boolean isLoginTextDisplayed=login.isDisplayed();// this method uot put is true or false
        Assert.assertTrue(isLoginTextDisplayed);

    }

    public void closeBrowser(){
        driver.quit();
    }

}
