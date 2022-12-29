package com.au;

import java.util.Arrays;

public class ForFunHandsOn {

	public static void main(String[] args) {
		String name="Arshiya Syed"; // ayihsrA deyS
		
		String[] arr=name.split(" ");// [Arshiya, Syed]
		String op="";
		for (String each : arr) {
			char[] localArr = each.toCharArray(); // [A,r,s,h,i,y,a] in 1st, 2nd [S,y,e,d]
			System.out.println(Arrays.toString(localArr));
			int len = localArr.length;
			for (int i = len - 1; i >= 0; i--) {
				op += localArr[i];
			}
			op += " ";

		}
		System.out.println(op.trim());

	}

}
