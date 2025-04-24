package US_205;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_205 extends BaseDriver {

    @Test(groups = {"Regression"})
    public void SocialMedia(){
        LogTutma.info("Submenu Social Media testi basladi!");

        TC_205_Elements sm = new TC_205_Elements();

        driver.get("https://techno.study/");
        MyFunc.Bekle(1);

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        MyFunc.Bekle(1);

        sm.facebook.click();
        MyFunc.Bekle(1);
        sm.instagram.click();
        MyFunc.Bekle(1);
        sm.youtube.click();
        MyFunc.Bekle(1);
        sm.linkedin.click();
        MyFunc.Bekle(1);

        LogTutma.info("Submenu Social Media testi bitti");
    }
}
