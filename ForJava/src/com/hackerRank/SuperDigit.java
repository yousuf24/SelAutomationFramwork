package com.hackerRank;

public class SuperDigit {
	public static int superDigit(String n, int k) {
	    // Write your code here
	    
	    while(true){
	    	int sum=0;
	        for(int i=0;i<n.length();i++){
	            sum+=Integer.parseInt(n.charAt(i)+"");
	        }
	        
	        n=String.valueOf(sum);
	        if(n.length()==1)break; 
	    } 
	    n=n.repeat(k);
	    System.out.println(n);
	    while(true) {
	    	int sum=0;
	    	for(int i=0;i<n.length();i++) {
	    		sum+=(Integer.parseInt(n.charAt(i)+""));
	    	}n=""+sum;
	    	
	    	if(n.length()==1)break;
	    }
	    
	    return Integer.parseInt(n);
	    }

	
	public static void main(String[] args) {
		int res=superDigit("9875987598759875",2);
		System.out.println(res);
//		char i='9';
//		System.out.println(Integer.parseInt(i+""));
	}

}
