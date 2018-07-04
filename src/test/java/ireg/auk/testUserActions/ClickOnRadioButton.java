package ireg.auk.testUserActions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ireg.auk.WaitUtility.WaitUI;
import ireg.auk.userActions.WebUI;

public class ClickOnRadioButton {
	
	private static WebDriver driver = null;


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "//Executables//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sesa443020/Desktop/Radio.html");
	   /*WebElement element=driver.findElement(By.xpath("//input[@type='checkbox']"));
		WaitUI wait=new WaitUI(driver);
		wait.ElementIsClickable(element,(long)20);
		//Click on Link by attribute
		WebUI.clickOnElementByTagName(element,"input");
		WebUI.clickOnElementByTypeAttribute(element,"checkbox");
		*/
		WebElement radioButton=driver.findElement(By.xpath("//input[@type='radio'][@value='Wine']"));
		WaitUI wait=new WaitUI(driver);
		wait.ElementIsClickable(radioButton,(long)20);
		List<WebElement>radioButtons=driver.findElements(By.tagName("input"));
		WebUI.clickOnElementsByAttribute(radioButtons,"value", "Beer");
		Thread.sleep(3000);
		WebUI.clickOnElementsByAttribute(radioButtons,"value","Wine");
		Thread.sleep(3000);
		WebUI.clickOnElementByAttribute(radioButton,"value","Water");
		Thread.sleep(3000);
		WebUI.clickOnElement(radioButton, "Click on radio button");
		Thread.sleep(3000);
		driver.quit();
	}
	

}
