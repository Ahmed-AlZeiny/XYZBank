package xyzbank.webpages;

import org.openqa.selenium.By;
import xyzbank.utilities.PageActions;

public class CustomerLoginPage {

    PageActions pageActionsObj = new PageActions();
    By listId = By.id("userSelect");
    By loginBtn = By.xpath("//button[@type='submit']");
    By customerName = By.xpath("//*[text()='Albus Dumbledore']");

    public CustomerLoginPage selectCustomer(String customerName){
        pageActionsObj.selectFromList(listId , customerName);
        return this;
    }

    public CustomerLoginPage clickOnLoginBtn(){
        pageActionsObj.clickOnElement(loginBtn);

        return this;
    }

    public String getCustomerName(){
       return pageActionsObj.setText(customerName).getTextValue();
    }


}
