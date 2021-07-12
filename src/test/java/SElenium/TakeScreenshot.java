package SElenium;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakeScreenshot {
	WebDriver driver;
	
	@Test
	public void Screenshot() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation files\\SPRAOI\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://online.actitime.com/ky");
		driver.manage().window().fullscreen();
		Thread.sleep(10000);
		Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
        ImageIO.write(s.getImage(),"PNG",new File("F:\\Automation files\\SPRAOI\\screenshots\\fullPageScreenshot1.png"));
        driver.close();
		
	}
	}

