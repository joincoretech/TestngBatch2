package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class DependOnMethodDemo2 {


    public WebDriver driver;

    @Test
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://dreamhiringacademy.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @Test(dependsOnMethods = "openBrowser")
    public void loginMethod(){
        driver.findElement(By.name("name")).sendKeys("admin@gmail.com");
        driver.findElement(By.id("Psw")).sendKeys("admin#123");
        driver.findElement(By.className("login")).click();
    }
    @Test(dependsOnMethods = "loginMethod")
    public void closeBrowser(){
        driver.quit();
    }

}
