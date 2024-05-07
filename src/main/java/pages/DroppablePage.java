package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DroppablePage extends BasePage {

    @FindBy(id = "dropdown")
   public WebElement dropdownElement;

    @FindBy(tagName = "option")
public List<WebElement> optionList;
    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    public boolean isDropdownAvailable() {
        return dropdownElement.isDisplayed();
    }

    public void selectOption() {

    }

    public String getSelectedOption() {

        return null;
    }

    public int getOptionsCount() {
        return optionList.size();
    }
}