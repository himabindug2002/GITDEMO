package hotelAdactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Adactin {

	public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://adactinhotelapp.com/");
  	    driver.findElement(By.id("username")).sendKeys("himabindu1417");
  	    driver.findElement(By.id("password")).sendKeys("2002BINDU");
  	    driver.findElement(By.id("login")).click();
		system.out.println("Git");
		system.out.println("added new line to tigger");

	}

}
