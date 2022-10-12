package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends BasePage{

    private WebDriver driver;
    private By searchResults = By.cssSelector("li[data-testid*='search-bodega-result']");
    private By searchResultsTitles = By.cssSelector("li[data-testid*='search-bodega-result'] h4");

    public SearchResultPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public List<WebElement> getResultsList(){
        return driver.findElements(searchResults);
    }

    public List<String> getResultTitles(){
        List<String> resultTitles =  new ArrayList<>();
        for (WebElement result:driver.findElements(searchResultsTitles)) {
            resultTitles.add(result.getText());
        }
        return resultTitles;

    }
}
