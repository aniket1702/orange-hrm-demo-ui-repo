package org.orangehrm.ui.maps.pages;

import org.openqa.selenium.By;

public final class LoginPageMaps {
    private LoginPageMaps() {
    }

    public static By enterUsername() {
        return By.cssSelector("input[name='username']");
    }

    public static By enterPassword() {
        return By.cssSelector("input[name='password']");
    }

    public static By clickButton() {
        return By.cssSelector("button[type='submit']");
    }
}
