package SElenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Actitime {
	WebDriver driver;

	@Test
	public void Screenshot() throws InterruptedException, IOException {
		

		File file = new File("F:/Automation files/SPRAOI/K2021/Configs/config.properties");

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();

		// load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", "F:/Automation files/SPRAOI/Drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		
		 driver.get("https://online.actitime.com/ky");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 Thread.sleep(5000);

		System.out.println("URL ::" + prop.getProperty("url"));
		System.out.println("Path::" + prop.getProperty("driver_path"));
		System.out.println("implicitlywait::" + prop.getProperty("implicitlywait"));

		// https://online.actitime.com/ky/
		// Here are your login details:
		// Username:kishormy1991@gmail.com
		// Password (Make sure you change it after your first login): Y4Ypu7eb
		
		
	}
}
