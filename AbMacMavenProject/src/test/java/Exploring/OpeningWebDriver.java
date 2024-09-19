package Exploring;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpeningWebDriver {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();    						// ctrl + space = suggestion
		
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.24.0");
		
		
		driver.findElement(By.xpath("//a[normalize-space()='selenium-java']")).click();
		
		
		driver.quit();
		
		
		
	}

}
