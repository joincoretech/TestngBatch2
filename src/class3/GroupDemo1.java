package class3;

import org.testng.annotations.Test;

public class GroupDemo1 {

    @Test (groups = "smoke")
    public void firstTest(){
        System.out.println("this is first test");
    }
    @Test(groups = "smoke")
    public void secondTest(){
        System.out.println("this is second test");
    }
    @Test(groups = "regression")
    public void thirdTest(){
        System.out.println("this is third test");
    }
    @Test( groups = "smoke" )
    public void forthTest(){
        System.out.println("this is forth test");
    }


}
