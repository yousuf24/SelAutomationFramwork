package com.au;


class superclass { //parent class
	public void met(){ 
	System.out.println("Printing from superclass"); 
	}
}
public final class Day24 extends superclass{//child class
	String number;//default access specifier
	//method signature it means same method name and same no of arguments
	
	public int comm() {
		return -1;
	}
	
	public int comm(int a) {
		return a;
	}
//	public void comm() {
//		System.out.println("aghaogfhasd");
//	}
	public void comm(float in) {
		System.out.println(in);
	}
	
	
	public void displayResult(){ 
		System.out.println("Printing from Childclass"); 
		super.met();
		}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		//Child class obj and child class ref
		Day24 obj1=new Day24();
		obj1.met();// No dynamic binding . Fundamental behavior of inheritance
		
		//cloning
		Object obj_copy=obj1.clone();
		
		
		//Child class obj and Parent class ref
		superclass obj2=new Day24(); //upcasting
		//obj2.displayResult(); //dynamic binding . It looks for methods present in either only in parent class or both classes
		
		/*prim wrapper/non prim
		int Integer
		float Float*/
		
		String nm="sri";
		String nm1=nm;//direct assignment
		String nm2="sri";
		
		//to explain immutability
		String initial="mohammad";
		initial.concat("Yousuf");//it will create another copy of str value Mohammad yousuf
		System.out.println(initial);
		
		//String and Stringbuffer
		String expression="((2+(3*5))-10)*2";
		
		String op="";
		op+=expression.charAt(0);//op=op+expression.charAt(0);//not threadsafe and single threading
		
		StringBuilder sb=new StringBuilder();
		sb.append(expression.charAt(0));//threadsafe and multi threading
		//1200000  1200.000
		
		Day24 obj3=new Day24();//invoked default constructor of the class and creates an object
		Day24 obj4=obj3;//== true , .equals()
		
		//conversion of primitive to non-primitive
		int a=10;
		Integer a_w=Integer.valueOf(a);
	}

}

//class Day24_Child extends Day24{
//	
//}