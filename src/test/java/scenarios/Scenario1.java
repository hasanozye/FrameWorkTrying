package scenarios;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utility.Browsers;
import utility.Driver;

public class Scenario1 {
    WebDriver driver = Driver.getDriver();


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
        driver = Driver.getDriver(Browsers.EDGE);

        HomePage homePage = new HomePage();
    }


}
