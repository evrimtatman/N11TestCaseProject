package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    public String baseURL = "http://www.n11.com/";

    @BeforeClass
    public void setup () {
        //Create a Chrome driver. All test classes use this.

         driver =  new ChromeDriver();
         //Maximize Window
         driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown () {

        //driver.quit();
    }
}
