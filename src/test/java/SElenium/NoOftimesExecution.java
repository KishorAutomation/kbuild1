package SElenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NoOftimesExecution {

	@Test (invocationCount=5)
	public void practicemethod1() {
		System.out.println("Print");
	}
}
