package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
	public static void main(String[] args) {
		//
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net");
		System.out.println("Page title is " + driver.getTitle());
		
	    // Find the About Us link and click it
        driver.findElement(By.linkText("About Us")).click();
        
        // Print the page title of the About Us page
        System.out.println("New page title is: " + driver.getTitle());
		
		
		//driver.close(); //close the active tab
		//driver.quit();//close the entire browser
		
		
	}

}