package com.tnsif.methodoverriddingdemo;

public class Client {

	public static void main(String[] args) {
		RBI rbi;
		
		SBI sbi=new SBI();//static binding //tight coupling
		
		rbi=new SBI(); //Dynamic Binding  //loose coupling
		System.out.println(rbi.getRateOfInterest());
		
		rbi=new HDFC();
		System.out.println(rbi.getRateOfInterest());
		
		rbi=new Axis();
		System.out.println(rbi.getRateOfInterest());
		

	}

}
