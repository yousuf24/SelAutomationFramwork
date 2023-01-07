package com.hackerRank;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UandT88 {

	public static void main(String[] args) {
		String nm="anupriya";
		String nm2="k",ln="a";
		System.out.println(nm2.charAt(0)>ln.charAt(0));
		System.out.println(nm2.substring(0));
		String mod=Stream.of(nm.split("")).sorted((x1,x2)->x1.compareTo(x2)).collect(Collectors.joining());
		System.out.println(mod);

	}

}
