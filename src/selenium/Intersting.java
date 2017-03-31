package selenium;

import java.util.Date;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Intersting {
	static WebDriver d;
	public static void main(String[] args) {
		//open_new_tab();
		find_java_script_errors();
		
	}
static
{
	System.setProperty(
			"webdriver.chrome.driver",
			"C:\\Users\\nmakkar\\.jenkins\\workspace\\Coax-mercury\\src\\main\\resources\\Drivers_executable\\chromedriver.exe");

	// TODO Auto-generated method stub
	//d  = new ChromeDriver();
	
}
	private static void find_java_script_errors() {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        LoggingPreferences loggingprefs = new LoggingPreferences();
        loggingprefs.enable(LogType.BROWSER, Level.ALL);
        capabilities.setCapability(CapabilityType.LOGGING_PREFS, loggingprefs);
        d = new ChromeDriver(capabilities);
        d.manage().window().maximize();
        
		d.get("https://www.hallwaze.com/");

        LogEntries logEntries = d.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logEntries) {
            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
        }
	}

	private static void open_new_tab() {
		d.get("https://www.hallwaze.com/");
		d.findElement(
				By.xpath(".//*[@class='btn btn-success-ghost pull-right signin-btn']"))
				.sendKeys(Keys.CONTROL, Keys.RETURN);

	}
 
}
