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
    //****WebElements****

    //By addFavoriteBy = By.xpath("//*[@id=\"getWishList\"]");
    By addFavoriteBy = By.id("addToFavouriteWishListBtn");
    By myAccountBy = By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div[1]/a[1]");
    By accountWishListBy = By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/a[2]");
    By addedProductName = By.className("productName");
    //*********Page Methods*********
//search the product on Homepage

    public FavoritePage addFavorite() {
        //Add chosen product to favorite
        waitVisibility(By.xpath("//*[@id=\"720263490\"]"));
        Select Select = new Select(driver.findElement(By.id("720263490")));

        //  Select option 'SİYAH' (Use selectByIndex)
        Select.selectByVisibleText("SİYAH");
        // Select option 'SİYAH' now (Use selectByVisibleText)
        Select.selectByIndex(1);
         //select.selectByValue("1");
        //select.selectByVisibleText("SİYAH");
        // Click favorite  Button
        driver.findElement(By.xpath("//*[@id=\"getWishList\"]")).click();
        waitVisibility(addFavoriteBy);
        click(addFavoriteBy);
        //close light box
        //driver.findElement(By.xpath("/html/body/div[7]/div/div/span")).click();
        driver.findElement(By.xpath("/html/body/div[7]/div/span[1]")).click();

       //WebElement element =driver.findElement(By.ByLinkText("addWishListBtn"));
        //element.submit();
        //click(addFavoriteBy);
        readText(addedProductName);
        return this;
    }

    //Verify Product added to Favorites
    public FavoritePage checkFavorites() {
        //Check Account Favorites
        click(myAccountBy);
        click(accountWishListBy);
        //Assert.assertEquals(addedProductName,driver.findElement(By.className("pro").findElement()));
        return this;
    }
}






