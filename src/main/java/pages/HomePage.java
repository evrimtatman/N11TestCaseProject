package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    String baseURL = "http://www.n11.com/";
    //*****WebElements****
    By signInButtonBy = By.className("btnSignIn");
    //*********Page Methods*********
    //Go to Homepage

    public HomePage goToN11 (){
        driver.get(baseURL);
        return this;
    }

    //Go to LoginPage
    public LoginPage goToLoginPage (){
        click(signInButtonBy);
        return new LoginPage(driver);
    }

    //Verify Homepagetitle
    public String title(){
        return driver.getTitle();
    }
    public void verifyTitle() {
        Assert.assertEquals(title(), "n11.com - Alışverişin Uğurlu Adresi");
            }
}
