package MavProj;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class SeleniumzTest {

@AfterSuite
public void BrowserTest() {
	System.out.println("07 Android App");
}
@AfterSuite
public void ElementsUI() {
	System.out.println("08 IOS App");
}
}