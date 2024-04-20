package day3browseoperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	

		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			//identify username and password from the application and store it into a variable
			String userName=driver.findElement(By.className("oxd-text")).getText();
			System.out.println("Username: "+userName);
			
			
			
			String passwordName=driver.findElement(By.className("oxd-text")).getText();
			System.out.println("Password name: "+passwordName);
			
			//identify username
			driver.findElement(By.className("oxd-input")).sendKeys("Admin");
			
			//identify password
			driver.findElement(By.className("oxd-input")).sendKeys("Admin123");
			
			//Identify login button
			driver.findElement(By.className("oxd-button" )).click();
			
			
			
					
			

		}

	}
	/*
	https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

	get the username and password from the application and store it into a variable

	enter username 
	enter password
	click on login button
	*/

