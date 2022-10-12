package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    private WebDriver driver;
    private HeaderComponent headerComponent;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.headerComponent = new HeaderComponent(driver);
    }

    public HeaderComponent getHeader() {
        return headerComponent;
    }
}
