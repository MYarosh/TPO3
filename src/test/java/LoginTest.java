import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class LoginTest {
    private static WebDriver driver;
    private WebDriverWait wait;
    private static Map<String, Object> vars;
    private static JavascriptExecutor js;
    private static Properties properties = new Reader().getProperties();
    @BeforeClass
    public static void setUp() {
        if (properties.getBrowser().toLowerCase().equals("chrome"))
            driver = new ChromeDriver();
        else{
            System.setProperty("webdriver.gecko.driver", "/home/maximyarosh/Загрузки/geckodriver");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @AfterClass
    public static void tearDown() {
        driver.close();
    }

    @Test
    public void loginTest(){
        driver.get(properties.getUrl());
        driver.manage().window().setSize(new Dimension(1920, 1080));
        WebElement logInButton = driver.findElement(By.xpath("/html/body/div/div/div[5]/div[2]/header/nav/div/div[3]/a"));
        String path = logInButton.getAttribute("href");
        driver.get(path);
        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailInput.sendKeys(properties.getLogin());
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordInput.sendKeys(properties.getPassword());
    }
}
