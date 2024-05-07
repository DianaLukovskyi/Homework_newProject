package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class AlertsTest extends BaseTest {

    @Test
    public void testJSAlertButton() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.clickJSAlertButton();

    }

    @Test
    public void testJSConfirmButton() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.clickJSConfirmButton();

    }

    @Test
    public void testJSPromptButton() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.clickJSPromptButton();

    }
}