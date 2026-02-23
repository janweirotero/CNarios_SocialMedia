package Call_Elements;

import BaseFile.Base_File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class Call_elements extends Base_File{

    public Call_elements(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")
    WebElement clickHeart;

    @FindBy(css = ".css-cpepff")
    WebElement filledState;


    public void clickHeart(){
        clickHeart.click();
    }

    public void verifyCount(){

       List<WebElement> getText =  driver.findElements(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 css-1o5u7u9'])[1]"));

       for(WebElement s : getText){

           String[] newText = s.getText().split(" ");
           int count = Integer.parseInt(newText[0]);

           if (count > 12){

               int postCount = count - 12;
               Assert.assertEquals(postCount, 1);
               Assert.assertTrue(filledState.isDisplayed());

           } else if (count == 12) {

               int postCount = count - 12;
               Assert.assertEquals(postCount, 0);
               Assert.assertTrue(clickHeart.isDisplayed());

           }



       }

    }

}
