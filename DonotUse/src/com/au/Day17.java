package com.au;
/*
 * class Day16{
 * public String gadget="iphone 14pro max";
 * Day16(){
 * syso("inside parent");
 * }
 * 
 */
public class Day17  {
	public boolean flag;
	public double salary;
	
	//syso(super.gadget);
	//Super is used to access parent class attributes or methods
	Day17(boolean a,double b){
		super();//when we create object of child class, we need to call first parent class constructor
		this.flag=a;
		this.salary=b;
	}
	
	@Override
	public String toString() {
		return this.flag+"->"+this.salary;
	}
	public static void main(String[] args) {
		
		Day17 object0=new Day17(false,40.0);
		Day17 object1=new Day17(true,50.0);
		
		
		
		System.out.println(object0);
		System.out.println(object1);
		
//		Object md=29;//non primitive
//		if(md instanceof String )System.out.println("user enters string");
//		else if(md instanceof Integer )System.out.println("int is Entered");
		//.....
		
		
		
		 //A and B C,D,E F
		//else if ladder  
//		int marks=86;
//		if(marks>=92)System.out.println("Topper");
//		else if(marks>=85)System.out.println("High performer");// as many times as we want
//		else if(marks>=75)System.out.println("average");
//		else System.out.println("fail");// this is not mandatory, optional
		
		
		//1 min
		
		
	}

}
