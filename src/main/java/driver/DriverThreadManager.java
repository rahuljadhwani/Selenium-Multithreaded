package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverThreadManager {
    static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public static void setThreadSafeDriver(WebDriver driver){
        threadLocal.set(driver);
    }

    public static WebDriver getThreadSafeDriver(){
        return threadLocal.get();
    }

    public static void unload(){
        threadLocal.remove();
    }
}
