package com.au;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Day13 {
	
	Day13(){
		
	}
	Day13(int a){
		a=10;
	}
	
	static void stat() {
		System.out.println("inside Day13 static method");
	}
	void method1() {
		try {
			int a=0;
			int b=10;
			if(b/a !=0)System.out.println("jdhgauighas;");
			
		}catch(ArithmeticException e) {
			System.out.println("Divide by zero error.");
		}finally {
			System.out.println("End of program execution");
		}
	}

	public static void main(String[] args) throws IOException  {
		// Q22 to be started
		//new Day13().method1();
		Day13 p=new Derived();
		Day13 p1=new Day13();
		//Derived p2=(Derived) new Day13();
		
		Day13.stat();// overriding will not happen for static methods
		Derived.stat();
		
		
		//String to primitive
		/*String key="320106715031"; // char byte short int long float double   ; boolean, bigDecimal, BigInteger, Integer, Character
		long id=Long.parseLong(key);//Integer.  or Double.		
		System.out.println(id);
		
		//primitive to string
		char c_p='A';
		String con1=c_p+"";// ""+c_p
		String con2=String.valueOf(c_p);
		String con3=Character.toString(c_p);
		double d_p=25.0;
		String conv1=d_p+"";
		String conv2=String.valueOf(d_p);
		String conv3=Double.toString(d_p);
		
		//Wrapper to String
		Integer i_p=45;
		String conversion1=i_p.toString();
		
		//String to wrapper
		String input1="33.45";
		double input1_p=Double.parseDouble(input1);
		Double input1_w=Double.valueOf(input1_p);
		
		//wrapper to primitive
		Integer num1=23456;//convert to primtive
		int num1_p=num1.intValue();//Unboxing
		Boolean f=true;
		boolean f_p=f.booleanValue();//unboxing
		
		//primitive to Wrapper
		double sal=30000.00;
		Double sal_w=Double.valueOf(sal);
		byte b=12;
		Byte b_w=Byte.valueOf(b);*/
		
		
		
//		int n1=10,n2=20;
//		boolean n=n1==n2;
		
		
		//How do u get input from user
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Pls enter either Y or N?");// convey to user
//		String input=sc.nextLine();// Y or N
//		System.out.println("Input taken from User: "+input);
//		sc.close();
		
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //from the console
//		BufferedWriter bw=new BufferedWriter(new FileWriter("test.txt"));
//		System.out.println("Pls enter yourName?");// convey to user
//		String in=br.readLine();
//		System.out.println("Your Name is "+in);
//		
//		bw.write(in);
//		bw.close();
//		br.close();
		
//		System.out.println("ahgiuogha\"o\"dghaiisdhg");
//		System.out.println("C:\\Users\\HI\\My_Items\\Job\\Softwares\\eclipse-workspace3"); 
//		System.out.println("New Line is followed\r\n"+"newLine is followd again\n"+"space is followed\s"+"afterSpace\\S\t"+"NonWhiteSpaceChar");
//		System.out.println("New Line is followed\\r\\n"+"newLine is followd again\\n"+"space is followed\\s"+"afterSpace\\S"+"NonWhiteSpaceChar");
		
//		System.out.println("a");
//		System.out.println();
//		System.out.println("b"); 
		/*a
		 * 
		 * b
		 */
		
//		System.out.print("a");
//		System.out.print("");
//		System.out.print("b");
		/*
		 * ab
		 * 
		 */
		

	}

}
class Derived extends Day13{
	
	
	static void stat() {
		System.out.println("inside derived/child");
	}
}
