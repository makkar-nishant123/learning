package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intersting {
	
	public static void main(String[] args) {
	
		try {
			open_browser();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static void open_browser() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nishant\\Desktop\\galen-bin-2.3.2\\chromedriver.exe");
		d.get("https://www.payubiz.in/");
		d.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul/li[1]/a")).sendKeys(Keys.CONTROL + "t");
	}
	
	

}
