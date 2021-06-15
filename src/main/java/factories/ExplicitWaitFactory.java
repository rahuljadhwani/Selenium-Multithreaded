package factories;

import driver.DriverThreadManager;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.FrameworkConstants;

public class ExplicitWaitFactory {

    public static WebElement performExplicitWait(WaitStrategy waitStrategy, By by){
        WebElement element = null;
        if (waitStrategy == WaitStrategy.CLICKABLE){
            element = new WebDriverWait(DriverThreadManager.getThreadSafeDriver(), FrameworkConstants.getEXPLICITWAITTIMEOUT()).until(ExpectedConditions.elementToBeClickable(by));
        }else if (waitStrategy == WaitStrategy.PRESENT){
            element = new WebDriverWait(DriverThreadManager.getThreadSafeDriver(),FrameworkConstants.getEXPLICITWAITTIMEOUT()).until(ExpectedConditions.presenceOfElementLocated(by));
        }else if(waitStrategy == WaitStrategy.NONE){
           element = DriverThreadManager.getThreadSafeDriver().findElement(by);
        }
        return element;
    }
}
