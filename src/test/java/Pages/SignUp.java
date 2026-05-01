package Pages;

import Utils.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {

    // ========== Variables ==========
    private final String url = "https://automationexercise.com/login";

    // ========== Driver ==========
    private final WebDriver driver ;

    // ========== Constructor ==========

    public SignUp(WebDriver driver) {
        this.driver = driver;
    }

    // ========== Locators ==========
    private final By email_textBox = By.xpath("//input[@data-qa=\"login-email\"]");
    private final By password_textBox = By.xpath("//input[@data-qa=\"login-password\"]");
    private final By login_btn = By.xpath("//button[@data-qa=\"login-button\"]");

    // ========== Actions ==========
    public void login(String username , String password)
    {
        ElementActions.fill(driver, email_textBox, username);
        ElementActions.fill(driver, password_textBox, password);
        ElementActions.click(driver, login_btn);
    }

    // ========== Assertions =========
}
