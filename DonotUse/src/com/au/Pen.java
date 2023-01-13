package com.au;

class Stu{
	
}

public class Pen {
	private int point;//attributes
	private String color;
	public static boolean isClicked=false;
	
		//methods (setter, getter , customized methods )
	public int getPoint() {
		return point;
	}

	public Pen setPoint(int point) {
		this.point = point;
		return this;//current object or current instance
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static boolean isClicked() {
		return isClicked;
	}

	public static void setClicked(boolean isClicked) {
		Pen.isClicked = isClicked;
	}

	public static boolean click() {
		isClicked=true;
		return isClicked;
	}
	
	public static boolean unClick() {
		isClicked=false;;
		return isClicked;
	}
	

	public static void main(String[] args) {
		Pen p=new Pen();// this refers to current object or current instance
		Pen p1=new Pen();
		
		Boolean result=p.setPoint(10).isClicked();

	}

}
