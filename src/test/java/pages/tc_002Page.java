import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {

    private WebDriver driver;
    private By uploadButton = By.id("uploadFile");
    private By uploadInput = By.id("fileInput");
    private By filePreview = By.id("filePreview");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadValidFile(String filePath) {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys(filePath);
    }

    public boolean isFileUploaded() {
        WebElement uploadElement = driver.findElement(uploadButton);
        return !uploadElement.isDisplayed();
    }

    public boolean isFilePreviewDisplayed() {
        WebElement preview = driver.findElement(filePreview);
        return preview.isDisplayed() && preview.getText().contains("PDF/DOCX");
    }
}