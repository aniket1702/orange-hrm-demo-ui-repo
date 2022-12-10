package org.orangehrm.ui.test;

import org.orangehrm.ui.drivers.Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BaseTest {

    @Test
    public void testMethod()
    {
        Driver.initDriver();
        System.out.println("Test is Passed");
    }

    @AfterTest
    public void closeBrowser()
    {
        Driver.closeBrowser();
    }
}
