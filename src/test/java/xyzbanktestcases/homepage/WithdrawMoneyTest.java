package xyzbanktestcases.homepage;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import xyzbank.utilities.BrowserFactory;
import xyzbank.webpages.CustomerAccountActions;
import xyzbank.webpages.CustomerLoginPage;
import xyzbank.webpages.HomePage;

public class WithdrawMoneyTest {


    HomePage homePageObj = new HomePage();
    CustomerLoginPage customerLoginPageObj = new CustomerLoginPage();
    CustomerAccountActions customerAccountActionsObj = new CustomerAccountActions();
    String expectedValue = "Transaction successful";
    @Test
    @Parameters({"customerName" , "amount"})
    public void withdrawMoney(String customerName , String amount){

        homePageObj.navigateToCustomerLoginPage();

        customerLoginPageObj.selectCustomer(customerName).clickOnLoginBtn();


      String actualValue =  customerAccountActionsObj.withdrawMoney(amount).getMessage();

        Assert.assertEquals(actualValue , expectedValue);
    }

    @AfterTest
    public void quitBrowser(){
        BrowserFactory.browserQuit();
    }
}
