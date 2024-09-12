package xyzbanktestcases.homepage;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import xyzbank.utilities.BrowserFactory;
import xyzbank.webpages.CustomerAccountActions;
import xyzbank.webpages.CustomerLoginPage;
import xyzbank.webpages.HomePage;

public class DepositMoneyAccount {

    HomePage homePageObj = new HomePage();
    CustomerLoginPage customerLoginPageObj = new CustomerLoginPage();
    CustomerAccountActions customerAccountActionsObj = new CustomerAccountActions();

    String expectedResult = "Deposit Successful";


    @Test
    @Parameters({"customerName" , "amount"})
    public void depositMoney(String customerName, String amount){
        homePageObj.navigateToCustomerLoginPage();
        customerLoginPageObj.
                selectCustomer(customerName).
                clickOnLoginBtn().
                selectCustomer(customerName).
                clickOnLoginBtn();
        String actualResult=customerAccountActionsObj.depositMoney(amount).getMessage();

        Assert.assertEquals(actualResult , expectedResult);

        BrowserFactory.browserQuit();
    }
}
