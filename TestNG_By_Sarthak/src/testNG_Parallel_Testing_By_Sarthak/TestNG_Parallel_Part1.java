package testNG_Parallel_Testing_By_Sarthak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Parallel_Part1 {
	WebDriver driver;

   /* If we wish to execute one method 'tc1' in multiple threads
	* Thread means instances
	*/
	@Test(threadPoolSize = 3, invocationCount = 3)
	public void tc1() {
		System.out.println("This is TC1 logic: " + Thread.currentThread().getId());
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.get("https://www.google.co.in/");
	}

	@Test
	public void tc2() {
		System.out.println("This is TC2 logic: " + Thread.currentThread().getId());
		// We can open this with ChromeDriver also
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	
	/*
	 * Situation - methods are 2, thread-count = 2, if we run xml file It will
	 * allocate different id for 2 methods like below in console
	 * This is TC2 logic: 17 
	 * This is TC1 logic: 16
	 */
	
	@Test
	public void tc3() {
		System.out.println("This is TC3 logic: " + Thread.currentThread().getId());
	}
	
	/*
	 * Situation - methods are 3, thread-count = 2, if we run xml file It will
	 * allocate same id for 2 methods like below in console
	 * This is TC2 logic: 17 
	 * This is TC1 logic: 16
	 * This is TC3 logic: 17
	 */
}
