package US_205;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_205_Elements {

    public TC_205_Elements(){
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(css = "[aria-label='Social media links']>:nth-child(1)")
    public WebElement facebook;

    @FindBy(css = "[aria-label='Social media links']>:nth-child(2)")
    public WebElement instagram;

    @FindBy(css = "[aria-label='Social media links']>:nth-child(3)")
    public WebElement youtube;

    @FindBy(css = "[aria-label='Social media links']>:nth-child(4)")
    public WebElement linkedin;
}
