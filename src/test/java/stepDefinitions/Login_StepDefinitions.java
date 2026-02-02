package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static driver.DriverFactory.getDriver;

public class Login_StepDefinitions {

    private WebDriver driver =  getDriver();

    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
        driver.get("https://www.webdriveruniversity.com/Login-Portal/index.html?");
    }

    @And("I enter username {string}")
    public void i_enter_username(String userName) {
        driver.findElement(By.id("text")).sendKeys(userName);
    }

    @And("I enter password {}")
    public void i_enter_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("I click on Login button")
    public void i_click_on_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should be presented with a login validation message {string}")
    public void i_should_be_presented_with_login_validation_message(String validationMessage) {
        String loginMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(loginMessage,validationMessage);
    }

}
