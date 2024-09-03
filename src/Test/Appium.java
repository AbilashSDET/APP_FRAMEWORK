package Test;



import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.URL;
import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Appium {
	public AndroidDriver androiddriver ;
	
	@Before
	public void setup() throws MalformedURLException{
		DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11.0");  // Your device/emulator's version
        caps.setCapability("deviceName", "Galaxy S21");  // Change to your device/emulator ID
        caps.setCapability("automationName", "UiAutomator2");
        caps.setBrowserName("Chrome");
        
        androiddriver = new AndroidDriver(new URL("https://TESTINGBOT_KEY:TESTINGBOT_SECRET@hub.testingbot.com/wd/hub"), caps);
        }
	@Test
	public void appium() 
	{
		androiddriver.get("https://www.google.co.in/");
		System.out.println(androiddriver.getTitle());
	}
	@After
	public void close() 
	{
		androiddriver.quit();
	}

}
