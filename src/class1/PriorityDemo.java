package class1;

import org.testng.annotations.Test;

public class PriorityDemo {

    @Test   (priority = 2)
    public void method1(){
        System.out.println("method one but i should run second");
    }
    @Test (priority = 3)
    public void method2(){
        System.out.println("Method two but i should run third");
    }
    @Test (priority = 1)
    public void method3(){
        System.out.println("method three but i should eun first");
    }
}
