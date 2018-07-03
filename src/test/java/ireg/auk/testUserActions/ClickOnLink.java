package ireg.auk.testUserActions;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ireg.auk.WaitUtility.WaitUI;
import ireg.auk.userActions.WebUI;

public class ClickOnLink {
	private static WebDriver driver = null;


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//Executables//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		//waitTillElementClickable(driver.findElement(By.cssSelector("a.login")), (long) 20);
		By element=By.cssSelector("a.login");
		WaitUI wait=new WaitUI(driver);
		wait.ElementIsClickable(element,(long)20);
		String data = "Sign in";
		String attribute = WebUI.getElementAttribute(driver.findElement(By.cssSelector("a.login")), "href");
		System.out.println("Href: " + attribute);
		//Click on Link
		//WebUI.clickOnElement(driver.findElements(By.tagName("a")), "Cliecked on " + data + " link", data);
		//WebUI.clickOnElementByAttribute(driver.findElement(By.cssSelector("a.login")),"Link");
		//WebUI.clickOnElementByTagName(driver.findElement(By.cssSelector("a.login")),"a");
		
		Thread.sleep(3000);
		driver.quit();
	}

	

}
