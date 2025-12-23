package com.exception;

public class DemoRunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=args.length;
		
		try {
		System.out.println("Result of div "+(10/len));
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Divide by zero is not possible ");
		}
		
		

	}

}
