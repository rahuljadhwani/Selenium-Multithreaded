package pages;

import driver.DriverThreadManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public final class OrangeHRMHomePage {

    private final By welcomeUserlinkLocator = By.xpath("//a[@id='welcome']");
    private final By logoutUserlinkLocator = By.xpath("//a[text()='Logout']");

    public OrangeHRMHomePage clickOnWelcomeLink(){
        DriverThreadManager.getThreadSafeDriver().findElement(welcomeUserlinkLocator).click();
        return this;
    }

    public OrangeHRMLoginPage clickOnLogout(){
        new WebDriverWait(DriverThreadManager.getThreadSafeDriver(), 10).until(ExpectedConditions.elementToBeClickable(logoutUserlinkLocator));
        DriverThreadManager.getThreadSafeDriver().findElement(logoutUserlinkLocator).click();
        return new OrangeHRMLoginPage();
    }

}
