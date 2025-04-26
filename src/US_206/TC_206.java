package US_206;

import Utility.BaseDriverParameter;
import Utility.MyFunc;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TC_206 extends BaseDriverParameter {

    @Test(groups = "Regression")
    public void test1() {

        TC_206_Elements elements = new TC_206_Elements(driver);

        driver.get("https://techno.study/");

        int logo = 0;
        for (int i = logo; i < elements.programs.size(); i++) {

            elements.programsBtn.click();
            MyFunc.Bekle(1);

            elements.programs.get(i).click();
            MyFunc.Bekle(1);

            elements.logo.click();
            logo++;

            wait.until(ExpectedConditions.elementToBeClickable(elements.programsBtn));
        }
    }
}
