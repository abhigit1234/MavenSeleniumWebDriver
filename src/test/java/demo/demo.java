package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
public static void main(String[] args)  {
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.findElement(By.id("imagesrc")).click();
	



}



}
