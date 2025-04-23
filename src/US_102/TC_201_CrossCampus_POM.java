package US_102;

import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_201_CrossCampus_POM extends BaseDriverParameter {

    @Test(groups = {"Smoke"})
    public void CrossCampus() {
        TC_201_CrossCampusTest_Elements element = new TC_201_CrossCampusTest_Elements(driver);

        driver.get("https://techno.study/");
        wait.until(ExpectedConditions.elementToBeClickable(element.signinbutton));

        element.signinbutton.click();
        wait.until(ExpectedConditions.textToBePresentInElement(element.login, "GİRİŞ YAP"));

        Assert.assertTrue(element.login.getText().contains("GİRİŞ YAP"), "The login page could not be displayed.");
    }
}
