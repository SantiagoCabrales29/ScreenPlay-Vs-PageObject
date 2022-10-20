package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SectionPage extends BasePage{

    private By title = By.tagName("h1");
    private WebDriver driver;
    private By subSections = By.cssSelector("header ol a[href]");

    public SectionPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getTitle() {
        return driver.findElement(title).getText();
    }

    public SectionPage clickSubSection(String subSectionName){
        List<WebElement> listSubSections = driver.findElements(subSections);

        for(WebElement page: listSubSections){
            if(page.getText().toLowerCase().equalsIgnoreCase(subSectionName)){
                page.click();
                return new SectionPage(driver);
            }
        }
        return this;
    }
}
