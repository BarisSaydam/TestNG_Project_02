package US_205;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_205_Elements {
    public TC_205_Elements(WebDriver driver){
        PageFactory.initElements(driver,this);
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
