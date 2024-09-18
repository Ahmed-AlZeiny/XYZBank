package xyzbank.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageActions {

    WebDriver browser = BrowserFactory.getBrowser();
    WebDriverWait wait = BrowserFactory.getWait();
    Select selectList;
    String textValue;

    public void waitForElement(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public PageActions clickOnElement(By element) {
        waitForElement(element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        return this;

    }

    public PageActions selectFromList(By selectId, String value) {
        selectList = new Select(browser.findElement(selectId));
        selectList.selectByVisibleText(value);
        return this;
    }

    public PageActions setText(By element) {
        waitForElement(element);
        textValue = browser.findElement(element).getText();
        return this;
    }

    public PageActions insertValueInField(By locator, String value) {
        waitForElement(locator);
        browser.findElement(locator).sendKeys(value);
        return this;
    }

    public String getTextValue() {
        return textValue;
    }
}
