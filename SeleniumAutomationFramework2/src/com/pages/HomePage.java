package com.pages;

import org.openqa.selenium.By;

import com.base.BaseClass;

public class HomePage extends BaseClass {
	By xpath=By.xpath("");
	By linktext=By.linkText("");
	
	public void loadurl() {
		driver.findElement(By.xpath(readProperty("Element")));
	}

}
