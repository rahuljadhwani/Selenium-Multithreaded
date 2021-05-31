package driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public static void setDriverThread(WebDriver driver){
        threadLocal.set(driver);
    }

    public static WebDriver getDriverThread(){
        return threadLocal.get();
    }

    public static void unload(){
        threadLocal.remove();
    }
}
