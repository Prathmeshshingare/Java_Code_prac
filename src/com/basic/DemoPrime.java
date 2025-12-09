package com.basic;

public class DemoPrime {
	
	public boolean isprime(int num) {
		if(num<=1)
			System.out.println(num+":is not prime ");
		for(int i=2;i<=num-1;i++) {
			if(num % i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		DemoPrime dp=new DemoPrime();
		//The number which is div by 1 and itself
		System.out.println(dp.isprime(5));
		
				

	}

}
