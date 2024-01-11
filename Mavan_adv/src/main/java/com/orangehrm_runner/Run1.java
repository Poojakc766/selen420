package com.orangehrm_runner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.orangehrm_generic.Baseclass;

public class Run1 extends Baseclass
{
	@Test

	public void login()
	{
		
		driver. findElement(By.name("username")).sendKeys("Admin");
		driver. findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		
		
	}

}
