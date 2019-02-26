package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.BasePage;

import java.util.List;

public class SearchPage extends BasePage {
    /*********Constructor*********/
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    //****WebElements****

    By searchBoxBy = By.xpath("//*[@id=\"searchData\"]");
    By searchButtonBy = By.className("searchBtn");
    //By nextPageBy = By.xpath("//*[@id=\"contentListing\"]/div/div/div[2]/div[3/a[2]");

    By nextPageBy = By.cssSelector("#contentListing > div > div > div.productArea > div.pagination > a:nth-child(2)");
    //By chooseProductBy = By.xpath("//*[@id=\"p-242058259\"]/div[1]");
    //By  chooseProductBy = By.cssSelector("#view > ul > li:nth-child(3)");
    By chooseProductBy = By.xpath("//*[@id=\"view\"]/ul/li[3]");

    //*********Page Methods*********
//search the product on Homepage
    public SearchPage searchProduct(String productname) {
        //Enter SearchedProduct(Samsung)
        writeText(searchBoxBy, productname);
        //Click Search Button
        click(searchButtonBy);
        return this;
    }

    //choose the second page of the results
    public SearchPage navigate2anotherpage() {
        //waitVisibility(nextPageBy);
        click(nextPageBy);
        return this;
    }

    //Verify Searchpagetitle
    public String title() {
        return driver.getTitle();

    }

    public SearchPage verifyTitle(String expectedTitle) {
        Assert.assertEquals(title(), expectedTitle);
        return this;
    }

    public String currentUrl() {
        return driver.getCurrentUrl();
    }

    public SearchPage verifyCurrentPage(String expectedUrl) {
        Assert.assertEquals(currentUrl(), expectedUrl);
        return this;
    }

    public SearchPage chooseProduct() {
        WebElement productUrl= driver.findElement(By.xpath("//*[@id=\"view\"]/ul"));
        List<WebElement> productList=productUrl.findElements(By.tagName("li"));
        WebElement productDiv=productList.get(4).findElement(By.tagName("div"));
        List<WebElement>hrefList=productDiv.findElements(By.tagName("a"));
        driver.navigate().to(hrefList.get(0).getAttribute("href"));
        return this;
    }

    //**public SearchPage verifyChosenProduct(String expectedUrl){
    //Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
    // return this;

    //}
}
