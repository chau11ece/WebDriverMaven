/*
 * package testcases;
 * 
 * import java.net.URL; import java.util.Date; import
 * java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.Platform; import
 * org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeOptions; import
 * org.openqa.selenium.remote.DesiredCapabilities; import
 * org.openqa.selenium.remote.RemoteWebDriver;
 * 
 * public class TestParallelDataProviderThreadLocal {
 * 
 * public ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>(); public
 * WebDriver driver;
 * 
 * public ThreadLocal<DesiredCapabilities> dc = new
 * ThreadLocal<DesiredCapabilities>(); public DesiredCapabilities cap;
 * 
 * public WebDriver getDriver() { return dr.get();
 * 
 * }
 * 
 * public void setWebDriver(WebDriver driver) { dr.set(driver);
 * 
 * }
 * 
 * public DesiredCapabilities getDesiredCapabilities() { return dc.get();
 * 
 * }
 * 
 * public void setDesiredCapabilities(DesiredCapabilities cap) { dc.set(cap);
 * 
 * }
 * 
 * 
 * public void launchBrowser(String browser, String username) { Date d = new
 * Date();
 * 
 * System.out.println(browser+" "+d.toString());
 * 
 * if (browser.equals("chrome")) {
 * 
 * cap = new DesiredCapabilities(); setDesiredCapabilities(cap);
 * getDesiredCapabilities().setPlatform(Platform.ANY);
 * getDesiredCapabilities().setBrowserName("chrome");
 * 
 * ChromeOptions options = new ChromeOptions(); options.merge(cap);
 * 
 * } else if (browser.equals("firefox")) {
 * 
 * }
 * 
 * driver = new RemoteWebDriver(new URL("")); setWebDriver(driver);
 * 
 * getDriver().get(""); getDriver().manage().timeouts().implicitlyWait(10,
 * TimeUnit.SECONDS); getDriver().manage().window().maximize();
 * 
 * getDriver().findElement(By.id("identifierId")).sendKeys(
 * "chautran@mailinator.com"); getDriver().quit();
 * 
 * } }
 */