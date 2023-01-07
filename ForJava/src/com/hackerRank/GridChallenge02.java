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

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
    // Write your code here
    	int len=grid.size(); 	
    	
        String[] row=new String[len];Arrays.fill(row, "");
        String[] col=new String[len];Arrays.fill(col, "");
        
        for(int i=0;i<grid.size();i++){//iterate through the list
        	row[i]=Stream.of(grid.get(i).split("")).sorted((x1,x2)->x1.compareTo(x2)).collect(Collectors.joining());
        }
       // System.out.println(Arrays.asList(row));
        try {
        for(int i=0;i<len;i++){
            String tmp=row[i];
            for(int j=0;j<len;j++){
                //if(j==0) col[j]+=tmp.charAt(j);
                col[j]+=tmp.charAt(j);
                               
                
            }
        }//System.out.println(Arrays.toString(col));
        }catch(StringIndexOutOfBoundsException e) {return "NO";}
        for(int i=0;i<len;i++) {
            String tmp=col[i];
            for(int j=0;j+1<tmp.length();j++) {
                System.out.println();
                if(tmp.charAt(j+1)<tmp.charAt(j))return "NO";
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

