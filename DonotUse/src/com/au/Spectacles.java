package com.au;

public class Spectacles {
	//attributes
	private double lep;
	private double rep;
	private String lens;
	private String[] controls;
	static boolean isMadeOfMicrofiber=true;
	
	//Default constructor
	Spectacles(){
		this.lep=0.5;//this keyword indicates instance/object and it is not class specific . Object specific
		this.rep=0.5;
		this.lens="AntiClare";
	}
	
	//constructor parameterized
	Spectacles(String[] arr){
		
		this.controls= arr;
		
	}

	
	//To access private attributes outside . We need Setter/getters
	public double getLep() {
		return lep;
	}

	public void setLep(double lep) {
		this.lep = lep;
	}

	public double getRep() {
		return rep;
	}

	public void setRep(double rep) {
		this.rep = rep;
	}

	public String getLens() {
		return lens;
	}

	public void setLens(String lens) {
		this.lens = lens;
	}

	public String[] getControls() {
		return controls;
	}

	public void setControls(String[] controls) {
		this.controls = controls;
	}
	
	public static void toggleMaterial() {
		isMadeOfMicrofiber=false;
	}
	
	

}
