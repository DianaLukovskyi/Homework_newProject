package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import pages.HomePage;
public class FileUploadTest extends BaseTest{
    @Test
    public void testFileUpload() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        FileUploadPage fileUploadPage = homePage.clickFileUploadLink();
        Assert.assertTrue(fileUploadPage.isPageOpened(),
                "File Upload page is not opened.");

    }
}

