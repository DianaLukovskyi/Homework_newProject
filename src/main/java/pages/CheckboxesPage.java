package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CheckboxesPage extends BasePage {

    @FindBy(xpath = "//input[@type='checkbox'][1]")
    private WebElement checkbox1;

    @FindBy(xpath = "//input[@type='checkbox'][2]")
    private WebElement checkbox2;

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCheckbox1Available() {
        return checkbox1.isDisplayed();
    }


    public boolean isCheckbox2Available() {
        return checkbox2.isDisplayed();
    }


    public boolean isCheckbox1Selected() {
        return checkbox1.isSelected();
    }

    public boolean isCheckbox2Selected() {
        return checkbox2.isSelected();
    }


    public void selectCheckbox1() {
        if (!isCheckbox1Selected()) {
            checkbox1.click();
        }
    }


    public void selectCheckbox2() {
        if (!isCheckbox2Selected()) {
            checkbox2.click();
        }
    }


    public void deselectCheckbox1() {
        if (isCheckbox1Selected()) {
            checkbox1.click();
        }
    }


    public void deselectCheckbox2() {
        if (isCheckbox2Selected()) {
            checkbox2.click();
        }
    }


}