package tests;

import driver.DriverManager;
import driver.DriverSetup;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public final class LoginTest extends TestBase{
    private LoginTest(){

    }

    @Test
    public void testOne(){
        DriverManager.getDriverThread().findElement(By.name("q")).sendKeys("mumbai", Keys.ENTER);
    }

    @Test
    public void testTwo(){
        DriverManager.getDriverThread().findElement(By.name("q")).sendKeys("pune", Keys.ENTER);
    }
}

