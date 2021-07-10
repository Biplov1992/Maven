package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstMaven {
	
  WebDriver driver;	
	
  @Test
  public void print()
  {
	  System.out.println("Hello Maven...");
  }
  
  @Test
  public void run()
  {
	   
	    System.setProperty("webdriver.gecko.driver","F:\\Software\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com/");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		driver.quit();		
  }
  
}
