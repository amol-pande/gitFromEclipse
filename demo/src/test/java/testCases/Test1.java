package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Selenium.demo.baseTestClass;

public class Test1 extends baseTestClass
{

	WebDriver driver;
	@Test
	public void test_1()
	{
		
		
		driver = getDriver();
		driver.get("https://courses.letskodeit.com/practice");
		
	}
	
	
}
