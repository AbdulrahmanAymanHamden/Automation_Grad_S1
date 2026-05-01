package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

    public static WebDriver initDriver(String browser , String headless)
    {
        WebDriver driver ;

        switch (browser.toLowerCase())
        {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                if(headless.equalsIgnoreCase("true"))
                {
                    chromeOptions.addArguments("--headless");
                }
                driver = new ChromeDriver(chromeOptions);
                System.out.println("Chrome browser launched successfully.");
                break;

            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                if(headless.equalsIgnoreCase("true"))
                {
                    edgeOptions.addArguments("--headless");
                }
                driver = new EdgeDriver(edgeOptions);
                System.out.println("Edge browser launched successfully.");
                break;

            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                if(headless.equalsIgnoreCase("true"))
                {
                    firefoxOptions.addArguments("--headless");
                }
                driver = new FirefoxDriver(firefoxOptions);
                System.out.println("Firefox browser launched successfully.");
                break;

            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        return driver;
    }
}
