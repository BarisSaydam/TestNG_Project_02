package US_204;

import Utility.BaseDriverParameter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_204 extends BaseDriverParameter {

    @Test(groups = "Regression")
    public void Test1(){
        TC_204_Elements elements=new TC_204_Elements(driver);
        driver.get("https://techno.study/");

        elements.blogs.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,500)");

        wait.until(ExpectedConditions.visibilityOf(elements.blogyazisi));

        elements.blogyazisi.click();

        Assert.assertTrue(elements.dogrulama.getText().contains("Explore how manual testing ensures comprehensive test coverage, identifies complex bugs, and enhances software quality and reliability."));

    }
}
