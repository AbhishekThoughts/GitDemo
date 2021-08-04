package MavProj;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class RestAssuredTest {

	
	@BeforeClass
	public void PostJitra(){
		System.out.println("05 POstJira");
	}
	
	@AfterClass
	public void DeleteTwitter(){
		System.out.println("06 DeleteTwitterRestAssured");
	
	}
	
}
