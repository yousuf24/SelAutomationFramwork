package com.au;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;



abstract class Abs{ //ABstract class can have both abstract/non abstract methods
	
}

class Abs2{
	
	void method1() {
	}
}

public class Day12 {
	public static String evaluate(boolean condition) {
		if(condition)return  "num1 is preferred";
		else return "num2 is preferred";
	}

	public static void main(String[] args) {
		IntStream s=IntStream.of(1,2,3);
		
		
		
//		Object obj=new String("shahas"); //object dataType
//		Object ob=new Integer(23);
//		Object obj1=new Float(3.45f);
		
		
//		Random r=new Random();
//		System.out.println(r.nextInt(1000000));
		
		/*num1!=num2 ( relational operator)
		& | ^ ~		bit wise operators
		(condition)?"":"" Ternary operators
		if()System.out.println("");
		else System.out.println();*/
//		int num1=1,num2=99;
//		String result=(num1>num2)?"num1 is preferred":"num2 is preferred";
//		String result2=evaluate(num1>num2);
//		System.out.print(result+":"+result2);
		
		
		
		char c='a';char c1='r';//letter is alphanumeric [a-zA-Z0-9] //char '[a-zA-Z]'
		//A - 65 , B=66............Z=90 ..... a=97,b=98........z=122
		//System.out.println((int)'z');
		//System.out.println(c<c1);// Here < , > == can be used
		
		
		//Palindrome method-new and affective
//		String input="axuaa";// match initial vs last --> initial+1 ==last-1 --> intial+n==last-n
//		int st=0,end=input.length()-1;
//		boolean flag=true;
//		while(st<=end) {//string and index
//			if(input.charAt(st)!=input.charAt(end)) {flag=false;break;}
//			st++;
//			end--;
//		}if(flag)System.out.println("PALINDROME.");
//		else System.out.println("Not PALINDROME.");
		
		return;//optional statement when your behaviour/method used void return type
	}

}
