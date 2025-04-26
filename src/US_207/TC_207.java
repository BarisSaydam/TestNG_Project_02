package US_207;
import Utility.BaseDriverParameter;
import Utility.MyFunc;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class TC_207 extends BaseDriverParameter {

    @Test(groups = "Smoke")
    public void Test() {
        TC_207_Elements elements = new TC_207_Elements(driver);
        Actions actions = new Actions(driver);
        driver.get("https://techno.study/");

        for (int i = 0; i < elements.learnMore.size(); i++) {
            elements = new TC_207_Elements(driver);
            List<WebElement> learnMoreButtons = elements.learnMore;

            WebElement button = learnMoreButtons.get(i);
            actions.moveToElement(button).build().perform();

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
            MyFunc.Bekle(2);

            Assert.assertTrue(button.getText().contains("Learn"),"Learn More goruntulenemedi!");

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);

            Assert.assertTrue(elements.technoLogo.isDisplayed(),"Logo goruntulenemedi!");

            MyFunc.Bekle(2);
            driver.navigate().back();
            MyFunc.Bekle(2);

        }
    }
}
