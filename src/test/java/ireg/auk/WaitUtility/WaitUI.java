package ireg.auk.WaitUtility;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUI {
	private WebDriver driver=null;
	public WaitUI(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// wait for element to be clickable
		public  void ElementIsClickable(WebElement element, Long time) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, time);
				wait.until(ExpectedConditions.elementToBeClickable(element));
			} catch (NoSuchElementException ex) {
				System.out.println(ex.getMessage());
			} catch (StaleElementReferenceException ex) {
				System.out.println(ex.getMessage());
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}

		// wait for element to be clickable using By class
		public  void ElementIsClickable(By element, Long time) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, time);
				wait.until(ExpectedConditions.elementToBeClickable(element));
			} catch (NoSuchElementException ex) {
				System.out.println(ex.getMessage());
			} catch (StaleElementReferenceException ex) {
				System.out.println(ex.getMessage());
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}

		}

}
