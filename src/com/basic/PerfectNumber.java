package com.basic;

public class PerfectNumber {
	
	public boolean isPerfectNumber(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(num % i == 0) {
				sum=sum+i;
			}
		}
		if(num == sum) {
			return true;
		}
	   return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumber pn=new PerfectNumber();
		System.out.println(pn.isPerfectNumber(28));

	}

}
