package class1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemo1 {


    @Test
    public void hello(){
        System.out.println("hello batch2 this is testng");
    }

    @Test
    public void method1(){
        System.out.println("this is method1");
    }

    @Test
    public void method2(){
        System.out.println("this is method2");
    }
}
