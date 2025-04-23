package US_203;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_203_CreateCustomer_Elements {

    public TC_203_CreateCustomer_Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "APPLY NOW")
    public WebElement applynow;

    @FindBy(xpath = "(//*[@class='t-input-block'])[1]/input")
    public WebElement fullname;

    @FindBy(xpath = "(//*[@class='t-input-block'])[2]/input")
    public WebElement email;

    @FindBy(id = "input_1661174990146")
    public WebElement number;

    @FindBy(xpath = "(//*[@class='t-select__wrapper t-select__wrapper_bbonly']/select)[1]")
    public WebElement chooseourcountry;

    @FindBy(xpath = "(//*[@class='t-select__wrapper t-select__wrapper_bbonly']/select)[2]")
    public WebElement chooseyourcourse;

    @FindBy(xpath = "(//*[@class='t-select__wrapper t-select__wrapper_bbonly']/select)[3]")
    public WebElement howdidyouhearaboutus;

    @FindBy(xpath = "(//*[@class='t-input-block']/input)[3]")
    public WebElement promocode;

    @FindBy(css = "[class='t-checkbox js-tilda-rule']+div")
    public WebElement agreebutton;

    @FindBy(xpath = "//*[@class='tn-form__submit']/button")
    public WebElement bookacall;

    @FindBy(xpath = "(//*[@style='font-family: SFProDisplay;'])[4]")
    public WebElement thankyoumessage;

    String[] Names = {
            "Diyar Olmez",
            "Isaac Newton",
            "Nikola Tesla",
            "William James Sidis",
            "Leonardo Da Vinci"
    };

    int rndIndex = (int) (Math.random() * Names.length);
    String randomName = Names[rndIndex];


}