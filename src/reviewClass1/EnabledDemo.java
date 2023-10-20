package reviewClass1;

import org.testng.annotations.Test;

public class EnabledDemo {



    @Test (enabled = false)
    public void firstTest(){
        System.out.println("this is first test");
    }

    @Test
    public void secondTest(){
        System.out.println("this is second test");
    }

    @Test(enabled = false)
    public void thirdTest(){
        System.out.println("this is third test");
    }

}
