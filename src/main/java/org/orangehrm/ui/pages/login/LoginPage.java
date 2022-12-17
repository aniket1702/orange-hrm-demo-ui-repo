package org.orangehrm.ui.pages.login;

import org.orangehrm.ui.drivers.DriverManager;
import org.orangehrm.ui.enums.loggers.LogType;
import org.orangehrm.ui.logger.OrangeHRMDemoLogger;
import org.orangehrm.ui.maps.pages.LoginPageMaps;

public class LoginPage {

    /* method to enter username */
    public LoginPage enterUsername()
    {
        DriverManager.getDriver().findElement(LoginPageMaps.enterUsername()).sendKeys("Admin");
        OrangeHRMDemoLogger.log(LogType.PASS,"Username is entered...");
        return this;

    }

    /* method to enter password */
    public LoginPage enterPassword()
    {
        DriverManager.getDriver().findElement(LoginPageMaps.enterPassword()).sendKeys("admin123");
        OrangeHRMDemoLogger.log(LogType.PASS,"Password is entered...");
        return this;
    }

    /* method to click button */
    public LoginPage clickLoginButton()
    {
        DriverManager.getDriver().findElement(LoginPageMaps.clickButton()).click();
        OrangeHRMDemoLogger.log(LogType.PASS,"Button is clicked...");
        return this;
    }
}
