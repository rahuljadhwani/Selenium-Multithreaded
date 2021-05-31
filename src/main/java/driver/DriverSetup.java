package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class DriverSetup {

    public static void initDriver(){
        if (Objects.isNull(DriverManager.getDriverThread())) {
            WebDriverManager.chromedriver().setup();
            DriverManager.setDriverThread(new ChromeDriver());
            DriverManager.getDriverThread().manage().window().maximize();
            DriverManager.getDriverThread().get("https://www.google.com");
        }
    }

    public static void quitDriver(){
        if (Objects.nonNull(DriverManager.getDriverThread())) {
            DriverManager.getDriverThread().quit();
            DriverManager.unload();
        }
    }
}
