package class2;

import org.testng.annotations.Test;

public class EnableDisableDemo {

    @Test(enabled = false)
    public void method1(){
        System.out.println("method1");
    }

   @Test (enabled = false)
    public void method2(){
        System.out.println("method2");
    }
    @Test
    public void method3(){
        System.out.println("method3");
    }

}
