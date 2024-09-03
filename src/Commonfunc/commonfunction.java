package Commonfunc;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class commonfunction {
	public static WebDriver driver = null;
	public String workingdir = System.getProperty("user.dir");
	
	public void click(WebDriver driver, By string)
	{
		driver.findElement(string).click();
	}
	public void launchurl(String url,String version) 
	{
		if(version.equals("Chrome"))
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	
	public void screenshot(String filename)
	{
		TakesScreenshot scr = (TakesScreenshot) driver;
		File source = scr.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Abilash\\OneDrive\\Documents" +filename+ ".png");
		try {
            FileHandler.copy(source, destination);
            System.out.println("Screenshot saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
