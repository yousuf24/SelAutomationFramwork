package com.au;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Ude extends Exception{
	Ude(){
		this("fvhadfhas;dh ");
	}
	Ude(String msg){
		super(msg);
	}
}
class Employee{
	String name;
	int id;
	Employee(){
		
	}
}
public class Day28 {

	public static void main(String[] args)  {
		//Scanner and exception , File , Read the file using Scanner, print the same on the console
		//try catch and finally , how can we declare multiple Exceptions with single reference, user-defined excep
		//List.of difference with Arrays.asList, lambda expression, 
		//streams, terminal ops in streams, chaining in stream
		//declaring an int[] and converting in to stream and printing. Foreach
	
		Collection<String> list1=List.of("spring","fall","winter","summer");//Immutable collection
		//list1.add("miscelleneous");
		
		//Get back
//		String[] arr= {"spring","fall","winter","summer"};
//		Collection<String> list2=Arrays.asList(arr);//Mutable DS
//		list2.remove(1);
//		list2.add("miscg");
//		System.out.println(list2);
		
		
		
		//Lamda are for consized way of writing the code
//		Supplier<Employee> obj=new Supplier<Employee>() {
//			@Override
//			public Employee get() {				
//				return new Employee();
//			}			
//		};
//		
//		Supplier<Employee> lam=()->new Employee();//Functional interfaces
		
		
		//Stream
		Stream<Integer> st=Stream.of(1,2,3,56,89);
		List<Integer> li=st.collect(Collectors.toList());
		
		String[] names= {"mohammad","sriniRajis","shaikShoaib","cholamurugesan"};
		
		//terminal operations
//		long countOf=Arrays
//		.stream(names)
//		.filter(x->x.length()>=6).count();
//		
//		System.out.println(countOf);
		
		String str="2 4 6 8";
		String[] arr=str.split("\\s");// 2 4 6 8
		
		Stream<String> strea=Arrays.stream(arr);
		int sum=strea.filter(x->x.length()==1).mapToInt(x->Integer.parseInt(x)).sum();
		System.out.println(sum);
		
		List<Double> li2=new ArrayList<>(Arrays.asList(2.3,3.4,4.5,55.6,6000.0,54700.00));
		li2.forEach(x->System.out.print(x+ " "));
		System.out.println();
		li2.forEach(System.out::println);
		
		
		
		
//		try {
//			File f=new File("test.txt");
//			File fNew=new File("test01.txt");
//			Scanner s1=new Scanner(f);
//			//throw new Ude("Differnt msg than default");//invoked parameterized constructor
//			//f.createNewFile();
//			PrintWriter pw=new PrintWriter(fNew);// i can either print it on console or write it in test01.txt
//			
//			//Read the content from file 'f'
//			while(s1.hasNext()) {
//			pw.append(s1.next());}
//			
//			//pw.println(s1.nextLine());
//			
//			
//		} 
////		catch(Ude e) {
////			e.printStackTrace();
////		}
//		catch (IOException | IllegalArgumentException  e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			
//		}
		

	}

}
