package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class framesPage {
    private WebDriver driver;
    private By nestedFrames = By.linkText("Nested Frames");
    private By frameMiddle = By.xpath("//frame[@src='/frame_middle']");
    private By middleFrameContent = By.id("content");

    public framesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickNestedFrames() {
        driver.findElement(nestedFrames).click();
    }

    public String getTextfromLeftFrame() throws InterruptedException {
        Thread.sleep(2000);
        switchToMiddleFrame();
        String content = driver.findElement(middleFrameContent).getText();
        switchToMainArea();
        return content;
    }

    public void switchToMiddleFrame() {
        driver.switchTo().frame(driver.findElement(frameMiddle));
    }

    public void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

}
