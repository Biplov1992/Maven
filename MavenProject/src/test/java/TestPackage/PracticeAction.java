package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class PracticeAction {
	
  @Test
  public void f() {
	   
  }
  @BeforeMethod
  public void launch() {
	  
	  System.setProperty("webdriver.gecko.driver","F:\\Software\\Drivers\\geckodriver.exe");
	   WebDriver driver = new FirefoxDriver();
	   driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
