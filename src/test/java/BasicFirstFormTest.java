import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.BasicFirstForm;
import utils.Base;

public class BasicFirstFormTest extends DriverBasicCommands {
    BasicFirstForm basicFirstForm;
    @Test(dataProvider="getData")
    public void addValueIntoTextBox(String userName) throws InterruptedException {
        driver.get(properties.getProperty("url"));
        driver.manage().window().maximize();
      //  Thread.sleep(2000);
       // WebDriverWait wait=new WebDriverWait(driver,20) ;
       // wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("image-darkener")));
       // wait.until(ExpectedConditions.elementToBeClickable(By.id("image-darkener")));
        basicFirstForm = new BasicFirstForm(driver);
        basicFirstForm.getMessageTextBoxXpath().sendKeys(userName);
        basicFirstForm.clickShowMsgButton().click();
    }

    @Test
    public void verifyMessage(){
        basicFirstForm.showMessage().getText();
        Assert.assertTrue(basicFirstForm.showMessage().isDisplayed());
    }


    @DataProvider
    public Object[] getData() {
        // Row stands for how many different data types test should run
        //coloumn stands for how many values per each test
        // Array size is 1
        Object[] data = new Object[2];
        data[0] = "Harveen";
        data[1] = "123456";

        return data;

    }
}