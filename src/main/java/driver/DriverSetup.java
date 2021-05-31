package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.PropertyReader;

import java.util.Objects;

public class DriverSetup {

    public static void initDriver(){
        if (Objects.isNull(DriverThreadManager.getThreadSafeDriver())) {
            WebDriverManager.chromedriver().setup();
            DriverThreadManager.setThreadSafeDriver(new ChromeDriver());
            DriverThreadManager.getThreadSafeDriver().manage().window().maximize();
            DriverThreadManager.getThreadSafeDriver().get(PropertyReader.readProperty("url"));
        }
    }

    public static void quitDriver(){
        if (Objects.nonNull(DriverThreadManager.getThreadSafeDriver())) {
            DriverThreadManager.getThreadSafeDriver().quit();
            DriverThreadManager.unload();
        }
    }
}

