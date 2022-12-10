package org.orangehrm.ui.drivers;

import org.orangehrm.ui.configs.ConfigFactory;
import org.orangehrm.ui.constants.OrangeHRMDemoConstants;

import java.util.Objects;

public final class Driver {
    private Driver(){}

    /* method declared to initiate driver */
    public static void initDriver()
    {
        if(Objects.isNull(DriverManager.getDriver()))
        {
            DriverManager.setDriver(DriverFactory.getDriver(OrangeHRMDemoConstants.getBrowser()));
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().get(OrangeHRMDemoConstants.getURL());
        }
    }

    /* method declared to close browser */
    public static void closeBrowser()
    {
        if(Objects.nonNull(DriverManager.getDriver()))
        {
            DriverManager.getDriver().close();
//            DriverManager.unload();
//            DriverManager.getDriver().manage().deleteAllCookies();
        }

    }

    /* method declared to quit browser */
    public static void quitBrowser()
    {
        if(Objects.nonNull(DriverManager.getDriver()))
        {
            DriverManager.unload();
            DriverManager.getDriver().manage().deleteAllCookies();
            DriverManager.getDriver().quit();
        }
    }
}
