import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import utils.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InputFormTest extends Base {
    public static Logger log= LogManager.getLogger(InputFormTest.class.getName());
    @Test
    public void addValidMessage() {
        driver.get(properties.getProperty("url"));
        log.info("Navigated to Home Page");

        HomePage home = new HomePage(driver);
        //Assert.assertEquals(home.getTitle().getText(), "Wikipedia123");
        Assert.assertEquals(home.getTitle().getText(),"hey");
    }

    @AfterTest
    public void teardown() {
        driver.close();
        log.info("Driver is closed");
    }
}
