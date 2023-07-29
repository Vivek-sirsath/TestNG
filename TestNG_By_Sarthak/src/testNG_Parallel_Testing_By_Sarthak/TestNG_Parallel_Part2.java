package testNG_Parallel_Testing_By_Sarthak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Parallel_Part2 {
	WebDriver driver;

   /* If we wish to execute one method 'tc1' in multiple threads
	* Thread means instances
	*/
	@Test
	public void tc4() {
		System.out.println("This is TC4 logic: " + Thread.currentThread().getId());
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}

	@Test
	public void tc5() {
		System.out.println("This is TC5 logic: " + Thread.currentThread().getId());
		// We can open this with ChromeDriver also
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();     // We can open this with ChromeDriver also
		driver.get("https://www.iloveimg.com/convert-to-jpg/webp-to-jpg");
	}	
}
