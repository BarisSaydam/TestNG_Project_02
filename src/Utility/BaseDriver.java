package Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

public class BaseDriver {
    public static Logger LogTutma= LogManager.getLogger(); // Logları ekleyeceğim nesneyi başlattım.

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void Setup()
    {
        // seleniumdaki static yani başlangıç kısımlar konacak
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @AfterClass
    public void TearDown()
    {
        MyFunc.Bekle(3);
        driver.quit();
    }
}