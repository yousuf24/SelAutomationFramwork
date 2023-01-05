package com.au;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyArray {

	public static void main(String[] args) {
		//Data structure
		// array is used for programming having fixed length + they can be modified. 
		// Accessing the data array is preferred. Inserting,deleting data array is not preferred
		/*
		 * PRIMITIVE (limited usage) for consuming purpose | NON PRIMITIVE (usage is profound) for transmission purpose
		 * dataTypes that comes along with programming language | wrapper classes that are derived from Object class
		 * byte, short, int, long, float/double | Object,Array, Byte,Short,Integer,Float,Double,BigInteger,BigDecimal (wrapper class) 
		 * cadbury chocolate -> chocolate + wrapper == primitive datatype + wrapper --> Non primitive dataType/wrapper class
		 * AutoBoxing | AutoUnboxing
		 * primtive dataType int id=<>; Integer ref=id; 
		 * AutoUnboxing --> viceversa of above scenario   ; Integer id=<>;  int ref=;
		 * 
		 */
		
		/*byte a=12; //8 bit data range is from -2^8 to 2^8-1 -> -256 to 255; 0000 0000 -> 1111 1111;-ve value will be analyzed by complementing bits and add 1 (2's complement) 
		short b=20;// 16 bit  -2^16 to 2^16-1
		int id=0; //32 bit
		long d=20l; // 64 bit 
		//implicit typecasting
		int a1=45;
		long b1=a;//we are trying to fit smaller database into Larger one
		
		long b2=234567777l;
		int id2=(int)b2; // we need explicit typecasting*/
		
		//array 
		/*int[] id_arr= {1,2,3,4,5};//direct declaration using {}
		
		int[] id_arr2=new int[5];// RHS size is mandatory
		for(int i=0;i<5;i++)id_arr2[i]=i+1;
		
		for(int each:id_arr)System.out.print(each+" ");
		System.out.println();
		for(int each:id_arr2)System.out.print(each+" ");
		
		Integer[] id_arr3= {1,2,3,4,5};
		Integer[] id_arr4=new Integer[5];// RHS size is mandatory
		for(int i=0;i<5;i++)id_arr4[i]=i+1;
		
		//Functions of string
		String A="Arshiya Syed";//not creating object; Stack is used; recommended to used
		String B="Arshiya Syed";
		String obj1=new String("Arshiya Syed");//object is created here; Heap memory is used
		String obj2=new String("Arshiya Syed");
		
//		boolean result=(A==obj1);//false
//		boolean result2=A.equals(obj1);//true
//		System.out.println(result);//compare references
//		System.out.println(result2);//compares content
		
		boolean result3=(A==B); //true
		boolean result4=obj1.equals(obj2);//true
		boolean result5=obj1.equals(A);//true
		boolean result6= (obj2==B);//false
		
		//.equals ()  compare only the content. Dont worry about reference
		// ==  compare reference
		System.out.println(result3+" "+result4);
		System.out.println(result5+" "+result6);*/
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%Day9 Notes%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		// Au students ; name that follows only alphabets or space (no special char, no other \\w). 
		//Id contains only digits and no decimal is allowed. 5 byte atleast
		//email should A-Za-z0-9!@#$%^&**(()).com|.in|.org
		String name="ABC";
		String domainTerminator="com";
		int id=345;
		String email="arshiyaSyed2105@gmail.com";
		//preRequisites
		/*
		A-Z
		a-z
		0-9
		meta characters []().
		
		. means any character digit/alphabet/specialchar/whitespace
		whiteSpace \s \r\n \n \u2025 tabSpace \s+
		quantifiers *?+ (repeating the string * 0 or more ? atomost 1 + atleast 1
		\\b (zero width assertion)It separates a word to non-word
		
		
		//boolean name_check=name.matches("[A-Z]*");//IUGUIAHGHEGHQOWIUGHQ
		boolean domain_check=domainTerminator.matches("(com|in|org|gov)$");$ indicates end of the string; ^ indicates start of the string
		
		System.out.println(domain_check);*/
		
		String html_code="<div name=''>Text of your choice </div>"; // \(backSlash ) is the escape char
		boolean res=html_code.matches("^<\\w+\\s\\w+=\\'\\'\\>[A-Za-z0-9_\\s]*\\<\\/\\w+\\>$");// [] () [A-Za-z0-9]
		//System.out.println(res);
				/*
				 * <a id="abcd" />
				 * or 
				 * <a name="">Text of your choice </a>
				 * [A-Za-z0-9_]   --> \\w      syed_arshiya   syed_arshiya. arshiya2002
				 * [\r\n\n\s....] --> \\W (non words | all white space characters \r\n \n tab space)
				 * [0-9] --> \\d used for only digits
				 * <tagName .na;hgawodo > </tagName>  or <tagName .../>
				 * \\' while writing regex u cant use directly few char to match the input string
				 * \\. \\, @ \\( \\) \\[ \\]
				 *     /  forward slash
				 *     \  backward slash
				 *     \\b (It separates word from non-Word)
				 */
//		String query="i read this book which is read by famous this reader";//count: 2
//		String regex="\\b(\\w+)\\b.*\\1\\b";//expression that u have formed
//		Pattern p=Pattern.compile(regex);// patterns are used for complex requirements
//		Matcher m=p.matcher(query);int counter=0;
//		while(m.find()) {
//			System.out.println(m.group()+": "+m.group(1));
//			counter++;
//		}System.out.println("\r\nrepeated words COUNT: "+counter);
		
		/*String name_str="arshiya syed";//requirement is to print * instead of space
		char[] arr=name_str.toCharArray();
		for(int i=0;i<arr.length;i++){//Conventional method uses index i
			if((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z') ) System.out.print(arr[i]+" ");
			else System.out.print(" * ");
			}
		System.out.println();
		for(char each:arr) { //enhanced for loop
			if((each>='a' && each<='z') || (each>='A' && each<='Z') ) System.out.print(each+" ");
			else System.out.print(" * ");
		}
		/*Logical operators
		 * T AND F --> F   in java use &&
		 * T  OR F --> T   use ||
		 * 
		 * 
		 */
		
		String s = "I want to eat apple. apple is a fruit.\r\n I really want fruit.";
		Pattern p=Pattern.compile("(\\b\\w+\\b)(?=[\\s\\S]*\\b\\1\\b)");
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}
	
	// (?<=\b| )([^ ]+)(?= |$).+(\1)  --> it detects first word that repeats
			// (\\b\\w+\\b)(?=.*\\b\\1\\b)        // matches duplicates only in a single line
			//(\\b\\w+\\b)(?=[\\s\\S]*\\b\\1\\b)  // or the above regex with DOTALL flag
			/*
			      Pattern p = Pattern.compile("\\b(\\w+)\\b(?=.*\\b(\\1)\\b)", Pattern.DOTALL);

	    			
	    		Matcher m = p.matcher(s);
	    		while (m.find()) {
	        		System.out.println("at: " + m.start(1) + " " + m.group(1));
	        		System.out.println("    " + m.start(2) + " " + m.group(2));
		*/
//	String test02="arshiya syed ji"; // \\b separates word to non word. ZeroWidthassertion. Word Boundary
//	Pattern p=Pattern.compile("(?<=\\b|\\s)([a-zA-Z])");// can match any substring from inputString
//	Matcher m=p.matcher(test02);int counter=0;
//	while(m.find()) {
//		System.out.println(m.group(1));counter++;
//	}System.out.println(counter);
		
		
		/*\\s -> space
		\\S --> [^\\s]
		\\w --> word
		\\W -->[^\\w]
		\\d --> digits
		\\D --> [^0-9]*/
	
//	String test03="benedit cumberbatch";
//	boolean flag3=test03.matches("[^\\s]+"); // ^ excludes the expression
//	System.out.println(flag3);
	
//	String test04="henry cavil";
//	System.out.println(test04.matches(".*(?=\\s|$).*"));
//	System.out.println(test04.matches(".+"));
		
//	String test05="a\r\nd";
//	Pattern p3=Pattern.compile(".*"); 
//	Matcher m3=p3.matcher(test05);
//	while(m3.find()) {System.out.println(m3.group());}
	

	}

}

