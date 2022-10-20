package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    public By logo = By.tagName("image");
    public By emailInputField = By.id("email");
    public By continueButton = By.cssSelector("button[data-testid='submit-email']");
    public WebElement termsOfServiceButton = driver.findElements(By.cssSelector("div[class*='legal-disclaimer'] a")).get(0);
    public WebElement privacyPolicyButton = driver.findElements(By.cssSelector("div[class*='legal-disclaimer'] a")).get(1);

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage clickLogo(){
        driver.findElement(logo).click();
        return new HomePage(driver);
    }

    public void fillEmailInputField(String email){
        driver.findElement(emailInputField).sendKeys(email);
    }
}
