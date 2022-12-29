package com.au;

public class Uber implements Book{

	public static void main(String[] args) {
		/*Uber arshiyaRide=new Uber();
		arshiyaRide.book("madhuravada", "maddilapalem");*/
		
		String str=new String("arshiya");
		if(str.equals("arshiya"))System.out.println("My name is arshiya.");
		else System.out.println("wrong name");
		
		//jar - single deployable artifact for java enterprise applications amazon
		//war - single deployable artifact for webApp goibibo, myyatra, railyatri(irctc) 

	}

	@Override
	public void book(String src,String dst) {
		System.out.println("cab is booked"+"from source:"+src+" to destination: "+dst);
		
	}

}
