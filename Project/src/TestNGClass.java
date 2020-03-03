import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNGClass {
	
	@AfterSuite
	public void walk()
	{
		System.out.println("walk");
	}
	@BeforeSuite
	public void run()
	{
		System.out.println("Run");
	}

}
