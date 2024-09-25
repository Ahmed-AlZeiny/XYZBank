package xyzbank.webpages;

import org.openqa.selenium.By;
import xyzbank.utilities.PageActions;

public class HomePage {

    By customerLoginBtn = By.xpath("//button[@ng-click='customer()']");
    PageActions pageActionsObj = new PageActions();

    public HomePage navigateToCustomerLoginPage(){
        pageActionsObj.clickOnElement(customerLoginBtn);
        return this;
    }


}
