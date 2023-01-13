package com.au;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Wpm {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(3);
		TimeUnit.SECONDS.sleep(1);//
		System.out.println(2);
		TimeUnit.SECONDS.sleep(1);
		System.out.println(1);
		double st=LocalTime.now().toNanoOfDay();//
		Scanner s=new Scanner(System.in);		
		String input=s.nextLine();
		double en=LocalTime.now().toNanoOfDay();
		double elapsedTime=(en-st)/1000000000.0;
		System.out.println(elapsedTime);
		int wpm=(int) ((double)(input.length()/5)/elapsedTime)*60;
		System.out.println("wpm is "+wpm+"!");
		

	}

}
