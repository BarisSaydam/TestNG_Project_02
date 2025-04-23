package US_01;

import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_01 extends BaseDriverParameter {
    int counter =0;

    @Test(dataProvider = "data",groups = "Smoke")
    public void programTest(String control) {

        TC_01_Elements elements = new TC_01_Elements(driver);

        driver.get("https://techno.study/");

        for (int i = counter; i < elements.programs.size(); i++) {

            elements.programsBtn.click();

            elements.programs.get(i).click();

            if (driver.getCurrentUrl().contains(control.toLowerCase())) {
                Assert.assertTrue(driver.getCurrentUrl().contains(control.toLowerCase()), "Program ile sayfa eşleşmiyor.");
                counter++;
                break;
            }

            wait.until(ExpectedConditions.elementToBeClickable(elements.programsBtn));
        }
    }

    @DataProvider
    Object[] data() {
        Object[] aranacaklar = {"SDET", "data-science", "ai", "android-bootcamp", "masters"};

        return aranacaklar;
    }
}
