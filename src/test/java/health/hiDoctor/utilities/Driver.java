package health.hiDoctor.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    public static WebDriver getDriver() {

        if (driverPool.get() == null) {

            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType) {
                case "remote-chrome":
                    try {
                        ChromeOptions chromeOptions = new ChromeOptions();
                        String gridAddress = "";  // virtual device ip
                        URL url = new URL("http://" + gridAddress + ":4444/wd/hub");
                        driverPool.set(new RemoteWebDriver(url, chromeOptions));
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;
                case "chrome":
                    Map<String, Object> prefs = new HashMap<String, Object>();
                    prefs.put("profile.default_content_setting_values.notifications", 2);
                    ChromeOptions options = new ChromeOptions();
                    options.setExperimentalOption("prefs", prefs);

                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver(options)); //options
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }

        }

        return driverPool.get();

    }

    /*
        public static WebDriver getMobileDriver() {

            if (driverPool.get() == null) {

                String mobileBrowserType = ConfigurationReader.getProperty("mobileBrowser");

                switch (mobileBrowserType) {
                    case "chrome":
                        // driverPool.set(new ChromeDriver());
                        //  driverPool.get().manage().window().maximize();
                        ChromeDriver driver = new ChromeDriver();
                        DevTools devTools = driver.getDevTools();
                        devTools.createSession();
                        devTools.send(Emulation.setDeviceMetricsOverride(390,  // iPhone 12Pro
                                844,
                                75,
                                true,
                                Optional.empty(),
                                Optional.empty(),
                                Optional.empty(),
                                Optional.empty(),
                                Optional.empty(),
                                Optional.empty(),
                                Optional.empty(),
                                Optional.empty(),
                                Optional.empty()));
                        driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                        break;
                }

            }

            return driverPool.get();

        }
    */
    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit(); // this line will terminate the existing session. value will not even be null
            driverPool.remove();
        }
    }

}
