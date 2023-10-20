package reviewClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class InValidLogin {

    WebDriver driver;
     @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://dreamhiringacademy.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void invalidLogin(){
         String expectedText="Username and Password is Wrong!";
        WebElement userNameBox=driver.findElement(By.name("name"));
        userNameBox.sendKeys("admin@gmail.com");
        WebElement password=driver.findElement(By.id("Psw"));
        password.sendKeys("test123");
        driver.findElement(By.name("submit")).click();
        WebElement alert=driver.findElement(By.xpath(" //h4[contains(text(),'Wrong!')]"));
        String actualText=alert.getText();

        Assert.assertEquals(actualText, expectedText);
        System.out.println("the alert text are equal "+ actualText);

    }




}
