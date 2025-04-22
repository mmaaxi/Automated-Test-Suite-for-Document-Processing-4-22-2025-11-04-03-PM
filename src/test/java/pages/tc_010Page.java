package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {

    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By processButton = By.id("processButton");
    By slipGeneratedNotification = By.id("slipNotification");
    By originalDocumentsHistory = By.id("originalDocsHistory");
    By extractedDataHistory = By.id("extractedDataHistory");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDocumentUploadPage() {
        driver.get("http://example.com/uploadPage");
    }

    public void uploadAndProcessDocuments() {
        driver.findElement(uploadButton).click();
        driver.findElement(processButton).click();
    }

    public boolean isSlipGenerated() {
        return driver.findElement(slipGeneratedNotification).isDisplayed();
    }

    public boolean areOriginalDocumentsStored() {
        return driver.findElement(originalDocumentsHistory).isDisplayed();
    }

    public boolean isExtractedDataStored() {
        return driver.findElement(extractedDataHistory).isDisplayed();
    }
}