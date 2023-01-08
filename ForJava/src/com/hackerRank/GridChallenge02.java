package com.hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static String gridChallenge(List<String> grid) {
    // Write your code here
    	int len=grid.size(); 	
    	
        String[] row=new String[len];Arrays.fill(row, "");
        int col_len=grid.get(0).length();        
        String[] col=new String[col_len];Arrays.fill(col, "");
        
        
        for(int i=0;i<grid.size();i++){//iterate through the list
        	row[i]=Stream.of(grid.get(i).split("")).sorted((x1,x2)->x1.compareTo(x2)).collect(Collectors.joining());
        }
        System.out.println(Arrays.asList(row));
        
       
        for(int i=0;i<len;i++) {
        	String tmp=row[i];
        	for(int j=0;j<col_len;j++) {
        		col[j]+=tmp.charAt(j)+"";
        	}
        }System.out.println(Arrays.toString(col));
            	
        for(int i=0;i<col_len;i++) {
        	String tmp=col[i];
        	for(int j=0;j+1<len;j++) {
        		if(tmp.charAt(j)>tmp.charAt(j+1))return "NO";
        	}
        }
        
    return "YES";

}
}
public class GridChallenge02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("op.txt"));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                    .collect(toList());

                String result = Result.gridChallenge(grid);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

