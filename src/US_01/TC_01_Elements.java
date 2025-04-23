package US_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC_01_Elements {
    public TC_01_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class='t966__menu-item-title t966__typo__menu_474856319 t-name']")
    List<WebElement> programs;

    @FindBy(css = "[class='t-menu__link-item t966__tm-link']")
    WebElement programsBtn;
}
