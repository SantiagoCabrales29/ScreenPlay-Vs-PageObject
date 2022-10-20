package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage{

    private By pages = By.cssSelector("div[data-testid='masthead-mini-nav'] li[data-testid='mini-nav-item'] a");
    private WebDriver driver;
    private By title = By.cssSelector("div[data-testid='masthead-desktop-logo'] a");

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }

    public SectionPage clickSectionPage(String subPageName){
        List<WebElement> listSubPages = driver.findElements(pages);
        for(WebElement page: listSubPages){
            if(page.getText().equals(subPageName)){
                page.click();
                return new SectionPage(driver);
            }
        }
        return new SectionPage(driver);
    }

    public String getTitle(){
        return driver.findElement(title).getAttribute("aria-label");
    }


}
