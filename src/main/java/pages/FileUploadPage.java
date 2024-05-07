package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


    public class FileUploadPage extends BasePage {

        private By chooseFileButton = By.id("file-upload");
        private By uploadButton = By.id("file-submit");
        private By uploadedFile = By.id("uploaded-files");

        public FileUploadPage(WebDriver driver) {
            super(driver);
        }


        public boolean isPageOpened() {
            return driver.getCurrentUrl().endsWith("/upload");
        }


        public void uploadFile(String filePath) {
            WebElement chooseFileElement = driver.findElement(chooseFileButton);
            chooseFileElement.sendKeys(filePath);

            WebElement uploadButtonElement = driver.findElement(uploadButton);
            uploadButtonElement.click();
        }


        public String getUploadedFileName() {
            WebElement uploadedFileElement = driver.findElement(uploadedFile);
            return uploadedFileElement.getText();
        }


    }

