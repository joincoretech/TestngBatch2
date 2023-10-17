package class2;

import org.testng.annotations.Test;

public class DependOnMthodDemo1 {


    @Test
    public void method1(){
        System.out.println("this method should run first");
    }

    @Test(dependsOnMethods = "method1")
    public void method2(){
        System.out.println("this method should run if first method pass");
    }
}
