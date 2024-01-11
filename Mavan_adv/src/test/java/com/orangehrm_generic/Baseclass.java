package com.orangehrm_generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass implements Frame_constant
{
	public WebDriver driver;
	@BeforeMethod
	public void openApp() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--start-maximized--");
		driver= new ChromeDriver();
		driver. manage().timeouts().implicitlyWait(10,TimeUnit. SECONDS);
		driver.get(url);
		Thread.sleep(2000);
		//next year pooja bigboss cont
		
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}

}
