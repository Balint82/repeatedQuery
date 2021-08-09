import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;
    HomePage homePage;

    @BeforeEach
    public void setup() {
        WebDriverManager.chromedriver().setup();

        /*ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless");*/
        driver = new ChromeDriver();

        driver.get("http://ikk.hu");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
    }

}
