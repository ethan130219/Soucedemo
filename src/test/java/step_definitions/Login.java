package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;

import java.util.List;

public class Login {
LoginPage loginPages= new LoginPage();
HomePage homePage=new HomePage();

    @Given("user navigates to SwagLab Login Page")
    public void user_navigates_to_SwagLab_Login_Page() {
        Driver.getInstance().getDriver().get("https://www.saucedemo.com/");
    }

    @When("user enters valid {string}")
    public void user_enters_valid(String username) {
       loginPages.userNameBox.sendKeys(username);


    }

    @Then("user enters {string} as password")
    public void user_enters_as_password(String password) {
        loginPages.passwordBox.sendKeys(password);

    }

    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPages.loginButton.click();

    }

    @Then("user should be successfully land on SwagLap Home Page")
    public void user_should_be_successfully_land_on_SwagLap_Home_Page() {
        String actualText= homePage.productText.getText();
        System.out.println(actualText);
        String expectedText= "PRODUCTS";
        Assert.assertEquals( "Landing on home page failed!", expectedText, actualText );

    }

    @When("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String username, String password) {
        loginPages.userNameBox.sendKeys(username);
        loginPages.passwordBox.sendKeys(password);
        loginPages.loginButton.click();


    }

    @Then("user should verify {string} error message")
    public void user_should_verify_error_message(String errorMessage) {



        String actualErrorMessage = loginPages.errorMessage.getText();
        String expectedErrorMessage= errorMessage;
              Assert.assertEquals("Error message verification failed!",expectedErrorMessage,actualErrorMessage);
    }



}
