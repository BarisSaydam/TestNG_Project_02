package US_208;

import Utility.BaseDriverParameter;
import Utility.MyFunc;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_208 extends BaseDriverParameter {

    @Test(groups = "Regression")
    public void Test () {
        driver.get("https://techno.study/");
        TC_208_Elements elements = new TC_208_Elements(driver);
        Actions actions = new Actions(driver);

        elements.applyNow.click();
        actions.moveToElement(elements.termOfUse).build().perform();
        MyFunc.Bekle(2);
        elements.termOfUse.click();
        MyFunc.Bekle(2);

        Assert.assertTrue(elements.termOfUseText.getText().contains("Terms of Use"),"Yazi goruntulenemedi!");
    }
}
