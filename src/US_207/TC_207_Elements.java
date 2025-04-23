package US_207;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC_207_Elements {

    public TC_207_Elements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()='Learn more']")
    public List <WebElement> learnMore;

    @FindBy(xpath = "//img[@imgfield='img']")
    public WebElement technoLogo;

}
