package com.au;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
class SpiderMonkey{
	void sound() {
		System.out.println("Ooh aaa ha");
	}
}
public class Day16 {
	enum Seasons{// Enums can be declared outside the class, inside class but not with in methods
		
		SPRING(100),WINTER(30),SUMMER(90),RAINY(50);
		private int points;
		private Seasons(int i){
			this.points=i;
		}
		
		public Seasons getObj() {
			return this;
		}
		
	}
	
	
	public static int fact(int num) {// they are not recommended method. DSA DFS. Stackoverflow
		int fact=1;//for 'sum' use temp variable with value 0
		
		if(num<=1)return 1;//base condition
		else return num * fact(num-1);//iterative condition
	}
	
	/*
	 * num * fact(num-1)
	 * num * (num-1) * fact(num-2)
	 * ..
	 * ...
	 * num*num-1*num-2...................................*1
	 */
	
	
	public static void stat() {
		
	}
	public static void makePattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
			
		}
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				
				System.out.print("*");
			}System.out.println();
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		//System.out.println(Seasons.RAINY);//this is how we access enum
		//Seasons.valueOf(Seasons.RAINY);
		Seasons[] arr0=Seasons.values();
		for(Seasons each:arr0) {
			System.out.println(each.name()+":"+each.points);
		}
		
		//System.out.println(fact(5));
		
//		Day16.stat();
//		Day16 obj90=new Day16();
//		obj90.stat();
		
		
		//makePattern(5);
		
		//Object[]
//		SpiderMonkey object1=new SpiderMonkey();
//		SpiderMonkey object2=new SpiderMonkey();
//		SpiderMonkey object3=new SpiderMonkey();// Business give us array of Objects
//		Object[] monkeyArray= {object1,object2,object3};//Object array
		
		
		
		
//		String name="Syed Arshiya Althaf";//.split( ) will return [Syed,Arshiya,Althaf]
//		int len=name.split(" ").length;//Function chaining
		
//		int[] array1= {99,98,97};
//		for(int each:array1) {
//			System.out.println(each);
//		}
		
		
		
		
		
		//HashSet (Order is not maintained)
		Set<Integer> uniq=new HashSet<>(); // Parent p=new Child();
		uniq.add(10);
		uniq.add(45);
		uniq.add(10);
		//System.out.println(uniq);
		
		//HashMap key:value  (key can't have duplicates, values can have duplicates); pairs
		Map<Integer,String> col=new HashMap<>();
		col.put(41, "arshiya");
		col.put(2, "Althaf");
		col.put(1, "Nani");// Updation
		//System.out.println(col);// output is based on ascending order of keys
		
		//Stack (LIFO)
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(21);
		stack.push(18);
		stack.push(99);
		//System.out.println("***********Stack Output*********");
//		while(!stack.isEmpty()) {
//			System.out.print(stack.peek()+ " ");
//			stack.pop();
//		}
			
		//System.out.println();
		//while(!stack.isEmpty()) {System.out.println( stack.pop());}
//		System.out.println(stack.peek());
//		System.out.println(stack.isEmpty());
		
		//QUEUE (FIFO)
		Queue<Integer> queue=new LinkedList<>();
		queue.add(11);
		queue.add(22);
		queue.add(33);
		//System.out.println("**********Queue output***************");
//		for(Integer each:queue) {// no use of index means its a enhanced for loop
//			System.out.print(each+" ");
//			
//		}
//		while(!queue.isEmpty()) {
//			System.out.print( queue.peek()+ " ");
//			queue.poll();
//		}
		
		
			
				BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\HI\\OneDrive\\Desktop\\Sample.txt"));
			 // compiletime exceptions (IOException, FileNotFoundException etc.)
				//RunTime Exceptions (NullPointerException, ClassCastException, IndexOutOfBoundsException, ArithmeticException)
				
				Object[] arr= {12,3,45};//non primitive dataType
				//Integer[] arr1=(Integer[]) arr;
				//System.out.println(Arrays.toString(arr1));
//				for(Object each:arr) {
//					System.out.println((Integer)each);
//				}
		
	}

}
 