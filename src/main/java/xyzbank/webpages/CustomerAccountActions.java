package xyzbank.webpages;

import org.openqa.selenium.By;
import xyzbank.utilities.PageActions;

public class CustomerAccountActions {

    PageActions pageActionsObj = new PageActions();
    By showDepositFieldBtn = By.xpath("//*[@ng-class='btnClass2']");
    By confirmDepositBtn = By.xpath("//*[@type='submit']");
    By depositField = By.xpath("//*[@ng-model='amount']");
    By withdrawBtn = By.xpath("//button[@type = 'submit']");
    By successMessage = By.xpath("//*[@ng-show='message']");
    By showWithdrawField = By.xpath("//*[@ng-class='btnClass3']");
    By withdrawField = By.xpath("//*[@type='number']");
    By confirmWithDrawBtn = By.xpath("//*[text()='Withdraw']");

    public CustomerAccountActions depositMoney(String amount) {
        pageActionsObj.clickOnElement(showDepositFieldBtn)
                .insertValueInField(depositField, amount)
                .clickOnElement(confirmDepositBtn);
        return this;
    }

    public CustomerAccountActions withdrawMoney(String amount) {
        pageActionsObj.clickOnElement(showWithdrawField).
                        insertValueInField(withdrawField , amount).
                        clickOnElement(confirmWithDrawBtn);
        return this;
    }

    public String getMessage() {
        return pageActionsObj.setText(successMessage).getTextValue();
    }
}
