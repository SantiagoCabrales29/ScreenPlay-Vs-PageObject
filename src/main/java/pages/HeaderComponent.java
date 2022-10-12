package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderComponent {

    private WebDriver driver;

    public HeaderComponent(WebDriver driver) {
       this.driver = driver;
    }

    private By title = By.cssSelector("a[aria-label*='New York Times Logo']");
    private By searchButton = By.cssSelector("button[data-test-id='search-button']");
    private By searchBar = By.cssSelector("input[data-testid='search-input']");
    private By goButton = By.cssSelector("button[data-test-id='search-submit']");


    public void clickLogoButton(){
        driver.findElement(title).click();
    }

    public SearchResultPage searchTerm(String searchTerm){
        driver.findElement(searchButton).click();
        driver.findElement(searchBar).sendKeys(searchTerm);
        driver.findElement(goButton).click();
        return new SearchResultPage(driver);
    }

}
