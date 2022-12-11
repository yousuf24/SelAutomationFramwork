package com.testScript;

import com.baseFramework.BaseClass;

public class UandT01 extends BaseClass{

	public static void main(String[] args) {
		String filePath=System.getProperty("user.dir")+"//src//com//config//config.properties";
		initializeProp(filePath);
		System.out.println("application URL-> "+readProperty("applicationURL"));

	}

}
