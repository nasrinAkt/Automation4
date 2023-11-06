package com.happy.Automation4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class class2 {
@Test
public void happy() throws Exception {
System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");	
	ChromeOptions fun = new ChromeOptions();
	fun.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://fancy-pika-6b453f.netlify.app/");
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.manage().window().maximize();
	
	WebElement academics = driver.findElement(By.cssSelector("#root > div.h-screen > div:nth-child(2) > div > div.navbar-center.hidden.lg\\:flex > ul > li:nth-child(2) > a"));
	academics.click();
	
	WebElement exam = driver.findElement(By.linkText("Examinations"));
      exam.click();
	Thread.sleep(2000);
	
	WebElement lib = driver.findElement(By.linkText("Library"));
	lib.click();
	Thread.sleep(2000);
	
	WebElement stu =driver.findElement(By.linkText("Student Support"));
	stu.click();
	Thread.sleep(2000);
	
	WebElement teac = driver.findElement(By.linkText("Teachers"));
	teac.click();
	Thread.sleep(2000);
	
	WebElement notice = driver.findElement(By.linkText("Notice"));
	notice.click();
	Thread.sleep(2000);
	
	WebElement blog = driver.findElement(By.linkText("Blog"));
	blog.click();
	
	
	Thread.sleep(5000);
	driver.close();
	
	
	
	
}
	
	
	
	
	
	
	
	
}
