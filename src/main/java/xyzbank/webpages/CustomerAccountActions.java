package xyzbank.webpages;

import org.openqa.selenium.By;
import xyzbank.utilities.PageActions;

public class CustomerAccountActions {

    PageActions pageActionsObj = new PageActions();
    By showDepositFieldBtn = By.xpath("//*[@ng-class='btnClass2']");
    By confirmDepositBtn = By.xpath("//*[@type='submit']");
    By depositField = By.xpath("//*[@ng-model='amount']");
    By withdrawBtn = By.xpath("//button[@type = 'submit']");
    By depositSuccessMessage= By.xpath("//*[@ng-show='message']");
    String successMessage;

    public CustomerAccountActions depositMoney(String amount) {
        pageActionsObj.clickOnElement(showDepositFieldBtn)
                      .insertValueInField(depositField, amount)
                      .clickOnElement(confirmDepositBtn);
        return this;
    }

    public String getMessage(){
         return pageActionsObj.getTextValue(depositSuccessMessage);
    }

    public CustomerAccountActions withdrawMoney(String amount) {
        pageActionsObj.clickOnElement(withdrawBtn)
                .insertValueInField(depositField , amount);


        return this;
    }

}
