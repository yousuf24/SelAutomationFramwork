package com.au;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.IntStream;
class Monkey{
	static void makeSound() {
		System.out.println("ooh aah aah");
	}
}
public class Day15 {
	void method25() {
		return ;
	}
	void method26(int n) {
		for(int i=0;i<n+5;i=i+1) {//i=i+1; i-> 0 to 9  , j-> 0 to 4 --> 50 iterations
			for(int j=0;j<n;j++ ) {
				System.out.println("i: "+i+" j: "+j);
			}
		}
		
	}
	
	void method27() {
		return;      // nothing , null, void . Object can have null
	}

	public static void main(String[] args) throws IOException {
		String name="";
		
		
		
//		Monkey obj2 = null; // "" is not same as null and void is not same as null
//		System.out.println(obj2);
		
		
//		Day15 obj1=new Day15();
//		obj1.method26(5);
		
		//System.out.println(System.currentTimeMillis());
		
		
//		Date d=new Date();
//		SimpleDateFormat timeFormat=new SimpleDateFormat("hh:mm:ss");
//		SimpleDateFormat dateFormat=new SimpleDateFormat("MM/DD/YYYY");
//		SimpleDateFormat weekday=new SimpleDateFormat("EEEE");
//		SimpleDateFormat clock=new SimpleDateFormat("hh:mm:ss a");
//		
//		System.out.println(timeFormat.format(d));//time
//		System.out.println(dateFormat.format(d));
//		System.out.println(weekday.format(d));
//		System.out.println(clock.format(d));
//		
		//Take input from file
//		File f=new File("C:\\Users\\HI\\My_Items\\Job\\INFY\\LEX\\Java\\SessionWithIntern\\Day2_Javasession.txt");
//		Scanner s=new Scanner(f);
//		FileWriter fw=new FileWriter("C:\\Users\\HI\\OneDrive\\Desktop\\Sample.txt");
//		String fileContent="";
//		while(s.hasNextLine()) {
//			//System.out.println(s.nextLine());
//			fileContent=fileContent.concat(s.nextLine()+"\r\n");//it captures line1. FileContent="line1\r\nline2"
//			
//		}
//		fw.write(fileContent);
//		fw.close();
//		s.close();		
//		
//		String nm="Althaf";
//		nm.concat("Shaik");
//		String fn="".concat("Arshiya");//arshiya +
		//System.out.println(fn);
		
		//NULL POINTER exception
//		String cartoon = "";//"CourageTheCoveryDog"; null is not same as ""
//		String tomandJerry=null;
		//System.out.println(cartoon.charAt(0));//indexOutOfBoundsException
//		System.out.println(tomandJerry.equals("haiughwa"));
		
		
//		
//		
//		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("DD-MMM-YY");
//		System.out.println(dtf);
//		
//		
//		String content="I am leonel messie from argentina! ";
//		content.concat("i play football");
//		content=content.concat("We won the worldCup");
//		System.out.println(content);
//		IntStream is=content.chars();
//		int[] array01=is.toArray();
		
		//new Monkey().makeSound();
	}

}
//