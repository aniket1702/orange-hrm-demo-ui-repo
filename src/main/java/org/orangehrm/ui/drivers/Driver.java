package org.orangehrm.ui.drivers;

import org.orangehrm.ui.constants.OrangeHRMDemoConstants;
import org.orangehrm.ui.enums.loggers.LogType;
import org.orangehrm.ui.logger.OrangeHRMDemoLogger;

import java.util.Objects;

public final class Driver {
    private Driver(){}

    /* method declared to initiate driver */
    public static void initDriver()
    {
        if(Objects.isNull(DriverManager.getDriver()))
        {
            DriverManager.setDriver(DriverFactory.getDriver(OrangeHRMDemoConstants.getBrowser()));
            OrangeHRMDemoLogger.log(LogType.PASS,"Driver Initialized...");
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().get(OrangeHRMDemoConstants.getURL());
            OrangeHRMDemoLogger.log(LogType.PASS,"URL Loaded...");
        }
    }

    /* method declared to close browser */
    public static void closeBrowser()
    {
        if(Objects.nonNull(DriverManager.getDriver()))
        {
            DriverManager.getDriver().close();
            OrangeHRMDemoLogger.log(LogType.PASS,"Browser Closed...");
        }
    }

    /* method declared to quit browser */
    public static void quitBrowser()
    {
        if(Objects.nonNull(DriverManager.getDriver()))
        {
            DriverManager.getDriver().quit();
            OrangeHRMDemoLogger.log(LogType.PASS,"Browser Quit...");
        }
    }
}
