package DriverSetup;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
 
 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
 

public class SetupDriver {
	public static WebDriver driver;
	public static ChromeOptions options;
	public static EdgeOptions options1;
	
	
	@SuppressWarnings("deprecation")
	public static WebDriver chromedriver() {
		  WebDriverManager.chromedriver().setup();
		   options= new ChromeOptions();
		   options.addArguments("--start-maximized");
    	   options.addArguments("disable-popup-blocking");
		   driver= new ChromeDriver(options);
		   driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); 
		   driver.get("https://www.nobroker.in/");
		   
		   return driver;
	}
	
	public static WebDriver edgedriver() {
		WebDriverManager.edgedriver().setup();
		options1=new EdgeOptions();
		options1.addArguments("--start-maximized");
		options1.addArguments("disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); 
		driver.get("//https://www.nobroker.in/");
		
		return driver;
	}

 
}