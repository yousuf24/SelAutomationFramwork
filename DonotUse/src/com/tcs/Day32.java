package com.tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
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
		//Comparator<Day32> comp=Comparator.comparing();
		//int result=Collections.binarySearch(li, 0, Comparator.comparing(null));
		//System.out.println(result);
		li.sort((a,b)->a-b);
//		System.out.println(li);
//		li.sort((a,b)->b-a);		
//		System.out.println(li);	
		
		//TODO Reverse an array without creating a new array ( pivot around mid point and use i, len-1-i equality
		int[] arr1=new int[] {1,2,3,4,5,6};int len=arr1.length;
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
		
		//TODO stream of int[] , use flatpMapToint and filterToarray
		//TODO Recommended way when u do string reverse operation/ or any operation on object is to check if object is null to avoid null pointer exception
//		String country = null;//"canada";
//		if(country.isEmpty() && country!=null)//
//			System.out.println(country.length());
		//TODO normalize a string (lowercase, trim(), replace(<whiteSpace>))
		String sentence="     Background       ";
		sentence=sentence.trim();//.replaceAll("\\W", "");
		System.out.println("*"+sentence+"*");
		//TODO pwdFair, .chars().anyMatch ; isAllUpper  .chars().allMatch()
		//TODO use stream concept and  .findFirst()
		//TODO find commonElements given two arrays
		//TODO merge two arrays without defining/decaring new array
		int[] A= {10,1,18,7},B= {10,90,99,21,18,7};
		Set<Integer> uniq=new HashSet<>();
		
		Set<Integer> dups=Stream.of(A,B)
		.flatMapToInt(Arrays::stream)
		.boxed()
		.filter(x->!uniq.add(x)).collect(Collectors.toSet());
		//System.out.println(dups);
		
		
		
		
		
		//Source: Mar23_11.java 
		

	}

	
	

}
