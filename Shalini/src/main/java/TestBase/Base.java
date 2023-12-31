package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver driver = null;
	public static Properties prop;
	
	public Base()
	{
		prop = new Properties();
		try {
			FileInputStream fl = new FileInputStream(
					"C:\\Users\\Hussain\\eclipse-workspace\\Shalini\\src\\main\\resources\\Config\\Config.properties");
			prop.load(fl);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void setup()
	{
       System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hussain\\eclipse-workspace\\Shalini\\src\\main\\resources\\Drivers\\Firefox\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("App_Url"));
	}
}
