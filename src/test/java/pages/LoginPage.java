package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class LoginPage {
    WebDriver driver;
    public LoginPage(){
        driver= Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement userNameBox;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement passwordBox;
    @FindBy (xpath = "//input[@id='login-button']")
    public WebElement loginButton;
    @FindBy (xpath = "//h3[@data-test=\"error\"]")
    public WebElement errorMessage;
    @FindBy (xpath = "//div[@id='login_credentials']//br")
    public List<WebElement> acceptedUsernameCredentials;

    @FindBy (xpath = "//div[@class='login_password']//h4")
    public WebElement passwordCredential;



}
