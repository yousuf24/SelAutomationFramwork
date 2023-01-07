package com.hackerRank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GridChallenge {
	public static String gridChallenge(List<String> grid) {
	    // Write your code here
	    int len=grid.size();
	    String[] row=new String[grid.size()];
	    String[] col=new String[grid.size()];Arrays.fill(col, "");
	    for(int i=0;i<len;i++){
	        row[i]=Stream.of(grid.get(i).split("")).sorted((x1,x2)->x1.compareTo(x2)).collect(Collectors.joining());
	    }
	    System.out.println(Arrays.asList(row));
	    for(int i=0;i<len;i++){
	        String tmp=row[i];
	        for(int j=0;j<len;j++){
	            col[j]+=tmp.charAt(j);      	
	            
	        }
	    }System.out.println(Arrays.toString(col));
	    
	    for(int i=0;i<len;i++) {
	    	String tmp=col[i];
	    	for(int j=0;j+1<tmp.length();j++) {
	    		System.out.println();
	    		if(tmp.charAt(j+1)<tmp.charAt(j))return "NO";
	    	}
	    }
	    
	return "YES";
	    }
	public static void main(String[] args) {
		String[] arr={"uxf", "vof","hmp"};
		System.out.println(gridChallenge(Arrays.asList(arr)));

	}

}
