package com.pages;

import org.openqa.selenium.By;

import com.baseFramework.BaseClass;

public class HomePage extends BaseClass{
	public void clickSeleniumArticlesLink() {
		driver.findElement(By.xpath(readProperty("Element")));
	}
}
