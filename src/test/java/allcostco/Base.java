package allcostco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Base {
	@Test
	public void openBrowser() {
		WebDriver dr = new HtmlUnitDriver();
		
		ChromeOptions c=new ChromeOptions();
		c.setHeadless(true);
		
		dr.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Title is"+" "+dr.getTitle());
		System.out.println("pageSource:"+" "+dr.getPageSource());
		
	}

}
