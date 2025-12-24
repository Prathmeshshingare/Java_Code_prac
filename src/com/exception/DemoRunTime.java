package com.exception;

public class DemoRunTime {
	
	void disp() {
		System.out.println("disp  method");
	}

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
		
		
		int arr[]= {12,3,4};
		try {
			System.out.println(arr[1]);
		System.out.println(arr[4]);
		System.out.println(arr[0]);
		}
		catch (ArrayIndexOutOfBoundsException  e) {
			// TODO: handle exception
			System.out.println("You are trying to access more than its size  ");
		}
		
		
		try {
			String str=null;
			DemoRunTime d=null;
			d.disp();
			System.out.println(str);
			System.out.println(d);
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Null pointer exception occure");
			//System.exit(0); finally not executed
		}
		finally {
			System.out.println("finally block executed ");
		}

	}

}
