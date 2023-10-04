package com.facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookTest {
	WebDriver driver;


@BeforeTest

public void openBrowser() {
	WebDriver driver=new ChromeDriver();
	
}
@Test
public void openApplication() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
public void loginTest() {
	driver.findElement(By.id("email")).sendKeys("tanita12@hmail.com");
	driver.findElement(By.id("pass")).sendKeys("123tan");
	driver.findElement(By.name("login")).click();
}



}