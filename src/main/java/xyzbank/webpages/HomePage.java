package xyzbank.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import xyzbank.utilities.BrowserFactory;
import xyzbank.utilities.PageActions;

public class HomePage {

    By customerLoginBtn = By.xpath("//button[@ng-click='customer()']");
    WebDriver browser = BrowserFactory.getBrowser();
    WebDriverWait wait = BrowserFactory.getWait();
    PageActions pageActionsObj = new PageActions();

    public HomePage navigateToCustomerLoginPage(){
        pageActionsObj.clickOnElement(customerLoginBtn);
        return this;
    }


}
