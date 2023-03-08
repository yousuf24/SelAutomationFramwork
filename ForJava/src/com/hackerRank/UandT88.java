package com.hackerRank;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class UandT88 {
	public static void swap(List<Integer> A,int i1,int i2) {
		int temp=A.get(i1);
		A.set(i1, A.get(i2));
		A.set(i2, temp);
	}

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(1);li.add(5);li.add(3);li.add(4);li.add(2);
		swap(li,0,4);
		//System.out.println(li);
		
		String nm="anupriya";
		String nm2="k",ln="a";
		
//		char i1='s';//97+18 -->115
//		char i2='z';//  122
//		System.out.println(i1<i2);
		//65 A +25==90 Z
		//97 a +25==122 z
		
		
		
//		System.out.println(nm2.charAt(0)>ln.charAt(0));
//		System.out.println(nm.substring(0));//
//		String mod=Stream.of(nm.split("")).sorted((x1,x2)->x1.compareTo(x2)).collect(Collectors.joining());
//		System.out.println(mod);

	}

}

