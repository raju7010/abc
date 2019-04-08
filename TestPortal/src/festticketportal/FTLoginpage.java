package festticketportal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class FTLoginpage {

	public static void main(String[] args) {
				 	
	System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chrome driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.festicket.com/");
	driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		//Login as a Registered User

	driver.findElement(By.xpath("//*[@id=\"root\"]/main/nav/ul/li[6]/div/button")).click();

	
	driver.findElement(By.xpath("//*[@id=\"emailInput\"]")).sendKeys("madhavitest774@gmail.com");
	
	driver.findElement(By.xpath("//*[@id=\"passwordInput\"]")).sendKeys("Abcd1234@@@");
	
	driver.findElement(By.xpath("//*[@id=\"submitButton\"]/span")).click();
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/main/nav/div/a")).click();
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	
	
	}

}
