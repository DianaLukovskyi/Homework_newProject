package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrokenPage;
import pages.HomePage;

public class BrokenTest extends BaseTest{

    @Test
    public void testBrokenImages() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        BrokenPage brokenImagesPage = homePage.clickBrokenImagesLink();


        Assert.assertTrue(brokenImagesPage.isPageOpened(), "Broken Images page is not opened.");


        Assert.assertTrue(brokenImagesPage.hasBrokenImages(), "No broken images found.");
    }
}

