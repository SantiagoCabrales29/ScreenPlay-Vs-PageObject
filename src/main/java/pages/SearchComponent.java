package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchComponent {

    private By searchButton = By.cssSelector("button[data-test-id='search-button']");
    private By searchBar = By.cssSelector("input[data-testid='search-input']");
    private By goButton = By.cssSelector("button[data-test-id='search-submit']");
    private By clearButton = By.cssSelector(" input[type='reset']");
    private WebDriver driver;

    public SearchComponent(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }

    public void sendKeysToSearchBar(String searchTerm){
        driver.findElement(searchBar).sendKeys(searchTerm);
    }

    public SearchResultPage clickGoButton(){
        driver.findElement(goButton).click();
        return new SearchResultPage(driver);
    }

    public String getSearchBarText(){
        return driver.findElement(searchBar).getAttribute("value");
    }

    public void clearSearchBar(){
        driver.findElement(clearButton).click();
    }

    public boolean isSearchBarVisible(){
        try {
            driver.findElement(searchBar);
            return true;
        }catch (Exception e){
           return false;
        }
        /*
        I tried with return driver.findElement(searchBar).isDisplayed(); but I got a problem. The method wasn't able to
        tell that the element wasn't visible because it wasn't present in the DOM after clicking the search button again.
        So I switched this to a try catch. In the case that an exception was returned then it means the element wasn't
        visible so I returned false.
         */
    }

    public SearchResultPage searchTerm(String searchTerm){
        clickSearchButton();
        sendKeysToSearchBar(searchTerm);
        return clickGoButton();
    }
}
