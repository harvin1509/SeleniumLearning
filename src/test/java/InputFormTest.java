import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.Base;

import java.io.IOException;

public class InputFormTest extends Base {

    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();
    }

    @Test
    public void addValidMessage() {
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
