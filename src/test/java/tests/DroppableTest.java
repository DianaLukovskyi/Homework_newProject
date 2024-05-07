
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DroppablePage;
import pages.HomePage;


public class DroppableTest extends BaseTest {

    @Test
    public void testDropdownAvailability() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        DroppablePage dropdownPage = homePage.clickDropdownLink();


        Assert.assertTrue(dropdownPage.isDropdownAvailable(), "Is not available.");
    }

    @Test
    public void testDropdownOptions() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        DroppablePage dropdownPage = homePage.clickDropdownLink();


        Assert.assertEquals(dropdownPage.getOptionsCount(), 2, "Incorrect.");


    }

    @Test
    public void testDropdownSelection() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        DroppablePage dropdownPage = homePage.clickDropdownLink();
        dropdownPage.selectOption();
        Assert.assertEquals(dropdownPage.getSelectedOption(), "Option 1", "Incorrect selected option.");

    }
}
