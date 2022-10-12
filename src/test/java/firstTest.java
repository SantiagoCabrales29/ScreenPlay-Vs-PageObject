import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstTest {

    WebDriver driver = new ChromeDriver();

    private By title = By.cssSelector("a[aria-label*='New York Times Logo']");
    private By searchButton = By.cssSelector("button[data-test-id='search-button']");
    private By searchBar = By.cssSelector("input[data-testid='search-input']");


    @Test
    public void firstTest(){
        driver.get("https://www.nytimes.com/");
        driver.findElement(searchButton).click();
        driver.findElement(searchBar).sendKeys("searchTerm");

        //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("input[title='Buscar']")).sendKeys("Hello");
        driver.quit();
    }


}
