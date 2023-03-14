package com.au;


import java.util.*;
import java.util.stream.Collectors;

class Guest{
	int id;
	String name;
	String location;
	String country;
	Guest(int i,String b,String c,String d){
		this.id=i;this.name=b;this.location=c;this.country=d;
	}
}
public class Day30 {

	public static void main(String[] args) {
		Guest obj1=new Guest(99,"A","Tenesse","USA");
		Guest obj2=new Guest(100,"B","New jersey","USA");
		Guest obj3=new Guest(101,"C","Ohio","USA");
		Guest obj4=new Guest(102,"D","vizag","India");
		
		
		Guest[] arr=new Guest[] {obj1,obj2,obj3,obj4};
		//Use stream and filter those where location with"v" and length of State>=3
		List<Guest> listG=Arrays.stream(arr)
		.filter(a->a.location.toLowerCase().startsWith("v") && a.country.length()>=3)
		.collect(Collectors.toList());
		for(Guest each:listG) {
			System.out.format("%s <--> %s",each.country,each.location);
		}
		System.out.println();
		listG.forEach(x->System.out.println(x.country+":"+x.location));
		
		//swap the objects with in the array
		List<Guest> list2=Arrays.asList(arr);
		System.out.println(list2);		
		Guest g1=list2.get(1);//2nd position
		Guest g2=list2.get(2);//3rd position
		list2.set(2, g1);
		list2.set(1, g2);
		System.out.println(list2);
		

	}

}
