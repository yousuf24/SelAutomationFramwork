package com.testScript;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.*;

import com.baseFramework.BaseClass;
import com.pages.HomePage;

public class TestScript0002 extends BaseClass {
	BaseClass basecls=new BaseClass();
	HomePage homepg=new HomePage();
	@Test
	public void readP() {
		String filePath=System.getProperty("user.dir")+"//src//com//config//config.properties";
		//BaseClass.initializeProp(filePath);
		//PropertyConfigurator.configure(System.getProperty("user.dir")+prop.getProperty("log4jRelativeFilePath"));
		
		//System.out.println("application URL-> "+BaseClass.readProperty("applicationURL"));
		//launchBrowser();
		//homepg.clickSeleniumArticlesLink();
	}
	
	@BeforeSuite
	public void su() {
		System.out.println("B4 Suite");
	}
	@BeforeTest
	public void su_test() {
		System.out.println("B4 test ie. classLevel command");
	}
	@BeforeClass
	public void su_class() {
		System.out.println("B4 class i.e. methodLevel command");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("B4 method i.e Testcase");
	}
	
	@AfterSuite	
	public void td() {
		System.out.println("tearDown Suite");
	}
	@AfterTest
	public void td_test() {
		System.out.println("tearDown classLevel");
	}
	@AfterClass
	public void td_class() {
		System.out.println("tearDown methodLevel");
	}
	@AfterMethod
	public void am() {
		System.out.println("AfterEvery Testcase");
	}

}
