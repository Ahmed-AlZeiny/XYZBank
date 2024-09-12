package xyzbank.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserFactory {

    private static WebDriver browser;
    private static WebDriverWait wait;

  private BrowserFactory(){}

    public static WebDriver getBrowser(){
        if (browser == null) {
            browser = new ChromeDriver();
            browser.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
            browser.manage().window().maximize();
            browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            browser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        }
        return browser;
    }
    public static void browserQuit(){
        browser.quit();
    }

    public static void browserClose(){
        browser.close();
    }
    public static WebDriverWait getWait(){
        if(wait==null) {
            wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        }
        return wait;
    }

}
