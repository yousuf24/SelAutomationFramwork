package com.au;

class RubbishException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	RubbishException(String msg){
		super(msg);
	}
}

interface Intf{
	public static  int ID = 0;// by default the attributes are public static  and final
	void method2();// it is public
	
	public static void method3() {
		return;
	}
	default void method4() {// default here is not the access specifier
		
	}
}

public class Day26  implements Intf {
	private String foodCoupon;
	
	//static int id=1;//global at class level
	Day26(){
		System.out.println("default constructor");
	}
	Day26(int i){
		this();
		String local=		this.foodCoupon;
	}
	

	
public static void main(String[] args) throws RubbishException {
		String nm="rajiS";//doesn't create an object
		String nm2=new String("RajiS");//object
		
//		System.out.println(nm==nm2);//compre references
//		System.out.println(nm.equals(nm2));//compares content
//		System.out.println(nm.equalsIgnoreCase(nm2));//content and ignores case
		
//		ID+=1;
		
		if(nm.contains("X"))System.out.println();
		else throw new RubbishException("Please add a String that contains X character");

		/*
		 * 
		 * if uhandle exception or else
		 */
	}
	
	public static void method1() {
		
		/*
		 * 
		 * 
		 * handling is not done
		 * 
		 */
		
	}

	@Override
	public
	 void method2() {
		// TODO Auto-generated method stub
		
	}

}
