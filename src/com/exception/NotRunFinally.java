package com.exception;

public class NotRunFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		System.out.println("try block");
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Not possible to divide by zero");
			System.exit(0);
		}
		finally {
			System.out.println("Finally Block");
		}

	}

}
