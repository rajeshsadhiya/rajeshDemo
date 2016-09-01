package com.selenium.gspann.yatraTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YatraTestEx {
	
	@Test
	
	public void t1() throws Exception{
		
		//launch the firefox
		WebDriver driver= new FirefoxDriver();
		
		// maximize the browser
		driver.manage().window().maximize();

		// setting timeout for implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//call URL in get method
		driver.get("http://www.yatra.com/");
		
		//verifying URL
		Assert.assertEquals(driver.getCurrentUrl(), "http://www.yatra.com/");
		
		driver.findElement(By.xpath("//div[@class='menu']/ul/li/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='header-dropdown category-ddn']/ul/li[3]/a")).click();
		
	    driver.findElement(By.xpath("//input[@id='BE_holiday_leaving_city']")).sendKeys("New Delhi");
	    driver.findElement(By.xpath("//input[@id='BE_holiday_leaving_city']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//input[@id='BE_holiday_leaving_city']")).sendKeys(Keys.ENTER);
	    
        Thread.sleep(2000);
        
	    driver.findElement(By.xpath("//input[@id='BE_holiday_destination_city']")).sendKeys("Manali");
	    driver.findElement(By.xpath("//input[@id='BE_holiday_destination_city']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//input[@id='BE_holiday_destination_city']")).sendKeys(Keys.ENTER);
		
        Thread.sleep(2000);
        //BE_holiday_search_btn
        
        driver.findElement(By.xpath("//input[@id='BE_holiday_search_btn']")).click();
		
	}

}
