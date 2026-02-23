package BaseFile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base_File {

    public WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void initialize() throws IOException {

        Properties prop = new Properties();
        FileInputStream fInput = new FileInputStream("C:\\Users\\User\\IdeaProjects\\CNarios_Social_Media\\src\\test\\java\\BaseFile\\BrowserName");
        prop.load(fInput);

        String browserName = prop.getProperty("browser");

        if (browserName.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("firefox")){

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get("https://www.cnarios.com/challenges/social-media-feed");




    }

}
