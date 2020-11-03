import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

import java.util.List;


public class TestNGTestCase2 {
    public String baseUrl = "http://www.way2automation.com/demo.html";
    String driverPath = "C:\\softwares\\chromedriver_win32\\chromedriver.exe";
    public  WebDriver driver ;

    @Test(priority = 0)
    public void countImages() {
        System.out.println("launching chrome browser");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Number of images:"+images.size());


    }
    @Test(priority = 1)
    public void countButtons() {
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println("Number of buttons:"+buttons.size());
        driver.close();
    }
}
