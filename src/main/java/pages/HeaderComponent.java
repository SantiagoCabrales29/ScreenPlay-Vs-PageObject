package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderComponent {

    private WebDriver driver;
    private SearchComponent searchComponent;

    public HeaderComponent(WebDriver driver) {
       this.driver = driver;
       this.searchComponent = new SearchComponent(driver);
    }

    private By title = By.cssSelector("a[aria-label*='New York Times Logo']");


    public void clickLogoButton(){
        driver.findElement(title).click();
    }


    public SearchComponent getSearchComponent() {
        return searchComponent;
    }
}
