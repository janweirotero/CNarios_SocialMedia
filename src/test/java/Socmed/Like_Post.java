package Socmed;

import BaseFile.Base_File;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Call_Elements.Call_elements;

public class Like_Post extends Base_File {

    Call_elements elementObjective;

    @BeforeMethod
    public void init(){

        elementObjective = new Call_elements(driver);

    }

    @Test
    public void StartUp(){

        elementObjective.clickHeart();
        elementObjective.verifyCount();

    }

}
