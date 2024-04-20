package day6DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentMonthYearDropDown {
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//identify and click on country dropdown
		driver.findElement(By.cssSelector("yearbox")).click();
		

}
}

/*validate year and month dropdown
* 		- check multiple selection
* 		- check whether your allowed to select any option or not
* 		- validate year is in ascending order or not
* 		- validate months option are in required sequence
* */
