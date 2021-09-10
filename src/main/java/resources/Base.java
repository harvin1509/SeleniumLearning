package resources;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public WebDriver driver;
    public Properties properties;


    public WebDriver initializeDriver() throws IOException {
        // Adding knowledge of data. properties file to read browser name and
        // url -"/Users//harveen//Downloads//E2EProject//src//main//java//resources
        properties = new Properties();
        //    FileInputStream fileinputstream=new FileInputStream("src//main//java//resources//data.properties");
        FileInputStream fileinputstream = new FileInputStream("src/main/javaresources/data.properties");
        properties.load(fileinputstream);
        String browserName = properties.getProperty("browser");
        System.out.println(browserName);

        return driver;
    }

    public void getScreenShotPath() {
    }
}
