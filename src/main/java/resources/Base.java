package resources;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public WebDriver driver;
    public Properties properties;


    public WebDriver initializeDriver() throws IOException {
        // Adding knowledge of data. properties file to read browser name and
        // url -"/Users//harveen//Downloads//E2EProject//src//main//java//resources
        properties = new Properties();
        //    FileInputStream fileinputstream=new FileInputStream("src//main//java//resources//data.properties");
        FileInputStream fileinputstream = new FileInputStream("src/main/java/resources/data.properties");
        properties.load(fileinputstream);

        String browserName = properties.getProperty("browser");
        System.out.println(browserName);

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/harveen/Downloads/selenium/chromedriver");
            driver = new ChromeDriver();
            //execute in chrome driver

        } else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
            //firefox code
        } else if (browserName.equals("IE")) {
            //	IE code
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }

//    public String getScreenShotPath(String testCaseName) throws IOException {
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//      //  System.out.println("---> " + System.getProperty("user.dir"));
//        String destinationFile = System.getProperty("user.dir") + "/reports/" + testCaseName + ".png";
//        FileUtils.copyFile(source, new File(destinationFile));
//        return destinationFile;
//
//    }
}
