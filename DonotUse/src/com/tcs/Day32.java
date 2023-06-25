package com.tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day32 implements Comparator<Integer> {
	public int id;
	public static int binaryS(int[] arr,int toF) {
		return -1;
	}
	@Override
	public int compare(Integer o1, Integer o2) {		
		return o1-o2;
	}
	
	public static void main(String[] args) {
		//TODO Binary Search
		Integer[] arr= {1,2,3,4,5,6,7,88,0};
		List<Integer> li=Arrays.asList(arr);//List.of(1,2,3,4,56,7,87,8,0);
		//System.out.println(li);
		//String outputAsStr=Arrays.toString(arr);
		
		//Comparator<Day32> comp=Comparator.comparing();
		//int result=Collections.binarySearch(li, 0, Comparator.comparing(null));
		//System.out.println(result);
		
		li.sort((a,b)->a-b);//lambda expression for Comparator
//		System.out.println(li);
//		li.sort((a,b)->b-a);		
//		System.out.println(li);	
		
		//TODO Reverse an array without creating a new array ( pivot around mid point and use i, len-1-i equality
		int[] arr1=new int[] {1,2,3,4,5,6,7};int len=arr1.length;
		for(int i=0;i<len/2;i++) {//arr[i]=arr[len-1-i] ; //reversed array
			int temp=arr1[i];			
			arr1[i]=arr1[len-i-1];
			arr1[len-i-1]=temp;
		}
		//System.out.println(Arrays.toString(arr1));
		
		//TODO takes two array and returns an array with even Number
		int[] A1= {2,4,6,7},B1= {0,1,2,8,9,10};		
		
		Object[] resultArray=Stream.of(A1,B1)//Stream<int[]>
		.flatMapToInt(x->Arrays.stream(x))//IntStream
		.boxed()//Stream[Integer]
		.filter(x->x%2==0 && x!=0)
		.toArray();
		
		int[] resultArray1=Stream.of(A1,B1)//Stream<int[]>
				.flatMapToInt(x->Arrays.stream(x))//IntStream
				.filter(x->x%2==0 && x!=0)
				.toArray();
		//System.out.println(Arrays.toString(resultArray));
		
		//Convert list into an array using stream
		List<Double> listD=new ArrayList<>(List.of(1.0,2.3,4.1));
		Double[] listDToArr=listD.toArray(new Double[] {});
		System.out.println(Arrays.toString(listDToArr));
		
		Float[] arrF=new Float[] {1.0f,2.3f,3.4f};
		List<Float> arrFToList=Arrays.asList(arrF);	
		System.out.println(arrFToList);
		
		List<Integer> list01=new ArrayList<>(List.of(1,2,3));//immutable list
		int[] arrFromList=list01.stream().mapToInt(x->x.intValue()).toArray();
		
		int ash1=99;
		Integer ash1ToW=Integer.valueOf(ash1);
		
		Integer ash2=90;
		int ash2ToP=ash2.intValue();
		
		//TODO stream of int[] , use flatpMapToint and filterToarray
		//TODO Recommended way when u do string reverse operation/ or any operation on object is to check if object is null to avoid null pointer exception
//		String country = null;//"canada";
//		if(country.isEmpty() && country!=null)//
//			System.out.println(country.length());
		//TODO normalize a string (lowercase, trim(), replace(<whiteSpace>))
		String sentence="     Background       ";
		sentence=sentence.trim();//.replaceAll("\\W", "");
//		\\d - digit
//		\\D - [^digit]
//		\\s - space
//		\\w - word
//		\\W - [^word]
		System.out.println("*"+sentence+"*");
		//TODO pwdFair, .chars().anyMatch ; isAllUpper .allMatch()
		String name="Scarlett johnson";//output of .chars() -->Stream<s c a r l e t t.....>
		//System.out.println(Arrays.toString( name.chars().toArray()));
		
		boolean ifPExist=name.chars().anyMatch(x->x=='j');
		System.out.println(ifPExist);
		
		int[] A= {10,1,18,7},B= {10,90,99,21,18,7};
		//TODO use stream concept and  .findFirst() based on condition if it is even
		Optional<Integer> opI=Stream.of(A,B)   //stream<int[]>
		.flatMapToInt(Arrays::stream) //single stream ( IntStream)
		.boxed() //stream<Integer>
		.filter(x->x%2==0 && x!=0) //Stream<Integer> but it doesn't contain all elements 
		.findFirst();//get the first element
		
		opI.ifPresent(System.out::print);//it will print on the console if integer exist;
		
		
		//TODO merge two arrays without defining/declaring new array
		
		//.boxed() any primitive to non primitive
		int[] arr000=
		Stream.of(A,B)
		.flatMapToInt(Arrays::stream) //single stream ( IntStream)
		.toArray();
		
		Object[] arr001=
		Stream.of(A,B)
		.flatMapToInt(Arrays::stream) //single stream ( IntStream)
		.boxed()//streamof integers
		.toArray();		
		
		//If u have two arrays and u want to find the common elements between the two arrays
		//TODO find commonElements given two arrays
		Set<Integer> uniq=new HashSet<>();//collecting only unique elements
		uniq.add(1);//true
		uniq.add(1);//false
		
		Set<Integer> dups=
		 Stream.of(A,B) //converting two int[] into stream(int[])
		.flatMapToInt(Arrays::stream)//it will convert into single stream intStream
		.boxed()//Stream<Integer>10,1,18,7,10,90,99,21,18,7
		.filter(x->!uniq.add(x))// 18,7,10
		.collect(Collectors.toSet());
		//System.out.println(dups);
		//Source: Mar23_11.java 
		

	}

	
	

}
