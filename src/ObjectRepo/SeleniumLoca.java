package ObjectRepo;

import org.openqa.selenium.By;

public interface SeleniumLoca {
	public static By Username = By.xpath("//input[@placeholder='Username']");
	public static By Password = By.xpath("//input[@placeholder='Password']");
	public static By Submit = By.cssSelector("#login-button");
	public static By drpdwon = By.xpath("//*[@data-test='product-sort-container']");
	

}
