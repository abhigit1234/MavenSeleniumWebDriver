package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo {
public static void main(String[] args)  {
	
	ChromeOptions opt = new ChromeOptions();
	opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.findElement(By.id("imagesrc")).click();
	



}



}
