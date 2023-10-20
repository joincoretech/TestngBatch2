package reviewClass1;

import org.testng.annotations.Test;

public class PriorityDemo {

    @Test (priority = 3)
    public void firstTest(){
        System.out.println("this is first test");
    }

    @Test(priority = 2, dependsOnMethods = "firstTest")
    public void secondTest(){
        System.out.println("this is second test");
    }

    @Test(priority = 1, dependsOnMethods = "secondTest")
    public void thirdTest(){
        System.out.println("this is third test");
    }
}
