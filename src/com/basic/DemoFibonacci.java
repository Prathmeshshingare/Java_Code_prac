package com.basic;

public class DemoFibonacci {
	
	public int fibonacciSeries(int num) {
		int f=0;
		int s=1;
		int fib=0;
		for(int i=2;i<=num;i++) {
			fib=f+s;
			f=s;
			s=fib;
		
		System.out.println(fib);
		}
		return fib;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoFibonacci df=new DemoFibonacci();
		df.fibonacciSeries(10);

	}

}
