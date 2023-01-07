package org.orangehrm.ui.pages.login;

import org.openqa.selenium.By;
import org.orangehrm.ui.drivers.DriverManager;

public class BasePage {
    protected BasePage(){}

    /* method to click button */
    public void clickButton(By by)
    {
        DriverManager.getDriver().findElement(by).click();
    }

    /* method to enter text i TextBox */
    public void sendKeys(By by, String value)
    {
        DriverManager.getDriver().findElement(by).sendKeys(value);
    }


}
