package SElenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectOperations {
	
	@Test	
	 public void main2() throws InterruptedException {
	      System.setProperty("webdriver.chrome.driver",
	         "F:/Automation files/SPRAOI/Drivers/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      //implicit wait
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      //URL launch
	      driver.get("https://the-internet.herokuapp.com/dropdown");
	      // identify dropdown
	      WebElement d = driver.findElement(By.tagName("select"));
	      //Select class to get options in dropdown
	      Select l = new Select(d);
	      l.selectByIndex(2);
	      Thread.sleep(5000);
	      System.out.print(l.getFirstSelectedOption().getText());
	      List<WebElement> m = l.getOptions();
	      System.out.println("Drodown list items are: ");
	      //iterate through options till list size
	      for (int j = 0; j < m.size(); j++) {
	         String s = m.get(j).getText();
	         l.selectByValue(s);
	         System.out.println(s);
	        
	         Thread.sleep(5000);
	      }
	      driver.quit();}
	   }

