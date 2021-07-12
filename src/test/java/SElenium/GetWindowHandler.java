package SElenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetWindowHandler {
	   @Test
	   public void windowHandle() throws Exception {
	      System.setProperty("webdriver.chrome.driver", "F:\\Automation files\\SPRAOI\\Drivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("https://www.tutorialspoint.com/index.htm");
	      String currentwindow = driver.getWindowHandle();
	      Set<String> allWindows = driver.getWindowHandles();
	      Iterator<String> i = allWindows.iterator();
	      while(i.hasNext()){
	         String childwindow = i.next();
	         if(!childwindow.equalsIgnoreCase(currentwindow)){
	            driver.switchTo().window(childwindow);
	            System.out.println("The child window is "+childwindow);
	         } else {
	            System.out.println("There are no children");
	         }
	      }
	      driver.quit();
	   }
}
