package tests;

import models.Account;
import models.AccountFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest {

    @Test
    public void createAccount() {
        boolean isOpened = loginPage
                .open()
                .login("ksandrnav-fjsk@force.com", "145599Sbmw")
                .isOpened();
        assertTrue(isOpened, "Home page wasn't opened");

        //loginPage.open();
        //loginPage.login("ksandrnav-fjsk@force.com", "145599Sbmw");
        accountPage.open();
        accountPage.clickNew();

        Account account = AccountFactory.get();
        accountPage.createAccount(account);
        accountPage.clickSave();
    }
}