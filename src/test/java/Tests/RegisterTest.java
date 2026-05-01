package Tests;

import Pages.HomePage;
import Pages.SignUp;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{

    HomePage homePage ;
    SignUp signUp ;

    @Test(priority = 1 , description = "Verify that user can register successfully with valid credentials")
    @Description("Verify that user can register successfully with valid credentials")
    public void registerTest()
    {
        homePage = new HomePage(driver);
        signUp = new SignUp(driver);

        homePage.navigate();
        homePage.clickSignupLogin();
        signUp.login("abdo.ayman.ha@gmail.com" , "123456");
        homePage.assertLoginSuccessfully();
    }

    @Test(priority = 2 , description = "Verify that user cannot register with invalid credentials")
    @Description("Verify that user can cannot register with invalid credentials")
    public void invalidRegisterTest()
    {
        homePage = new HomePage(driver);
        signUp = new SignUp(driver);

        homePage.navigate();
        homePage.clickSignupLogin();
        signUp.login("abdo.ayman.hdsa@gmail.com" , "123456");
        homePage.assertLoginSuccessfully();
    }
}
