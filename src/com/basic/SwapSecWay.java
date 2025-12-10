package com.basic;

public class SwapSecWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("value of a before swap"+a);
		System.out.println("value of b before swap"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a before swap"+a);
		System.out.println("value of b before swap"+b);

	}

}
