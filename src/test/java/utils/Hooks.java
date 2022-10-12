package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Hooks {

    protected WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public void testSetUp(){
        driver.get("https://www.nytimes.com/");
    }

    @AfterSuite
    public void testTearDown(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
