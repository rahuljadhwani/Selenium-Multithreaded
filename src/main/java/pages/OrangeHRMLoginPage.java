package pages;

import driver.DriverThreadManager;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public final class OrangeHRMLoginPage extends CommonPageActions{

    private final By usernameLocator = By.xpath("//input[@id='txtUsername']");
    private final By passwordLocator = By.xpath("//input[@id='txtPassword']");
    private final By loginButtonLocator = By.xpath("//input[@id='btnLogin']");

    public OrangeHRMLoginPage enterUsername(String username){
        sendKeysOnElement(usernameLocator, WaitStrategy.PRESENT, username);
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password){
        sendKeysOnElement(passwordLocator, WaitStrategy.PRESENT, password);
        return this;
    }

    public OrangeHRMHomePage clickOnLoginButton(){
        clickOnElement(loginButtonLocator, WaitStrategy.CLICKABLE);
        return new OrangeHRMHomePage();
    }

    public String getLoginPageTitle(){
        return getPageTitle();
    }
}
