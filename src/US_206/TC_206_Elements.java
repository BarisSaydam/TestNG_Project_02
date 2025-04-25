package US_206;

import US_201.TC_201_Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;
import java.util.List;

public class TC_206_Elements {
    public TC_206_Elements(WebDriver driver){PageFactory.initElements(driver,this);}

    @FindBy(css = "[class='t966__menu-item-title t966__typo__menu_474856319 t-name']")
    List<WebElement> programs;

    @FindBy(css = "[class='t-menu__link-item t966__tm-link']")
    WebElement programsBtn;

    @FindBy(xpath = "//*[@style='max-height: 80px']")
    WebElement logo;








}
