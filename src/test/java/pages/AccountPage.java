package pages;

import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.Input;

public class AccountPage extends BasePage {

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void createAccount(Account account) {
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Phone").write(account.getAccountName());
        new Input(driver, "Website").write(account.getAccountName());
        new Input(driver, "Employees").write(account.getAccountName());
    }

    public AccountPage open() {
        driver.get(baseUrl + "lightning/o/Account/list?filterName=Recent");
        return this;
    }

    public void clickNew(){
        driver.findElement(By.cssSelector("[title=New]")).click();
    }

    public void clickSave() {
        driver.findElement(By.xpath("//span[contains(text(), 'Save')]")).click();
    }

}