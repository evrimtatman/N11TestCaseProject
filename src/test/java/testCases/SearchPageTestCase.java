package testCases;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;
import utils.BaseTest;

@Listeners({Listener.class})
public class SearchPageTestCase extends BaseTest {

    @Test(priority = 0)
    public void searchProduct() throws InterruptedException {

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);

        //*************PAGE METHODS********************
        homePage.goToN11();
        homePage.goToLoginPage().loginToN11("ewotest123@gmail.com","Ewo123*");
        searchPage.searchProduct("samsung");
        searchPage.verifyTitle("Samsung - n11.com");
        searchPage.navigate2anotherpage();
        //searchPage.verifyTitle("Samsung - n11.com - 2/11820");
        searchPage.verifyCurrentPage("https://www.n11.com/arama?q=samsung&pg=2");
        searchPage.chooseProduct();
        //searchPage.verifyChosenProduct("https://urun.n11.com/cep-telefonu/samsung-galaxy-s9-plus-64gb-samsung-turkiye-garantili-P242058259");


    }
}