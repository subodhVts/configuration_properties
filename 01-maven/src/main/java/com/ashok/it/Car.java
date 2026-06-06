package com.ashok.it;

public class Car extends Engine{
	
	public void drive()  {
		boolean start = super.start();
		if(start) {
			System.out.println("journey started");
		}
		
	}

}
