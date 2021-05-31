package tests;

import driver.DriverThreadManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


public final class LoginTest extends TestBase{
    private LoginTest(){

    }

    @Test
    public void testOne(){
        DriverThreadManager.getThreadSafeDriver().findElement(By.name("q")).sendKeys("mumbai", Keys.ENTER);
    }

    @Test
    public void testTwo(){
        DriverThreadManager.getThreadSafeDriver().findElement(By.name("q")).sendKeys("pune", Keys.ENTER);
    }
}

