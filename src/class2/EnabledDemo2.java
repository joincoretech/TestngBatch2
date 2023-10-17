package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class EnabledDemo2 {

   public WebDriver driver;

   @Test(priority = 1)
   public void openBrowser(){
       System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
       driver= new ChromeDriver();
       driver.get("https://dreamhiringacademy.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

   }
   @Test(priority = 2, enabled = true)
   public void validateTitle(){
      // System.out.println(driver.getTitle());
       String expectedTitle="Login Page - HRM";
       String actualTitle= driver.getTitle();
       if (expectedTitle.equals(actualTitle)){
           System.out.println("title is correct");
       }else{
           System.out.println("title is incorrect");
       }
   }

    @Test(priority = 3, enabled = true)
    public void loginMethod(){
        driver.findElement(By.name("name")).sendKeys("admin@gmail.com");
        driver.findElement(By.id("Psw")).sendKeys("admin#123");
        driver.findElement(By.className("login")).click();
    }

@Test (priority = 4)
public void closeBrowser(){
       driver.quit();
}
}
