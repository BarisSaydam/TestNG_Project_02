package US_204;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_204_Elements {
    public TC_204_Elements(WebDriver driver){PageFactory.initElements(driver,this);}

    @FindBy(xpath = "//*[text()='Blogs'][1]")
    public WebElement blogs;

    @FindBy(xpath = "//*[text()='Importance of Manual Testing  in the Modern SDLC']")
    public WebElement blogyazisi;

    @FindBy(xpath = "//*[@class='t986__descr t-descr t-descr_lg']")
    public WebElement dogrulama;
}
