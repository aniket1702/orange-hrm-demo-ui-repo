package org.orangehrm.ui.test;

import org.orangehrm.ui.pages.login.LoginPage;
import org.orangehrm.ui.utils.DateUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    private LoginPage loginPage;
    private DateUtils dateUtils;

    private LoginPageTest() {
        loginPage = new LoginPage();
        dateUtils = new DateUtils();
    }


    @Test(testName = "Login Page Test", description = "Verify Login Page with valid details.")
    public void verifyLoginPageWithValidUsernameAndPassword() throws InterruptedException {
        loginPage.loginToApplication("Admin", "admin123");
        System.out.println(dateUtils.getCurrentDateTime());

        Thread.sleep(2000);

    }

    @Test(testName = "Login Page Test", description = "Verify Login Page with Invalid details.")
    public void verifyLoginPageWithInvalidUsernameAndPassword() throws InterruptedException {
        loginPage.loginToApplication("Admin1", "admin1232");
        System.out.println(dateUtils.getCurrentDateTime());
        Assert.assertFalse(false,"Login test Failed");

        Thread.sleep(2000);

    }

  /*  @Test
    public void enterPassword() throws InterruptedException {
        loginPage.enterPassword();
        Thread.sleep(2000);

    }

    @Test
    public void clickButton() throws InterruptedException {
        loginPage.clickLoginButton();
        Thread.sleep(2000);
        Assert.assertEquals("OrangeHRM", DriverManager.getDriver().getTitle());

    }*/
}
