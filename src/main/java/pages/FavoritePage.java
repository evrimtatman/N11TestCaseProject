package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.BasePage;

import java.util.List;

public class FavoritePage extends BasePage {
    public FavoritePage(WebDriver driver) {
        super(driver);
    }

    By addFavoriteBy = By.id("addToFavouriteWishListBtn");
    By myAccountBy = By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div[1]/a[1]");
    By accountWishListBy = By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/a[2]");
    By addedProductName = By.className("productName");


    public FavoritePage addFavorite() {

        Select Select = new Select(driver.findElement(By.xpath("//*[@id=\"skuArea\"]/fieldset/select")));
        Select.selectByIndex(1);
        driver.findElement(By.xpath("//*[@id=\"getWishList\"]")).click();
        waitVisibility(addFavoriteBy);
        click(addFavoriteBy);
        driver.navigate().refresh();
        readText(addedProductName);

        return this;
    }

    public FavoritePage checkFavorites() {
        click(myAccountBy);
        click(accountWishListBy);
        return this;
    }
}






