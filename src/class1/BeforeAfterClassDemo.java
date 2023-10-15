package class1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClassDemo {


    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }

    @Test
    public void firstMethod(){
        System.out.println("first method");
    }
    @Test
    public void secondMethod(){
       System.out.println("second method");
    }


    @BeforeClass
    public void beforeClass(){
       System.out.println("before class");
    }


}
