package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    WebDriver driver;
    WebDriverWait wait;
    String baseUrl = "https://tms8.my.salesforce.com/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public abstract BasePage open();

    public void openMenu(WebDriver driver){
        this.driver = driver;

    }

}