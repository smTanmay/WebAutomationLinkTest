package link_test;

import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links_verify {
	

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		WebElement footer=driver.findElement(By.cssSelector(".navFooterVerticalRow.navAccessibility"));
		System.out.println( footer.findElements(By.tagName("a")).size());
		
		WebElement opentabs=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[3]"));
		System.out.println(opentabs.findElements(By.tagName("a")).size());
		
		Collection<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The number of links is" +links.size());
		
		for (WebElement link:links) {
			System.out.println(link.getText());
			
		}
		
		
		for (int i=1;i<opentabs.findElements(By.tagName("a")).size();i++)
		{
			String opentabsagain=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			opentabs.findElements(By.tagName("a")).get(i).sendKeys(opentabsagain); }
		
		
						
			
			
		}
		
		
			}
	

