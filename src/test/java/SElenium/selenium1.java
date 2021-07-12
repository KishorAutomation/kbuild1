package SElenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class selenium1 {
	static WebDriver driver;
	@Test
	public void practicemethod1(){
	System.setProperty("webdriver.gecko.driver", "E:/OTHERS/SELENIUM/JAR files/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");	
	driver.manage().window().maximize();	
	driver.navigate().refresh();
	try{
	
	WebElement Username = driver.findElement(By.name("login"));
	String untext = Username.getText();
	assertnotEquals(untext, "Username", "same as expected");
	System.out.print("Failed");
//	Actions a1 = new Actions(driver);
//	a1.sendKeys("CONTROL+T").build().perform();
	Thread.sleep(5000);
	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
	driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
	Thread.sleep(5000);
	}
	catch(Exception e){
		System.out.print(e.getStackTrace());
		
	}
	finally{
	driver.close();
	}
	
	}
	private void assertnotEquals(String untext, String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	

}
