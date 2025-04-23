package US_208;

import US_207.TC_207_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_208_Elements {


    public TC_208_Elements (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()='APPLY NOW']")
    public WebElement applyNow;

    @FindBy(xpath = "//*[text()='Terms of Use']")
    public WebElement termOfUse;

    @FindBy(xpath = "(//*[text()='Terms of Use'])[1]")
    public WebElement termOfUseText;
}
