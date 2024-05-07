package pages;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class BrokenPage extends BasePage {
    public BrokenPage(WebDriver driver) {
        super(driver);
    }


    public boolean isPageOpened() {
        return driver.getCurrentUrl().endsWith("/broken_images");
    }

    public boolean hasBrokenImages() {
        List<WebElement> images = driver.findElements(By.tagName("img"));
        boolean hasBrokenImages = false;

        for (WebElement image : images) {
            if (image.getAttribute("naturalWidth").equals("0")) {
                hasBrokenImages = true;
                break;
            }
        }

        return hasBrokenImages;
    }

}