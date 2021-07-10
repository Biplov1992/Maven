package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPractice {
	
	WebDriver driver;
	
	@Test
	@Parameters({"browser","url"})
	  public void run(String browser,String url)
	  { 
		   if(browser.equalsIgnoreCase("firefox"))
		    {
			   System.setProperty("webdriver.gecko.driver","F:\\Software\\Drivers\\geckodriver.exe");
		       driver = new FirefoxDriver();
		       driver.manage().window().maximize();
		    } 
		   
		    driver.get(url);
			String link = driver.getCurrentUrl();
			String title = driver.getTitle();
			System.out.println(link);
			System.out.println(title);
			driver.quit();		 
	  }		

}
