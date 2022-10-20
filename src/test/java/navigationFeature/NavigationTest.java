package navigationFeature;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SectionPage;
import utils.Hooks;

public class NavigationTest  extends Hooks {

    private HomePage homePage;

    @Test
    public void navigateToSectionPage(){
        String subPageName = "World";

        homePage = new HomePage(driver);

        SectionPage sectionPage = homePage.clickSectionPage(subPageName);
        Assert.assertTrue(sectionPage.getTitle().contains(subPageName));
        Assert.assertTrue(driver.getCurrentUrl().contains(subPageName.toLowerCase()));
    }

    @Test
    public void navigateBackToHomePage(){
        String subPageName = "Sports";

        homePage = new HomePage(driver);

        SectionPage sectionPage = homePage.clickSectionPage(subPageName);
        Assert.assertTrue(sectionPage.getTitle().contains(subPageName));
        Assert.assertTrue(driver.getCurrentUrl().contains(subPageName.toLowerCase()));

        HomePage homePage = sectionPage.getHeader().clickLogoButton();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.nytimes.com/");
        Assert.assertTrue(homePage.getTitle().equalsIgnoreCase("The New York Times"));
    }

    @Test
    public void navigateToSubSectionPage(){
        String subPageName = "Arts";
        String subSectionName = "Movies";

        homePage = new HomePage(driver);

        SectionPage sectionPage = homePage.clickSectionPage(subPageName);
        sectionPage.clickSubSection(subSectionName);

        Assert.assertTrue(sectionPage.getTitle().contains(subSectionName));
        Assert.assertTrue(driver.getCurrentUrl().contains(subSectionName.toLowerCase()));
    }
}
