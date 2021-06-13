package pages;

import driver.DriverThreadManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public final class OrangeHRMLoginPage extends CommonPageActions{

    private final By usernameLocator = By.xpath("//input[@id='txtUsername']");
    private final By passwordLocator = By.xpath("//input[@id='txtPassword']");
    private final By loginButtonLocator = By.xpath("//input[@id='btnLogin']");

    public OrangeHRMLoginPage enterUsername(String username){
        sendKeysOnElement(usernameLocator, username);
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password){
        sendKeysOnElement(passwordLocator, password);
        return this;
    }

    public OrangeHRMHomePage clickOnLoginButton(){
        clickOnElement(loginButtonLocator);
        return new OrangeHRMHomePage();
    }

    public String getLoginPageTitle(){
        return getPageTitle();
    }
}
