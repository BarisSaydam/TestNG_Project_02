package US_102;

import Utility.BaseDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_201_CrossCampusTest_Elements {

    public TC_201_CrossCampusTest_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "SIGN IN")
    public WebElement signinbutton;

    @FindBy(xpath = "//button[@aria-label='LOGIN'] ")
    public WebElement login;
}
