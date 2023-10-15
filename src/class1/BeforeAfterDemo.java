package class1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterDemo {

    @Test
    public void firstMethod(){
        System.out.println("first method");
    }
    @Test
    public void secondMethod(){
        System.out.println("second method");
    }
    @Test
    public void thirdMethod(){
        System.out.println("third method");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }


}
