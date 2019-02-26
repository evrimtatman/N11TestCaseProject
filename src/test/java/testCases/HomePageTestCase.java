package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.BaseTest;

@Listeners({Listener.class})
public class HomePageTestCase extends BaseTest {
    @Test(priority = 0)
    public void titleControl (){

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);

        //*************PAGE METHODS********************
        homePage.goToN11()
                .verifyTitle();

    }




}
