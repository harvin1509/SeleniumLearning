package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    public Properties properties;

//whenever a subclass extends parent class then the constructor made in parent class is called by itself
    public Base()  {
        this.properties = loadProperties();
        driver = (driver == null) ? initializeDriver() : driver;
    }

    private Properties loadProperties() {
        Properties properties = new Properties();
        try {
            FileInputStream fileinputstream = new FileInputStream("src/main/resources/data.properties");
            properties.load(fileinputstream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }

    public WebDriver initializeDriver()  {
        String browserName = properties.getProperty("browser");
       // System.out.println(browserName);

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", properties.getProperty("chromeDriverPath"));
            driver = new ChromeDriver();

        } else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equals("IE")) {
            //	IE code
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}
