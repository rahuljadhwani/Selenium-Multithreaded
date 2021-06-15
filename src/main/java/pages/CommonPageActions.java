package pages;

import driver.DriverThreadManager;
import enums.WaitStrategy;
import factories.ExplicitWaitFactory;
import org.openqa.selenium.By;

public class CommonPageActions {

    protected void clickOnElement(By by, WaitStrategy waitStrategy){
        ExplicitWaitFactory.performExplicitWait(waitStrategy,by).click();
    }

    protected void sendKeysOnElement(By by, WaitStrategy waitStrategy, String keysToSend){
        ExplicitWaitFactory.performExplicitWait(waitStrategy,by).sendKeys(keysToSend);
    }

    protected String getPageTitle(){
        return DriverThreadManager.getThreadSafeDriver().getTitle();
    }
}
