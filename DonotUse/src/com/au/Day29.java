package com.au;

public class Day29 {
	int _Id;
	String _name;
	long _age;
	Day29(int Id,String name, long age){
		_Id=Id;
		_name=name;
		_age=age;
	}
	
	@Override
	public String toString() {
		return _Id+":"+_name+":"+_age;
	}
	

	public static void main(String[] args) {
		//1. Formatting
		//2. printing an object and how we customize it
		//3. Comparator  and Collections.binarySearch(,,); Guest and Room*
		//4. Handson example
//		System.out.println();
//		System.out.format("%-20s %-10s %-8s%-5d%n", "raji","S","Polur",120);//firstarg is string, ..args
//		System.out.format("%-20s %-10s %-8s%-5d", "arshiya","P","Vizag",100);
		
		Day29 object0=new Day29(1,"Joe",20);		
		System.out.println(object0);
		
		
		
		
		
	}

}
