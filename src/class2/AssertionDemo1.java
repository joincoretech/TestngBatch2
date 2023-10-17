package class2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo1 {
    @Test
    public void assertionMethod(){
        String expectedText="JoinCoreTech";
        String actualText="JoinCoreTech";

       /* if (actualText.equals(expectedText)){
            System.out.println("passed");
        }else{
            System.out.println("fail");
        }*/
        Assert.assertEquals(actualText, expectedText);
        System.out.println("my test case is passed");

        Boolean buttonIsDisplayed= false;
        Assert.assertFalse(buttonIsDisplayed);// assertion will pass
        Assert.assertTrue(buttonIsDisplayed);// assertion will fail


    }





}
