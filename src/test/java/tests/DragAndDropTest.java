package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragAndDropPage;
import pages.HomePage;

public class DragAndDropTest extends BaseTest {

    @Test
    public void testDragAndDrop() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        DragAndDropPage dragAndDropPage = homePage.clickDragAndDropLink();


        Assert.assertTrue(dragAndDropPage.isPageOpened(), "Drag and Drop page is not opened.");


    }
}