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
    By getAccountWishListBy= By.className("column wishListColumn");



    public FavoritePage addFavorite() {

        Select Select = new Select(driver.findElement(By.xpath("//*[@id=\"skuArea\"]/fieldset/select")));
        Select.selectByIndex(1);
        driver.findElement(By.xpath("//*[@id=\"getWishList\"]")).click();
        waitVisibility(addFavoriteBy);
        click(addFavoriteBy);
        driver.navigate().refresh();


        return this;
    }

    public FavoritePage checkFavorites() {
//test
        driver.navigate().to("https://www.n11.com/hesabim/favorilerim");

        WebElement wishList=driver.findElement(By.className("pro"));

        List<WebElement> list=wishList.findElements(By.xpath("//*[@href]"));
        for(WebElement e : list){
            String link = e.getAttribute("href");
            if(!e.getTagName().equals("link"))
            {System.out.println(e.getTagName() + "=" + link);}

        }
        return this;
    }

}







