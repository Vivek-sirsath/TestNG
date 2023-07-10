package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Webdriver_Test {

	@Test
	public void login_Test() throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ecomadmin.realmlmsoftware.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUser']")).clear();
		driver.findElement(By.xpath("//input[@id='txtUser']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPass']")).clear();
		driver.findElement(By.xpath("//input[@id='txtPass']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='buttLogin']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Administrator Panel");
		System.out.println(driver.getTitle());
	
		driver.close();	
	}
	
	
}