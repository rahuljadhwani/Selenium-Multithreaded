package tests;

import driver.DriverThreadManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class HomePageTest extends TestBase{

    private HomePageTest(){

    }

    @Test
    public void testThree() { DriverThreadManager.getThreadSafeDriver().findElement(By.name("q")).sendKeys("kolkata", Keys.ENTER);
    }
}
