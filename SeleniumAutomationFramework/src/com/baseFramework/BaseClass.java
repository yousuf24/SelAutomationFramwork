package com.baseFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;

import com.testScript.TestScript0001;

public class BaseClass {//EveryClass in framework extends baseclass
	
	public static WebDriver driver;
	protected static Properties prop;
	static FileInputStream fi;
	static File file;
	protected static Logger logging=Logger.getLogger(TestScript0001.class);
	
	public static void initializeProp(String filePath) {
		
		file=new File(filePath);
		try {
			fi=new FileInputStream(file);
			prop=new Properties();
			prop.load(fi);
			
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();
			System.out.println("FileNotFound "+e.getMessage());
		} catch (IOException e) {
			
			//e.printStackTrace();
			System.out.println("IOException "+e.getMessage());
		}
	}
	public static String readProperty(String in) {
		return prop.getProperty(in);
	}
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", readProperty("ChromeDriverPath"));
		driver=new ChromeDriver();
		//System.out.println(readProperty("applicationURL"));
		driver.get(readProperty("applicationURL"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.close();
	}

}
