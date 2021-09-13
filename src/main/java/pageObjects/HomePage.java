package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver= driver;
    }

    By title=By.cssSelector("span[class='central-textlogo__image sprite svg-Wikipedia_wordmark']");


    public WebElement getTitle()
    {
        return driver.findElement(title);
    }

}
