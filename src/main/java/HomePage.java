import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage {

    private WebDriver driver;

    private final By NAVIGATE_BUTTON_CATCHER = By.xpath("//*[contains(@class,'chakra-button css-y8q9d7')][2]");
    private final By LINKTEXT_CATCHER = By.xpath("//*[contains(@class,'chakra-heading css-1c1vc2y')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        WebElement navigateButton = driver.findElement(NAVIGATE_BUTTON_CATCHER);

        navigateButton.click();
    }

    public String linkTitleText() {
        WebElement linkText = driver.findElement(LINKTEXT_CATCHER);
        String result = linkText.getText();

        return result;
    }

    public List<String> fullListAlchemist() {
        List<String> result = new ArrayList<>();

        while (true) {
            String linkTitle = linkTitleText();
            if (!result.contains(linkTitle)) {
                System.out.println(linkTitle);
                result.add(linkTitle);
                navigate();
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                break;
            }
        }
       return result;

    }

}
