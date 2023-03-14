package com.tcs;

public class ReverseAWord {
	public static String reverse(String in) {
		return new StringBuilder(in).reverse().toString();
	}

	public static void main(String[] args) {
		String sentence="My name is arshiya i am working on java Programming";
		StringBuilder sb=new StringBuilder();//.reverse()		
		
		
		for(String each:sentence.split(" ")) {
				sb.append(reverse(each));
				sb.append(" ");
		}
		System.out.println(sb.toString());
	}

}
