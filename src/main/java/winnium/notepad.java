package winnium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class notepad {
	 WiniumDriver driver = null;
	 
	 @BeforeClass
	 public void Setup ()
	 {
	  DesktopOptions desktop = new DesktopOptions();
	  desktop.setApplicationPath("C:\\Windows\\System32\\notepad.exe");
	  try {
	   driver = new WiniumDriver(new URL ("http://localhost:9999"), desktop);
	  }catch (MalformedURLException e)
	  {
	   e.printStackTrace();
	  }
	 }
	 
	 @Test
	 public void testcase ()
	 {
	  driver.findElementByClassName("Edit").sendKeys("Vicky's Winnium Test");
	 }
	 
	 @AfterClass 
	 
	 public void TearDown()
	 {
	  driver.close();
	 }
	}
