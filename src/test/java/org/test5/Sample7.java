package org.test5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample7 {
	WebDriver driver;
	@AfterClass
	private void browserlaunch() {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Orgin\\chrome\\chromedriver.exe" );
	driver=new ChromeDriver();
		}
	@Test
	@Parameters({"username","password"})
	private void login(String user,String pass) {
			// TODO Auto-generated method stub
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys(user);
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys(pass);
	}
}
