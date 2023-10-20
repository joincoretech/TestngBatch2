package reviewClass1;

import org.testng.annotations.*;

public class Demo1 {

    // testng is annotation base automation tools
    // the main annotation to run test case is @Test

    @Test
    public void firstTest(){
        System.out.println("this is first test");
    }

    @Test
    public void secondTest(){
        System.out.println("this is second test");
    }

    @Test
    public void thirdTest(){
        System.out.println("this is third test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this is before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println(" this is before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("this is after class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("this is before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("this is after test");
    }
}
