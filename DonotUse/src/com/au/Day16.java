package com.au;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
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

	public static void main(String[] args) throws FileNotFoundException {	
		int[] array1= {99,98,97};
		for(int each:array1) {
			System.out.println(each);
		}
		
		
		
		
		
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
			
		System.out.println();
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
