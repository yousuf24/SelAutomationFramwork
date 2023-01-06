package com.au;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex02 {

	public static void main(String[] args) {
		// Remove trailing and leading spaces
		String input="            yousuf Mohammad   ";
		Matcher m=Pattern.compile("(?:^\\s+.*)(?:.*\\s+$)").matcher(input);
		Matcher m2=Pattern.compile("^(\\s+)[a-zA-Z ]*(\\s+)$").matcher(input);//used below
		String mod="";
		
		while(m2.find()) {
			mod=input.replaceAll(m2.group(1)+"|"+m2.group(2), "");
			input=mod;
			}
		//System.out.println(mod);
		
		//System.out.println(input.replaceAll("(^\\s+|\\s+$)", ""));//simple way to get rid of leading/trailing spaces
		//System.out.println(input.trim());
		
		/* consists of tic or tac.
		tic should not be immediate neighbour of itself.
		The first tic must occur only when tac has appeared at least twice before.*/
		String key="tactactic";
		System.out.println(key.matches("^tac|tac{2,*}(tic(tac)+)*(tic)?$"));
		
		
		
		
	}

}
