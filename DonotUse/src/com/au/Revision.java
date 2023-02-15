package com.au;
import  java.lang.*;


class Parent{
	Parent(){};
	
	
	void ohio() throws Exception {
		int variable=0;
		
		if(variable==0)throw new Exception("Variable can't be zero");
		else System.out.println("Inside parent");
		
		return;
	}


//Garbage collection (not being used unassinged references, unused objects for long time)
//finalize() method is pen Ultimate step to GC
// 64 bit archi    BYTE1 BYTE2........BYTE8  00000001 00000000 000................
	byte a=100; // -2^8 to 2^8-1  (8bits or 1 byte)
	char c='\0'; // 2 byte of data (16 bits) range: -2^16 to +2^16-1
	short b=200; // 16 bits  (16 bits or 2 bytes)
	//int 
	long d=12345669988765655l;
	char ch='a';// ASCII 65 to 90 and 97 to 122

	int sum(int[] arr) {
		int total=0;
		
//		for(int i=0;i<arr.length;i++) {
//			total+=arr[i];
//		}
		
		for(int e:arr)total+=e;
		
		return total;
	}

	
	
}
public class Revision extends Parent {
	void ohio(int a) {
		System.out.println("Inside Child"+a);
	}

	public static void main(String[] args) {
		String a="abc";
		String b="abc";
		
		String str=new String("abc");
		
//		Object[] arr= new Object[10];
//		arr[0]=1;
//		arr[1]="ali";
//		arr[2]=true;
		
		System.out.println(1/0);
		
		//Page 21 will resume tomorrow Feb162023'
		
		
		//System.out.println(" Java is \"cool\" \\ \\ \\") ; 
		
//		System.out.println(a==b);//true
//		System.out.println(a.equals(b));
		
//		System.out.println(a.equals(str));
//		System.out.println(a==str);//false
		
		
		
//		Parent p=new Revision();// u will be able to use common methods present in both classes or methods in parent
//		p.ohio();//child class method will be
		
//		String nm="alilaA";
//		
//		int i=0, j=nm.length()-1;
//		boolean flag=true;
//		
//		while(i!=j ) {
//			if(nm.charAt(i)!=nm.charAt(j)) {flag=false;break;}
//			i++;j--;
//		}
//		
//		if(flag)System.out.println("PALINDROME TRUE");
//		else System.out.println("PALINDROME FALSE");

	}

}
