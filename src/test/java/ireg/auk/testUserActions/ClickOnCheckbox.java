package ireg.auk.testUserActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ireg.auk.WaitUtility.WaitUI;
import ireg.auk.userActions.WebUI;

public class ClickOnCheckbox {
	
		
		
		private static WebDriver driver = null;


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//Executables//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/howto/howto_js_display_checkbox_text.asp");
			//waitTillElementClickable(driver.findElement(By.cssSelector("a.login")), (long) 20);
			WebElement element=driver.findElement(By.xpath("//input[@type='checkbox']"));
			WaitUI wait=new WaitUI(driver);
			wait.ElementIsClickable(element,(long)20);
			//Click on Link by attribute
			WebUI.clickOnElementByTagName(element,"input");
			WebUI.clickOnElementByTypeAttribute(element,"checkbox");
			Thread.sleep(3000);
			driver.quit();
		}
		
		
	

}
