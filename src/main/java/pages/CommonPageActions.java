package pages;

import driver.DriverThreadManager;
import org.openqa.selenium.By;

public class CommonPageActions {

    protected void clickOnElement(By by){
        DriverThreadManager.getThreadSafeDriver().findElement(by).click();
    }

    protected void sendKeysOnElement(By by, String keysToSend){
        DriverThreadManager.getThreadSafeDriver().findElement(by).sendKeys(keysToSend);
    }

    protected String getPageTitle(){
        return DriverThreadManager.getThreadSafeDriver().getTitle();
    }
}
