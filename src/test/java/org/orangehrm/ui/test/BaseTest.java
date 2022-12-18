package org.orangehrm.ui.test;

import org.orangehrm.ui.drivers.Driver;
import org.orangehrm.ui.enums.loggers.LogType;
import org.orangehrm.ui.logger.OrangeHRMDemoLogger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {


    /* method to initialize the driver */
    @BeforeTest
    public void setup() throws InterruptedException {
        Driver.initDriver();
        Thread.sleep(3000);
    }


    /* method to close the browser */
    @AfterTest
    public void tearDown() {
        Driver.closeBrowser();
    }
}
