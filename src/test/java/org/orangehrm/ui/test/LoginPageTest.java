package org.orangehrm.ui.test;

import org.orangehrm.ui.drivers.DriverManager;
import org.orangehrm.ui.pages.login.LoginPage;
import org.orangehrm.ui.utils.DateUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    private LoginPage loginPage;
    private DateUtils dateUtils=new DateUtils();
    private LoginPageTest()
    {
        loginPage=new LoginPage();
    }


    @Test
    public void enterUsername() throws InterruptedException {
        loginPage.enterUsername();
        System.out.println(dateUtils.getCurrentDateTime());

        Thread.sleep(2000);

    }

    @Test
    public void enterPassword() throws InterruptedException {
        loginPage.enterPassword();
        Thread.sleep(2000);

    }

    @Test
    public void clickButton() throws InterruptedException {
        loginPage.clickLoginButton();
        Thread.sleep(2000);
        Assert.assertEquals("OrangeHRM", DriverManager.getDriver().getTitle());

    }
}
