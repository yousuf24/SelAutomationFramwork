package com.testScripts;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.*;

import com.base.BaseClass;
import com.pages.HomePage;

public class TestScript0001 extends BaseClass {
	static String filePath=System.getProperty("user.dir")+"//src//com//config//config.properties";
	BaseClass basecls=new BaseClass();
	HomePage hp=new HomePage();
	@Test
	public void testcase01() {
		initializeProp(filePath);
		PropertyConfigurator.configure(System.getProperty("user.dir")+"//src//com//logs//log4j.properties");
		
		launchBrowser();
		//hp.loadurl();
		//logging.info("Browser About to be Launched.");
		driver.close();
		//logging.info("BrowserClosed.");
		
	}

}
