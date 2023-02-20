package com.au;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

@FunctionalInterface
interface intr{
	
	//String abst(int a);// all methods inside theinterface is public
	void abst();
}
public class Day25 {
	static String co ;//member attributes/class level attributes and without initialization it will print default values
	
	void method99(int a,double b) {}
	int method99(double a, int b) {return -1;}// this method has same signature as before
	
	
	 static List<Integer> li;
	public static void main(String[] args) {
		
		Day25 obj=new Day25();
		System.out.println(obj.co);
		
//		String co1;
//		System.out.println(co1);
		
//		File f=new File("");
//		try {
//			FileInputStream fi=new FileInputStream(f);
//		} catch (FileNotFoundException e) {//IOException //SQLException
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		String food=null;
//		System.out.println(food.length());//unchecked or runtime exception
		
		
		
		
		
		//Nam obj=new Nam() {void method21(){};} ;
		
		
//		intr ref0=new intr() {public String abst(int a){return ""+a;}};//implementation of an interface
//		intr ref2=a->""+a;
		
		//intr ref5=()->{System.out.println("agh asiudghasig"); li.add(10);};
		
		
	}

}
abstract class Nam{ //0 non concrete methods
	int method21(int a) {return a*a;}
	//void method22() {}
}

/*
 * --------------------------------------
OOPS - Object is the base
encapsulation - make the attributes private and use getters/setters
polymorphism - same method ezxisitng in different forms / behaving differntly in diff contexts
	static - while compilation
		method overloading
			Assert.assertEquals("ex","ac");  
			Assert.assertEquals("ex","ac","message to be thrown to user");
	dynamic - when program is run
		parent  run() , child  @Override run()
			Parent ref=new Child();// Upcasting . U can call common methods of parent/child or methods specific to parent
			ref.run(); //decision is taken at run time. It will call child class method
Abstract - Concrete and non concrete methods. 'To extend feature'
	non concrete - abstract. Method which doesn't have a body. Unimplemented methods
	    concrete - non abstract. mthod with a body / implementation
when a class has atelast 1 abstract METHOD --> should define abstrACT keyword at class level
A child class extends an abstract method, u have to either implement all bastract methods of parent of delcare child as abstract
U can't create an object of abstract
Abstract class can have 0 or more abstract methods
interface - way to achievement abstraction. It contains only abstract methods. 
	U cant create an object of interface
	Only 1 abstract method - functional interface - Lamda expression to writee consize code
	
	
	abstract class A{ void method1();}
	A object =new A(){ void method1(){ ...........}}; //implement it right away
	()=>{...........}// no object cration but implementing it
	A object = new A();//compilation error
	*/
