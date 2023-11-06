package com.happy.Automation4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class class1 {

@Test
public void happy() throws Exception  {
	System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");
	
	ChromeOptions fun = new ChromeOptions();
	fun.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	
	driver.manage().window().maximize();
	
	
	WebElement sear = driver.findElement(By.name("search_query"));
	sear.sendKeys("song");
	
	WebElement n = driver.findElement(By.cssSelector("#search-icon-legacy > yt-icon > yt-icon-shape > icon-shape > div"));
	n.click();
	
	Thread.sleep(10000);
	
	driver.close();
	
	
	
}
	
	
	
	
	
	
	
	
}
