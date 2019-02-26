package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.BaseTest;

@Listeners({Listener.class})
public class LoginTestCase extends BaseTest {
    @Test(priority = 0)
    public void invalidLoginTest_InvalidUserNameInvalidPassword () {

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);

        //*************PAGE METHODS********************
        homePage.goToN11()
                .goToLoginPage()
                .loginToN11("ewotest11@gmail.com", "12345")
                .verifyLoginPassword(("E-posta adresiniz veya şifreniz hatalı"))
                .verifyLoginPassword(("E-posta adresiniz veya şifreniz hatalı"));
    }

    @Test (priority = 1)
    public void invalidLoginTest_EmptyUserEmptyPassword () {
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);

        //*************PAGE METHODS********************
        homePage.goToN11()
                .goToLoginPage()
                .loginToN11("","")
                .verifyLoginUserName("Lütfen e-posta adresinizi girin.")
                .verifyLoginPassword("Bu alanın doldurulması zorunludur.");
    }

    @Test (priority = 2)
    public void invalidLoginTest_EmptyUserValidPassword () {
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);

        //*************PAGE METHODS********************
        homePage.goToN11()
                .goToLoginPage()
                .loginToN11("","ewo6553.")
                .verifyLoginUserName("Lütfen e-posta adresinizi girin.");
                //.verifyLoginPassword("Bu alanın doldurulması zorunludur.");
    }
    @Test (priority = 3)
    public void invalidLoginTest_ValidUserInvalidPassword () {
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);

        //*************PAGE METHODS********************
        homePage.goToN11()
                .goToLoginPage()
                .loginToN11("ewotest11@gmail.com","12345")
                //.verifyLoginUserName("E-posta adresiniz veya şifreniz hatalı")
                .verifyLoginPassword("E-posta adresiniz veya şifreniz hatalı");
    }
    @Test (priority = 4)
    public void validLoginTest_ValidUserValidPassword () {
        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);

        //*************PAGE METHODS********************
        homePage.goToN11()
                .goToLoginPage()
                .loginToN11("ewotest123@gmail.com","Ewo123*");

    }

}
