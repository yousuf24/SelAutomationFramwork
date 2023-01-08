package com.hackerRank;

import java.util.Arrays;

public class Bribe {
	public static void swap(int[] A,int i1,int i2) {
		int temp=A[i1];
		A[i1]=A[i2];
		A[i2]=temp;
	}

	public static void main(String[] args) {
		int[] arr= {1, 2 ,5, 3 ,7, 8, 6, 4};int len=arr.length,bribe=0;
		//print too chaotic if person bribes more than 2 persons else print no of bribes
		//initial state of an array {1,2,3,4,5}
		boolean green=true;
		for(int i=len-1;i>=0;i--) { //ideally arr[i]=i+1; and it can be (i+1)-2 to (i+1)+2. Idea is to bring back to initial state
			
			if(arr[i]!=i+1) {
			if(i-1>=0 && arr[i-1]==i+1) {bribe++; swap(arr,i-1,i);}
			else if(i-2>=0 && arr[i-2]==i+1) {bribe+=2;swap(arr,i-2,i-1);swap(arr,i-1,i);}
			else green=false;
			
			}
		}
		//System.out.println(Arrays.toString(arr));
		//Get length of an array arr[i]-1 will be index; i+1 will be the element
		//System.out.print("No fo bribes: "+bribe +"\r\n"+Arrays.toString(arr));
		if(green)System.out.println(bribe);
		else System.out.println("Too Chaotic");

	}

}
