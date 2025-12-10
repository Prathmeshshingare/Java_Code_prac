package com.basic;

public class swapTway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
	
		System.out.println("value of a Before swap"+a);
		System.out.println("value of b Before swap"+b);
		
		a=a ^ b;
		b=a ^ b;
		a=a ^b;
		System.out.println("value of a After swap"+a);
		System.out.println("value of b After swap"+b);

	}

}
