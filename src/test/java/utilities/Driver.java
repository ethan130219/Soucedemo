package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private Driver(){

    }
    private static utilities.Driver instance=new utilities.Driver();

    public static utilities.Driver getInstance(){
        return instance;
    }

    ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();// thread local driver object for webdriver

    public WebDriver getDriver(){
        return driver.get();
    }

    public  void setDriver(WebDriver driverParameter){


        driver.set(driverParameter);
    }
    public void removeDriver(){
        driver.get().quit();
        driver.remove();
    }
}
