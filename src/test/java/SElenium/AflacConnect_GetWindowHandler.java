package SElenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AflacConnect_GetWindowHandler {
	@Test
	public void SwitchOne() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:/Automation files/SPRAOI/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://use-aflqawa01.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		WebElement UN = driver.findElement(By.name("email"));
		WebElement PWD = driver.findElement(By.name("password"));
		WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));

		try {

			UN.sendKeys("kishormy.30@gmail.com");
			PWD.sendKeys("Test@123");
			Submit.click();
			Thread.sleep(10000);
			WebElement Shop = driver.findElement(By.xpath("//a[@href='/productPage']"));
			Shop.click();
			Thread.sleep(10000);
			WebElement SimpliCOlllege = driver.findElement(
					By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[2]/a[1]"));
			SimpliCOlllege.click();
			Thread.sleep(5000);

			String currentwindow = driver.getWindowHandle();

			driver.switchTo().window(currentwindow);

			WebElement EZshield1 = driver.findElement(
					By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[2]/div[2]/a[1]"));
			EZshield1.click();
			Thread.sleep(5000);

						
			WebElement EZshield2 = driver.findElement(
					By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[3]/div[2]/a[1]"));
			EZshield2.click();
			Thread.sleep(5000);
						
			driver.switchTo().window(currentwindow);
			Thread.sleep(5000);
			WebElement Meredian = driver.findElement(
					By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[4]/div[2]/a[1]"));
			Meredian.click();
			Thread.sleep(5000);
				
			
			driver.switchTo().window(currentwindow);
			Thread.sleep(5000);
			
			Set<String>s=driver.getWindowHandles();

			// Now iterate using Iterator
			Iterator<String> I1= s.iterator();

			while(I1.hasNext())
			{

			String child_window=I1.next();


			if(!currentwindow.equals(child_window))
			{
				Thread.sleep(5000);
			driver.switchTo().window(child_window);

			System.out.println(driver.switchTo().window(child_window).getTitle());
				
			}
			}
		}

		catch (Exception E) {
			System.out.println(E);
		}

		 finally {
		 driver.quit();
		 }
		

	}

}
