package ireg.auk.userActions;

import java.util.List;
import java.util.NoSuchElementException;

import javax.swing.text.AbstractDocument.LeafElement;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class WebUI {
	// 1.Click on Element
		public static void clickOnElement(WebElement element, String description) {
			try {
				element.click();
				// log and extent report message
				System.out.println(description);
			} catch (NoSuchElementException ex) {
				System.out.println(ex.getMessage());
				System.out.println(ex.getLocalizedMessage());
			} catch (StaleElementReferenceException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	
		// click on specific Element based on text
		public static void clickOnElementByText(List<WebElement> links, String description, String data) {
			for (int i = 0; i < links.size(); i++) {
				if (links.get(i).getText().equals(data)) {
					try {
						links.get(i).click();
						break;
					} catch (NoSuchElementException ex) {
						System.out.println(ex.getMessage());
					} catch (StaleElementReferenceException ex) {
						System.out.println(ex.getMessage());
					} catch (Exception ex) {
						System.out.println(ex.getMessage());
					}
				}
			}
		}

		//click on element by attribute
		public static void clickOnElementByTypeAttribute(WebElement element,String type)
		{ 
			try{
			   if(element.getAttribute("type").equalsIgnoreCase(type))
				{
					element.click();
				}
				
			}
			catch(NoSuchElementException ex)
			{
				System.out.println(ex.getMessage());
			}
			catch(StaleElementReferenceException ex)
			{
				System.out.println(ex.getMessage());
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		
		
		//click on element by tagname
		public static void clickOnElementByTagName(WebElement element,String tagName)
		{ 
			try{
			  if(element.getTagName().equals(tagName))
			  {  
				  element.click();
			  }
			}
			catch(NoSuchElementException ex)
			{
				System.out.println(ex.getMessage());
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		
		// get attribute values of element
				public static String getElementAttribute(WebElement element, String attribute) {
					try {
						if (element.getAttribute(attribute) == null) {
							return null;
						} else {
							return element.getAttribute(attribute);
						}

					} catch (NoSuchElementException ex) {
						System.out.println(ex.getMessage());
						return ex.getMessage();
					} catch (StaleElementReferenceException ex) {
						System.out.println(ex.getMessage());
						return ex.getMessage();
					} catch (Exception ex) {
						System.out.println(ex.getMessage());
						return ex.getMessage();
					}
				}
		
}
