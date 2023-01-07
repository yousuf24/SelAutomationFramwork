package com.hackerRank;

public class PalindromeIndex {
	public static boolean isP(String in,int left,int right){
        while(left <= right) {
        	if(in.charAt(left)!=in.charAt(right))return false;
        	left++;
        	right--;
        }return true;
    }
	public static int findI(String s) {
		
		int left=0,right=s.length()-1;
		if(isP(s,left,right))return -1;
		
		while(left <=right) {
			if(s.charAt(left)!=s.charAt(right)) {
			 
			 if(isP(s,left,right-1)) {return right;}
			 else {if(isP(s,left+1,right))return left;}
		 }left++;right--;
		
		}return -1;
		
	}

	public static void main(String[] args) {
		System.out.println(findI("aaab"));
		
		/*
		int toR=0;
		String s="baa";
        if(isP(s))toR=-1;
        else{
        char[] arr=s.toCharArray();int len=arr.length;
        char[] tem=arr;
        char util=Character.MIN_VALUE;
        for(int i=0;i<len;i++){
            arr=s.toCharArray();
            arr[i]=util;
            String temp=String.copyValueOf(arr).replace(util+"", "");
            System.out.println(temp);
            if(isP(temp))toR=i;
        }
        }*/

	}

}
