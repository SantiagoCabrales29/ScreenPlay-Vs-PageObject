package searchFeature;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultPage;
import utils.Hooks;

import java.util.List;

public class SearchBarTest extends Hooks {

    private HomePage homePage;
    private SearchResultPage searchResultPage;
    private WebDriver driver = getDriver();

    @Test
    public void searchTest(){
        String searchTerm = "Trump";
        boolean areSearchResultsCorrect = false;

        homePage = new HomePage(driver);
        searchResultPage = homePage.getHeader().searchTerm(searchTerm);
        List<String> results = searchResultPage.getResultTitles();
        for (String result: results) {
            if(result.contains(searchTerm)){
                areSearchResultsCorrect = true;
                break;
            }
        }
        Assert.assertTrue(searchResultPage.getResultsList().size()>0);
        Assert.assertTrue(areSearchResultsCorrect);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchTerm));
    }
}
