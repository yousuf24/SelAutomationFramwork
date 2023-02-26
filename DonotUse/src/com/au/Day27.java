package com.au;
import java.util.*;
abstract class Animal{
	
}
class Dog extends Animal{
	void sniffs() {
		System.out.println("HEY i can sniff unlike human beings and detect criminal");
	}
}
class Cat extends Animal{
	void screech() {
		System.out.println("HEY i put a mark on your skin");
	}
}
class P{
	P(){
		System.out.println("i am parent");
	}
	void method1() {
		
	}
}
public class Day27 extends P {
	
	Day27(){
		//by default it will invoke parent class constructor
		System.out.println("default constructor");
	}
	Day27(String a){
		this();	  //super(); or	
		System.out.println(a);
		
	}
	Day27(int a){
		System.out.println(a);
	}
	private class DayPc{
		
	}
	//@Override to override we must use same return type along iwth same signature
//	int method1() {
//		return 0;
//	}
	
	//Dog - fundamental nature of dog  sniffs, bark
	// 4 legs, color, height, sniffing cap, sleep
	// behaviors sniffs, bark
	//static int dogCounter=0;
	//dogCounter static static{ ++counter;} // to increment counter at constructor{counter++;}
	//ClassName.<StaticMethod> instead of instance
 	static void methodS() {
		System.out.println("inside static");
	}
	

	public static void main(String[] args) {
		String str1=new String("raji");
		StringBuffer sb=new StringBuffer("raji");
		
		//str1.compareTo(sb.toString());
	System.out.println(	str1.equals(sb));
	//System.out.println(	str1==sb);
	
	Boolean i=true;
	System.out.println(((Object)i));
		
		
//		new Day27("Raji");
//		Enumeration<String> intf;
		
//		Day27 obj=new Day27();
//		//obj.methodS();
//		Day27.methodS();//recommended of calling static method
//		String pwd="Amfc@1234";
//		if(pwd.length()<8)System.out.println("it should be >=8");
//		if(pwd.equals(pwd.toLowerCase())==false)System.out.println("Ucase fails");
//		if(!pwd.matches(".*[0-9].*"))System.out.println("should ocntrain atleast 1 no");
//		if(pwd.matches("[A-Za-z0-9]*"))System.out.println("should contain spl char");
//		if(pwd.equals("ABCD_1234"))System.out.println("no old pwd");
//		if(pwd.toLowerCase().contains("johndoe".toLowerCase()))System.out.println("no old pwd");
		
		/*Tip program for today

Password that should have length>=8
have atleast one Upper case
has atleast one number
should have atleast special char !@#$%^&*()_=-":>?<,./';
SHouldn't be equal to old password: ABCD_1234
shouldn't contain johndoe

Additional tips:
public sealed class Shape permits Rectangle,Circle{}
sealed class controls who can inherit

is below declaration of class allowed

public class final Square extends Rectangle{}

typecasting:
Animal sasha=new Dog();
((Cat)sasha).screech(); --> use it only when casted type is subclass of type of one in question

Remember : u can cast it to the parent but you can't cast it to the child
instanceof operator
Abstract classes can't be instantiated but it defines behavior and pushes the burden of implementation to subclasses.
	They are like templates meant to be used by subclasses

		 * 
		 * 
		 */

	}

}
