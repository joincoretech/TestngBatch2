package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SoftAssertDemo2 {

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
    public void validateTitle() {
        // System.out.println(driver.getTitle());
        String expectedTitle = "Login Page - HRM";
        String actualTitle = driver.getTitle();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);
        System.out.println("title is correct");

        driver.findElement(By.name("name")).sendKeys("admin@gmail.com");
        driver.findElement(By.id("Psw")).sendKeys("admin#123");
        driver.findElement(By.className("login")).click();

        WebElement accountName=driver.findElement(By.xpath("//div[@class='user-name']/p"));

        softAssert.assertTrue(accountName.isDisplayed());
        System.out.println("user loggedIn and account name is displayed");

        driver.quit();
        softAssert.assertAll();


    }
}
