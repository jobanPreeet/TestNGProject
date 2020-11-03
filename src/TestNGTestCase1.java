import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import static org.testng.Assert.*;


public class TestNGTestCase1 {
    public String baseUrl = "http://www.way2automation.com/demo.html";
    String driverPath = "C:\\softwares\\chromedriver_win32\\chromedriver.exe";
    public  WebDriver driver ;


    @Test(priority = 0)
    public void verifyTitle() {
        System.out.println("launching chrome browser");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        String expectedTitle = "Welcome";
        String actualTitle = driver.getTitle();
        //System.out.println(actualTitle);
        assertEquals(actualTitle, expectedTitle);
    }
    @Test(priority = 1)
    public void verifyLogo() {
        WebElement image = driver.findElement(By.xpath("//img[contains(@src,'demo/images/logo.png')]"));
        Boolean imageLoaded = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", image);
        assertTrue(imageLoaded);
        driver.close();
    }
}
