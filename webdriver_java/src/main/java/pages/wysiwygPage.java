package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class wysiwygPage {
    private WebDriver driver;
    String editorFrameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.xpath("//*[@title='Increase indent']");

    public wysiwygPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearText() {
        switchToFrame();
        driver.findElement(textArea).clear();
        switchToMainFrame();
    }

    public void setTextArea(String text) {
        switchToFrame();
        driver.findElement(textArea).sendKeys(text);
        switchToMainFrame();
    }

    public void clickIndentButton() {
        driver.findElement(increaseIndentButton).click();
    }

    public String getEditorText() {
        switchToFrame();
        String editorText = driver.findElement(textArea).getText();
        switchToMainFrame();
        return editorText;

    }

    public void switchToFrame() {
        driver.switchTo().frame(editorFrameId);
    }

    public void switchToMainFrame() {
        driver.switchTo().parentFrame();
    }
}
