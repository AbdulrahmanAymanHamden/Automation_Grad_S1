package Pages;

import Utils.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

    // ========== Variables ==========
    private final String url = "https://automationexercise.com/";

    // ========== Driver ==========
    private final WebDriver driver ;

    // ========== Constructor ==========

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // ========== Locators ==========
    private final By signupLogin_btn = By.xpath("//a[@href=\"/login\"]");
    private final By logout_btn = By.xpath("//a[@href=\"/logout\"]");

    // ========== Actions ==========
    public void navigate()
    {
        driver.get(url);
    }

    public void clickSignupLogin()
    {
        ElementActions.click(driver, signupLogin_btn);
    }

    // ========== Assertions =========
    public void assertLoginSuccessfully()
    {
        Assert.assertTrue(driver.findElement(logout_btn).isDisplayed() , "LOGIN FAILED : LOGOUT BUTTON IS NOT DISPLAYED");
    }
}
