package testCases;

import listener.Listener;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.FavoritePage;
import pages.HomePage;
import pages.SearchPage;
import utils.BaseTest;

@Listeners({Listener.class})
public class FavoritePageTestCase extends BaseTest {
    @Test(priority = 0)
    public void addToFavorite () {

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);
        FavoritePage favoritePage = new FavoritePage(driver);

        //*************PAGE METHODS********************
        homePage.goToN11();
        homePage.goToLoginPage().loginToN11("ewotest123@gmail.com", "Ewo123*");
        searchPage.searchProduct("samsung");
        searchPage.navigate2anotherpage();
        //searchPage.verifyTitle("Samsung - n11.com");
        //searchPage.verifyCurrentPage("https://www.n11.com/arama?q=samsung&pg=2");
        searchPage.chooseProduct();
        favoritePage.addFavorite();
        favoritePage.checkFavorites();


    }
}
