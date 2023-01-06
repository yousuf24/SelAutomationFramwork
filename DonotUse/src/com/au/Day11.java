package com.au;
interface BaseI{
	String token="";//Implicitly they are public static
	abstract void method();//implicitly public
	abstract void method3();
}
abstract class BaseA{
	void method1() {};
	abstract void method2();
}
public class Day11 extends BaseA implements BaseI  {
	private static final long id=320106715031l; // dont use private keyword within the methods, define them only at class level 
	//static methods can only access static attributes/methods. where as non static can access both
//	public void method1() {
//		
//		
//	}
//	public static void method2() {
//		
//	}
	
	
	public static void main(String[] args) {
		//float is less precise and double is more precise
		// when u divide int/int it always results in int
		
		
//		int num1=100,num2=3;
//		float res=(float)num1/num2;
//		double res1=(double)num1/num2;//-> 33.0 it is 
//		int res2=num1/num2;
//		System.out.println(res2+":"+res+":"+res1);
		String color="green";
		
		switch(color) { // conditional item
		case "yellow":System.out.println("It is reflective in nature");break;
		case "green":System.out.println("sign of success");break;
		default :System.out.println("No such in database");
		}
		
		//id=320106715039l;

	}
	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void method2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	

}
