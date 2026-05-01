package Tests;

import Driver.DriverFactory;
import Utils.Screenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

    WebDriver driver ;

    @Parameters({"browser" , "headless"})
    @BeforeMethod
    public void setUp(@Optional("chrome") String browser , @Optional("true") String headless)
    {
        driver = DriverFactory.initDriver(browser , headless);
    }

    @AfterMethod
    public void tearDown(ITestResult result)
    {
        if(result.getStatus() == ITestResult.FAILURE)
        {
            Screenshot.takeScreenshot(driver , result.getName());
        }
        driver.quit();
    }
}
