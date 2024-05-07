package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    public WebElement jsAlertButton;

    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    public WebElement jsConfirmButton;

    @FindBy(xpath = "//button[text()='Click for Js Promt']")
    public WebElement jsPromptButton;


    public AlertsPage clickJSAlertButton() {
        jsAlertButton.click();
        return new AlertsPage(driver);
    }

    public AlertsPage clickJSConfirmButton() {
        jsConfirmButton.click();
        return new AlertsPage(driver);
    }

    public AlertsPage clickJSPromptButton() {
        jsPromptButton.click();
        return new AlertsPage(driver);
    }


    public void open() {
        driver.getCurrentUrl();

    }


    public CheckboxesPage clickCheckboxesLink() {
        clickCheckboxesLink();
        return new CheckboxesPage(driver);
    }

    public DroppablePage clickDropdownLink() {
        clickDropdownLink();
        return new DroppablePage(driver);
    }

    public BrokenPage clickBrokenImagesLink() {
        return new BrokenPage(driver);
    }

    public DragAndDropPage clickDragAndDropLink() {
        return new DragAndDropPage(driver);
    }

    public FileUploadPage clickFileUploadLink() {
        return new FileUploadPage(driver);
    }
}




