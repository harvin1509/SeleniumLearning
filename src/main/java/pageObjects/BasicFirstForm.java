package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicFirstForm {
    WebDriver driver;

    public BasicFirstForm(WebDriver driver){
        this.driver=driver;
    }

    By messageTextBoxXpath =By.xpath("//input[@id='user-message']");
    By showMessageButtonCss=By.xpath("//button[contains(text(),'Show Message')]");
    By showMessageText=By.xpath("//div[@id='user-message']");

    public WebElement getMessageTextBoxXpath(){
        return driver.findElement(messageTextBoxXpath);
    }


    public WebElement clickShowMsgButton() {
        return driver.findElement(showMessageButtonCss);
    }

    public WebElement showMessage() {
        return driver.findElement(showMessageText);
    }
}
