package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Driver;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage() {
        driver = Driver.getDriver();
    }

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    String url = "https://demowebshop.tricentis.com/";

    String sMainMenuLinks = "//div[@class='header-links']//a[contains(.,'Log in')]";

    public void open() {
        driver.get(url);
    }

    public boolean login(String username, String password) {
        return false;
    }

    public void clickMenu(String menuText) {

    }


}
