package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage extends BasePage {

    private By sourceLocator = By.id("source");
    private By targetLocator = By.id("target");

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return driver.getCurrentUrl().endsWith("/drag_and_drop");
    }

    public void performDragAndDrop() {
        WebElement sourceElement = driver.findElement(sourceLocator);
        WebElement targetElement = driver.findElement(targetLocator);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
    }

}
