package MavProj;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppiumTest {


@BeforeTest
public void NativeAppAndroid() {
	System.out.println("03 Android App");
}
@AfterTest
public void IOSApp() {
	System.out.println("04 IOS App");
}
}