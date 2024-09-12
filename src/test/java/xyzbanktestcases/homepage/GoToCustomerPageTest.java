package xyzbanktestcases.homepage;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import xyzbank.utilities.BrowserFactory;
import xyzbank.utilities.PageActions;
import xyzbank.webpages.CustomerLoginPage;
import xyzbank.webpages.HomePage;

public class GoToCustomerPageTest {

    HomePage homePageObj = new HomePage();
    PageActions pageActionsObj = new PageActions();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    String actualResult;

    @Test
    @Parameters({"customerName"})
    public void goToCustomerLoginPage(String customerName) {
        homePageObj.
                navigateToCustomerLoginPage();
        actualResult = customerLoginPage.
                selectCustomer(customerName).
                clickOnLoginBtn().
                getCustomerName();


        Assert.assertEquals(actualResult, customerName);
    }

    @AfterTest
    public void quit(){
        BrowserFactory.browserQuit();
    }

}
