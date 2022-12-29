package com.au;

import java.util.ArrayList;
import java.util.List;

public abstract class InfyTraining {// abstract can have both abstract /non abstract method
	
	public void intake() {
		System.out.println("Infy can intake the trainees upto 500 per week");
	}
	
	abstract List<String> tagColor();

	public static void main(String[] args) {
		
		InfyTraining arshiya =new Trainee();// dynamic binding, decision at run time . Method is overridden
		String tagColor=arshiya.tagColor().get(2);
		System.out.println("Arshiya assigned tag of color "+tagColor);
	}

}
class Trainee extends InfyTraining{

	@Override
	List<String> tagColor() {
		List<String> li=new ArrayList<>();
		li.add("green");
		li.add("blue");
		li.add("yellow");
		li.add("black");
		return li;
	}
	
}
