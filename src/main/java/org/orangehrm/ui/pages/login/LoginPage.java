package org.orangehrm.ui.pages.login;

import org.orangehrm.ui.enums.loggers.LogType;
import org.orangehrm.ui.logger.OrangeHRMDemoLogger;
import org.orangehrm.ui.maps.pages.LoginPageMaps;
import org.orangehrm.ui.pages.dashboard.Dashboard;

public class LoginPage extends BasePage{

    /* method to enter username */
    private LoginPage enterUsername(String username)
    {
        sendKeys(LoginPageMaps.enterUsername(),username);
        OrangeHRMDemoLogger.log(LogType.PASS,"Username is entered...");
        return this;

    }

    /* method to enter password */
    private LoginPage enterPassword(String password)
    {
        sendKeys(LoginPageMaps.enterPassword(),password);
        OrangeHRMDemoLogger.log(LogType.PASS,"Password is entered...");
        return this;
    }

    /* method to click button */
    private Dashboard clickLoginButton()
    {
        clickButton(LoginPageMaps.clickButton());
        OrangeHRMDemoLogger.log(LogType.PASS,"Button is clicked...");
        return new Dashboard();
    }

    public Dashboard loginToApplication(String username,String password)
    {
        return new LoginPage().enterUsername(username).enterPassword(password).clickLoginButton();
    }
}
