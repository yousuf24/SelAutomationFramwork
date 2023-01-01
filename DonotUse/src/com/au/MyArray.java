package com.au;

public class MyArray {

	public static void main(String[] args) {
		//Data structure
		// array is used for programming having fixed length + they can be modified. 
		// Accessing the data array is preferred. Inserting,deleting data array is not preferred
		/*
		 * PRIMITIVE (limited usage) for consuming purpose | NON PRIMITIVE (usage is profound) for transmission purpose
		 * dataTypes that comes along with programming language | wrapper classes that are derived from Object class
		 * byte, short, int, long, float/double | Object,Array, Byte,Short,Integer,Float,Double,BigInteger,BigDecimal (wrapper class) 
		 * cadbury chocolate -> chocolate + wrapper == primitive datatype + wrapper --> Non primitive dataType/wrapper class
		 * AutoBoxing | AutoUnboxing
		 * primtive dataType int id=<>; Integer ref=id; 
		 * AutoUnboxing --> viceversa of above scenario   ; Integer id=<>;  int ref=;
		 * 
		 */
		
		byte a=12; //8 bit data range is from -2^8 to 2^8-1 -> -256 to 255; 0000 0000 -> 1111 1111;-ve value will be analyzed by complementing bits and add 1 (2's complement) 
		short b=20;// 16 bit  -2^16 to 2^16-1
		int id=0; //32 bit
		long d=20l; // 64 bit 
		//implicit typecasting
		int a1=45;
		long b1=a;//we are trying to fit smaller database into Larger one
		
		long b2=234567777l;
		int id2=(int)b2; // we need explicit typecasting
		
		//array 
		/*int[] id_arr= {1,2,3,4,5};//direct declaration using {}
		
		int[] id_arr2=new int[5];// RHS size is mandatory
		for(int i=0;i<5;i++)id_arr2[i]=i+1;
		
		for(int each:id_arr)System.out.print(each+" ");
		System.out.println();
		for(int each:id_arr2)System.out.print(each+" ");
		
		Integer[] id_arr3= {1,2,3,4,5};
		Integer[] id_arr4=new Integer[5];// RHS size is mandatory
		for(int i=0;i<5;i++)id_arr4[i]=i+1;*/
		
		//Functions of string
		String A="Arshiya Syed";//not creating object; Stack is used; recommended to used
		String B="Arshiya Syed";
		String obj1=new String("Arshiya Syed");//object is created here; Heap memory is used
		String obj2=new String("Arshiya Syed");
		
//		boolean result=(A==obj1);//false
//		boolean result2=A.equals(obj1);//true
//		System.out.println(result);//compare references
//		System.out.println(result2);//compares content
		
		boolean result3=(A==B); //true
		boolean result4=obj1.equals(obj2);//true
		boolean result5=obj1.equals(A);//true
		boolean result6= (obj2==B);//false
		
		//.equals ()  compare only the content. Dont worry about reference
		// ==  compare reference
		System.out.println(result3+" "+result4);
		System.out.println(result5+" "+result6);

	}

}

