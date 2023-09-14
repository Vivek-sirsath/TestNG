package testNG_By_Prachi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization_Google_Search {
	
	@Parameters("keyword")
	@Test	
	public void googleSearch(String searchData) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\EDUCATIONAL\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		Thread.sleep(3000);
			
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(searchData);
		
		Assert.assertEquals(searchData, searchBox.getAttribute("value"));
		
	}
}
