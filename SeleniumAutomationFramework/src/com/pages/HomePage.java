package com.pages;

import org.openqa.selenium.By;

import com.baseFramework.BaseClass;

public class HomePage extends BaseClass{
	public static By ele=By.xpath(readProperty("Element"));
	public void clickSeleniumArticlesLink() {
		driver.findElement(ele);
		System.out.println(driver.getTitle());
	}
}
