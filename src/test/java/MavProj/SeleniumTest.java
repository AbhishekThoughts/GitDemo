package MavProj;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

	@BeforeSuite
	public void BrowserTest() {
		System.out.println("01 Selenium BrowserTest");	
	}
	@BeforeSuite
	public void ElementsUI() {
		System.out.println("02 ElementsUI");		
	}
}
