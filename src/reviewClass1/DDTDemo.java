package reviewClass1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTDemo {

    @DataProvider
    public Object[][] dataMethod(){
        Object [][] data=new Object[2][3];
        data[0][0]="Samiullah";
        data[0][1]="Amanzai";
        data[0][2]= 12;
        data[1][0]="masodi";
        data[1][1]="masodi";
        data[1][2]= 14;
        return data;
    }


    @Test (dataProvider="dataMethod" )
    public void addDataTest( String firstName , String lastName, Integer id){

        System.out.println("FirstName is "+firstName+" LastName is "+lastName+" Id is "+id);
    }
}
