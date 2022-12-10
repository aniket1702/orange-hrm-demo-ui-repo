package org.orangehrm.ui.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverFactory {
    private DriverFactory(){}

    /* method declared to get driver from DriverManager class */
    public static WebDriver getDriver(String browser)
    {
        WebDriver driver = null;
        if(browser.equalsIgnoreCase("chrome"))
        {
            driver=new ChromeDriver();
            return driver;
        }
        return driver;
    }
}
