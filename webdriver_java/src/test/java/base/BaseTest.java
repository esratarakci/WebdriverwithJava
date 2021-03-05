package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

import java.util.List;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait()
        goHome();

        homePage = new HomePage(driver);

//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println("link size:" + links.size());
//
//        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
//        shiftingContent.click();
//
//        WebElement menuElement = driver.findElement(By.linkText("Example 1: Menu Element"));
//        menuElement.click();
//
//        List<WebElement> linksFromMenuElement = driver.findElements(By.tagName("a"));
//        System.out.println("menu element link size:" + linksFromMenuElement.size());
////        WebElement inputLink = driver.findElement(By.linkText("Inputs"));
////        inputLink.click();
////        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}


