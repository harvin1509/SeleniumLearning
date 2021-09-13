import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import resources.Base;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class InputFormTest extends Base {
public WebDriver driver;

 @BeforeTest
   public void initialize() throws IOException {
        driver = initializeDriver();
     driver.get(properties.getProperty("url"));
   }

    @Test
    public void addValidMessage() {

        HomePage home=new HomePage(driver);
        Assert.assertEquals(home.getTitle().getText(),"Wikipedia123");
    }
    @AfterTest
    public void teardown()
    {

        driver.close();


    }


}
