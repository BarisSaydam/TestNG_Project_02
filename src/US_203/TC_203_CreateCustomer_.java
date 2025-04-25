package US_203;

import Utility.BaseDriverParameter;
import Utility.MyFunc;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TC_203_CreateCustomer_ extends BaseDriverParameter {


    @Test(groups = {"Smoke"})
    public void CreateCustomer() throws InterruptedException, AWTException {
        TC_203_CreateCustomer_Elements elements=new TC_203_CreateCustomer_Elements(driver);

        driver.get("https://techno.study/");

        Robot robot = new Robot();

        // Add to card a tikla
        for (int i = 0; i < 11; i++) {


            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(200);

        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");

        elements.fullname.sendKeys(elements.randomName);
        elements.Email.sendKeys("Testdiyar@gmail.com");
        elements.number.sendKeys("4248957898");

        Select select=new Select(elements.chooseourcountry);
        select.selectByVisibleText("Andorra");

        Select select1=new Select(elements.chooseyourcourse);
        select1.selectByVisibleText("SDET");

        Select select2=new Select(elements.howdidyouhearaboutus);
        select2.selectByVisibleText("Friend");

        elements.promocode.sendKeys("12345");
        elements.agreebutton.click();
        elements.bookacall.click();

        MyFunc.Bekle(6);

        Assert.assertTrue(elements.thankyoumessage.isDisplayed(), "Thank you message couldnt displayed");


    }




}
