package Socmed;

import BaseFile.Base_File;
import org.testng.annotations.BeforeMethod;
import Call_Elements.Call_elements;
import org.testng.annotations.Test;

public class Notifications extends Base_File {

    Call_elements elementsObject;

    @BeforeMethod
    public void init(){

        elementsObject = new Call_elements(driver);

    }

    @Test
    public void StartUp(){

        elementsObject.clickHeart();
        elementsObject.notification();


    }


}
