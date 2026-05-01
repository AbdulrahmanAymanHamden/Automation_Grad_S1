package Tests;

import Pages.HomePage;
import Pages.SignUp;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    HomePage homePage ;
    SignUp signUp ;

    @Test
    @Description("Verify that user can login successfully with valid credentials")
    public void loginTest()
    {
        homePage = new HomePage(driver);
        signUp = new SignUp(driver);

        homePage.navigate();
        homePage.clickSignupLogin();
        signUp.login("abdo.ayman.ha@gmail.com" , "123456");
        homePage.assertLoginSuccessfully();
    }
}
