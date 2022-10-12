package searchFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultPage;

import java.util.List;

public class SearchBarTest {

    private WebDriver driver = new ChromeDriver();
    private HomePage homePage;
    private SearchResultPage searchResultPage;

    @Test
    public void searchTest(){
        String searchTerm = "Trump";
        driver.get("https://www.nytimes.com/");
        homePage = new HomePage(driver);
        searchResultPage = homePage.getHeader().searchTerm(searchTerm);
        List<String> results = searchResultPage.getResultTitles();
        for (String result: results) {
            Assert.assertTrue(result.contains(searchTerm));
        }


        //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("input[title='Buscar']")).sendKeys("Hello");
        //driver.quit();
    }
}
