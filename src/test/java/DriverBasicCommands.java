import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Base;

public class DriverBasicCommands extends Base {
    public static Logger log= LogManager.getLogger(InputFormTest.class.getName());

    @BeforeTest
    public void initializeBrowser(){

    }

    @AfterTest
    public void teardown() {
        driver.close();
        log.info("Driver is closed");
    }
}
