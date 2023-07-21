package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.Browsers;
import utility.Driver;

import java.util.List;

public class Scenario1 {
    WebDriver driver;
    String myUsername = "abc123@aa.com";
    String myPassword = "123456";


    @Test
    public void scenario1() {
         /*
         1. https://demowebshop.tricentis.com/ sayfasına gidin
         2. HomePage class'inin kullanarak login olun

         HomePage homePage = new HomePage(driver);
         homePage.login("username","password);
         homePage.search("mac");
         gibi
         3. desktop aratin ve 6 ürün listelendigini assert edin
         4. "Add to Cart" içeren ürün sayisini veren güzel bir xpath yazmalisiniz
          */
        HomePage homePage = new HomePage();
        driver = Driver.getDriver();
        homePage.open();
        System.out.println(homePage.login(myUsername, myPassword));

        List<WebElement> searchedProducts = homePage.search("comp");
        int prods = searchedProducts.size();
        Assert.assertEquals(prods, 7);

        int addToCart = driver.findElements(By.cssSelector(".search-results .item-box input")).size();
        Assert.assertEquals(addToCart, 6);


        Driver.getDriver().quit();
    }

    @Test
    public void test2() {
        HomePage hp = new HomePage(Browsers.EDGE);
        hp.open();
        hp.login(myUsername, myPassword);
        Driver.getDriver().quit();
    }


}
