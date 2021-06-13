package pages;

import driver.DriverThreadManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public final class OrangeHRMLoginPage {

    private final By usernameLocator = By.xpath("//input[@id='txtUsername']");
    private final By passwordLocator = By.xpath("//input[@id='txtPassword']");
    private final By loginButtonLocator = By.xpath("//input[@id='btnLogin']");

   /* WebDriver driver;

    public OrangeHRMLoginPage(){
        driver=DriverThreadManager.getThreadSafeDriver();
    }*/

    public OrangeHRMLoginPage enterUsername(String username){
        DriverThreadManager.getThreadSafeDriver().findElement(usernameLocator).sendKeys(username);
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password){
        DriverThreadManager.getThreadSafeDriver().findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public OrangeHRMHomePage clickOnLoginButton(){
        DriverThreadManager.getThreadSafeDriver().findElement(loginButtonLocator).click();
        return new OrangeHRMHomePage();
    }

    public String getLoginPageTitle(){
        return DriverThreadManager.getThreadSafeDriver().getTitle();
    }
}
