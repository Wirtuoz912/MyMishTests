package src.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Inka on 16-Dec-18.
 */
public class TestBase {
    WebDriver driver = new ChromeDriver();
    @BeforeMethod
    public void initWebDriver(){
        driver.get("https://mish.sheygam.com/#/wellcome");
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

}
