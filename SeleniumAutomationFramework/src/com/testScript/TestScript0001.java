package com.testScript;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.*;
import com.baseFramework.BaseClass;
import com.pages.HomePage;


public class TestScript0001 extends BaseClass{
	BaseClass basecls=new BaseClass();
	HomePage homepg=new HomePage();
	String filePath=System.getProperty("user.dir")+"//src//com//config//config.properties";
	
	@Test(enabled=true)
	public void readProp() {
		logging.info("INFO: in testcase->readProp");
		System.out.println("Reading Property "+BaseClass.readProperty("applicationURL"));
	}
	@Test(enabled=true)
	public void POMTest() {
		logging.info("INFO: in testcase->POMTest");
		launchBrowser();
		homepg.clickSeleniumArticlesLink();
	}
	
	@BeforeMethod
	public void b4Method() {
		logging.warn("WARN: Inside b4Method");
	}
	@BeforeClass
	public void b4Class() {
		logging.info("INFO: inside BeforeClass");
	}
	@BeforeTest
	public void b4Test() {
		logging.warn("WARN: Inside b4Test");
	}
	@BeforeSuite
	public void b4Suite() {
		initializeProp(filePath);
		PropertyConfigurator.configure(System.getProperty("user.dir")+prop.getProperty("log4jRelativeFilePath"));
		logging.info("INFO: inside BeforeSuite");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		logging.info("INFO: Inside afterMethod");
	}
	@AfterTest
	public void afterTest() {
		logging.error("ERROR: Inside afterTest");
	}
	@AfterClass
	public void afterClass() {
		logging.info("INFO: inside afterClass");
	}
	@AfterSuite
	public void afterSuite() {
		logging.info("INFO: inside AfterSuite");
	}

}
