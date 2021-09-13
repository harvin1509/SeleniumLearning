import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import utils.Base;

public class InputFormTest extends Base {

    @Test
    public void addValidMessage() {
        driver.get(properties.getProperty("url"));
        HomePage home = new HomePage(driver);
        Assert.assertEquals(home.getTitle().getText(), "Wikipedia123");
    }

    @AfterTest
    public void teardown() {
        driver.close();
    }
}
