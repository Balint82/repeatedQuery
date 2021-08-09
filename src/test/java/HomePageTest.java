import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HomePageTest extends BaseTest {

    @Test
    public void getTitleTest() {
      List<String> result = homePage.fullListAlchemist();

      Assertions.assertTrue(result.contains("Támogatónk"));
    }
}
