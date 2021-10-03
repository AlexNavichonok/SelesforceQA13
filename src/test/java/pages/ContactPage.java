package pages;

import org.openqa.selenium.WebDriver;

public class ContactPage extends BasePage{

    public ContactPage(WebDriver driver){
        super(driver);
    }

    @Override
    public ContactPage open(){
        return this;
    }
}
