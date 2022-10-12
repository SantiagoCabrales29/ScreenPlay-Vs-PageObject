import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstTest {

    WebDriver driver = new ChromeDriver();

    @Test
    public void firstTest(){
        //System.setProperty("webdriver.chrome.driver","/Users/sancabra/Documents/Automation/Automation_Projects/Selenium_Java/ScreenPlay-Vs-PageObject/chromedriver");

        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector("input[title='Buscar']")).sendKeys("Hello");
        //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("input[title='Buscar']")).sendKeys("Hello");
        driver.quit();
    }


}
