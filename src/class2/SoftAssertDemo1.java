package class2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo1 {

  @Test
    public void softAssertMethod(){

        String expectedText="this is my test";
        String actualText="This is my test";

        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals(actualText, expectedText);
        System.out.println("code after first assertion");


        softAssert.assertTrue(false);
        System.out.println("code after second assert");


        softAssert.assertFalse(true);
        System.out.println("code after third assertion");

        softAssert.assertAll();
    }
}
