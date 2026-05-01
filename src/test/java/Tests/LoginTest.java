package Tests;

import Pages.HomePage;
import Pages.SignUp;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    HomePage homePage ;
    SignUp signUp ;

    @Test(priority = 1 , description = "Verify that user can login successfully with valid credentials")
    @Description("Verify that user can login successfully with valid credentials")
    public void loginTest()
    {
        homePage = new HomePage(driver);
        signUp = new SignUp(driver);

        homePage.navigate();
        homePage.clickSignupLogin();
        signUp.login("abdo.ayman.ha@gmail.com" , "123456");
        homePage.assertLoginSuccessfully();
        System.out.println("TESTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT!");
    }

    @Test(priority = 2 , description = "Verify that user cannot login with invalid credentials")
    @Description("Verify that user can cannot login with invalid credentials")
    public void invalidLoginTest()
    {
        homePage = new HomePage(driver);
        signUp = new SignUp(driver);

        homePage.navigate();
        homePage.clickSignupLogin();
        signUp.login("abdo.ayman.hdsa@gmail.com" , "123456");
        homePage.assertLoginSuccessfully();
    }
}
